package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Course englishCourse = new Course();
        Student student1 = new Student("Yaroslav");
        Student student2 = new Student("Karina");
        Teacher teacher = new Teacher("Ivan Serhiyovich");

        englishCourse.attach(student1);
        englishCourse.attach(student2);
        englishCourse.attach(teacher);

        englishCourse.addNewLesson("Lesson 1: Introduction to Grammar");
        englishCourse.addNewLesson("Lesson 2: Vocabulary Building");

        englishCourse.detach(student2);
        englishCourse.addNewLesson("Lesson 3: Conversational Practice");
    }
}
