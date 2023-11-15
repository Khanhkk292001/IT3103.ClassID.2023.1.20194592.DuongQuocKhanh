//Dương Quốc Khánh - 20194592

package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
 public static void main(String[] args) {
     createGarbage();
 }

 public static void createGarbage() {
     String garbage = "";
     for (int i = 0; i < 100000; i++) {
         garbage += generateRandomString(); 
     }
     System.out.println("Garbage created!");
 }

 public static String generateRandomString() {
     return Long.toHexString(Double.doubleToLongBits(Math.random()));
 }
}

