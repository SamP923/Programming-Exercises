favNums = [0,0,0,0,0]

favNums[0] = raw_input("Favorite number? ")
favNums[1] = raw_input("Another favorite number? ")
favNums[2] = raw_input("Another favorite number? ")
favNums[3] = raw_input("Another favorite number? ")
favNums[4] = raw_input("Another favorite number? ")

favNumsFormatted = "";

print("These are your favorite numbers:")
for x in favNums:
    favNumsFormatted = favNumsFormatted + "\t" + x

print favNumsFormatted

