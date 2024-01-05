public class Singleton {
    private static Singleton single_instance = null;

    public String information;

    //All constructors must be private
    private Singleton() {
        this.information = "I am a singleton instantiated";
    }

    public static synchronized Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}
