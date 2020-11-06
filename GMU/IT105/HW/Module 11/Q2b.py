def silly(value):
    if value == 10:
        print("done")
        return -5
    else:
        print("not done")
        return -3 * silly(value + 2)

print("start", "final: ", silly(4))
