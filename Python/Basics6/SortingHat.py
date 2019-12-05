fl1 = float(raw_input("Number 1:\t"))
fl2 = float(raw_input("Number 2:\t"))
fl3 = float(raw_input("Number 3:\t"))

flList = [fl1, fl2, fl3]
def sortingHat(floats):
    floats.sort()
    return floats

newList = sortingHat(flList)
print newList
