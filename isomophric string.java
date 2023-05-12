/**
    search through string s and record all visited letters into a string and their placement in a string of integers.
    Do the same for string t and compareteh string of integers for both.

 */
import java.util.HashMap; //import hashmap library

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap <String, Integer> storeds = new HashMap<String, Integer>();
        HashMap <String, Integer> storedt = new HashMap<String, Integer>();
        
        //A1 is for visited char and a2 is the integer
        String a1 = "";
        String a2 = "";
        String b1 = "";
        String b2 = "";


          
  
        for (int i = 1; i < s.length()+1; i++){
            char a = s.charAt(i-1);
            String stringa = Character.toString(a);
            if (a1.contains(stringa)){
                a2 += storeds.get(stringa);
            } else {
                a1 += stringa;
                a2 += i;
                storeds.put(stringa,i);
                  
            }
  
          }
  
        for (int i = 1; i < t.length()+1; i++){
            char a = t.charAt(i-1);
            //System.out.println(a);
            String stringa = Character.toString(a);
            if (b1.contains(stringa)){
                //System.out.println('1');
                b2 += storedt.get(stringa);
            }else {
                b1 += stringa;
                //System.out.println('2');
                //System.out.println(b1);
                b2 += i;
                storedt.put(stringa,i);
                  
            }
  
        }

        if(a2.compareTo(b2) != 0) {
            System.out.println(a2 +" "+b2);
            return false;
        }

        System.out.println(a2 +"and"+b2);
        
        return true;
    }
}
