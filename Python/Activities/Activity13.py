	
def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum
		
numList = [1,2,3,4,5,6]
	
result = calculate_sum(numList)
	
print("The sum of all the elements is: " + str(result))