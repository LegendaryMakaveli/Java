multiply = 1
sum = 0
for number in range(4, 8,4) :
	for digit in range(1,6) :
		multiply = multiply * number
		sum = sum + multiply
	print(sum, end = " ")

for number in range(1) :
	print(" ", end = "")

total = 1
sumNumber = 0
for number in range (8,9) :
	for digit in range(1,6) :
		total = total * number
		sumNumber = sumNumber + total
	print (sumNumber, end = " ")