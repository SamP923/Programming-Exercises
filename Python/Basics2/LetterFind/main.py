LWPicked = False
longWord = raw_input("Pick a long word: ")

if len(longWord) > 9:
    LWPicked = True

while LWPicked == False:
    longWord = raw_input("Please pick a word with 10 or more letters ")
    if len(longWord) > 9:
        LWPicked = True

print "The length is " + str(len(longWord)) + "\nThe third letter is: " + longWord[2] + "\nThe sixth letter is: " + longWord[5] + "\nThe seventh letter is: " + longWord[6]

