import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RaffleApp {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<EntrantInfo> entrants = new ArrayList<>();    // Basically stores the entrants inputs in EntrantInfo Array
        Random random = new Random();

        int raffleEntrants = 0;

        do {        // Gets entrants information they input
            System.out.println ("Entrant " + (raffleEntrants + 1) + (" full name: "));
            String name = scnr.nextLine();
            System.out.println ("Entrant " + (raffleEntrants + 1) + (" primary email: "));
            String email = scnr.nextLine();
            System.out.println ("Entrant " + (raffleEntrants + 1) + (" JDK version: "));
            String jdkVersion = scnr.nextLine();

            EntrantInfo entrant = new EntrantInfo(name, email, jdkVersion);     // This part stores the entrants information and adds each entrant to the ArrayList
            entrants.add(entrant);
            raffleEntrants++;       // raffleEntrants is increased by 1 after every loop

            System.out.println();
        }
        while (raffleEntrants < 3);  // This do-while loop makes it so no more than 3 entrants are entered into the raffle

        int winnerPicked = random.nextInt(entrants.size());     // This random object would pick the winner randomly
        EntrantInfo won = entrants.get(winnerPicked);
        System.out.println();

        System.out.println("Entrants In The Raffle Are:");            //  Prints every entrant input like name, email and JDK version
        for (EntrantInfo entrant : entrants) {      // Creates new variable entrant and assigns the value of the first element in the entrants list
            System.out.println(entrant.getName() + ", Email: " + entrant.getEmail() + " JDK Version: " + entrant.getJdkVersion());

            System.out.println();
        }

        System.out.println();
        System.out.println("And The Winner Of The GPU Raffle Is...");
        for (int i = 3; i > 0; i--) {       // This for loop counts down from 3 to 1
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pauses the program for 1 second
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(won.getName() + ", Email:" + won.getEmail() + " and uses JDK Version: " + won.getJdkVersion());      // gets and prints the winner here
    }
}