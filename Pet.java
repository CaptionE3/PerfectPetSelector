import java.util.Scanner;

public class Pet{
    public static void main(String[]args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("enter color");


        String color = myObj.nextLine();
        
        //asks color
        if(!color.equals("blue") && !color.equals("red") && !color.equals("green")){
            System.out.println("Not a real color!");
            return;
        }

        
            System.out.println("enter season");
         
        String season = myObj.nextLine();
        
            //asks season
         if(!season.equals("winter") && !season.equals("fall") && !season.equals("summer") && !season.equals("spring")){
            System.out.println("Not a real season!");
            return;
         }

            //asks name
            System.out.println("enter name");
        String name=myObj.nextLine();
          if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0,0 + 1).toLowerCase()) < 0){
                System.out.println("Not a real name!");
                return;
            //determines what pet you get 
          }
        if (color.equals("blue") && season.equals("fall")){
            System.out.println("you should have an alligater");
        }
        
        else if (color.equals("blue") && season.equals("spring")){
            System.out.println("you should have an ostrich");
        }
        else if (color.equals("green") && season.equals("winter")&&("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0,0 + 1).toLowerCase()) >= 0)){
            System.out.println("you should have a giraffe");
        }
        else if (color.equals("green") && !season.equals("fall")&&!season.equals("winter")){
            System.out.println("you should have a dog");
        }
        else if (color.equals("red") ){
            System.out.println("you should have a panda");
        }
        else if (color.equals("red") && ("aeiou".indexOf(name.substring(0,0 + 1).toLowerCase()) >= 0)){
            System.out.println("you should have a porcupine");
        }
        else if (!color.equals("green") && !color.equals("red") && season.equals("summer")&&("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0,0 + 1).toLowerCase()) >= 0)){
            System.out.println("you should have a pony");
        }
        else if (color.equals("blue") && ("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0,0 + 1).toLowerCase()) >= 0)&&season.equals("winter")){
            System.out.println("you should have a porcupine");
        }
        else 
             System.out.println("you should have a rock");

    }
}


