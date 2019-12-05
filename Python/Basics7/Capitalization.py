statesDone = False
statesTraveled = []

while statesDone == False:
    state = str(input("Have you traveled to any other states? "))
    if state.lower() == "no":
        print (statesTraveled)
        print ("You have been to " + str(len(statesTraveled)) + " states.")
        break;
    else:
        statesTraveled.append(state)

        
