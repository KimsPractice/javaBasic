package Class;

public class UsedClass {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Students student2 = new Students();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : "+student1.name+", 나이 : "+student1.age+", 성적 : "+student1.grade);
        System.out.println("이름 : "+student2.name+", 나이 : "+student2.age+", 성적 : "+student2.grade);
    }
}
