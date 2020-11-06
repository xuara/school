numResp = 0
lrt = 0
comp = 0
resp = 'y'

while(resp == 'y'):
    actualrace = float(input('Insert a finish time.\n'))
    if(actualrace > 0):
        numResp += 1
    while(actualrace <= 0):
        print('Invalid input.')
        actualrace = float(input('Insert a finish time.\n'))
        if(actualrace > 0):
            numResp += 1
    if(numResp == 1):
        lrt = actualrace
        comp = actualrace    
    if(actualrace < comp):
        lrt = actualrace
        comp = lrt
    print('Do you have another input time? (Enter "y" for yes)')
    resp = input()
print('The lowest finish time is', lrt)

