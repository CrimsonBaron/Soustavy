package com.soustavy.main;

import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean yn = true;
        while (yn) {
            System.out.println("gib , prev type , type to // types: decimal binry hex octal || or stop");
            String n = sc.nextLine();
            if (n.equals("stop")) {
                yn = false;
                break;
            }
            String prevType = sc.nextLine();
            String type = sc.nextLine();


            convert(n, prevType, type);
        }
    }

    public static void convert(String n, String prevType, String type) {
        String result = "";
        int nInt = Integer.parseInt(n);
        switch (type.toLowerCase()) {
            case "decimal" -> {
                switch (prevType) {
                    case "decimal" -> System.out.println("Canot convert decimal to decimal");
                    case "binary" -> System.out.println(Integer.parseInt(n, 2));
                    case "hex" -> System.out.println(Integer.parseInt(n, 16));
                    case "octal" -> System.out.println(Integer.parseInt(n, 8));
                }
            }
            case "binary" -> {
                switch (prevType) {
                    case "decimal" -> System.out.println(Integer.toBinaryString(nInt));
                    case "binary" -> System.out.println("Cannot convert binary to binary");
                    case "hex" -> System.out.println(Integer.toBinaryString(Integer.parseInt(n, 16)));
                    case "octal" -> System.out.println(Integer.toBinaryString(Integer.parseInt(n, 8)));
                }
            }
            case "hex" -> {
                switch (prevType) {
                    case "decimal" -> System.out.println(Integer.toHexString(nInt));
                    case "binary" -> System.out.println(Integer.toHexString(Integer.parseInt(n, 2)));
                    case "hex" -> System.out.println("Canot convert hex to hex");
                    case "octal" -> System.out.println(Integer.toHexString(Integer.parseInt(n, 8)));
                }
            }
            case "octal" -> {
                switch (prevType) {
                    case "decimal" -> System.out.println(Integer.toOctalString(nInt));
                    case "binary" -> System.out.println(Integer.toOctalString(Integer.parseInt(n, 2)));
                    case "hex" -> System.out.println(Integer.toOctalString(Integer.parseInt(n, 16)));
                    case "octal" -> System.out.println("Cannot convert octal to octal");
                }
            }
        }

    }

}
