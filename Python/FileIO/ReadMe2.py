doc = open("Fresh.txt", "r")

freshLines = doc.readlines()

for x in range(len(freshLines)):
    if x % 2 == 0:
        print(freshLines[x])

doc.close()
