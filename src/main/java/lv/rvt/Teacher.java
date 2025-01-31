package lv.rvt;

class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, String email, int salary) {
        super(name, age, email);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + salary + " euro/month}";
    }
}
