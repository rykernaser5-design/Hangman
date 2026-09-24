import java.util.Random;
import java.util.Scanner;
public class HANGMAN {
 public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
boolean win = false;
    String[] guessletters = {};
    String[] words = { "apple", "beach", "chair", "dance", "earth", "faith", "grape", "heart", "image", "juice","knife", "lemon", "mouse", "night", "ocean", "paper", "queen", "river", "smile", "train","uncle", "voice", "water", "youth", "zebra", "angel", "bread", "brick", "cloud", "cream","drive", "flame", "flash", "floor", "fruit", "ghost", "glass", "glove", "grass", "green","guard", "guide", "happy", "horse", "hotel", "house", "light", "money", "music", "nurse","party", "phone", "piano", "pilot", "plant", "plate", "radio", "robot", "salad", "scale","sheep", "shirt", "shoes", "slant", "snake", "spoon", "stare", "stone", "store", "sugar","sweet", "table", "tiger", "toast", "towel", "truck", "trust", "truth", "Tulip", "union","visor", "vivid", "wagon", "watch", "whale", "wheat", "wheel", "white", "world", "yacht","yield", "actor", "adult", "agent", "album", "alert", "alien", "alley", "allow", "alone"};

    Random rand = new Random();
String word = words[rand.nextInt(100)];

System.out.println(word);

int guessnum = 0;

char l1 = word.charAt(0);
char l2 = word.charAt(1);
char l3 = word.charAt(2);
char l4 = word.charAt(3);
char l5 = word.charAt(4);

char l11 = '_';
char l22 = '_';
char l33 = '_';
char l44 = '_';
char l55 = '_';

while (guessnum < 7){

System.out.println("current word " + l11 + " " + l22 + " " + l33 + " " + l44 + " " + l55 + "\nYour on guess: " + guessnum);


System.out.println("\nGuess a letter: ");

String letter = scanner.next();

if (letter.equals(Character.toString(l1)) && !(l11 == l1)) {
    
    l11 = l1;
}
else if (letter.equals(Character.toString(l2)) && !(l22 == l2)) {
    l22 = l2;
}
else if (letter.equals(Character.toString(l3)) && !(l33 == l3)) {
    l33 = l3;
}
else if (letter.equals(Character.toString(l4)) && !(l44 == l4)) {
    l44 = l4;
}
else if (letter.equals(Character.toString(l5)) && !(l55 == l5)) {
    l55 = l5;
} else {
guessnum = guessnum + 1;
}

if (l11 == l1 && l22 == l1 && l33 == l3 && l44 == l4 && l55 == l5) {
    System.out.println("YOU WIN");
    guessnum = 10000;
}
if (guessnum > 6){
System.out.println("You Lose NERD");
}
}}}


