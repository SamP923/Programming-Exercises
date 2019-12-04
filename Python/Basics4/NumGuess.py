from random import *

startGame = str(raw_input("Do you want to play Random Gumballs? (yes/no): "))

if startGame.lower() == "yes":
    gumballWinnings = randint(1,20) * 5
    print "You won " + str(gumballWinnings) + " gumballs!"
else:
    print "Ok. Next time..."

