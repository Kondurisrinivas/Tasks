T=int(input())
for _ in range(T):
    a=[]
    start=int(input())
    end=int(input())
    step=int(input())
    for i in range(start,end+1,step):
        a.append(i)
    print(a)