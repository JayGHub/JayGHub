package JavaTesting;
import java.util.Scanner;

public class Testing {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello there.\nWhat is your name?");
        String name = input.nextLine();
        System.out.println("Well then, hello " + name + ".\nHow old are you?");
        int age = input.nextInt();
        System.out.println("So you are " + age + " years old then.\nDo you want to know how old you will be in ten years? Yes/No");
        yesOrNo(age);
        
    }
    public static int ageInTenYears(int age) {
        return age + 10;
    }
    
    public static void yesOrNo(int age) {
        String yesOrNo = input.next();
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            System.out.println("In ten years you will be " + ageInTenYears(age) + " years old.");
        } else if (yesOrNo.equalsIgnoreCase("no")) {
            System.out.println("Okay then, have a nice day scaredy cat.");
        } else {
            System.out.println("Please type yes or no");
            yesOrNo(age);
        }
    }
}
