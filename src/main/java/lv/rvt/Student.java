package lv.rvt;

class Student extends Person {
    private int studyCredits;

    public Student(String name, int age, String email) {
        super(name, age, email);
        this.studyCredits = 0;
    }

    public void study() {
        this.studyCredits++;
    }

    public int credits() {
        return this.studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + ", studyCredits=" + studyCredits + "}";
    }
}
