doc = open("PeterPiper.txt", "r")

lineList = doc.readlines()
doc.close()

for x in reversed(lineList):
    print(x)
