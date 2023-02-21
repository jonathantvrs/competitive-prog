spent_time_in_hours = int(input())
average_speed = int(input())

amount_of_liters = spent_time_in_hours * average_speed / 12.0

print("{:.3f}".format(amount_of_liters))