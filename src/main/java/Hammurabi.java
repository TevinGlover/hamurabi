           // package declaration
import java.util.InputMismatchException;
import java.util.Random;         // imports go here
import java.util.Scanner;

public class Hammurabi {         // must save in a file named Hammurabi.java




    static Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);
////////////////////////
int getNumber(String message){
    while(true) {
        System.out.println(message);
        try {// catch any error that not a number
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\"" + scanner.next() + "\" isn't a number!");
        }
    }
}
///******************************************************************************************************************

    public static void main(String[] args) { // required in every Java program
        new Hammurabi().playGame();
    }


    void playGame() {
    int bushelsFedToPeople = ;
    int population = 100;
    int acresOwned  = 1000;
    int grainInStorage = 2800;
    int totalDeaths = 0;
    int percentDied =0;
    int year = 0;
    int immigrants = 0;
    int deaths =0;
    int yeild = 3;
    int landPrice  =0;





        // while player is equal to people !population = 0 || !overthrown || !years == 10
        // declare local variables here: grain, population, etc.
        // statements go after the declations
    }

   // public int plagueDeaths(int i) {
      //  return 0;
    //}

    public int starvationDeaths(int population, int bushelsFedToPeople) {
        // count go up as people die from not eating

        //Each person needs 20 bushels of grain to survive.
        // If you feed them more than this, they are happy,
        // but the grain is still gone. You don't get any benefit from having happy subjects.
        // Return the number of deaths from starvation (possibly zero).


        return 0;
    }

   // public boolean uprising(int i, int i1) {
     //   return false;
   // }

//    public int immigrants(int pooulation, int acresOwned, int grainInStorage) {
//            // random number of new people add to the population
//
//        //Nobody will come to the city if people are starving (so don't call this method).
//        // If everyone is well fed, compute how many people come to the city as:
//        // (20 * _number of acres you have_ + _amount of grain you have in storage_) / (100 * _population_) + 1.
//
//        return 0;
//    }

    public int harvest(int acres) {
        return bushelsUsedAsSeed;
    }

   // public int grainEatenByRats(int i) {
    //        return 0;
  //  }

    public int newCostOfLand() {
            return landPrice;
    }
    // create a random number for cost of land per yearly cycle

    //other methods go here

}