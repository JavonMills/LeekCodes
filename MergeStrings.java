class Solution {
    public String mergeAlternately(String word1, String word2) {
        //put the length of both strings into variables
        int w1len = word1.length();
        int w2len = word2.length();
        String answer = "";
        //find the size of the smaller string and puts it into a variable
        int smaller = 0;
        String rest = "";
        boolean w1IsBigger = false;
        if (w1len == w2len){
            for (int i = 0; i < w1len ; i++ ) {
                //System.out.println(w1len);
                char temp = word1.charAt(i);
                char temp2 = word2.charAt(i); 
                answer = answer + temp + temp2;
               
            }
            return answer;

        }else if (w2len < w1len){
            w1IsBigger = true;
            smaller = w2len  ;

        
        }else{
            smaller = w1len  ;
        }

        for (int j = 0; j < smaller ; j++) {
            System.out.println(j);
            char temp = word1.charAt(j);
            char temp2 = word2.charAt(j); 
            answer = answer + temp;
            answer = answer + temp2;
            
        }

        
        
        if (w1IsBigger == true) {
            
            String subs = word1.substring(w2len);   
            answer = answer + subs;
        } else {
            String subs = word2.substring(w1len);
            answer = answer + subs;
        }

        return answer;

    }
}
