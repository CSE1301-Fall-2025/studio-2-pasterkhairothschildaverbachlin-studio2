import java.util.Scanner;


public class Ruin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What amount of money are you starting with?");
        double startAmount = in.nextDouble();
        System.out.println("What probability does a player win on the game?");
        double winChance = in.nextDouble();
        System.out.println("What is your win limit?");
        double winLimit = in.nextDouble();

       
        System.out.println("What is the total simulations to run?");
        int totalSimulations = in.nextInt();
        int lossCount = 0;
        for (int i = 1; i <=  totalSimulations; i++){
            int plays = 0;
            double moneyLeft = startAmount;
            while(moneyLeft > 0 && moneyLeft < winLimit) {
                boolean win = winChance >= Math.random();
                if (win == true) {
                    
                    moneyLeft++;
                }
                
                else { 
                    moneyLeft--;
                    lossCount++;                
                }

            plays++;

            }
        
        String dayresult = "";
        if (moneyLeft != 0) {
            dayresult = "Win";
        }
        else {
            dayresult  = "LOSE";

        }

        System.out.println("Simulation " + i + ": " + plays + " " + dayresult);
        
    }
        
    
    }

}
