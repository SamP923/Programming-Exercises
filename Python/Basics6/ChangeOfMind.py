sportsList = ["baseball", "basketball", "football", "hockey", "soccer"]

print sportsList
likeSports = str(raw_input("Do you like all of these sports? (yes/no): "))

if likeSports.upper() == "YES":
    print("nice!")
elif likeSports.upper() == "NO":
    removeSport = str(raw_input("that's too bad! which do you want to remove? "))
    removeInd = sportsList.index(removeSport.lower())
    sportsList.pop(removeInd)
    
    print "\nHere's the new list: " + str(sportsList)
    addSport = str(raw_input("Do you want to add a sport to the list? (yes/no) "))
    if addSport.upper() == "NO":
        print("okay! thanks for your time")
    elif addSport.upper() == "YES":
        sportAdded = str(raw_input("\nokay! what sport would you like to add? "))
        sportsList.append(sportAdded)
        print sportsList

        sportsList[0] = str(raw_input("\nPlease input your preference (first to last) of the sports.\nFirst: "))
        sportsList[1] = str(raw_input("Second: "))
        sportsList[2] = str(raw_input("Third: "))
        sportsList[3] = str(raw_input("Fourth: "))
        sportsList[4] = str(raw_input("Fifth: "))

        print sportsList

    else:
        print ("invalid input")
else: 
    print ("invalid input")
