doc = open("RandomList.txt", "r")

numList = doc.readlines()
doc.close()

maxNum = int(numList[0])
minNum = int(numList[0])
numElements = len(numList)
average = 0

for x in numList:
    if int(x) > int(maxNum):
        maxNum = x
    if int(x) < int(minNum):
        minNum = x
    average += int(x)

average = average / numElements

print("maximum: " + str(maxNum) + "minimum: " + str(minNum)+
      "number of elements: " + str(numElements) + "\naverage: " + str(average))
