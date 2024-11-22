public class Activity{
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
