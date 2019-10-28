package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String[] array = new String[100];
//        Open all lockers
            for (int i = 0; i < array.length; i++) {
                array[i] = "open";
            }

//        Do the stuff
            for (int j = 1; j < 100; j++) {
                int increaseAmount = j + 1;
                for (int i = j; i < array.length; i = i + increaseAmount) {
                    if (array[i].equalsIgnoreCase("open")) {
                        array[i] = "closed";
                    } else {
                        array[i] = "open";
                    }
                }

            }

//        Print Open Remaining Lockers
            for (int i = 0; i < array.length; i++) {
                if (array[i].equalsIgnoreCase("open")) {
                    System.out.println(i);
                }
            }
        }
    }


