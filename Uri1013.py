def higher(x, y):
    return (x + y + abs(x - y)) // 2

values = list(map(int, input().split()))
A, B, C = values[0], values[1], values[2]

higher_number = higher(A, higher(B, C))

print(f"{higher_number} eh o maior")