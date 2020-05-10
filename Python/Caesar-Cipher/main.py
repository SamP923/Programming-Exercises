# Code to brute force a Caesar cipher in Python

alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def decrypt(key, ciphertext):
    # since decryption uses the same logic as encryption, use 26-key
    # to handle the given uppercase alphabet characters
    plaintext = encrypt(26 - key, ciphertext)
    return plaintext

def decryptWOKey(ciphertext):
    # for each letter in the alphabet string, print out how what 
    # key is being used (AKA the shift number) and the shifted String
    plaintext = ''
    for letter in range(len(alpha)):
        plaintext += "Shift " + str(letter) + ": " + encrypt(letter, ciphertext) + "\n\n"

    return plaintext


def encrypt(key, plaintext):
    # for each letter in the plaintext, shift each letter by the given
    # key and add it to the ciphertext String
    ciphertext = ''
    for letter in plaintext:
        ciphertext = ciphertext + shiftLetterByKey(letter, key)
    
    return ciphertext

# this function takes in a letter and returns the letter
# after the text has been shifted by the Caesar cipher key
# Ex: letter: D, key: 3 --> returns letter A
def shiftLetterByKey(letter, key):
    newNumber = (alpha.find(letter) - key) % len(alpha)
    return alpha[newNumber]

print(decrypt(7, "BEHOXCTOTFHKXMATGIRMAHG"))
print(decryptWOKey("BEHOXCTOTFHKXMATGIRMAHG"))