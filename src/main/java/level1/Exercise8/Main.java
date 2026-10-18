package level1.Exercise8;

public class Main {
    public static void main(String[] args) {

    ReverseInterface reverser = text -> new StringBuilder(text).reverse().toString();
        System.out.println("Original phrase: See you later Alligator");
        System.out.println("Reversed phrase: " + reverser.reverse("See you later Alligator"));
    }
}
