
import java.util.Scanner;
import java.util.Random;
class Number{
    public int number(){
        Random random=new Random();
        int rand=random.nextInt(11);
        return rand;
    }
    public int guessing(int rand){
        Scanner sc=new Scanner(System.in);
        int guess=sc.nextInt();
        System.out.println();
        int count=0;
        while(guess!=rand){
            System.out.println("Another try");
            guess=sc.nextInt();
            count++;
        }
        sc.close();
        return count;
    }
    

}
public class NoGuessing {
    public static void main(String[] args){
        Number num=new Number();
       int a= num.number();
       System.out.println("Enter a number");
        int count=num.guessing(a);
        System.out.println("Number of tries" +"- "+ count);
        System.out.println("The number was - "+a);
        
    }
}
