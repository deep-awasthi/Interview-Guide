class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        row = len(matrix)
        col = len(matrix[0])
        col0 = False
        row0 = False
        for i in range(row):
            if matrix[i][0]== 0:
                col0 = True
                break
        for i in range(col):
            if matrix[0][i] == 0:
                row0 = True
                break
        if row>1 and col>1:
            for i in range(1, row):
                for j in range(1,col):
                    if matrix[i][j]==0:
                        matrix[0][j] = 0
                        matrix[i][0] = 0
            
            for i in range(1, row):
                for j in range(1, col):
                    if matrix[0][j] == 0 or matrix[i][0] == 0:
                        matrix[i][j] = 0
            
            if matrix[0][0]==0:
                for i in range(1,row):
                    matrix[i][0] = 0
                for j in range(1,col):
                    matrix[0][j] = 0
            
            if row0 == True:
                for i in range(col):
                    matrix[0][i] = 0
                    
            if col0 == True:
                for i in range(row):
                    matrix[i][0] = 0

        elif row==1 and col>1:
            flag  = 1
            for i in range(col):
                if matrix[0][i]==0:
                    flag = 0
                    break
            if flag == 0:
                for i in range(col):
                    matrix[0][i]=0
        
        elif row>1 and col==1:
            flag = 1
            for i in range(row):
                if matrix[i][0]== 0:
                    flag = 0
                    break
            if flag==0:
                for i in range(row):
                    matrix[i][0] = 0

        return matrix
