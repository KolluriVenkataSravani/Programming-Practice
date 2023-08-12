'''
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
'''
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if not matrix:
            return None
        m=len(matrix)
        n=len(matrix[0])
        rmat=[False]*m
        cmat=[False]*n
        for i in range(m):
            for j in range(n):
                if matrix[i][j]==0:
                    rmat[i]=True
                    cmat[j]=True
        for i in range(m):
            for j in range(n):
                if rmat[i] or cmat[j]:
                    matrix[i][j]=0
        return matrix
