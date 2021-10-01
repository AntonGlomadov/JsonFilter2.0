package json.extractor;

import json.models.person.Person;

import java.io.IOException;
import java.util.List;

public interface IPersonExtractor {
    List<Person> extractPerson() throws IOException;
}
