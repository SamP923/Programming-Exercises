from random import *

def randGen(a, b):
    for x in range(0,5):
        print randint(a,b)

num1 = int(raw_input("Choose an integer: "))
num2 = int(raw_input("Choose an integer greater than the previous: "))

randGen (num1, num2)

