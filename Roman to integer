import java.util.HashMap; // import the ArrayList class

class Solution {
    public int romanToInt(String s) {

        //this will allow the loop to match the roman to the integer
        HashMap <Character,Integer> mapping = new HashMap<Character,Integer>(); 
        //this is a variable for the last index of the string
        int textLen = s.length() - 1;

        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);


        
        //this will assume the smalled value that this roman can be
        int num = mapping.get(s.charAt(textLen));
        //loop through the entire string backwards
        for (int j = textLen - 1; j >= 0; j--){
            //if the previous element is less then num - j as int
            if(mapping.get(s.charAt(j)) < mapping.get(s.charAt(j + 1)) ){
                num -= mapping.get(s.charAt(j));
            //if the previous element is greater or the same num + j as int
            }else{
                num += mapping.get(s.charAt(j));
            }

        }

        return num;        

    }
}
