package example.mavenExercise;

public class Server {
    public static void main( String[] args ) {
        spark.Spark.get( "/hello", (req, res) -> "Hallo Browser " + req.userAgent() );
    }
}
