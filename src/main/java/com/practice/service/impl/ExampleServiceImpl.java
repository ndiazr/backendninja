package com.practice.service.impl;

import com.practice.model.Person;
import com.practice.service.ExampleService;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService
{
    private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople()
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("NelsonMAV", 30));
        people.add(new Person("dhdhsdfh", 55));
        people.add(new Person("sdfgdfhbdb", 65));
        people.add(new Person("qertwerter", 18));

        LOG.info("Hello from Service");

        return people;
    }
}
