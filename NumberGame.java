import java.util.*;
public class NumberGame{
    public static int hitOrMiss(int target, int number){
        if(target == number){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int game(){
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Game Starts now:");
        System.out.println("In this Game you need to guess the number generated randomly between 1 to 100.");
        System.out.println("To get Good Score you need to guess the number in least guesses.Use hints to do ....");
        System.out.println("Please read all rules before you Start the game");
        System.out.println("Rules:");
        System.out.println("1.if your guessed number is more than target : Aim less hint will be given.");
        System.out.println("2.if your guessed number is less than target : Aim more hint will be given.");
        System.out.println("3.You have only 10 chances to guess the number");
        int yourNumber;
        int hit=0;
        int Score;
        int count;
        int target=random.nextInt(100);
        for(count=9;count >= 0;count--)
        {
            System.out.println("Guess the number:");
            yourNumber=input.nextInt();
            hit = hitOrMiss(target,yourNumber);
            if( hit == 1){
                System.out.println("Congrats you won !!");
                break;
            }
            else{
                System.out.println("Hints:");
                if(target > yourNumber){
                    System.out.println("Aim more");
                }
                else{
                    System.out.println("Aim less");
                }
                System.out.println("you have "+count+" chances");
            }
        }
        if(hit == 1){
            if(count >= 8){
                System.out.println("Excellent");
            }
            else if(count >= 6){
                System.out.println("Good");
            }
            else if(count >= 4){
                System.out.println("Average can do better!!");
            }
            else if(count >= 1){
                System.out.println("Need to improve");
            }
        }
        else{
            System.out.println("You Lost Try Again!!");
        }
        Score=((count+1)*10);
        System.out.println("Your Score: "+Score);
        System.out.println(target);
        System.out.println("Restart : Enter 1");
        System.out.println("Exit : Enter 0");
        int opinion=input.nextInt();
        if(opinion == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner enter=new Scanner(System.in);
        System.out.println("------Welcome to Number Game------");
        System.out.println("To start : Enter 1");
        System.out.println("To exit : Enter 0");
        int start=enter.nextInt();
        int Restart;
        if(start == 1){
           Restart = game();
        }
        else{
            return;
        }
        while (Restart == 1) {
            Restart=game();
        }
    }
}
