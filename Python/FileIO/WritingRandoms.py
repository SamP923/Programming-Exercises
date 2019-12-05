from random import *

doc = open("RandomsText.txt", "w")

numsToWrite = int(input("How many random integers should I write to the file? " ))
lowerRange = float(input("What should the lower range be? "))
upperRange = float(input("What should the upper range be? "))

for x in range(numsToWrite):
    doc.write( str(randint(lowerRange, upperRange)) + "\n")

doc.close()
