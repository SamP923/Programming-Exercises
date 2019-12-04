num1 = float(raw_input("First number: "))
num2 = float(raw_input("Second number: "))
operation = raw_input("What do you want to do? (+ - * / % //) ")

if operation == "+":
    print num1 + num2
elif operation == "-":
    print num1 - num2
elif operation == "*":
    print num1 * num2
elif operation == "/":
    print num1 / num2
elif operation == "%":
    print num1 % num2
elif operation == "//":
    print num1 // num2 
else:
    print "invalid operation..."

