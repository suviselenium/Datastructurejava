import com.sun.media.sound.InvalidDataException;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class Angram {

    /**
     *  Given 2 strings, this method will determine if they are anagram or not.
     *  If the strings are anagram it will return true or else it will return false.
     *
     * @param str1
     * @param str2
     * @return boolean
     * @throws InvalidDataException
     */
    public boolean isStringAnagram(String str1, String str2) throws InvalidDataException{
        boolean isAnagram = true;

        if(str1==null||str2==null){
            throw new InvalidDataException();
        }

        if((str1.length()==0)||(str2.length()==0)){
            throw new InvalidDataException();
        }

        String strUpdate1 = str1.replaceAll("\\s", "").trim().toLowerCase();
        String strUpdate2 = str2.replaceAll("\\s", "").trim().toLowerCase();

        int strlen1 = strUpdate1.length();
        int strlen2=  strUpdate2.length();

        System.out.println(strUpdate1 + " and length " + strlen1);
        System.out.println(strUpdate2 + " and length " + strlen2);


        if(strlen1!=strlen2) {
            isAnagram=false;
        }else {
            HashMap<Character, Integer> strmap;
            strmap = new HashMap<Character,Integer>();

            for(int i=0;i<strlen1;i++) {
                char key = strUpdate1.charAt(i);
                int count = 0;

                if(strmap.containsKey(key)) {
                    count=strmap.get(key);
                }
                strmap.put(key, ++count);
                System.out.print(strmap.keySet() +" ");
                System.out.println(strmap.values() +" ");
                count=0;

                key=strUpdate2.charAt(i);

                if(strmap.containsKey(key)) {
                    count= strmap.get(key);
                }
                strmap.put(key, --count);
                System.out.print(strmap.keySet() +" ");
                System.out.println(strmap.values() +" ");
            }

            for(int mapvalue:strmap.values()) {
//                System.out.print(strmap.keySet() +" ");
//                System.out.println(mapvalue +" ");

                if(mapvalue!=0) {
                    isAnagram=false;
                }
            }

        }

        if(isAnagram) {
            System.out.println(str1 + " and  " + str2 + " are anagrams");
        }else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
        return isAnagram;
    }
}