package com.bridgelabz.linkedlist;

import java.util.Scanner;

/**
 * Program on LinkedList
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 16/10/2021
 */

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        switch(scanner.nextInt()){
            case 1:
                Operations.addDataAtStart();
        }
    }
}
