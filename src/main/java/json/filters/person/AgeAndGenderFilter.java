package json.filters.person;

import json.models.person.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgeAndGenderFilter implements IPersonFilter {
    @Value("${personFilter.gender}")
    private String m_gender;

    @Value("${personFilter.minAge}")
    private int m_minAge;

    @Value("${personFilter.maxAge}")
    private int m_maxAge;
    @Override

    public List<Person> filterOut(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.gender.equals(m_gender))
                .filter(person -> person.age >= m_minAge && person.age <= m_maxAge)
                .collect(Collectors.toList());
    }
}
