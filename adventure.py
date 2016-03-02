    

def mainMenu():
    print("Your options are:")
    print("(n) Go north to the mountains")
    print("(s) Go south to the jungle")
    print("(w) Go west to desert city")
    print("(e) Go east to monster valley")
    print("(i) to check inventory")
    print("(x) to go to the shop")
    print("(p) see what items are available to pickup")
    answer = input("You choose: ")
    if (answer == "n" or answer=="N"):
        north()
    if (answer == "s" or answer=="S"):
        south()
    if (answer == "w" or answer=="W"):
        west()
    if (answer == "e" or answer=="E"):
        east()
    if (answer == "i" or answer=="I"):
        inventory()
    if (answer == "x" or answer=="X"):
        shop()
    if (answer == "p" or answer == "P"):
        print("you can pickup: ")
    if (answer not in "nsweispxNSWEISPX"):
        print("wrong input")
        mainMenu()


def north():
    
    print("You have entered the snowy mountains")
    print("your options are:")
    print("(s) Go south to go back home")
    print("(i) to check inventory")
    print("(p) see what items are available to pickup")
    answer = input("You choose: ")
    if (answer == "s" or answer=="S"):
        startingarea()
    if (answer == "i" or answer == "I"):
        inventory()
    if (answer == "p" or answer == "P"):
        print("you can pickup: ")
    if (answer not in "sipSIP"):
        print("wrong input")
        north()

def east():
    print("You have entered Monster Valley, prepare to fight")
    print("your options are:")
    print("(w) Go west to go back home")
    print("(i) to check inventory")
    print("(d) to fight dragon")
    print("(z) to fight demons")
    print("(o) to fight ogre")

    answer = input("You choose: ")
    if (answer == "w"):
        startingarea()
    if (answer == "i"):
        inventory()
    if (answer == "d" or answer == "D"):
        print ("you have entered the dragons layer")
        #finish this shit
    if (answer == "z" or answer == "Z"):
        print ("you are surrounded by demons, get ready!!")
        #finish this shit
    if (answer == "o" or answer == "O"):
        print ("you have entered the ogres swamp, it doesnt seem very happy..")
        #finish this shit
    if (answer not in "widzoWIDZO"):
        print("wrong input")
        east()

def west():
    print("You have entered the desert city..")
    print("your options are:")
    print("(e) Go east to go back home")
    print("(i) to check inventory")
    print("(p) see what items are available to pickup")
    answer = input("You choose: ")
    if (answer == "e" or answer == "E"):
        startingarea()
    if (answer == "i" or answer == "I"):
        inventory()
    if (answer == "p" or answer == "P"):
        print("you can pickup: ")       
    if (answer not in "eipEIP"):
        print("wrong input")
        west()

def startingarea():
    print ("you are back home in your tiny village")
    print("Your options are:")
    print("(n) Go north to the mountains")
    print("(s) Go south to the jungle")
    print("(w) Go west to desert city")
    print("(e) Go east to monster valley")
    print("(i) to check inventory")
    print("(x) to go to the shop")
    print("(p) see what items are available to pickup")
    answer = input("You choose: ")
    if (answer == "n" or answer=="N"):
        north()
    if (answer == "s" or answer=="S"):
        south()
    if (answer == "w" or answer=="W"):
        west()
    if (answer == "e" or answer=="E"):
        east()
    if (answer == "i" or answer=="I"):
        inventory()
    if (answer == "x" or answer=="X"):
        shop()
    if (answer == "p" or answer == "P"):
        print("you can pickup: ")       
    if (answer not in "nsweispxNSWEISPX"):
        print("wrong input")


    

def south():
    print("you are at the lake")
    print("your options are:")
    print("(n) Go south to the uni/union")
    print("(w) Go west to west campus")
    print("(e) Go east to Biosci")
    print("(i) to check inventory")
    print("(x) to go to the shop")
    print("(p) see what items are available to pickup")
    answer = input("You choose: ")
    if (answer == "n"):
        startingarea()
    if (answer == "w"):
        west()
    if (answer == "e"):
        east()
    if (answer == "i"):
        inventory()
    if (answer == "x"):
        shop()
    if (answer == "p"):
        print("you can pickup: ")
    if (answer not in "nsweispxPXNSWEIS"):
        print("wrong input")
          


def starting():
    name = input("enter your name: ")
    print("welcome to adventure game, ", name)
    print ("you are at home in your tiny village..")
    mainMenu()







################################################################################
################################################################################
################################################################################
################################################################################
################################################################################
################################################################################



def startinginv():
    startinventory = ["bronze sword","wooden shield", "ragged boots", "shrimps"]
    return startinventory

def storeinv(newlist):
    newlis = []
    newlis.append(newlist)
    return newlis
    

def acquiredinv(newlist):
    newlis = []
    newlis.append(newlist)
    return newlis


def startingmoney():
    coins = 500
    return coins

def storemoney(coins):
    newcoins = startingmoney()-coins
    return newcoins

def maininventory():
    maininv = startinginv()+storeinv([])+acquiredinv([])
    return maininv


def inventory():
    print ("You currently have: ",startinginv()+storeinv([])+acquiredinv([]))
    print ("to access menu type 'm'")
    answer = input("you chose: ")
    if (answer == "m"):
        mainMenu()
    



def game():
    starting()




def shop():
    real = True
    tab = 0
    tabitems = []
    store = {'ironArmor':500, 'steelArmor':500, 'ironSword':500, 'steelSword':500,'dragonShield':500,'holyNecklace':500,'lightBoots':500, 'ogreBat':500}
    print("welcome to the shop!")
    print("What we have to offer is: ", store)
    print("To buy item, type item")
    print("to access menu type 'm'")    
    while(real == True):
        answer = input("You choose: ")
        if (answer == "m"):
            mainMenu()

        if (answer=="ironArmor"):
            store['ironArmor'] = store['ironArmor']-1
            tabitems.append('ironArmor')
            tab = tab+50
             
        if (answer=="steelArmor"):
            store['steelArmor'] = store['steelArmor']-1
            tabitems.append('steelArmor')
            tab = tab+150
            
        if (answer=="ironSword"):
            store['ironSword'] = store['ironSword']-1
            tabitems.append('iron sword')
            tab = tab+30
            
        if (answer=="steelSword"):
            store['steelSword'] = store['steelSword']-1
            tabitems.append('steelSword')
            tab = tab+100

        if (answer=="dragonShield"):
            store['dragonShield'] = store['dragonShield']-1
            tabitems.append('dragonShield')
            tab = tab+120

        if (answer=="holyNecklace"):
            store['holyNecklace'] = store['holyNecklace']-1
            tabitems.append('holyNecklace')
            tab = tab+50

        if (answer=="lightBoots"):
            store['lightBoots'] = store['lightBoots']-1
            tabitems.append('lightBoots')
            tab = tab+100

        if (answer=='ogre'):
            store['ogreBat'] = store['ogreBat']-1
            tabitems.append('ogreBat')
            tab = tab+100
                       
        if (answer == "i"):
            
            storeinv(tabitems)
            
            print("Items you currently have: ", maininventory())
            print("money you currently have: ", storemoney(tab))

                  
        



    





