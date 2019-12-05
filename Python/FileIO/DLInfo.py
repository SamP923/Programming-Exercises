doc = open("DLText.txt", "w")

fullName = str(input("Full Name: "))
eyeColor = str(input("Eye Color: "))
hairColor = str(input("Hair Color: "))
height = str(input("Height: "))
weight = str(input("Weight: "))

doc.write("Full Name: " + fullName)
doc.write("\nEye Color: " + eyeColor)
doc.write("\nHair Color: " + hairColor)
doc.write("\nHeight : " + height)
doc.write("\nWeight: " + weight)

doc.close()
