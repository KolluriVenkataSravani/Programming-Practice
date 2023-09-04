'''
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
'''
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [set() for _ in range(9)]
        col = [set() for _ in range(9)]
        box = [set() for _ in range(9)]
        for i in range(9):
            for j in range(9):
                val = board[i][j]
                if val == '.':
                    pass
                if val in row[i]:
                    return False
                row[i].add(val)
                if val in col[j]:
                    return False
                col[j].add(val)
                index = (i // 3)*3  + j // 3
                if val in box[index]:
                    return False
                box[index].add(val)
        return True
