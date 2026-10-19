package level2.Exercise4;

public class Main {
    public static void main(String[] args) {

        Exercise4 ext4 = new Exercise4();

        System.out.println("--- Sorted by first char ---");
        System.out.println(ext4.sortWithFirstChar());

        System.out.println("--- Words with 'e' first ---");
        System.out.println(ext4.sortWithEFirst());

        System.out.println("--- Repace 'a' with '4' ---");
        System.out.println(ext4.replaceAWith4());

        System.out.println("--- Only numbers ---");
        System.out.println(ext4.showOnlyNumbers());
    }
}
