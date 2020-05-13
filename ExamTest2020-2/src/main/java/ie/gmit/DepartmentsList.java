package ie.gmit;

import java.util.ArrayList;

public class DepartmentsList {
    private ArrayList<Departments> list;

    public DepartmentsList() {
        list = new ArrayList<Departments>();
    }

    public void addDepartments(Departments thisDepartment)
    {
        list.add(thisDepartment);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Departments findByName(String name)
    {
        for(Departments departments : list)
        {
            if(departments.getName().equals(name))
            {
                return departments;
            }
        }
        return null;
    }

    public Departments findByCode(String code)
    {
        for(Departments departments : list)
        {
            if(departments.getCode().equals(code))
            {
                return departments;
            }
        }
        return null;
    }

    public Departments findByPhone(String phone)
    {
        for(Departments departments : list)
        {
            if(departments.getPhone().equals(phone))
            {
                return departments;
            }
        }
        return null;
    }

    public Departments findByEmail(String email)
    {
        for(Departments departments : list)
        {
            if(departments.getEmail().equals(email))
            {
                return departments;
            }
        }
        return null;
    }
}
