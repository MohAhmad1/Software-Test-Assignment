package ie.gmit;

import java.util.ArrayList;

public class LecturersList {
    private ArrayList<Lecturers> list;

    public LecturersList() {
        list = new ArrayList<Lecturers>();
    }

    public void addLecturer(Lecturers thisLecturer)
    {
        list.add(thisLecturer);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Lecturers findByName(String name)
    {
        for(Lecturers lecturer : list)
        {
            if(lecturer.getName().equals(name))
            {
                return lecturer;
            }
        }
        return null;
    }

    public Lecturers findByEmail(String email)
    {
        for(Lecturers lecturer : list)
        {
            if(lecturer.getEmail().equals(email))
            {
                return lecturer;
            }
        }
        return null;
    }
}
