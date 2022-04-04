package javafx;

public class Person {
    public String fullName;
    public String email;
    public Integer age;

    public Person() {
    }

    public Person(String fullName, String email, Integer age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "\n------------------";
        s += "\n" + getFullName();
        s += "\n" + getEmail();
        s += "\n" + getAge();
        return s;
    }
}
