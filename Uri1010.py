product_one = input().split()
product_two = input().split()

number_of_units_1, number_of_units_2 = int(product_one[1]), int(product_two[1])
price_of_product_1, price_of_product_2 = float(product_one[2]), float(product_two[2])

value_to_pay = number_of_units_1 * price_of_product_1 + \
    number_of_units_2 * price_of_product_2

print("VALOR A PAGAR: R$ {:.2f}".format(value_to_pay))