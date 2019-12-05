startNum = int(input("Starting number: "))

def collatzCalc(num):
    if num % 2 == 0:
        return num / 2
    elif num == 1:
        return num
    else:
        return num * 3 + 1

num = startNum;

while num != 1:
    num = collatzCalc(num)
    print(num)
    
