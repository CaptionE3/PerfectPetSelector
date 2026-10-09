import java.util.Scanner;

public class Pet{
    public static void main(String[]args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("enter color");


        String color = myObj.nextLine();
        System.out.println();

        if(!color.equals("blue") && !color.equals("red") && !color.equals("green")){
            System.out.println("Not a real color!");
            return;
        }

        
            System.out.println("enter season");
         
        String season = myObj.nextLine();
        System.out.println();
        
         if(!season.equals("winter") && !season.equals("fall") && !season.equals("summer") && !season.equals("spring")){
            System.out.println("Not a real season!");
            return;
         }
        
            System.out.println("enter name");
        }
        




    }
    

}
