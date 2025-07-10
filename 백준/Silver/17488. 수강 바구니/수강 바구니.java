import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 각 과목별 수강제한인원
        int[] limits = new int[M + 1]; // 1-indexed
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            limits[i] = Integer.parseInt(st.nextToken());
        }

        // 학생별 수강바구니 정보
        List<List<Integer>> firstBasket = new ArrayList<>();
        List<List<Integer>> secondBasket = new ArrayList<>();

        // 1차 수강바구니 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> courses = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int course = Integer.parseInt(st.nextToken());
                if (course == -1) break;
                courses.add(course);
            }
            firstBasket.add(courses);
        }

        // 2차 수강바구니 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> courses = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int course = Integer.parseInt(st.nextToken());
                if (course == -1) break;
                courses.add(course);
            }
            secondBasket.add(courses);
        }

        // 각 학생별 최종 수강등록 결과
        List<Set<Integer>> studentCourses = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            studentCourses.add(new HashSet<>());
        }

        // 각 과목별로 실패한 학생들을 추적 (다음 차수에서도 계속 신청상태 유지)
        List<Set<Integer>> failedStudents = new ArrayList<>();
        for (int i = 0; i <= M; i++) {
            failedStudents.add(new HashSet<>());
        }

        // 1차 수강바구니 처리
        // 각 과목별 신청자 수 계산
        int[] firstApplicants = new int[M + 1];
        for (int studentId = 0; studentId < N; studentId++) {
            for (int course : firstBasket.get(studentId)) {
                firstApplicants[course]++;
            }
        }

        // 1차에서 정원 이내인 과목들만 등록 성공, 초과하면 모두 실패
        for (int studentId = 0; studentId < N; studentId++) {
            for (int course : firstBasket.get(studentId)) {
                if (firstApplicants[course] <= limits[course]) {
                    studentCourses.get(studentId).add(course);
                } else {
                    // 정원 초과로 실패한 학생들을 기록
                    failedStudents.get(course).add(studentId);
                }
            }
        }

        // 2차 수강바구니 처리
        // 각 과목별 신청자 수 계산 (이미 등록한 학생 + 1차에서 실패한 학생들 + 2차 새로운 신청자)
        int[] secondApplicants = new int[M + 1];

        // 1차에서 실패한 학생들이 2차에서도 계속 신청상태
        for (int course = 1; course <= M; course++) {
            secondApplicants[course] += failedStudents.get(course).size();
        }

        // 2차에서 새로 신청하는 학생들 추가
        for (int studentId = 0; studentId < N; studentId++) {
            for (int course : secondBasket.get(studentId)) {
                // 이미 등록한 과목이 아니고, 1차에서 실패하지 않은 경우만 새로운 신청자로 카운트
                if (!studentCourses.get(studentId).contains(course) &&
                    !failedStudents.get(course).contains(studentId)) {
                    secondApplicants[course]++;
                }
            }
        }

        // 1차에서 성공한 과목들의 현재 등록 인원 계산
        int[] currentEnrolled = new int[M + 1];
        for (int studentId = 0; studentId < N; studentId++) {
            for (int course : studentCourses.get(studentId)) {
                currentEnrolled[course]++;
            }
        }

        // 2차에서 남은 정원과 비교하여 등록 처리
        for (int studentId = 0; studentId < N; studentId++) {
            for (int course : secondBasket.get(studentId)) {
                // 이미 등록한 과목이 아닌 경우만 처리
                if (!studentCourses.get(studentId).contains(course)) {
                    int remainingSlots = limits[course] - currentEnrolled[course];
                    // 2차 총 신청자가 남은 정원 이하인 경우만 성공
                    if (secondApplicants[course] <= remainingSlots) {
                        studentCourses.get(studentId).add(course);
                    }
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (studentCourses.get(i).isEmpty()) {
                sb.append("망했어요\n");
            } else {
                List<Integer> courses = new ArrayList<>(studentCourses.get(i));
                Collections.sort(courses);
                for (int j = 0; j < courses.size(); j++) {
                    if (j > 0) sb.append(" ");
                    sb.append(courses.get(j));
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}