package json.fileGetter;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class Getter implements IGetter {

    @Override
    public String getJson(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
