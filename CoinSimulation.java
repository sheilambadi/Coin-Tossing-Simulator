package coinsimulation;

import java.util.Random;

public class CoinSimulation {

    public static void main(String[] args) {
        Random rn = new Random();
        
        int counterHead = 0;
        int counterTail = 0;

        for(int i =0; i < 1000; i++) {
            int toss = rn.nextInt(10) + 1;
            
            if(toss <= 5){
                counterHead++;
            }else {
                counterTail++;
            }
        }
        
        System.out.println("Number of heads observed is: " + counterHead);
        System.out.println("Number of tails observed is: " + counterTail);
        
               
    }
    
}
