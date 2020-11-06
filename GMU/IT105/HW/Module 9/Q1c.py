#sequence info
n = 20 #number of terms
r = 2 #common ratio
af = 6 #first term in sequence
al = 3145728 #last term in sequence

print("The sequence is:")

#Outputting geometric sequence as a list
geo = [af * r ** (n - 1) for n in range(1, n + 1)]
print(geo,'\n')

print("The sum of the sequence is:")

#formula for calculating the sum of a geometric sequence
sum = af*((1-(r**n))/(1-r))

print(sum)
