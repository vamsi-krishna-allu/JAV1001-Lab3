/**
 * @author: vamsi krishna allu
 *          student number : A00259393
 *          MAPD - JAV-1001 - App Development for Android
 */

public class Die {

    private String name;
    private int numberOfSides;
    private int currentSideUp;

    /**
     * no args constructor
     * default name: d6
     * default side: 6
     */
    Die() {
        this.name = "d6";
        this.numberOfSides = 6;
        this.currentSideUp = rollDice();
    }

    /**
     * constructor with numberofsides
     * default name: d with number of sides appended to it
     * 
     * @param numberOfSides
     */
    Die(int numberOfSides) {
        this.name = "d" + numberOfSides;
        this.numberOfSides = numberOfSides;
        this.currentSideUp = rollDice();
    }

    /**
     * constructor with name and number of sides
     * 
     * @param numberOfSides
     * @param name
     */
    Die(int numberOfSides, String name) {
        this.name = name;
        this.numberOfSides = numberOfSides;
        this.currentSideUp = rollDice();
    }

    /**
     * getters to access the private variables outside of the class
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getCurrentSideUp() {
        return currentSideUp;
    }

    /**
     * Setters to set the current side up value from outside class
     */
    public void setCurrentSideUp(int currentSideUp) {
        this.currentSideUp = currentSideUp;
    }

    /**
     * Its made private as name cannot be directly provided by classes outside Die
     * as it doesnot seem proepr if user gives some name that doesnot align with
     * number of sides. This setter updates name only when name is not empty.
     * 
     * @param name
     */
    private void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    /**
     * If the number of sides is updated then name is also updated accordingly
     * and the dice is rolled again so that it would get new value with current
     * range of number of sides
     * 
     * @param numberOfSides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.setName("d" + numberOfSides);
        this.setCurrentSideUp(this.rollDice());
    }

    /**
     * This is used to roll a dice and give a random side
     * 
     * @return
     */
    public int rollDice() {
        return (int) ((Math.random()) * this.numberOfSides);
    }

}
