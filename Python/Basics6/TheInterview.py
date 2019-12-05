def interview():
    pets = str(raw_input("Any pets? "))
    age = int(raw_input("Your age? "))
    gpa = float(raw_input("Average GPA? "))
    city = str(raw_input("Birth city? "))
    favclass = str(raw_input("Favorite Class? "))

    qList = []
    qList.append(pets)
    qList.append(age)
    qList.append(gpa)
    qList.append(city)
    qList.append(favclass)

    return qList

questions = interview()

print "Pets: " + str(questions[0])
questions.pop(0)
print "Age: " + str(questions[0])
questions.pop(0)
print "GPA: " + str(questions[0])
questions.pop(0)
print "Born: " + str(questions[0])
questions.pop(0)
print "Class: " + str(questions[0])
questions.pop(0)
