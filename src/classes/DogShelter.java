package classes;

import java.util.ArrayList;

public class DogShelter {
    protected int capacity;
    protected String name;
    protected ArrayList<Dog> dogs = new ArrayList<>();
    public DogShelter(int capacity, String name)
    {
        this.capacity=capacity;
        this.name=name;
    }
    public void addDog(Dog dog) throws FullShelterException, DogIsNotHomeless
    {
        if(!dog.isHomeless()) throw new DogIsNotHomeless("Собака не бездомная. Возможно, она была украдена у хозяев");
        if(dogs.size()<capacity)
            dogs.add(dog);
        else
        {
            throw new FullShelterException("Приют полон, похоже, что " +dog.getName()+" останется на улице.");
        }
    }

}
