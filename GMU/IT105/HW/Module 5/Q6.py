ttl = 0
numEnt = 0

while(numEnt < 10):
    dist = int(input('Enter distance in miles from home to the club.\n'))
    while(dist < 0):
        print('Invalid input.')
        dist = int(input('Enter distance in miles from home to the club.\n'))
    numEnt += 1
    ttl += dist
avg = ttl / dist
print("The average distance is:", avg)

