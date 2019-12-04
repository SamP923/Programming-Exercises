floatArr = [0,0,0,0,0]
newArr = [0,0,0,0,0]

floatArr[0] = float(raw_input("Choose a float: "))
floatArr[1] = float(raw_input("Choose a float: "))
floatArr[2] = float(raw_input("Choose a float: "))
floatArr[3] = float(raw_input("Choose a float: "))
floatArr[4] = float(raw_input("Choose a float: "))

def triple(fl):
    return fl * 3

newArr[0] = triple(floatArr[0])
newArr[1] = triple(floatArr[1])
newArr[2] = triple(floatArr[2])
newArr[3] = triple(floatArr[3])
newArr[4] = triple(floatArr[4])

print newArr