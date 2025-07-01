

public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;//1<<0 or 1>>0 = 1 same 
        if((n & bitMask) ==0){
            //even
            System.out.println("even no.");

        }
        else{
            System.out.println("odd");
        }
    }

    // to get ith bit our bit mask will be 1<<i and then do & if result is 1 then ith bit is 1 else 0
    public static int getIthBit(int n ,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }


    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){

        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask; 


    }

    public static int clearLastIBits(int n,int i){
        int bitMask = (-1)<<i;
        return n & bitMask;
    }


    public static void main(String[] args) {
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //     System.out.println(5 & 6);
    //     System.out.println(5 | 6);
    //     System.out.println(5 ^ 6);
    //     //5-> 101
    //     //6-> 110
    //    //5^6->011 -> 0/p will be 3 
    //     System.out.println(~3);
        
    //     System.out.println(5<<2);
    //     System.out.println(6>>1);
    // ~~~~~~~~~~~~~~~~~~~~~~~~~
    // oddOrEven(3);
    // oddOrEven(4);
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~
        // operations
        // 1.Get ith bit
        // System.out.println(getIthBit(10,3 ));
        //2.set ith bit
        // System.out.println(setIthBit(10, 2));
        //3.clear ith bit
        // System.out.println(clearIthBit(10, 1));
        //4.update ith bit
        // System.out.println(updateIthBit(10, 2, 1));
        //last i bits clear
        System.out.println(clearLastIBits(15,2 ));

    }
    
}
