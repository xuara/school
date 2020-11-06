def nonsensical(num):
    if num > 1:
        print("Num is: ", num)
        nonsensical(num - 1)
        print("After the recursive call")
    else:
        print("This is the base case and Num is: ", num)

nonsensical(4)
