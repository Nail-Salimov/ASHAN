import com.beust.jcommander.JCommander;

public class Main {
    public static void main(String[] args) {
        Starter starter = new Starter();
        JCommander jCommander = new JCommander(starter);
        jCommander.parse(args);
        starter.start();
    }
}
