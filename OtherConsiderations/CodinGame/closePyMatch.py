#mine 87

n=int(input())
for x in range(n):print('#'*n if x==0 or x==n-1 else'#'+(' '*(n-2))+'#')

# best 79

n=int(input())
for i in range(n):print(n*"#"if (i+1)%n<2 else"#"+" "*(n-2)+"#")


print(sum(int(c) for c in bin(int(input()))[2:]))
print(sum(int(x)for x in bin(int(input()))[2:]))