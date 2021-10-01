package json.fileGetter;

import java.io.IOException;

public interface IGetter {
    String getJson(String filePath) throws IOException;
}
