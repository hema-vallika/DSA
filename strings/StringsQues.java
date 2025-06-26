public class StringsQues {

    // Count how many times lowercase vowels occurred in a String entered by the user
    public static int countLowercaseVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    //check two strings are anagrams or not ex- care and race
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            int index = str2.indexOf(ch);
            if(index == -1){
                return false;
            }
            else{
                str2 = str2.substring(0, index) + str2.substring(index + 1);
            }
        }
        return true;
    }



    public static void main(String[] args) {
        // String str1= "hi my name is hema";
        // System.out.println(countLowercaseVowels(str1));
        // String str="ShradhaDidi";
        // String str1="ApnaCollege"; 
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));
        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);

        String str1 = "care";
        String str2 = "race";
        System.out.println(areAnagrams(str1, str2));
        
    }
    
}
