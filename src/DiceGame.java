/**
 * @author: vamsi krishna allu
 *          student number : A00259393
 *          MAPD - JAV-1001 - App Development for Android
 */

import java.util.ArrayList;
import java.util.List;

public class DiceGame {

    /**
     * This is used to verify if all dice side are up
     * 
     * @param listOfDie
     * @return
     */
    public static boolean areAllDiceSideUpsMatched(List<Die> listOfDie) {
        for (int i = 1; i < listOfDie.size(); i++) {
            if (listOfDie.get(0).getCurrentSideUp() != listOfDie.get(i).getCurrentSideUp()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Creating a default d6...");
        Die defaultDie = new Die();
        System.out.println("Creating a d20...");
        Die dieWithSides = new Die(20);
        System.out.println("Creating percentile die (a special d10)...\n");
        Die dieWithSidesAndName = new Die(10, "Percentile");

        System.out.println("-----");
        System.out.println("BEFORE");
        System.out.println("-----");

        System.out.println("The current side up for " + defaultDie.getName() + " is " + defaultDie.getCurrentSideUp());
        System.out.println(
                "The current side up for " + dieWithSides.getName() + " is " + dieWithSides.getCurrentSideUp());
        System.out.println(
                "The current side up for " + dieWithSidesAndName.getName() + " is "
                        + dieWithSidesAndName.getCurrentSideUp());

        System.out.println("\nTesting the roll method\n");

        System.out.println("-----");
        System.out.println("AFTER");
        System.out.println("-----");

        System.out.println("Rolling the d6...");
        defaultDie.setCurrentSideUp(defaultDie.rollDice());
        if (defaultDie.getCurrentSideUp() == defaultDie.getNumberOfSides()) {
            System.out.println("YAY! It's a " + defaultDie.getCurrentSideUp());
        } else {
            System.out.println("The new value is " + defaultDie.getCurrentSideUp());
        }

        System.out.println("Rolling the d20...");
        dieWithSides.setCurrentSideUp(dieWithSides.rollDice());
        if (dieWithSides.getCurrentSideUp() == dieWithSides.getNumberOfSides()) {
            System.out.println("YAY! It's a " + dieWithSides.getCurrentSideUp());
        } else {
            System.out.println("The new value is " + dieWithSides.getCurrentSideUp());
        }

        System.out.println("Rolling the Percentile...");
        dieWithSidesAndName.setCurrentSideUp(dieWithSidesAndName.rollDice());
        if (dieWithSidesAndName.getCurrentSideUp() == dieWithSidesAndName.getNumberOfSides()) {
            System.out.println("YAY! It's a " + dieWithSidesAndName.getCurrentSideUp());
        } else {
            System.out.println("The new value is " + dieWithSidesAndName.getCurrentSideUp());
        }

        System.out.println("Setting the d20 to show 20...");
        dieWithSides.setCurrentSideUp(dieWithSides.getNumberOfSides());
        System.out.println("The side up is now " + dieWithSides.getCurrentSideUp() + ". Finally.\n");

        System.out.println("change the " + dieWithSides.getName() + " number of sides...");
        dieWithSides.setNumberOfSides(15);
        System.out.println("The die name is changed to " + dieWithSides.getName() + " with number of sides "
                + dieWithSides.getNumberOfSides() + " having current side up as " + dieWithSides.getCurrentSideUp()
                + "\n");

        List<Die> listOfDie = new ArrayList<>();
        System.out.println("-----");
        System.out.println("BONUS");
        System.out.println("-----");
        System.out.println("Creating 5 d6...");
        for (int i = 0; i < 5; i++) {
            listOfDie.add(new Die());
        }

        int count = 1;
        while (!areAllDiceSideUpsMatched(listOfDie)) {
            count++;
            listOfDie.forEach(die -> {
                die.setCurrentSideUp(die.rollDice());
            });
        }

        System.out.println("YAHTZEE! It took " + count + " rolls");

    }

}
