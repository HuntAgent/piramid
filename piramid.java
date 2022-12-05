public class piramid {
    public static void main(String[] args) {
        String str = "TRAXCON";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", ch[j]);
            }
            System.out.printf("%c\n", ch[i]);
        }

    }
}
