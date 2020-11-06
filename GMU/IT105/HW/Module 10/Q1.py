#Function Defintion: skipline
def skipline(clr):
    if(clr >= 3): #if clearance level is high enough to skip the line
        print("Clearance level:",clr)
        print("Access granted. Permission to skip line accepted.")
    elif(clr >=0): #if clearance level is not high enough to skip the line
        print("Clearance level:",clr)
        print("Access denied. Permission to skip line rejected.")
    while(clr < 0): #while taken value is invalid
        clr = int(input("Error! Enter a number greater than or equal to 0:\n")) #output error message and inquire for clearance level once again
        if(clr >= 3): #if clearance level is high enough to skip the line
            print("Clearance level:",clr)
            print("Access granted. Permission to skip line accepted.")
        elif(clr >=0): #if clearance level is not high enough to skip the line
            print("Clearance level:",clr)
            print("Access denied. Permission to skip line rejected.")


#Function Call
c = int(input("What is the clearance level of the next person in line?\n"))
skipline(c)
