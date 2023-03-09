package J24_Encapsulation.Tasks.Task_01;

public class Bmi {//pojo class
    //fields
   private String name;
    private int age;
    private double weight;
    private double height;


    //constructor
    public Bmi(String name, int age, double weight, double height) {//full p li constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double getBmi() {//taks ta istenen method
        return weight / (height * height); //ins variable sonrasi output return edildi.
    }
    public String getStatus(){//task da istenen method
        if (getBmi() < 18.5) {
            return "zayifsin";
        }else if (getBmi() >= 18.5 && getBmi() < 25){
            return "Normalsin";
        }else if (getBmi() >= 25 && getBmi() < 30){
            return "Kilolusunuz";
        }else
            return "Az yeyiniz";

        }

    //getters and setters

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    //toString method
    @Override
    public String toString() {
        return "Bmi{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", weight= " + weight +
                ", height= " + height +
                '}'+getStatus();
    }
}//class sonu
