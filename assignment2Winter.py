#ROMAN SOKOLOVSKI
#10185440
#ASSIGNMENT2


#PUT ALL TEXTFILES IN FOLDER WHERE ALL YOUR PYTHON FILES ARE
#MINE ARE IN MY DOCUMENTS SO THATS WHERE MY PATH WOULD BE
#ALL THESE PROGRAMS WORK PERFECTLY ON MAC, SO IF THEY DONT WORK ON PC I DONT KNOW WHAT TO SAY..


#ON MAC IT ONLY REQURIES FILE NAME NOT PATH EX: 'QueensHopefuls.txt' not "~/Documents/QueensHopefuls.txt"

def whoIsMissing(lis1, lis2):#Question1
    with open(lis1, 'r') as a:
        Qhope = [line.strip() for line in a]
    with open(lis2, 'r') as b:
        Qpaid = [line.strip() for line in b]
    newlis = []
    print("If its a long file it will take a bit..")
    i = 0
    j = 0
    for i in range(len(Qhope)):
        newlis.append(Qhope[i])
        for j in range(len(Qpaid)):
            if Qhope[i] == Qpaid[j]:
                newlis.remove(Qhope[i])
                break            
    print(newlis)
        


    
def modBinary(lis, target):#Question2
    low = 0
    high = len(lis)
    counter = 0#counter var for how many times target appears in lis
    while low < high:
        mid = (low + high) // 2
        if lis[mid] < target:
            low = mid + 1 
        elif lis[mid] > target:
            high = mid
        elif mid > 0 and lis[mid-1] == target:
            high = mid
        else:
            for i in range(0,len(lis)):
                if lis[i] == target:
                    counter+=1
                    
            print("number of times target appears: ",counter)
            return mid
    return -1
            

#ON MAC IT ONLY REQURIES FILE NAME NOT PATH EX: 'QueensHopefuls.txt' not "~/Documents/QueensHopefuls.txt"
def sortNames(file):#Question3
    with open (file) as f:
        lines = f.readlines()
        lis = [line.rstrip('\n') for line in open(file)]
    
    for i in range(0,len(lis)-1):#This is a selection sort
        minIndex = i
        for j in range(i+1,len(lis)):
            if len(lis[j])<len(lis[minIndex]):#if len of element is less than the current min, set new min as the element
                minIndex = j #sets new minindex as the element smaller than it
        lis[i],lis[minIndex] = lis[minIndex],lis[i]
    return lis



def floor(lis,target):#Question4
     if lis == None:
         return -1
     if len(lis)<2:
         return 0
     for i in range(0,len(lis)):
         if target == lis[i]:#if target is in list return the index its at
             return i
         if target>lis[i] and target<lis[i+1]:# if target is in between 2 elements return the smaller elements index
             return i

def ceil(lis,target):#Question4
    if lis == None:
         return -1
    if len(lis)<2:
         return 0
    for i in range(0,len(lis)):
         if target == lis[i]:#if target is in list return the index its at
             return i
         if target>lis[i] and target<lis[i+1]:# if target is in between 2 elements return the larger elements index
             return i+1
    
        








    


            
