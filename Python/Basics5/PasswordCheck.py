pw = str(raw_input("Password:\t\t"))
pwCheck = str(raw_input("Confirm Password:\t"))

def verify(str1, str2):
    if (str1 == str2):
        return True
    else:
        return False

checked = verify(pw, pwCheck)

if checked == True:
    print "Passwords Match"
else:
    print "Error: Passwords Invalid"