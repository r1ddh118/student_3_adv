// Student.java
// Class representing a student with attributes like name, PRN, department, batch, and CGPA.

public class Student {
    private String name;
    private long prn;
    private String dept;
    private String batch;
    private double cgpa;

    // Constructor to initialize student attributes
    public Student(String name, long prn, String dept, String batch, double cgpa) {
        this.name = name;
        this.prn = prn;
        this.dept = dept;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    // Getter and Setter methods for encapsulation
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public long getPRN() { 
        return prn; 
    }
    public void setPRN(long prn) { 
        this.prn = prn; 
    }
    public String getDept() {  
        return dept; 
    }
    public void setDept(String dept) { 
        this.dept = dept; 
    }
    public String getBatch() { 
        return batch; 
    }
    public void setBatch(String batch) { 
        this.batch = batch; 
    }

    public double getCGPA() { 
        return cgpa; 
    }
    public void setCGPA(double cgpa) { 
        this.cgpa = cgpa; 
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", PRN: " + prn + ", Department: " + dept + ", Batch: " + batch + ", CGPA: " + cgpa);
    }
}

