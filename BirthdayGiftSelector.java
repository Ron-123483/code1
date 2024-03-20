import java.util.Scanner;


public class BirthdayGiftSelector {
    public static void main(String[]args){

        double amount;

        //The program will first prompt the user to state how much money they want to put toward the gift

        Scanner scanner = new Scanner(System.in);


        System.out.println("How much do you want to spend towards the gift: ");


        // this will input the amount
        amount = scanner.nextDouble();



        if(amount > 10 && amount <= 30){

            System.out.println("I suggest you go for a cool T-shirt. \n");
        }
        else if(amount > 30 && amount <= 50){

            System.out.println("I suggest you go for a perfume. \n");

        }
        else if(amount <= 10){

            System.out.println("I suggest you go for hat. \n");
        }
        else{
            System.out.println("Don't spend this much on a gift give it to charity. \n");
        }





        /*
        // Part 2

        // Making a category

        double price;

        System.out.println("How much would you like to spend on a gift? ");

        price = scanner.nextInt();

        String choice;

        choice = scanner.next();

        if (price < 10) {
            if (choice.equalsIgnoreCase("electronics")) {
                System.out.println("hello");

            }
        }

*/









        /*
       // String Category;

        System.out.println("If you really want to buy your friend your gift. For " + (int)amount + " dollars : \n");

       // Category = scanner.next();


        if (amount >= 10 && amount <= 30) {
            System.out.println("You can buy electronics such as phone case. ");
        } else if (amount > 30 && amount <= 50) {
            System.out.println("You can buy electronics such as camera lens for a phone. ");
        } else if (amount < 10) {
            System.out.println("You can buy electronics such as a phone charger. ");
        }

        if (amount >= 10 && amount <= 30) {
            System.out.println("You can buy clothes such as SFSU T-shirt. ");
        } else if (amount > 30 && amount <= 50) {
            System.out.println("You can buy clothes such as SFSU hoodie. ");
        } else if (amount < 10) {
            System.out.println("You can buy clothes such as cap. ");
        }

        if (amount >= 10 && amount <= 30) {
            System.out.println("You can buy books such as the book 'Flowers for Algernon' . ");
        } else if (amount > 30 && amount <= 50) {
            System.out.println("You can buy books such as the book 'The Lord of the Rings trilogy' . ");
        } else if (amount < 10) {
            System.out.println("You can buy books such as 'The Book Thief' . ");
        }

        if (amount >= 10 && amount <= 30) {
            System.out.println("You can buy a gift card such as Target gift card. ");
        } else if (amount > 30 && amount <= 50) {
            System.out.println("You can buy a gift card such as Visa gift card. ");
        } else if (amount < 10) {
            System.out.println("You can buy a gift card such as Starbucks gift card. ");
        } else {
            System.out.println("You should not spend too much on gifts. ");
        }


*/

/*
        if(Category > 10 && Category <= 30 && Category.equals("Electronics")){

            System.out.println("I suggest you go for a cool T-shirt. ");
        }
        else if(Category > 30 && Category <= 50){

            System.out.println("I suggest you go for a perfume. ");

        }
        else if(Category <= 10){

            System.out.println("I suggest you go for hat. ");
        }
        else{
            System.out.println("Don't spend this much on a gift give it to charity. ");
        }


       // Category = scanner.nextLine();


        if (Category.equals("Electronics")) {
            System.out.println("We have lots of grocery!");
        } else if (Category.equals("Flower")) {
            System.out.println("I am afraid we are out of flower today!");
        } else if (Category.equals("Baked Goods")) {
            System.out.println("Our baked items are always fresh!");
        } else {
            System.out.println("Invalid choice. Please come back later!");
        }

*/



















       // Based on the amount entered from the previous step, suggest a gift depending on the amount entered:
       // If they say less than 10 dollars, suggest one thing (of your choosing)
       // If they say between 10 and 30 dollars, suggest a bit more expensive another thing
       // If they say between 30 and 50 dollars, suggest a little more expensive thing
        //If they say above 50 dollars, tell them to not spend that much on a gift but rather to give that to charity.





    }
}
