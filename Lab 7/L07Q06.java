package com.mycompany.l07q06;

import java.io.*;
import java.util.*;

public class L07Q06 {
    public static void main(String[] args) {
        // Read products
        HashMap<String, String[]> products = new HashMap<>();
        try {
            try (Scanner productFile = new Scanner(new FileInputStream("product.txt"))) {
                while (productFile.hasNextLine()) {
                    String line = productFile.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String productId = parts[0].trim();
                        String productName = parts[1].trim();
                        String price = parts[2].trim();
                        products.put(productId, new String[]{productName, price});
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading product.txt: " + e.getMessage());
            return;
        }
        
        // Read orders and display merged data
        try {
            try (Scanner orderFile = new Scanner(new FileInputStream("order.txt"))) {
                System.out.println("ProductID\tProduct Name\t\tQuantity\tPrice/Unit\tTotal Price");
                System.out.println("-----------------------------------------------------------------------");
                
                while (orderFile.hasNextLine()) {
                    String line = orderFile.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String productId = parts[1].trim();
                        int quantity = Integer.parseInt(parts[2].trim());
                        
                        if (products.containsKey(productId)) {
                            String productName = products.get(productId)[0];
                            double pricePerUnit = Double.parseDouble(products.get(productId)[1]);
                            double totalPrice = quantity * pricePerUnit;
                            
                            System.out.printf("%-10s\t%-20s\t%d\t\t%.2f\t\t%.2f%n",
                                    productId, productName, quantity, pricePerUnit, totalPrice);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading order.txt: " + e.getMessage());
        }
    }
}