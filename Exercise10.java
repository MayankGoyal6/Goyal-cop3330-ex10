/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 10
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.*;

class Main {
  public static void main(String[] args) {
  
  Locale locale = new Locale("en", "US");
  NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter the price of item 1: ");
  int pItem1 = scanner.nextInt();

  System.out.println("Enter the quantity of item 1: ");
  int qItem1 = scanner.nextInt();

  System.out.println("Enter the price of item 2: ");
  int pItem2 = scanner.nextInt();

  System.out.println("Enter the quantity of item 2: ");
  int qItem2 = scanner.nextInt();

  System.out.println("Enter the price of item 3: ");
  int pItem3 = scanner.nextInt();

  System.out.println("Enter the quantity of item 3: ");
  int qItem3 = scanner.nextInt();

  double subtotal = ((pItem1*qItem1) + (pItem2*qItem2) + (pItem3*qItem3));
  double tax = ((subtotal * 5.5)/100);
  double total = (subtotal + tax);

  System.out.println("Subtotal: " + currencyFormatter.format(subtotal));
  System.out.println("Tax: " + currencyFormatter.format(tax));
  System.out.println("Total " + currencyFormatter.format(total));

  }
}