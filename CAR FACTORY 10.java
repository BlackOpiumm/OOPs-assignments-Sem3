import java.util.*;
abstract class Car
{
    private CarType model=null;

    public Car(CarType model) 
    {
        this.model = model;        
    }     

    protected abstract void construct();   //abstract method

}


// FILE NAME: CarFactory.java

class CarFactory
{
    public static Car buildCar(CarType model) 
    {
        Car car = null;
        switch (model) 
        {
            case SMALL:
            car = new SmallCar();
            break;

            case SEDAN:
            car = new SedanCar();
            break;

            case LUXURY:
            car = new LuxuryCar();
            break;

            default:
            
            break;
        }
            return car;
    }
}


// FILE NAME: CarType.java

enum CarType
{
    SMALL, SEDAN, LUXURY
}


// FILE NAME: LuxuryCar.java

class LuxuryCar extends Car 
{
    LuxuryCar() 
    {
        super(CarType.LUXURY);
        construct();
    }

    protected void construct() 
    {
        System.out.println("Building LUXURY car");
    }
}


// FILE NAME: SedanCar.java

class SedanCar extends Car 
{
    SedanCar() 
    {
        super(CarType.SEDAN);
        construct();
    }

    protected void construct() 
    {
        System.out.println("Building SEDAN car");
    
    }
}


// FILE NAME: SmallCar.java

class SmallCar extends Car 
{
    SmallCar() 
    {
        super(CarType.SMALL);
        construct();
    }
    
    protected void construct() 
    {
        System.out.println("Building small car");
    }
}


// FILE NAME: Assignment_10.java

public class Assignment_10
{
    public static void main(String[] args) 
    {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}