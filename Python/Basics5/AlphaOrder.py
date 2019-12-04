word1 = str(raw_input("Choose a word: " )).lower()
word2 = str(raw_input("Choose another word: ")).lower()

def alphaCheck(str1, str2):
    if str1[0] > str2[0]:
        return str2
    if str2[0] > str1[0]:
        return str1
    if str1[1] > str2[1]:
        return str2
    if str2[1] > str1[1]:
        return str1
    if str1[2] > str2[2]:
        return str2
    if str2[2] > str1[2]:
        return str1
    
alph = str(alphaCheck(word1, word2))

print alph
        