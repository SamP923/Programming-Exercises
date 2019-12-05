food0 = str(input("First Favorite Food:\t"))
food1 = str(input("Second Favorite Food:\t"))
food2 = str(input("Thrird Favorite Food:\t"))
food3 = str(input("Fourth Favorite Food:\t"))
food4 = str(input("Fifth Favorite Food:\t"))

orgArr = [food0, food1, food2, food3, food4]
print ("\nOriginal: " + str(orgArr))

orgArr[0].upper()
orgArr[2].upper()
orgArr[3].upper()
print ("Next: " + str(orgArr))

orgArr.pop(3)
print ("Next: " + str(orgArr))

orgArr.insert(3, "lasagna")

print ("\nFinalists:")
for x in orgArr:
    print(x)

