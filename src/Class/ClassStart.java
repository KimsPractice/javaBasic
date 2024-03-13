package Class;

public class ClassStart {
    public static void main(String[] args) {
        // 변수로만 학생정보 표출하기
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("변수");
        System.out.println("이름 : "+student1Name+",나이 : "+student1Age+", 성적 : "+student1Grade);
        System.out.println("이름 : "+student2Name+",나이 : "+student2Age+", 성적 : "+student2Grade);

        //배열 사용해서 반복줄이기
        String[] studentsName = {"학생1","학생2","학생3"};
        int[] studentsAge = {15,16,17};
        int[] studentsGrade = {90,80,70};

        System.out.println("배열로 반복줄이기");
        for (int i = 0; i <studentsName.length ; i++) {
            System.out.println("이름 : "+studentsName[i]+",나이 : "+studentsAge[i]+", 성적 : "+studentsGrade[i]);
        }
    }
}
