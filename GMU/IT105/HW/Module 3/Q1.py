print("Enter the score for the first race")
print("(1 for third place, 2 for second place, 3 for first place, 0 for other)")
r1 = input()
s1 = (int)(r1)
print("Enter the score for the second race")
print("(1 for third place, 2 for second place, 3 for first place, 0 for other)")
r2 = input()
s2 = (int)(r2)
if (s1 + s2) >= 3:
    print("Congratulations, you qualify for the final race!")
else:
    print("Better luck next time.")
