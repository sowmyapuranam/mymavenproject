package com.skillnext1;

public class Student {
    private int id;
    private String name;
    private int semester;
    private String department;

    // Constructors
    public Student() {}

    public Student(String name, int semester, String department) {
        this.name = name;
        this.semester = semester;
        this.department = department;
    }

    // Getters and setters
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getSemester() { 
        return semester; 
    }
    public void setSemester(int semester) { 
        this.semester = semester; 
    }

    public String getDepartment() { 
        return department; 
    }
    public void setDepartment(String department) { 
        this.department = department; 
    }

    @Override
    public String toString() {
        return "Student [id=" + id + 
               ", name=" + name + 
               ", semester=" + semester +
               ", department=" + department + "]";
    }
}
