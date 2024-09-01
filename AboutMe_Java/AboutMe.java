package AboutMe_Java;
import java.util.Scanner;

public class AboutMe {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean found = false;
        boolean done = false;
        String message = new String();
        while (!done) {
            System.out.print("What would you like to know about me? ");
            String question = input.next();
            while (!found) {
                found = true;
                switch (question) {
                    case "Discord": message = "I have 3 Discord accounts\nMy main account (I have full friends): joshua_green\nMy second account: dynoalt\nMy third account: dynoalt2"; break;
                    case "Discord_Server": message = "My Discord server link is https://www.discord.gg/yA9sQt7AuW \nOr you can use the code: yA9sQt7AuW"; break;
                    case "Snapchat": message = "My Snapchat is jaysnappychatt\nYou could also use the link: https://www.snapchat.com/add/jaysnappychatt?share_id=aC_7Xxwjf4o&locale=en-US"; break;
                    case "Age": message = "I am 17 years old"; break;
                    case "Number": message = "My phone number is (321)393-5321"; break;
                    case "Birthday": message = "My birthday is April 23, 2007"; break;
                    case "Sexuality": message = "I am bisexual"; break;
                    case "Status": message = "I am single"; break;
                    case "YouTube": message = "My youtube channel links are 7 ,u89"; break;
                    default: System.out.print("Couldn't find what you are looking for! Please try again. "); question = input.nextLine(); found = false; break;
                }
            }
            System.out.println(message);
            System.out.print("Is there anything else you would like to know about me? Yes or No: ");
            String yesOrNo = input.next();
            switch (yesOrNo) {
                case "Yes": break;
                case "No": done = true; break;
                default: System.out.println("Please type Yes or No: "); break;
            }
        }
    }
}
