from random import *

die1 = randint(1,6)
die2 = randint(1,6)
sumdie = die1 + die2

print "First die:\t%d\nSecond die:\t%d" % (die1, die2)

statement = ""
if sumdie == 7 or sumdie == 11:
    print ("Congrats! You WIN!")
elif sumdie == 2 or sumdie == 3 or sumdie == 12:
    print ("You crapped out. Sorry.")
else:
    print "Your rolled a " + str(sumdie) + ". Roll again."

    