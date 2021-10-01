package json.extractor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import json.fileGetter.Getter;
import json.models.person.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class PersonExtractor implements IPersonExtractor{
    @Value("${generatedJson.path}")
    private String m_personFilePath;

    @Autowired
    Getter m_jsonGetter;

    private final Type m_personListType = new TypeToken<List<Person>>() {}.getType();
    @Override
    public List<Person> extractPerson() throws IOException {
        Gson js = new Gson();
        String jsInfo;
        jsInfo = m_jsonGetter.getJson(m_personFilePath);
        return js.fromJson(jsInfo,m_personListType);
    }
}
