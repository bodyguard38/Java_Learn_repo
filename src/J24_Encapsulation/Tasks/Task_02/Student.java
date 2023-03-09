package J24_Encapsulation.Tasks.Task_02;

public class Student {
    //fields
    private String name;
    private int age;

    public Student(String name, int age) {//constructor full p li
        this.name = name;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
