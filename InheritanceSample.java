public class InheritanceSample {
    public static void main(String[] args) {
        
        Students student1 = new Students("Juan", "Batangas PH", "BSIT", 2);
        Students student2 = new Students("Angelo","Pantay","BSIT2B",2);

        Staff staff1 = new Staff("Batumbakal", "Quezon City PH", "QSU", 1500.99);
    
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Course: " + student1.getProgram());
        System.out.println("Student Age: " + student1.getYear());

        System.out.println("\nStudent Name: " + student2.getName());
        System.out.println("Student Address: " + student2.getAddress());
        System.out.println("Student Course: " + student2.getProgram());
        System.out.println("Student Age: " + student2.getYear());

        System.out.println("\nStudent Name: " + staff1.getName());
        System.out.println("Student Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary());
    }
}

class Person {
    protected String Name;
    protected String Address;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
}

class Students extends Person {
    private String Program;
    private int Year;

    public Students(String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getProgram() {
        return Program;
    }

    public int getYear() {
        return Year;
    }
}


class Staff extends Person {
    private String School;
    private Double Salary;


public Staff(String Name, String Address, String School, double Salary) {
    this.Name = Name;
    this.Address = Address;
    this.School = School;
    this.Salary = Salary;
    }

    public void setSchool(String School) {
        this.School= School;
    }
    public void setSalary(Double Salary){
        this.Salary = Salary;
    }

    public String getSchool() {
        return School;
    }
    public Double getSalary() {
        return Salary;
    }
}



