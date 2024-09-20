class Activity{
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Megatron");  

        System.out.println(dog.showName());
        System.out.println(dog.bark());

        dog.setNumber(3);
        System.out.println(dog.showNum());

        Dog doggy[]={"Destroyer","UrAnus","Berto","Berting","Earth"};
        dog.listPup(doggy);

        for(i=0; i<= dog.showNames().length; i++)
        System.out.println(dog.showNames()[i]);
        
    }
}