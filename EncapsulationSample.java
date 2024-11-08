public class EncapsulationSample{
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

class Student {
    private int Student_Id;
    private String Name;
 
    public void setId (int s_id){
        this.Student_Id = s_id;
    }
    public void setName(String s_name){
        this.Name = s_name;
    }

    public int getId(){
        return Student_Id;
    }
    public String getName(){
        return Name;
    }
}

class Book {
    private int book_number;
    private String title, author;
    private float price;
 
    public void setNum (int b_num){
        this.book_number = b_num;
    }
    public void setTitle(String b_title){
        this.title = b_title;
    }
    public void setPrice(float b_price){
        this.price = b_price;
    }

    public int getNum(){
        return book_number;
    }
    public String getTitle(){
        return title;
    }
    public float getPrice(){
        return price;
    }
}
