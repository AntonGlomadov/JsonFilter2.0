package json;

import json.extractor.IPersonExtractor;
import json.filters.person.IPersonFilter;
import json.models.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Parser {
    @Autowired
    IPersonFilter m_personFilter;

    @Autowired
    IPersonExtractor m_personExtractor;

    public List<Person> parse() throws IOException {
        List<Person> list = m_personExtractor.extractPerson();
        return  m_personFilter.filterOut(list);
    }
}
