package dev.VarArgs;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello world again!");

        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");
        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");
        System.out.println("_".repeat(20));
        printText();
        String[] sArr = {"first", "second"};
        System.out.println(String.join(",",sArr));
    }
    private static void printText (String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
