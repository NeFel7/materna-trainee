package example.classesObjectsPackages;

public class LinePrinter {
    public static void line(int len) {
        line(len, '-');
    }
    public static void line(int len, char c) {
        line("", len, c, "");
    }
    public static void line(String prefix, int len, char c, String suffix) {
        String s = Character.toString(c);
        System.out.print(prefix + s.repeat(len) + suffix);
    }
}
