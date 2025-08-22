package day9;

public class StringSubClass {
    private String value;

    public StringSubClass(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public String toUpperCase() {
        return value.toUpperCase();
    }

    @Override
    public String toString() {
        return value;
    }

    public static void main(String[] args) {
        StringSubClass myStr = new StringSubClass("Hello World");
        System.out.println("Length: " + myStr.length());
        System.out.println("Uppercase: " + myStr.toUpperCase());
        System.out.println("Original: " + myStr);
    }
}
