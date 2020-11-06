#Function Defintion
def a(n):
   # if(n == 1): #base case
    #    an = 3
     #   return 3
    # else:
    an = 2 + a(n-1) #recursive call
    return an

c = 1 #counter for term #
s = 0 #initialize value for sum
for i in range(1,7):
    print("Term #",c,"=",a(i))
    c += 1 #increment counter
    s += a(i) #calculate sum
print("The sum of the sequence is:",s)



