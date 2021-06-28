package string;

import java.util.HashMap;

/* given string consist of roman characters convert it to integer
* @author Vidyadhar
*  problem link : https://leetcode.com/problems/roman-to-integer/
* */
public class RomanToInteger {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character,Integer> romanNum = new HashMap<>();
        romanNum.put('I',1);
        romanNum.put('V',5);
        romanNum.put('X',10);
        romanNum.put('L',50);
        romanNum.put('C',100);
        romanNum.put('D',500);
        romanNum.put('M',1000);

        int result = 0;
        char prev = s.charAt(n-1);
        for(int i= n-1;i >= 0;i-- ){
            char ch = s.charAt(i);
            if(romanNum.get(ch) >= romanNum.get(prev)){
                result += romanNum.get(ch);
            }else{
                result -= romanNum.get(prev);
                result +=  romanNum.get(prev) - romanNum.get(ch);
            }
            prev = ch;
        }
        return result;
    }
}
