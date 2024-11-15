public class Acitivity{
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.setId(1234);
        student1.setName("Student_1");

        Book book1 = new Book();
        book1.setNum(1);
        book1.setTitle("Holy Bible");
        book1.setPrice(500);


        System.out.println("Hello World!");


        System.out.println("\nStudent Id: " + student1.getId());
        System.out.println("Student Id: " + student1.getName());
       
       
       
        System.out.println("\nBook Number: " + book1.getNum());
        System.out.println("Book Title: "+ book1.getTitle());
        System.out.printf("Book Price: %.2f php",book1.getPrice());

    }
}

