# print(readline().split` `.reduce((a,d)=>d=='Reset'?0:a+{R:2,L:1,S:-1,F:-2}[d[0]],0))

# is js golf equivalent of
c=input().split(' ')
d={"Rise":2,"Leap":1,"Sink":-1,"Fall":-2,"Reset":0}
t=0
for x in c:
 if d[x]==0:
  t=0
 else:
  t+=d[x]
print(t)


#print(Array(8).fill(+readline()).reduce((m,c,i,a)=>c>a[m]?i:m,0))


# import sys
# import math

# # Auto-generated code below aims at helping you parse
# # the standard input according to the problem statement.

# s = input()

# # Write an answer using print
# # To debug: print("Debug messages...", file=sys.stderr, flush=True)

# print(sum(e.isalpha() for e in s), sum(e.isdigit() for e in s))

import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

r = list(input())
t='abcdefghijklmnopqrstuvwxyz'
s='1234567890'
x=y=0
for a in r:
    if a.lower() in t:
        x+=1
    elif a in s:
        y+=1
# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)

print(x, y)