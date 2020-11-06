#Function Definition: teamaward
def teamaward(avg):
    if(avg == 300): #if team's average score is equal to 300
        print("Our average score is:",avg)
        return "Perfect Series"
    elif(avg >= 200): #if team's average score is between 200 and 299
         print("Our average score is:",avg)
         return "Almost Perfect Series"
    elif(avg >= 100): #if team's average score is between 100 and 199
        print("Our average score is:",avg)
        return "OK Series"
    elif(avg > 0): #if team's average score is between 1 and 99
        print("Our average score is:",avg)
        return "Horrible Series"
    elif(avg == 0): #if team's average is equal to 0
        print("Our average score is:",avg)
        return "The Worst"
    else: #if team's average is invalid
        print("Error!")

#Function Definition: avgscore
def avgscore(numMem):
    ttl = 0 #initialize average value
    count = 1 #Used to keep track of which team member's score is being entered
    for x in range(numMem):
            print("Input team member",count,"score:")
            a = int(input())
            count += 1 #iterate team member number
            ttl += a #sum team members' score
    avg = ttl/numMem #averaging the team's score
    while(numMem <= 0): #while number of members inputted is invalid
        numMem = int(input("Error! Enter a positive integer:\n")) #output error message and inquire number of team members once again
        for x in range(numMem):
            print("Input team member",count,"score:")
            a = int(input())
            count += 1 #iterate team member number
            ttl += a #sum team members' score
    avg = ttl/numMem #averaging the team's score
    return avg

#Function Calls
numMemb = int(input("Enter the number of team members:\n"))
num = avgscore(numMemb)
print("Our bowling team award notice is: ",teamaward(num))
