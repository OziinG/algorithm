def isUniform(matrix, x, y, size):
    """
    matrix의 특정 영역이 모두 같은 값을 가지는지 확인하는 함수
    """
    first_value = matrix[x][y]
    for i in range(x, x + size):
        for j in range(y, y + size):
            if matrix[i][j] != first_value:
                return False
    return True

def quadTree(matrix, x, y, size):
    """
    쿼드 트리를 재귀적으로 생성하는 함수
    """
    if isUniform(matrix, x, y, size):
        return str(matrix[x][y])
    
    half = size // 2
    topLeft = quadTree(matrix, x, y, half)
    topRight = quadTree(matrix, x, y + half, half)
    bottomLeft = quadTree(matrix, x + half, y, half)
    bottomRight = quadTree(matrix, x + half, y + half, half)
    
    return "(" + topLeft + topRight + bottomLeft + bottomRight + ")"

# 입력 처리
n = int(input())
qtree = []

for _ in range(n):
    qtree.append(list(map(int, input().strip())))

# 쿼드 트리 생성 및 출력
result = quadTree(qtree, 0, 0, n)
print(result)
