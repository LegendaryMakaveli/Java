square_result = 0
over_all_sum = 0
multiply = 1
sum = 0
for number in range(4, 8,4) :
	for digit in range(1,6) :
		multiply = multiply * number
		sum = sum + multiply

for number in range(1) :
	print(" ", end = "")

total = 1
sumNumber = 0
for number in range (8,9) :
	for digit in range(1,6) :
		total = total * number
		sumNumber = sumNumber + total


over_all_sum = sum + sumNumber
square_result = over_all_sum * over_all_sum
print(square_result)