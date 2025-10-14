public class program4  {
    public static void main(String[] args) {

        String a = "hello";

        a = a.toUpperCase();

        for (int i = 0; i < a.length(); i++)

            System.out.println((int) a.charAt(i)-64);
        System.out.println(a);
    }
}

