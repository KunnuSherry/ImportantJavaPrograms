package org.example;
class employee {
    int salary;
    String name;
    public void setName(String n){
        name = n ;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

}
public class Main {
    public static void main(String[] args) {
        employee kunal = new employee();
        kunal.setName("KunnuSherry");
        System.out.println(kunal.getName());
        kunal.salary = 233;
        System.out.println(kunal.getSalary());
    }
}

