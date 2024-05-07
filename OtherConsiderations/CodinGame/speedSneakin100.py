import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

c= int(input())
p= int(input())
d= int(input()) * 60
x=y=0
s=[]
t=[]
while x < d:
    if x != 0:
        s.append(x)
    x += c
while y < d:
    if y != 0:
        t.append(y)
    y += p
r=0
for z in s:
    if z in t:
        r+=1
if r == 0:
    print("No Encounters")
else:
    print(r)


# best

# import math
# *t,d=map(int,open(0))
# print((d*60-1)//math.lcm(*t)or'No Encounters')

#second different/4th

# c,p,d=map(int,open(0))
# print(sum(t%c<1for t in range(p,d*60,p))or"No Encounters")

#6th

# exec("c,p,d="+"int(input()),"*3)
# d*=60
# e=-1
# t=s=0
# while t<d and s<d:e,t,s=e+(t==s),t+c*(t<s),s+p*(t>=s)
# print(e or"No Encounters")

#7th

# z=input
# c,p,d=int(z()),int(z()),int(z())
# n=0
# for i in range(max(c,p),d*60):
#     if i%c==i%p==0:
#         n+=1
# print(n if n>0 else "No Encounters")