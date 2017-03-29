package coinsimulation;

import java.util.Random;

public class CoinSimulation {

    public static void main(String[] args) {
        //generate random numbers to bring element of chance-probability
        Random rn = new Random();
        
        //counter used to keep track of number of observations
        int counterHead = 0;
        int counterTail = 0;

        //The coin is tossed 1000 times
        for(int i =0; i < 1000; i++) {
            int toss = rn.nextInt(10) + 1;
            
            //the random numbers should be equally distributed as probability of either occurrence is a half
            if(toss <= 5){
                counterHead++;
            }else {
                counterTail++;
            }
        }
        
        //Final tally of number of heads and tails observed-frequency
        //This is the statistics part
        System.out.println("Number of heads observed is: " + counterHead);
        System.out.println("Number of tails observed is: " + counterTail);
        
               
    }
    
}
