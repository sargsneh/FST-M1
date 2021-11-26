import pandas
from pandas import ExcelWriter

data = {
	'FirstName':["Sneha", "Dhakshi", "Sphoorthi"],
	'LastName':["Sargunam", "M", "Karri"],
	'Email':["sneh@att.com", "dhakshi@att.com", "karri@att.com"],
	'PhoneNumber':["990088766", "7700998877", "9122334455"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

writer.save()