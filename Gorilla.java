package zookeeper1;

public class Gorilla extends Mamal{
    public void throwSomthing(){
    energyLevel = 5;
    System.out.println("The Gorilla throws a bannana!");
    this.energyLevel = energyLevel - 5;
    
    }
    public void eatBanana(){
        System.out.println("Eating a banana Yum!");
        this.energyLevel = energyLevel + 10;
    }
    
    public void climb(){
        System.out.println("Climbing a tree!");
        this.energyLevel = energyLevel - 10;
    
    
    
    }
    }
