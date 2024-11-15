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
