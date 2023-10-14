package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //[]                                -->  "no one likes this"
        //["Peter"]                         -->  "Peter likes this"
        //["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
        //["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
        //["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
        String[] whoLikes = {"Max", "John", "Mark"};
        System.out.println(infoPresentation(whoLikes));
    }

    public static String infoPresentation(String[] whoLikes) {
        if (whoLikes.length == 0)
            return "no one likes this";
        else if (whoLikes.length == 1)
            return String.format("%s likes this", whoLikes[0]);
        else if (whoLikes.length == 2)
            return String.format("%s and %s likes this", whoLikes[0], whoLikes[1]);
        else if (whoLikes.length == 3)
            return String.format("%s, %s and %s likes this", whoLikes[0], whoLikes[1], whoLikes[2]);
        return String.format("%s, %s and %d others like this", whoLikes[0], whoLikes[1], whoLikes.length-2);
    }
}