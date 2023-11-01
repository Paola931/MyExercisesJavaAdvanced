package MyExercisesJavaAdvanced.ArrayList.ArrayList1.ArrayList1;

public class Student {
    String name,surname;
    int age;


    public Student (String name,String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
