n = int(input())

print(n) 
print(str(n // 100) + " nota(s) de R$ 100,00")
n %= 100
print(str(n // 50) + " nota(s) de R$ 50,00")
n %= 50
print(str(n // 20) + " nota(s) de R$ 20,00")
n %= 20
print(str(n // 10) + " nota(s) de R$ 10,00")
n %= 10
print(str(n // 5) + " nota(s) de R$ 5,00")
n %= 5
print(str(n // 2) + " nota(s) de R$ 2,00")
n %= 2
print(str(n // 1) + " nota(s) de R$ 1,00")
