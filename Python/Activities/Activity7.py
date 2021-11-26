List = list(input("Enter numbers separated by commas: ").split(","))
sum = 0

for i in List:
  sum += int(i)

print(sum)