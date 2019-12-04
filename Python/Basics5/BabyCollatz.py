startNum = int(raw_input("Starting number: "))

def collatzCalc(num):
    if num % 2 == 0:
        return num / 2
    elif num == 1:
        return num
    else:
        return num * 3 + 1

num = startNum;
iterations = 0;

while num != 1:
    if iterations >= 10:
        break
    iterations += 1 
    num = collatzCalc(num)
    print num
    