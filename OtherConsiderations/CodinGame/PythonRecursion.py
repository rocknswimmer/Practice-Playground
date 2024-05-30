import sys
import math
import itertools
# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

number = int(input())
s = input().split()# contains words that can make a palandrome sentence
for n in itertools.permutations(s):# goes through all possible orders of a list
    if "".join(n) == "".join(n)[::-1]:
        print(" ".join(n))
        break
