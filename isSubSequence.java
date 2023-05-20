class Solution {
    public boolean isSubsequence(String s, String t) {

    //two pointers- j for the smaller string
    int i=0,j=0;
    int n=t.length();
    int m=s.length();
    //convert string to charArrays
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();
    //if the size is 0 then return true
    if(m<1){
        return true;
    }
    //loop through the larger string
    while(i<n){
        //if there is a match
        if(tt[i]==ss[j]){
            // move the small pointer to the next character
            j++;
        }
        //always imcrement through the larger string
        i++;
        //if we reach the end of the small string then we reached the goal state
        if(j==m){
        return true;
        }
    }
        //else if was not a subsequence.
        return false;
    }
}
