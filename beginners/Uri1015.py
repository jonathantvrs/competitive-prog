from math import pow, sqrt

x1, y1 = list(map(float, input().split()))
x2, y2 = list(map(float, input().split()))

distance_between_two_points = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2))

print("{:.4f}".format(distance_between_two_points))