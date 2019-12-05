breakLoop = False

while breakLoop == False:
    userinput = str(input("Is RET your favorite class? "))
    if userinput.lower() == "yes":
        print("Of course it is!")
        breakLoop = True
    else:
        print("I'm sorry, I didn't get that...")
        
