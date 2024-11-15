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
    @Override
    public String toString (){
        return  "Hello I am " + Name + " and " + "I lived in " + Address + ". I work at " + School + " with a salary of "+ Salary;
    }
}