class Activity{
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Megatron");  

        System.out.println(dog.showName());
        System.out.println(dog.bark());

        dog.setNumber(3);
        System.out.println(dog.showNum());

        Dog dog1= new Dog();
        dog1.setName("hatadog");
        Dog dog2= new Dog();
        dog2.setName("kaleidoscope");
        Dog dog3= new Dog();
        dog3.setName("Destroyer");
        Dog dog4= new Dog();
        dog4.setName("UrAnus");
        Dog dog5= new Dog();
        dog5.setName("Dipper");
      
        Dog hatdog[]={dog1,dog2,dog3,dog4,dog5};
        dog.listPup(hatdog);
  
        dog.showPuppies();
        
    }
}