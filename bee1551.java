public class bee1551 {
    public static void main(String[] args) {
        printAscii();
        

    }


    public static void printAscii(){
        for (int i = 0; i < 255; i++) {
            System.out.println(i + " = " + (char)i);
        }
    }
}
