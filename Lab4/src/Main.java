/*
 * Варіант:
 * C1 = 1328 % 11; // 8 - "Визначити клас меблі, який складається як мінімум з 5-и полів."
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class description "Main"
 * This is main class of program.
 *
 * @author Mikhail Shikalovskiy
 * @version 0.0.1 11 May 2022
 */

public class Main {

    /**
     * Method description "printArray"
     * This method prints ours array which consists of
     * objects of our class "Furniture"
     *
     * @param array will be printed
     */
    public static void printArray(Furniture[] array) {
        for (Furniture param : array) {
            System.out.println(param);
        }
    }


    /**
     * main method of our project
     * where we create objects of our class
     * and then modify them
     */
    public static void main(String[] args) {

        //Here we create objects of class "Furniture"
        Furniture cupboard = new Furniture("Шкаф", "Red", 27, 15, 10, 1500);
        Furniture chair = new Furniture("Стул", "Blue", 14, 32, 15, 1600);
        Furniture table = new Furniture("Стол", "Yellow", 10, 28, 32, 800);
        Furniture shelf = new Furniture("Полка", "Pink", 33, 20, 24, 650);
        Furniture bed = new Furniture("Кровать", "white", 46, 19, 1, 876);

        //Here we print our created objects of class "Furniture"
        Furniture[] furnitures = new Furniture[]{cupboard, chair, table, shelf, bed};
        System.out.println("\nObjects:");
        printArray(furnitures);

        //Sort Array by increase/decrease and printing them

        System.out.println("\nSorted by Weight increase(min->max):");
        Arrays.sort(furnitures, Comparator.comparingInt(Furniture::getWeight));
        printArray(furnitures);

        System.out.println("\nSorted by Length decrease(max->min):");
        Arrays.sort(furnitures, Comparator.comparingInt(Furniture::getLength).reversed());
        printArray(furnitures);

    }
}
