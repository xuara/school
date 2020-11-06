#sequence info
n = 7 #number of terms
d = -5 #common difference
af = 31 #first term in sequence
al = 1 #last term in sequence

print("The sequence is:")

#Outputting arithmetic sequence as a list
for an in range(af,al-1,d):
    print(an)

print("The sum of the sequence is:")

#Formula for calculating the sum of an arithmetic sequence
sum = (n/2)*((2*af)+(n-1)*d)

print(sum)
