package lesson25;

public class Main {

    public static void main(String[] args) throws CustomException {

        TeacherApp teacherApp=new TeacherApp();
        Teacher mathTeacher = Teacher.MATH_TEACHER;
        System.out.println("The math teacher is " + mathTeacher.getName());

        Teacher scienceTeacher = Teacher.SCIENCE_TEACHER;
        System.out.println("The science teacher is " + scienceTeacher.getName());


        Human2 teacher=new TeacherApp();
        if (teacher instanceof TeacherApp){
            System.out.println("True");
        }else {
            throw new CustomException("Exception");
        }
    }

}
