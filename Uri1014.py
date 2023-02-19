distance_in_km = int(input())
spent_fuel = float(input())

consumption = distance_in_km / spent_fuel

print("{:.3f} km/l".format(consumption))