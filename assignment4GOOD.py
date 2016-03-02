#Roman Sokolovski
#Assignment4
#10185440


import WordLookup


def oneLetterDiff(word):
    
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
             'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' ]
    newList = []
    wordList = []
    for i in range(len(word)): #loops for len of word
        for letter in range(len(alphabet)): #loops 25 times len(alphabet)
            newList = word.replace(word[i], alphabet[letter])#replaces letters in word with alphabet
            if WordLookup.lookup(newList) == True and newList != word: #checks if new words are legit              
                wordList.append(newList)#adds to new list if words are reald
    return wordList 
 
 
def wordPath(start, end, steps):
    #-----------------------Error Checking-------------------
    if (steps < 0): #checks for negative steps
        return None
    if (len(start) != len(end)): #makes sure both words are same len
        return None
    for i in range(len(start)): #capital letters check
        if(start[i].isupper() or end[i].isupper()):
            return None
    if (WordLookup.lookup(start) == False or WordLookup.lookup(end) == False): #checks if words are legit
        return None
    #--------------------------End of Error Checking---------------
    
    if (steps == 0): #if steps is 0
        if (start == end):
            return [start]
        else:
            return None   
    else:#steps is greater than 0
        nextWord = oneLetterDiff(start)
        for newWord in nextWord:
            nextPath = wordPath(newWord, end, steps - 1)
            if (nextPath != None):
                return [start] + nextPath
            
def allPath(start, end, steps, finalList=None):
    return None
