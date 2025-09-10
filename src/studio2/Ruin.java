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

        double moneyLeft = startAmount;
        
        while(moneyLeft > 0 && moneyLeft < winLimit) {
            boolean win = winChance >= Math.random();
            if (win == true) {
                
                moneyLeft++;
                System.out.println("You won! Your money left is " + moneyLeft);
            }
            else { 
                moneyLeft--;
                System.out.println("You lost! Your money left is " + moneyLeft);
            }

            



        }

        


    }

}
