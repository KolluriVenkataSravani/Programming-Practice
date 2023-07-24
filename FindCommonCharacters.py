'''
Given a string array words, return an array of all characters that show up in all strings 
within the words (including duplicates). You may return the answer in any order.
'''
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        lst1=list(words[0])
        for i in words[1:]:
            lst2=[]
            for j in i:
                if j in lst1:
                    lst2.append(j)
                    lst1.remove(j)
            lst1=lst2
        return lst1
