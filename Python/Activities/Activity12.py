def calculateSum(num):
  if num:
    return num + calculateSum(num-1)
  else:
    return 0

res = calculateSum(10)

print("Sum of numbers from 0 to 10 is: ")
print(res)