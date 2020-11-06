print("Enter a number.")
x = (float)(input())
prize = "${0:4.2f}".format(x*2)

if (x > 0) & (x < 25):
    print("You win!")
    print("Your prize is:",prize)
else:
    print("Sorry, you did not win.")
