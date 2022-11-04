import java.util.Scanner;
public class BooleanFun {
    public static void main(String[] args) {
        System.out.print("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int myAge = input.nextInt();
        System.out.println("Current age: " + myAge);

        //convert these into something more complete using if statements
        System.out.println("Can rent a car: " + (myAge >= 25));
        if(myAge >= 25){
            System.out.println("You can rent a car!");
        }
        else{
            System.out.println("You cannot rent a car :( ");
        }
        System.out.println("Gets a senior discount: "+ (myAge >= 65));
        if(myAge >= 65){
            System.out.println("You can get a senior discount!");
        }
        else{
            System.out.println("You cannot get a senior discount :( ");
        }
        System.out.println("Can order from children's menu: " + (myAge <= 12));
        if(myAge <= 12){
            System.out.println("You can order from a children's menu!");
        }
        else{
            System.out.println("You cannot order from a children's menu :( ");
        }
        int nextAge = myAge + 1;
        System.out.println("On your next birthday out you will be: "+nextAge); //complete this code, don't do math in sout

        //further modification: prompt user for input and then print what they are able to do based on their age
        //and print their age on their next birthday

    }
}
