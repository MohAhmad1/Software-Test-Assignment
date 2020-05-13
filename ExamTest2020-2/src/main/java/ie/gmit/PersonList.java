package ie.gmit;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> list;

    public PersonList() {
        list = new ArrayList<Person>();
    }

    public void addPerson(Person thisPerson)
    {
        list.add(thisPerson);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Person findByName(String name)
    {
        for(Person person : list)
        {
            if(person.getDisplayName().equals(name))
            {
                return person;
            }
        }
        return null;
    }

    public Person findByEmail(String email)
    {
        for(Person person : list)
        {
            if(person.getEmail().equals(email))
            {
                return person;
            }
        }
        return null;
    }

    public Person findByPhoneNumber(String phoneNumber)
    {
        for(Person person : list)
        {
            if(person.getPhoneNumber().equals(phoneNumber))
            {
                return person;
            }
        }
        return null;
    }

    public Person findByDateOfBirth(String dateOfBirth)
    {
        for(Person person : list)
        {
            if(person.getDateOfBirth().equals(dateOfBirth))
            {
                return person;
            }
        }
        return null;
    }

    public Person findByAddress(String address)
    {
        for(Person person : list)
        {
            if(person.getAddress().equals(address))
            {
                return person;
            }
        }
        return null;
    }

}
