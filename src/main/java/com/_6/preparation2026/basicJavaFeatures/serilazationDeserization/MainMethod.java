package com._6.preparation2026.basicJavaFeatures.serilazationDeserization;

import java.io.*;

public class MainMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sagar Das");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/file.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/file.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Employee employee1 = new Employee();
        employee1= (Employee) objectInputStream.readObject();
        System.out.println(employee1.getId());
        System.out.println(employee1.getName());

        Human human=new Human();
        human.setId(1);
        human.setName("Sagar Das");
        human.setAddress("UNK BELVISTA");
        human.setPhone(9999);
        FileOutputStream fileOutputStream1 = new FileOutputStream("src/main/resources/human.exe");
        ObjectOutputStream objectOutputStream1=new ObjectOutputStream(fileOutputStream1);

        objectOutputStream1.writeObject(human);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream2 = new FileInputStream("src/main/resources/human.exe");
        ObjectInputStream objectInputStream2=new ObjectInputStream(fileInputStream2);
        Human human1=new Human();
        human1= (Human) objectInputStream2.readObject();
        System.out.println(human1.getId());
        System.out.println(human1.getName());
        System.out.println("address -->> " +human1.getAddress());
        System.out.println("phone number -->>"+ human1.getPhone());





    }
}
