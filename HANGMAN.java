import java.util.Random;

public class HANGMAN {
 public static void main(String[] args) {
    
    String[] words = { "apple", "beach", "chair", "dance", "earth", "faith", "grape", "heart", "image", "juice","knife", "lemon", "mouse", "night", "ocean", "paper", "queen", "river", "smile", "train","uncle", "voice", "water", "youth", "zebra", "angel", "bread", "brick", "cloud", "cream","drive", "flame", "flash", "floor", "fruit", "ghost", "glass", "glove", "grass", "green","guard", "guide", "happy", "horse", "hotel", "house", "light", "money", "music", "nurse","party", "phone", "piano", "pilot", "plant", "plate", "radio", "robot", "salad", "scale","sheep", "shirt", "shoes", "slant", "snake", "spoon", "stare", "stone", "store", "sugar","sweet", "table", "tiger", "toast", "towel", "truck", "trust", "truth", "Tulip", "union","visor", "vivid", "wagon", "watch", "whale", "wheat", "wheel", "white", "world", "yacht","yield", "actor", "adult", "agent", "album", "alert", "alien", "alley", "allow", "alone"};
Random rand = new Random();
String word = words[rand.nextInt(6)];

System.out.println(word);

char l1 = word.charAt(0);
char l2 = word.charAt(1);
char l3 = word.charAt(2);
char l4 = word.charAt(3);
char l5 = word.charAt(4);

System.out.println(l1);
System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);
System.out.println(l5);





}}
