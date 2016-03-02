#ASSIGNMENT5-TRINARY SEARCH TREES
#ROMAN SOKOLOVSKI
#10185440





def printTree(tree, indent=0):
    """
    Provided as part of the assignment. 
    Prints an indented representation of a trinary tree.  The second
    parameter determines how far the tree is to be indented from the
    left margin.  Just like the indented representation of binary trees,
    this representation looks like a drawing of a tree without the
    connecting lines if you tilt your head to the left.
    """
    if tree == None:
        return # don't print anything
    elif tree['data2'] == None: # one data element, no children
        print(" "*indent + str(tree['data1']))
    else: # two data elements, may have up to three children
        printTree(tree['right'],indent+4)
        print(" "*indent + str(tree['data2']))
        printTree(tree['middle'],indent+4)
        print(" "*indent + str(tree['data1']))
        printTree(tree['left'],indent+4)

def createTree(values):
    """
    Parameter must be a Python lists of values.  Returns a tree
    created by adding each value from the list to the tree, in order.
    Provided to help generate trees for testing.
    This function won't work until your add function works.
    """
    tree = None
    for v in values:
        tree = add(tree,v)
    return tree

# the example tree from the assignment web site 
#exampleTree=createTree([13,42,3,6,23,32,72,90,1,10,26,85,88,97,73,80])


import random
def randomTree(numNodes):
    """
    Creates a tree with the specified number of nodes using random numbers.
    A helper to generate trees for testing.  
    """
    # Values in the tree will be multiples of 5, to leave lots of room
    # to experiment with adding values into any position
    values = list(range(5, 5*numNodes+1, 5))
    random.shuffle(values)
    return createTree(values)
    

def add(tree, newValue): #adds a new value to a trinary tree
    """
    Adds newValue to tree and returns a pointer to the root of the
    modified tree.  If newValue is already in the tree, doesn't change
    the tree (but this is not an error).
    """
    if tree == None:
        newNode = {'data1':newValue,'data2':None,'left':None,'middle':None,'right':None}
        return newNode
    if tree['data2'] == None and newValue< tree['data1']:
        newNode = {'data1':newValue, 'data2':tree['data1'],'left':None,'middle':None,'right':None}
        return newNode
    
    if tree['data2']== None and newValue> tree['data1']:
        newNode = {'data1':tree['data1'],'data2':newValue,'left':None,'middle':None,'right':None}
        return newNode
    
    elif tree['data1'] == newValue or tree['data2'] == newValue: #no duplicates
        return tree
        
        
    if newValue < tree['data1']:# if new value is < data1 add to left branch
        tree['left'] = add(tree['left'], newValue)
        return tree
    elif newValue > tree['data2'] or tree['data2'] == None: #if new value is > data2 add to right branch
        tree['right'] = add(tree['right'], newValue) 
        return tree
    else:# newValue>tree['data1'] and newValue<tree['data2']:
        tree['middle'] = add(tree['middle'], newValue)
        return tree
    
    
    
    
        

def search(tree,value):#searches for a specific value in a trinary tree
    """
    Searches a tree for a value.  Returns True if value occurs somewhere
    inside tree, False otherwise.
    """
    if tree == None:
        return False
    elif tree['data1'] == value or tree['data2'] == value:
        return True
    elif value<tree['data1']:
        return search(tree['left'],value)
    elif value> tree['data2']:
        return search(tree['right'],value)
    elif value>tree['data1'] and value<tree['data2']:
        return search(tree['middle'],value)
    
    
    
    
    

def total(tree):
    """
    Returns the total of all the numbers in a tree.  If the tree is empty,
    the total is zero.
    """
    if tree == None:
        return 0
    #IF any values in tree are None, converts it to 0
    if tree['middle'] == None: 
        tree['middle'] == 0
    if tree['left'] == None:
        tree['left'] == 0
    if tree['right'] == None:
        tree['right'] == 0
        
    if tree['data1'] == None:
        tree['data1'] ==0
    if tree['data2'] == None:
        tree['data2'] == 0
    #recursion step adds all left, middle and right side together    
    leftTotal = total(tree['left'])
    rightTotal = total(tree['right'])
    midTotal = total(tree['middle'])
    initialval1 = int(tree['data1'])
    initialval2= int(tree['data2'])

    return leftTotal+rightTotal+midTotal+initialval1+initialval2
    
    
    
                         
        

def height(tree): #finds the longest path from root to child, that is the height
    """
    Returns the height of the tree -- the length of the longest path from
    the root to a leaf.  So an empty tree has height 0, a tree with just one
    node has height 1, and so on, just like with binary search trees.
    """
    if tree == None:
        return 0
    if tree['middle'] == None:
        tree['middle'] == 0
    if tree['left'] == None:
        tree['left'] == 0
    if tree['right'] == None:
        tree['right'] == 0
    leftHeight = height(tree['left'])
    middleHeight = height(tree['middle'])
    rightHeight = height(tree['right'])
    tallestChildHeight = max(leftHeight,middleHeight,rightHeight)
    return 1 + tallestChildHeight
    


def findMin(tree): #finds the smallest value in a trinary tree
    """
    Returns the smallest value in the tree, or None if the tree is empty.
    """
    if tree['left'] == None:
        return tree['data1']
    else:
        return findMin(tree['left'])

    

def treeToList(tree): #converts trinary tree to a list
    """
    Returns a list of all the values in the tree, in ascending order
    """
    if tree == None:
        return []
        
    else:
        leftList = treeToList(tree['left'])
        midList = treeToList(tree['middle'])
        rightList = treeToList(tree['right'])
        newList = leftList +[tree['data1']] +midList + [tree['data2']] + rightList
        
        return newList

