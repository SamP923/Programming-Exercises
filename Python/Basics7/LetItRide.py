from random import *
num = 0
divisible = False
count = 0

while divisible == False:
    num = randint(1,10)
    print(num)
    if num % 3 == 0:
        break
    count += 1

print("The losing number was: " + str(num) + "\nWins: " + str(count))
    
