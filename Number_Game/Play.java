import java.util.Scanner;

public class Play{
    static Scanner sc = new Scanner(System.in);

    public static boolean result(int x){
        boolean flag = false;
        int y = Guess.getNumber();
        if(x==y){
            System.out.println("You Won!!!");
            flag = true;
            return flag;
        }
        else if(x<y){
            System.out.println("Ops wrong guess...number too low !!!");
        }
        else if(x>y){
            System.out.println("Ops wrong guess...number too high !!!");
        }
        return flag;
    }

    public static void play(){
        boolean flag = false;
        int chance = 10;
        int score = 100;
        
        System.out.println("Let's Start");

        while(flag == false && chance>0){
            System.out.println();
            System.out.println("Guess a number");
            int x = sc.nextInt();
            flag = Play.result(x);
            chance--;
            score = score-10;
        }

        System.out.println("Score:"+score);

        if(chance==0){
            System.out.println("You Lost");
            System.out.println();
            System.out.println("Play Again? y/n");
            String c = sc.next();

            if(c.equals("y")){
                Play.play();
            }    
        }

    }
    public static void main(String[] args){
        Play.play();
    }
}