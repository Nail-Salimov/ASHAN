import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

public class Starter {
    @Parameter(names = "--files", description = "link to picture")
    private String urlPictures;


    public void start() {
       ImageDownloader imageDownloader = ImageDownloader.create("postgres", "0205", "jdbc:postgresql://localhost:5432/postgres");
        String[] picture = urlPictures.split("#");
        for (String i : picture) {
            imageDownloader.load(i);
        }
    }
}

