package cn.itcast.day06.Demo03;

public class Demo04Student {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Kiko");
        student.setAge(20);
        student.setMale(false);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("It is boy: " + student.isMale());
    }

}
