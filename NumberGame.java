import java.util.Scanner;

public class NumberGame{

    public static int generate(int min,int max){
            return(int)(Math.random()+(max - min + 1) + min);
    }

    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int attempts = 10;
        int win = 0;
        boolean playAgain = true;

        System.out.println("        WELCOME ");
        System.out.println("You have " + attempts +" attempts to win the game");

        while (playAgain){
            int rand = generate(1,100);
            boolean guess  = false;
            for(int  i= 0;i < attempts ; i++){
                System.out.print("Chance "+ (i+1)+ "  Enter your Guess: ");
                int user  = sc.nextInt();
                if(user == rand ){
                    guess = true;
                    win += 1;
                    System.out.println("Correct.You won..");
                    break;
                }
                else if(user > rand){
                    System.out.println("Too High");
                }
                else {
                    System.out.println("Too Low");
                }
            }
            if( guess == false){
                System.out.println("You lost the chances.The number is:" +rand);
            }
            System.out.println("Do yo want to play again(y/n)?");
            String pA  =sc.next();
            playAgain = pA.equalsIgnoreCase("y");

        }
        System.out.println("Hope You have enjoyed it.");
        System.out.println("Here score :" +win);

    sc.close();
    }
}