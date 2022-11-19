public class Main {
    public static void main(String[] args) {
       Main main= new Main();
       String text = main.toString();
       System.out.println(text);
    }

    @Override
    public String toString() {
        return "Java version; "+System.getProperty("java.version");
    }
}

