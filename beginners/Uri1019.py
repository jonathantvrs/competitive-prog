N = int(input())

h = N // 3600
N %= 3600
min = N // 60
s = N % 60

print("{}:{}:{}".format(h, min, s))