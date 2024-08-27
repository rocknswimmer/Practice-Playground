l, s, n = [int(i) for i in input().split()]

#creat line of code to run
line=''
for i in range(l):
    line+=(input())

#store numbers to insert on , instruction
nums=[]
numsInd=0
for i in range(n):
    nums.append(int(input()))

#initialize array, pointer, and final answer
arr=[0]*s
cell=0
cur=''

#create open close pairs for []'s and check for validity
opens=[]
closes=[]
pairs=[]
valid=True
for i in range(len(line)):
    curVal=line[i]
    if curVal=='[':
        opens.append(i)
    if curVal==']':
        closes.append(i)
        if len(closes)>len(opens):valid=False
        if valid:
            pairs.append([opens[-1],i])
            opens.pop()
            closes.pop()
if valid:
    valid = len(opens)==len(closes)

#exicute the line of code, note when you [ or ] you change the index
ind=0
while ind < len(line) and valid:
    action=line[ind]
    if action == '[' and arr[cell]==0:
        dist = line[ind:].index(']')
        action = line[ind+dist+1]
        ind=ind+dist+1
    if action == ']' and arr[cell]!=0:
        curOp = 0
        for i in range(len(pairs)):
            if pairs[i][1]== ind:curOp=i
        action=line[pairs[curOp][0]+1]
        ind=pairs[curOp][0]+1
    if action == '>':
        cell+=1
        if cell > s-1:
            cur="POINTER OUT OF BOUNDS"
            break
    if action == '<':
        cell-=1
        if cell < 0:
            cur="POINTER OUT OF BOUNDS"
            break
    if action == '+':
        arr[cell]+=1
        if arr[cell] > 255:
            cur="INCORRECT VALUE"
            break
    if action == '-':
        arr[cell]-=1
        if arr[cell] < 0:
            cur="INCORRECT VALUE"
            break
    if action == '.':
        cur+=chr(arr[cell])
    if action == ',':
        arr[cell]=nums[numsInd]
        numsInd+=1
        if arr[cell] > 255 or arr[cell]< 0:
            cur="INCORRECT VALUE"
            break
    ind+=1

print(cur if valid else "SYNTAX ERROR")