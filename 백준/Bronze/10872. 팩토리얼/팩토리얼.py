# 사용자에게 입력을 요구하고 안내 메시지를 제공합니다.
i = int(input())

# num을 1로 초기화합니다.
num = 1
fact = 1
# num이 i보다 작거나 같을 때까지 반복합니다.
while num <= i:
    fact = fact*num;
    num += 1    # num을 1 증가시킵니다.
print(fact)