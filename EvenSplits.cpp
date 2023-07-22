/*
You are given a binary string S of length N. You can perform the following operation on it:
Pick any non-empty even-length subsequence of the string.
Suppose the subsequence has length 2k. Then, move the first k characters to the beginning of S and the other k to the end of S (without changing their order).
What is the lexicographically smallest string that can be obtained after performing this operation several (possibly, zero) times?
*/
#include <iostream>
using namespace std;
#include<algorithm>
int main() {
	// your code goes here
	int tc;
	int i;
	cin>>tc;
	while(tc--){
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    if(n>2){
	        sort(s.begin(),s.end());
	    }
	    cout<<s<<"\n";
	}
	return 0;
}
