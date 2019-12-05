doc = open("Example.txt", "r")

fileText = doc.read()
doc.close()


newText = fileText.replace("a", "*")

print(newText)
