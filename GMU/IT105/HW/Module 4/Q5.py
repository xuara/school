sugar= (float)(input('How many cups of sugar is needed for a regular sized cake?\n'))
moresugar = "{0:.2f}".format(sugar * 1.65)
print('To make a bigger cake, we would require 65 percent more sugar than that.')
print('Therefore, the amount of sugar needed for a bigger cake would be',moresugar,'cups')
