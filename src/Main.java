import java.util.ArrayList;

//class Student_btecht {
//    String name;
//    int age;
//    int marks;
//    public  void displayDetails(){
//        System.out.println("Student name is "+ this.name);
//        System.out.println("Student age is "+this.age);
//        System.out.println("marks of "+this.name+" is "+this.marks);
//    }
//    public boolean ispass(){
//        if(this.marks>=35){
//            return true;
//        }
//        return false;
//    }
//}
//class BankAccount{
//    String accountHolderName;
//    int balance;
//    public void desposit(int amount){
//        this.balance=this.balance+amount;
//        System.out.println("after deposit your current bank balance is "+this.balance);
//    }
//    public void withdraw(int amount){
//        if(amount>this.balance){
//            System.out.println("your bank does not sufficient money to withdraw");
//        }
//        else{
//            this.balance=this.balance-amount;
//            System.out.println("after withdrawing,your current bank balance is "+this.balance);
//        }
//    }
//    public void checkBalance(){
//        System.out.println("Your current balance is "+this.balance);
//    }
//}
//class Mobile{
//    String brand;
//    int price;
//    int storage;
//    public void call(){
//        System.out.println("Thankyou for calling!");
//    }
//    public void showDetails(){
//        System.out.println("Brand of this mobile is "+this.brand+ " and price is "+this.price+" and storage is "+this.storage);
//    }
//}
//class car{
//    String brand;
//    int price;
//    String model;
//    car(String brand,int price,String model){
//        this.price=price;
//        this.brand=brand;
//        this.model=model;
//        printdetails();
//    }
//
//    car() {
//        System.out.println("A new car has been launched!");
//    }
//    public void printdetails(){
//        System.out.println("Brand of the car is "+this.brand);
//        System.out.println("Price of this car is "+this.price);
//        System.out.println("current model of the car is "+this.model);
//    }
//}
//class Employee{
//    int id;
//    String name;
//    int salary;
//    public void displayEmployee(){
//        System.out.println("Employee name is "+this.name);
//        System.out.println("salary is "+this.salary);
//        System.out.println("current employee id is "+this.id);
//    }
//    Employee(int id,String name,int salary){
//        this.id=id;
//        this.name=name;
//        this.salary=salary;
//        displayEmployee();
//    }
//}
//class Animal{
//    public void eat(){
//        System.out.println("It is eating");
//    }
//}
//class Dog extends Animal{
//    public void bark(){
//        System.out.println("Dog Barks");
//    }
//}
//class person{
//    String name;
//    int age;
//}
//class Student extends person{
//    int rollno;
//    int marks;
//    public void displayDetails(){
//        System.out.println("name : "+this.name);
//        System.out.println("age: "+this.age);
//        System.out.println("Roll number is "+this.rollno);
//        System.out.println("Marks "+this.marks);
//    }
//}
//class Vehicle{
//    int speed;
//    String fuelType;
//}
//class Bike extends Vehicle{
//    String brand;
//    public void showBikeDetails(){
//        System.out.println("speed:"+this.speed);
//        System.out.println("fuelType : "+this.fuelType);
//        System.out.println("brand : "+this.brand);
//    }
//}
//class Calculator{
//    public int add(int a,int b){
//        return a+b;
//    }
//    public int add(int a,int b,int c){
//        return a+b+c;
//    }
//    public double add(double a,double b){
//        return a+b;
//    }
//    public int area(int side){
//        return side*side;
//    }
//    public int area(int length,int breadth){
//        return length*breadth;
//    }
//    public double area(double radius){
//        return 3.14*radius*radius;
//    }
//}
//class Animal{
//    public void sound(){
//        System.out.println("Animal Sound");
//    }
//}
//class Dog extends Animal{
//    public void sound(){
//        System.out.println("Dog Barks");
//    }
//}
//class Payment{
//    public void pay(){
//        System.out.println("payment type");
//    }
//}
//class UPI extends Payment{
//
//    public void pay() {
//        System.out.println("pay via upi");
//    }
//}
//class creditcard extends Payment{
//    public void pay() {
//        System.out.println("pay via creditcard");
//    }
//}
//class cash extends Payment{
//    public void pay() {
//        System.out.println("pay via cash");
//    }
//}
//class student{
//    private name;
//    private marks;
//    public void getdetails(){
//        System.out.println(this.name);
//        System.out.println(this.marks);
//    }
//}
//abstract class Shape{
//    abstract void CalculateArea();
//
//}
//class Circle extends Shape{
//    int radius;
//    Circle(int radius){
//        this.radius=radius;
//    }
//    public void CalculateArea(){
//        System.out.println(3.14*radius*radius);
//    }
//}
//class Rectangle extends Shape{
//    int length;
//    int breadth;
//    Rectangle(int length,int breadth){
//        this.length=length;
//        this.breadth=breadth;
//    }
//    public void CalculateArea(){
//        System.out.println(length*breadth);
//    }
//}
//abstract class Animal{
//    abstract void makeSound();
//}
//class Dog extends Animal{
//    public void makeSound(){
//        System.out.println("Dog Barks!");
//    }
//}
//class Cat extends Animal{
//    public void makeSound(){
//        System.out.println("Car Barks!");
//    }
//}
//interface Payment{
//    public void pay();
//}
//class CreditCardPayment implements Payment{
//    public void pay(){
//        System.out.println("Pay via Credit Card");
//    }
//}
//class UPIPayment implements Payment{
//    public void pay(){
//        System.out.println("Pay via UPI");
//    }
//}
//interface Switchable{
//    public void turnOn();
//    public void turnOff();
//}
//class fan implements Switchable{
//    @Override
//    public void turnOn() {
//        System.out.println("fan on!");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("fan offed Successfully!");
//    }
//}
//class Light implements Switchable{
//    @Override
//    public void turnOn() {
//        System.out.println("Light on!");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Light offed Successfully!");
//    }
//}
class Book{
    String title;
    int book_id;
    String author;
    boolean isIssued=false;

    Book(int book_id, String title, String author) {
        this.book_id=book_id;
        this.title=title;
        this.author=author;
    }

    public void displayBook(){
        System.out.println(book_id);
        System.out.println(title);
        System.out.println(author);
    }
}
class Member{
    int memberId;
    String memberName;

    Member(int memberId, String memberName) {
        this.memberId=memberId;
        this.memberName=memberName;
    }

    public void displayMember(){
        System.out.println("member id: "+memberId);
        System.out.println("member name: "+memberName);
    }
}
class Library{
    ArrayList<Book> array=new ArrayList<>();
    public void addBook(Book book){
        array.add(book);
        System.out.println("Book Added Successfully!");
    }
    public void displayBooks(){
        for(Book b : array) {
            // use b.book_id, b.title, etc.
            System.out.println("book_id: "+b.book_id);
            System.out.println("Title: "+b.title);
            System.out.println("Author: "+b.author);
            if(!b.isIssued){
                System.out.println("Status:Available");
            }
            else{
                System.out.println("Status:Issued");
            }
        }
    }
    public void IssueBook(int bookId){
        boolean book_found=false;
        for(Book b : array) {
            if(b.book_id == bookId) {
                book_found=true;
                if(!b.isIssued){
                    b.isIssued = true;
                    System.out.println("Book Issued Successfully");
                }
                else{
                    System.out.println("Book Already Issued");
                }
            }
        }
        if(!book_found){
            System.out.println("Book Not Found");
        }

    }
    public void returnBook(int BookId){
        for (Book b:array) {
            if(b.book_id == BookId){
                b.isIssued=false;
                System.out.println("Book Returned Successfully");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(101,"Java Basics","James");
        Book b2 = new Book(102,"DSA","Striver");

        library.addBook(b1);
        library.addBook(b2);
        library.IssueBook(101);
        library.IssueBook(101);
        library.displayBooks();

        library.IssueBook(101);

        library.returnBook(101);
    }
}
//        Student_btecht student1 =new Student_btecht();
//        student1.name="charani";
//        student1.age=20;
//        student1.marks=65;
//        student1.displayDetails();
//        System.out.println(student1.ispass());
//        Student_btecht student2 =new Student_btecht();
//        student2.name="charan";
//        student2.age=20;
//        student2.marks=25;
//        student2.displayDetails();
//        System.out.println(student2.ispass());
//    }
//}
//BankAccount acc=new BankAccount();
//        acc.accountHolderName="ravana";
//        acc.balance=1000;
//        acc.desposit(1200);
//        acc.checkBalance();
//        acc.withdraw(11200);

//mobile
//Mobile mobile=new Mobile();
//mobile.brand="realme";
//mobile.price=12000;
//mobile.storage=64;
//        mobile.call();
//        mobile.showDetails();

//car
//car car1 =new car();
//car1.price=10000;
//car1.brand="Audi";
//car1.model="21f";
//        car1.printdetails();
//car car2=new car("ford",12000,"2000");

//employee
//Employee emp=new Employee(10,"charan",12000);

//dog
//Dog jimmy=new Dog();
//       jimmy.bark();
//       jimmy.eat();

//Student
//Student student=new Student();
//student.name="charani";
//student.age=10;
//student.rollno=14;
//student.marks=55;
//        student.displayDetails();

//bike
//Bike bike1=new Bike();
//bike1.brand="hero";
//bike1.speed=20;
//bike1.fuelType="diesel";
//        bike1.showBikeDetails();
//calculator
//int a=2;
//       int b=4;
//       Calculator calci=new Calculator();
//       System.out.println(calci.area(a,b));
//        System.out.println(calci.area(7));
//        System.out.println(calci.area(7.21));
//Payment
//Payment p=new cash();
//      p.pay();