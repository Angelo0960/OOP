public class Dog {
    String name;
    boolean isMale;
    int numPup;
    
    Dog puppies[] = new Dog[5];
    
    public void setName(String itsName){
        name = itsName;
    }
    
    public String bark(){
        return "Woof! Woof!";
    }
    public String showName(){
        return name;
    }
    public void setNumber(int numofPup){
        numPup = numofPup;
    }
    public int showNum(){
        return numPup;
    }
    public void listPup(Dog pupSet[]){
        puppies = pupSet;
    }

    public void showPuppies(){
    for(int i=0; i< puppies.length; i++)
    System.out.println(puppies[i].showName());
    }
}

