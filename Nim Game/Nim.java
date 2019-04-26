import java.util.Scanner;
import java.util.Random;

public class Nim {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int smart_or_stupid;

        smart_or_stupid = rand.nextInt(2);

        if (smart_or_stupid == 1) {
            int random_number = rand.nextInt(2);

            // this is when the computer is in smart mode and goes first 
            if (random_number == 1) {
                // this creates the marbles
                int random_marbles = rand.nextInt(91) + 10;
                System.out.println("Marbles in Pile: " + random_marbles);


                while (random_marbles > 0) {
                    double half_of_pile = Math.floor(random_marbles / 2);
                    int computer_removed = 0;

                    do {
                        random_marbles = random_marbles - 1;
                        computer_removed = computer_removed + 1;
                    }
                    while (random_marbles != 1 && random_marbles != 3 && random_marbles != 7 && random_marbles != 15 && random_marbles != 31 && random_marbles != 63);
                    {
                        half_of_pile = Math.floor(random_marbles / 2);
                    }
                    System.out.println("The computer removed: " + computer_removed + " marbles from the pile.");
                    System.out.println("The current number of marbles left in the pile is: " + random_marbles);


                    if (random_marbles == 1) {
                        System.out.println("you have lost");
                        break;
                    }

                    // this is the users turn, asking how many marbles to remove
                    System.out.print("How many marbles would you like to remove from the pile?: ");
                    int user_marbles_removed = scanner.nextInt();

                    while (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                        if (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                            System.out.println("You can not remove this amount of marbles.");

                            System.out.print("How many marbles would you like to remove from the pile?: ");
                            user_marbles_removed = scanner.nextInt();
                        }
                    }
                    // removes the marbles that the use took from the pile
                    random_marbles = random_marbles - user_marbles_removed;
                    System.out.println("The current number of marbles in the pile is: " + random_marbles);


                }
            }


            // computer still in smart mode, but the user plays first
            else if (random_number == 0) {
                int random_marbles = rand.nextInt(91) + 10;
                System.out.println("number of marbles left in the pile: " + random_marbles);


                while (random_marbles > 0) {
                    double half_of_pile = Math.floor(random_marbles / 2);

                    if (random_marbles == 1) {
                        System.out.println("you have lost");
                        break;
                    }

                    System.out.print("How many marbles do you want to remove from the pile?: ");
                    int user_marbles_removed = scanner.nextInt();

                    while (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                        if (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                            System.out.println("You can not remove that number of marbles.");

                            System.out.print("How many marbles would you like to remove from the pile?: ");
                            user_marbles_removed = scanner.nextInt();
                        }
                    }
                    random_marbles = random_marbles - user_marbles_removed;
                    System.out.println("The amount of marbles left in the pile is: " + random_marbles);

                    int computer_removed = 0;

                    do {
                        random_marbles = random_marbles - 1;
                        computer_removed = computer_removed + 1;
                    }
                    while (random_marbles != 1 && random_marbles != 3 && random_marbles != 7 && random_marbles != 15 && random_marbles != 31 && random_marbles != 63);
                    {
                        half_of_pile = Math.floor(random_marbles / 2);
                    }
                    System.out.println("The computer removed: " + computer_removed + " marbles from the pile.");
                    System.out.println("number of marbles remaining in the pile: " + random_marbles);


                }
            }
        }

        // This is where the computer plays the stupid mode
        else if (smart_or_stupid == 0) {

            // this chooses who goes first
            int random_number = rand.nextInt(2) + 0;

            // player gets first turn
            if (random_number == 0) {
                int random_marbles = rand.nextInt(91) + 10;
                System.out.println("number of marbles in the pile currently: " + random_marbles);

                while (random_marbles > 0) {
                    int half_of_pile = (int) Math.floor(random_marbles / 2);

                    if (random_marbles == 1) {
                        System.out.println("you lost");
                        break;
                    }

                    System.out.print("How many marbles do you want to remove from the pile?: ");
                    int user_marbles_removed = scanner.nextInt();

                    while (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                        if (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                            System.out.println("This is an invalid number, try again..");

                            System.out.print("How mant marbles do you want to take out of the pile?: ");
                            user_marbles_removed = scanner.nextInt();
                        }
                    }
                    random_marbles = random_marbles - user_marbles_removed;
                    System.out.println("number of marbles left: " + random_marbles);

                    if (random_marbles == 1) {
                        System.out.println("You have won, congratulations");
                        break;
                    }
                    half_of_pile = (int) Math.floor(random_marbles / 2);
                    int computer_removed = rand.nextInt(half_of_pile) + 1;

                    random_marbles = random_marbles - computer_removed;

                    //System.out.println("Current number of marbles in pile: " + random_marbles);

                    System.out.println("The computer removed: " + computer_removed + " marbles from the pile.");
                    System.out.println("The current number of marbles is: " + random_marbles);

                }
            }

            // computer plays first turn still in stupid mode
            else if (random_number == 1) {
                // Generates Marbles
                int random_marbles = rand.nextInt(91) + 10;
                System.out.println("marbles in pile: " + random_marbles);

                while (random_marbles > 0) {
                    int half_of_pile = (int) Math.floor(random_marbles / 2);

                    if (random_marbles == 1) {
                        System.out.println("you win, congratulations");
                        break;
                    }
                    half_of_pile = (int) Math.floor(random_marbles / 2);
                    int computer_removed = rand.nextInt(half_of_pile) + 1;

                    random_marbles = random_marbles - computer_removed;
                    System.out.println("The computer removed: " + computer_removed + " marbles from the pile.");
                    System.out.println("The current number of marbles is: " + random_marbles);


                    if (random_marbles == 1) {
                        System.out.println("you lost");
                        break;
                    }

                    System.out.print("How many marbles do you want to remove from the pile?: ");
                    int user_marbles_removed = scanner.nextInt();

                    while (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                        if (user_marbles_removed > half_of_pile || user_marbles_removed == 0) {
                            System.out.println("You can not remove that many marbles.");

                            System.out.print("How many marbles do you want to remove from the pile?: ");
                            user_marbles_removed = scanner.nextInt();
                        }
                    }
                    random_marbles = random_marbles - user_marbles_removed;
                    System.out.println("The amount of marbles left in the pile: " + random_marbles);

                }
            }
        }
    }
}