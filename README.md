# JAV1001-Lab3
repository for JAV1001 Lab3

Implemented a Die game with different constructors and required methods

Die class: 

Added three constructors as part of this class

No Args Constructor : to create default Die object
Defualt die Objects details:
name : d6
number of sides : 6
current side up : calculated randomly from range 1 to 6

Parameterized Constructor with numberOfsides as Param.
name : obtained from numberOfSides.
number of sides: passsed through constructor.
current side up: calculated randomly from range 1 to number of sides.

Parameterized Constructor with numberOfsides and name as Param.
name : passsed through constructor.
number of sides: passsed through constructor.
current side up: calculated randomly from range 1 to number of sides.

Setters and Getters to set and get the private instance variables of Die.
When user updates the number of sides then name and current side up is also updated for that object to maintain consistency.
Setter for name is made private to prevent name being set from other classes.
Current side up is set only when the provided value is less than or equal to number of sides as a Die value setting to more than number of sides doesnot make any sense.

RollDice to generate a random number from 1 to number of sides.

DieGame class:

It is the main class that uses the objects of Die class to verify its functionality.

Finally a method to check if all the dies rolled have same current side up or not.
