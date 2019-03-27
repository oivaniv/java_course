public class Person {

    private int age;
    private String lastName;
    private int weigh;
    private boolean isAdult;

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;

        if (age >= 18) {
            isAdult = true;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
}
