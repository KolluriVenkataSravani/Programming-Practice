/*
Alice has an array A of length N which is initially a permutation. She dislikes K numbers which are 
B1,B2,...,BK all of which are distinct. Therefore, she removes all the occurrences of these numbers 
from A. The order of the remaining elements of the A does not change.
Can you find out the resulting array A?
Note: A permutation of length N is an array where every integer from 1 to N occurs exactly once
*/
#include <bits/stdc++.h>
using namespace std;

int main() {
    // your code goes here
    int tc;
    cin>>tc;
    while(tc--){
        int n;
        cin>>n;
        vector<int>arr(n) ;
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        int k;
        cin>>k;
        set<int>st;
        for(int i=0;i<k;i++){
            int p;
            cin>>p;
            st.insert(p);
        }
        for(int i=0;i<n;i++){
            if(st.count(arr[i])){
                continue;
            }
            else{
                cout<<arr[i]<<" ";
            }
        }
        cout<<endl;
    }
    return 0;
}
