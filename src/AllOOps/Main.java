package AllOOps;

abstract class ElectronicDevice{
    String brand;
    String model;
    int price;

    public void turnOn(){
        System.out.println("Turn on the electrical device");
    }
    public void turnOn(String type) {
        System.out.println("Turn on the electrical device" + type);
    }
    public void turnOff(){
        System.out.println("Turn off the electrical device");
    }


    public abstract void displayInfo();


}
interface call {
    void voiceCall();
    void videoCall();
}


interface GPS {
    void navigate();
}
class SmartPhone extends ElectronicDevice implements call,GPS {

    public void makeCall(){
        System.out.println("Calling a friend");
    }
    public void turnOn(){
        System.out.println("Turn on the Smart phone");

    }

    @Override
    public void voiceCall() {
        System.out.println("Voice calling...");
    }

    public void videoCall(){
        System.out.println("Video calling...");
    }

    public void navigate(){
        System.out.println("Navigating...");
    }
    public void displayInfo() {
        System.out.println("Smart Phone  Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price:" +price);
    }


}
class Samsung extends SmartPhone{
    public void assistance(){
        System.out.println("Has a build in Voice assistance");
    }

}
class Computer extends ElectronicDevice{

    public void openApplication(){
        System.out.println("Opening an application");
    }

    public void turnOn(){
        System.out.println("Turn on the Computer");
    }

    public void displayInfo() {
        System.out.println("Computer  Information:");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price "+price);
    }
}



public class Main{
    public static void main(String args[]){
        //Single Inheritance
        SmartPhone s1=new SmartPhone();
        s1.turnOn();
        s1.model = "23";
        s1.brand ="Nokia";
        s1.price=20000;
        s1.turnOn("Face");
        s1.turnOff();
        s1.makeCall();
        s1.displayInfo();

        //Multilevel inheritance
        Samsung s=new Samsung();
        s.turnOn();
        s.turnOn("Phone");
        s.turnOff();
        s.makeCall();




        //Hybrid Inheritance
        SmartPhone s2=new SmartPhone();
        s2.turnOn();
        s2.turnOn("Finger");
        s2.turnOff();
        s2.makeCall();

        Computer c=new Computer();
        c.turnOn();
        c.model = "air2";
        c.brand = "Apple";
        c.price=150000;
        c.displayInfo();
        c.turnOn("Voice");
        c.turnOff();
        c.openApplication();


    }
}

