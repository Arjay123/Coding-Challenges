#if strings are "Funny"
def isFunny(s, r):
    i=0
    while(i < len(s)):
        #          |s[i] - s[i-1]|           |s[i] - s[i-1]|
        if(abs(ord(s[i]) - ord(s[i-1]))!=abs(ord(r[i]) - ord(r[i-1]))):
            return False
        i=i+1
    return True
        
testCases = input() #get num of test cases
i = 0 
while(i<int(testCases)):
    s = input() #get next string input
    r = s[::-1] #reverse using extended slice, i.e. get 'elements' backwards
    if(isFunny(s, r)):
        print("Funny")
    else:
        print("Not Funny")
    i = i+1
    


