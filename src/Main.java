import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną reprezentację na ekranie

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number to get it binary representation");

        Integer number = scanner.nextInt();

        System.out.println(Integer.toBinaryString(number));

//        Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy, a następnie poprosi o N kolejnych liczb
//        uzupełniając nimi wcześniej stworzoną tablicę. Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby

        System.out.println("Give a number to program: ");

        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        for (int i = 0; i <= arrayLength - 1; i++) {
            System.out.println("Write a value of the " + i + " spot in array: ");
            array[i] = scanner.nextInt();

        }
        //sorting
        int temporaryLength = arrayLength;
        do {

            for (int i = 0; i < temporaryLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temporary = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporary;

                }
            }
            temporaryLength--;
        }
        while (temporaryLength > 1);
        //printing
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }

//        Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego długość, informację czy jest to palindrom czy nie oraz jego odwróconą wartość
        System.out.println();
        scanner.nextLine();
        System.out.println("Write a word: ");
        String word = scanner.nextLine();
        System.out.println("Word " + word + " is a " + word.length() + " letters long");

        boolean isPalindrome;

        word.toLowerCase();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        if (word.equals(reversedWord)){
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        System.out.println("Is " + word + " a palindrome?");
        System.out.println(isPalindrome);
        System.out.println("Backward form of word: " + word + ": " + reversedWord);

    }
}
