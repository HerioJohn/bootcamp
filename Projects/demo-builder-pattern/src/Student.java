import java.util.List;
import java.util.ArrayList;

public class Student {

    private String name;

    private int age;

    private List<String> subjects;

    public Student () {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public static class Builder {

        private String name;

        private int age;

        private List<String> subjects;

        public Builder name(String name) {
            this.name = name;
            return this;

        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder subject(List<String> subject) {
            this.subjects = subjects;
            return this;
        }

        public Student build() {
            return new Student (this.name, this.age,this.subjects)
        }

    }

    public static void main(String[] args) {
        Student student = new Student ("John", 13, new ArrayList<>(List.of("Maths", "English")));
    }

}
