from random import *

guess = int(raw_input("Guess a number (1-10): "))
numToGuess = randint(1, 10)
if guess == numToGuess:
    print "CORRECT!"
else:
    print "The number was " + str(numToGuess) + ". Try again!"

