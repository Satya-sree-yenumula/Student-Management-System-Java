public class Student {

    int id;
    String name;
    int age;
    String course;

    // Constructor
    public Student(int id, String name, int age, String course) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display Student Details
    @Override
    public String toString() {

        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course;
    }
}