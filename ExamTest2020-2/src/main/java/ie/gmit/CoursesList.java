package ie.gmit;

import java.util.ArrayList;

public class CoursesList {
    private ArrayList<Courses> list;

    public CoursesList() {
        list = new ArrayList<Courses>();
    }

    public void addCourses(Courses thisCourses)
    {
        list.add(thisCourses);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Courses findByName(String name)
    {
        for(Courses courses : list)
        {
            if(courses.getName().equals(name))
            {
                return courses;
            }
        }
        return null;
    }

    public Courses findByCode(String Code)
    {
        for(Courses courses : list)
        {
            if(courses.getCode().equals(Code))
            {
                return courses;
            }
        }
        return null;
    }

    public Courses findByDepartment(String Department)
    {
        for(Courses courses : list)
        {
            if(courses.getDepartment().equals(Department))
            {
                return courses;
            }
        }
        return null;
    }

    public Courses findByEntryPoints(String EntryPoints)
    {
        for(Courses courses : list)
        {
            if(courses.getEntryPoints().equals(EntryPoints))
            {
                return courses;
            }
        }
        return null;
    }
}
