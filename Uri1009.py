seller = input()
sellers_fixed_salary = float(input())
total_sales_in_the_month = float(input())

percentage_of_sales_in_money = total_sales_in_the_month * 0.15
salary = sellers_fixed_salary + percentage_of_sales_in_money

print("TOTAL = R$ {:.2f}".format(salary))