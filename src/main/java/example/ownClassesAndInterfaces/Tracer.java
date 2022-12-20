package example.ownClassesAndInterfaces;

public class Tracer {
    private static boolean tracingIsOn = false;
    public static void on() {
        tracingIsOn = true;
    }
    public static void off() {
        tracingIsOn = false;
    }
    public static void trace( String str ) {
        if ( tracingIsOn )
            System.out.println( str );
    }
    public static void trace( String format, Object... args ) {
        if ( tracingIsOn )
            System.out.printf( format + "%n", args );
    }
}
