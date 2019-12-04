print("Guess what color I'm thinking of!")
colorGuessed = False
color = "PURPLE"

guess = ""

while colorGuessed == False:
    guess = raw_input("Color guess: ")
    if str(guess.upper()) == color:
        print "GOOD JOB!"
        colorGuessed = True
    else:
        print "Try again..."

