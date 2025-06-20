public class Arrques {
    public static int trappedRainWater(int height []){//o(n)
        int n = height.length;
        //calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n -1] = height[n -1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trappedWater = 0;
        // loop
        for(int i=0;i<n;i++){
            // water level = Math.min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

        // waterlevel = Math.min(leftMax, rightMax) 
        //trappedWater += waterLevel - height[i];
    }


    public static int buyAndSellStocks(int prices []){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){//profit aa raha hein
                int profit = prices[i] - buyPrice; //today profit
                maxProfit = Math.max(maxProfit, profit);
                }else{
                buyPrice = prices[i]; //buying price
                }

        }
        return maxProfit;
    }




    public static void main(String[] args) {
        // int height[]= {4,2,0,6,3,2,5};
        // System.out.println("Trapped Rain Water: " + trappedRainWater(height));

        int prices [] ={7,1,5,3,6,4};
        System.out.println("Max Profit from Buy and Sell Stocks: " + buyAndSellStocks(prices));
        
    }
}