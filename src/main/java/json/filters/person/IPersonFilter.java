package json.filters.person;

import json.models.person.Person;

import java.util.List;

public interface IPersonFilter {
    List<Person> filterOut(List<Person> persons);
}
