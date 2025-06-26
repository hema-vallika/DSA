public class SubString {

    //start idx include but end index is not included
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }


    public static String largestLexicographicString(String fruits []){ //o(X*n) where X = max letters
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){ //largest < fruits[i] ==> <0
                                                   //largest > fruits[i] ==> >0
                                                   //largest == fruits[i] ==> ==0
                largest = fruits[i];
            }
        }
        return largest;

    }

    public static String firstLetterWordUppercase(String str){
      StringBuilder sb = new StringBuilder("");
      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);
      for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }

    public static String compress(String str){ //o(n)
        String newStr ="";
        for(int i =0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
               
            }
            
        }
        return newStr;
    }


    public static String compressStringBuilder(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {

        // String str = "helloWorld";
        //inbuilt
        // System.out.println(str.substring(0, 5));
        // System.out.println(subString(str, 0, 5));

        // String fruits [] = {"apple","mango","banana"};
        // System.out.println(largestLexicographicString(fruits));
        //if doing this with string then o(n^2)
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch <= 'z'; ch++){ //o(26)

        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // String str = "hi, i am hema";
        // System.out.println(firstLetterWordUppercase(str));
        
        String str = "aaabbbcccdd";
        System.out.println(compress(str));
    }
    
}
