import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the qualifier to the replacement string.
        // So, my teacher hates me becomes "Why do you say that your teacher hates you?" The replacement method returns the same words as the user entered only the replacement words have been swapped. Then the qualifier is prepended to the user's words.
        //out put
        //Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
        //your teacher hates you
        //Enter your response here or Q to quit: i dont know what's wrong
        //you dont know what's wrong
        //Enter your response here or Q to quit: i am feeling great
        //you are feeling great
        Scanner sca = new Scanner(System.in);
        System.out.println("Good day! this is Eliza if you have a problem please press enter or if not press Q");
        String userInput= sca.nextLine();

        while (!userInput.equalsIgnoreCase("Q")) {
           if (userInput.contains("I am feeling great")) {
                 System.out.println("Thank you");
           break;

            }
            //System.out.println(userInput);
            System.out.println("Enter your response here or Q to quit: ");
            userInput = sca.nextLine();
            //System.out.println("Your response is : " + userInput);
            for (int h = 0; h <= userInput.length(); h++) {
                if (userInput.contains("my")) {
                    // userInput = sca.nextLine();
                    userInput = userInput.replace("my", "yours");
                    // userInput = sca.nextLine();
                    // System.out.println(userInput);

                } else if (userInput.contains("me")) {
                    userInput = (userInput.replace("me", "you"));
                } else if (userInput.contains("i ")) {
                    userInput = (userInput.replace("i ", "you  "));

                }

            }

            System.out.println(userInput);
        }
    }
}


