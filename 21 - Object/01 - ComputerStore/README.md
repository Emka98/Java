Write a program that simulates a computer store specializing in notebooks. Create three classes:

	Computer - This class has fields "producer" and "model"—information about the computer's manufacturer and model, with the model represented as an integer. Define the equals() method to verify that this is the only one of its kind in the store. Override the toString() method to obtain readable information about a given item.

	DataStore - This class stores information about computers in an array. It allows you to add another computer to the database using the add() method and a second method that returns an array of added computers. There should also be a checkAvailability() method that takes a Computer object as a parameter and returns the number of identical computers in the store.

	NotebookShop - A class with a main method. Create at least five computers in this class and add them to the store's database. At least two of the computers must be identical. For a repeating item, check the checkAvailability() method and then display all notebooks available in the store.

Limitations: The store's inventory holds a maximum of 100 computers.