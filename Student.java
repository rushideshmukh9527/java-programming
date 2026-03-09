public class Student {

    private int registrationNumber;
    private String name;
    private int age;
    private String course;

   public Student(int registrationNumber, String name, int age, String course) {
    this.registrationNumber = registrationNumber;
    this.name = name;
    this.age = age;
    this.course = course;
}
    
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Reg No: " + registrationNumber +
               ", Name: " + name +
               ", Age: " + age +
               ", Course: " + course;
    }
}
