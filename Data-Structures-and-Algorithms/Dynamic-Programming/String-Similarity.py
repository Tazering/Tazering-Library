import numpy as np

# Declare necessary variables
firstWord = ""
secondWord = ""

# supplementary methods
def calculateSimilarity(firstWord, secondWord):

    dynamicProgrammingGrid = np.zeros((len(firstWord), len(secondWord)))

    for i in range(dynamicProgrammingGrid.shape[0]):
        if(firstWord[i] == secondWord[i]):
            if(i == 0):
                dynamicProgrammingGrid[i][i] = 1
            else:
                dynamicProgrammingGrid[i][i] = dynamicProgrammingGrid[i-1][i-1] + 1
    
    return dynamicProgrammingGrid

def print2dList(arr):
    for i in range(arr.shape[0]):
        row = ""
        for j in range(arr.shape[1]):
            row = row + " " + str(arr[i][j])
        print(row)


# main method
def main():
    print("This computes how similar the strings are to each other.")
    print("Input two words to compare:")
    print("Type the first word: ")
    firstWord = input()
    print("Type the second word")
    secondWord = input()
    print("The two words you typed were " + firstWord + " and " + secondWord)

    arr = calculateSimilarity(firstWord, secondWord)
    #print2dList(arr)
    print(np.amax(arr))



main()