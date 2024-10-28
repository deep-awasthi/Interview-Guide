class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        elif numRows == 2:
            return [[1],[1,1]]
        else:
            arr = [[1],[1,1]]
            for i in range(2,numRows):
                b = [1]
                f,s = 0,1
                for j in range(len(arr[-1])-1):
                    b.append(arr[-1][f]+arr[-1][s])
                    f+=1
                    s+=1
                b.append(1)
                arr.append(b)
            return arr
