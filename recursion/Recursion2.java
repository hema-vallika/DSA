public class Recursion2 {

    public static int tilingProblem(int n){//2 * n (floor size)
        //base case
        if(n == 0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;

    }


    public static void removeDuplicates(String str, int idx,StringBuilder newString, boolean[] map){
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currentChar = str.charAt(idx);
        //check if already present
        if(map[currentChar - 'a'] == true){//fuplicate so next ko call karo
            //present
            removeDuplicates(str, idx + 1, newString, map);
        } else {
            //not present
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString.append(currentChar), map);
        }
    }

    public static int freindsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //kaam
        //single frnd
        int fnm1 = freindsPairing(n-1);
        //pair of frnds
        int fnm2 = freindsPairing(n-2) * (n-1);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void printBinString(int n,int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        if(lastPlace == 0){
            printBinString(n-1, 0, str+"0");
            printBinString(n-1, 1, str+"1");
        }else{
            printBinString(n-1, 0, str+"0");

        }


    }









    public static void main(String[] args) {
        // System.out.println(tilingProblem(4));
        // String str = "appnnacollege";
        // boolean[] map = new boolean[26];
        // removeDuplicates(str, 0, new StringBuilder(""), map);
        // System.out.println(freindsPairing(3));
        printBinString(3, 0, "");

    }
    
}
