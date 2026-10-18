package level1.Exercise5;

public class Main {
    public static void main(String[] args) {

        PiInterface pi = () -> 3.1415;
        System.out.println("---The value of Pi is: " + pi.getPiValue());

    }
}



