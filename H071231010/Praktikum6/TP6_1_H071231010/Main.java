package TP6_1_H071231010;

public class Main {
  public static void main(String[] args) {
    Smartphone smartphone = new Smartphone(1000000, "Oppo");
    Car car = new Car(100, "Merah", 300);
    Bulldog bulldog = new Bulldog(4, 80);

    System.out.println("-------------------------------------------------");
    bulldog.move();
    bulldog.describe();
    System.out.println("-------------------------------------------------");
    System.out.println("-------------------------------------------------");
    car.move();
    smartphone.move();
    System.out.println("-------------------------------------------------");
  }  
}

