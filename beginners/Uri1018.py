n = int(input())

print(n)

amount_of_100 = n // 100
n %= 100
amount_of_50 = n // 50 
n %= 50
amount_of_20 = n // 20 
n %= 20
amount_of_10 = n // 10
n %= 10
amount_of_5 = n // 5
n %= 5
amount_of_2 = n // 2
n %= 2
amount_of_1 = n // 1   

print(f"{amount_of_100} nota(s) de R$ 100,00")
print(f"{amount_of_50} nota(s) de R$ 50,00")
print(f"{amount_of_20} nota(s) de R$ 20,00")
print(f"{amount_of_10} nota(s) de R$ 10,00")
print(f"{amount_of_5} nota(s) de R$ 5,00")
print(f"{amount_of_2} nota(s) de R$ 2,00")
print(f"{amount_of_1} nota(s) de R$ 1,00")