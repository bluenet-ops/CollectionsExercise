import java.util.HashMap;

public class CourseService{
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();


    public CourseService(){
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudent(String studentId, String courseId){
    	Student student = students.get(studentId);
    	Course course = courses.get(courseId);
    	if (student != null && course !=null) {
    		student.enroll(course);
    		System.out.println("----------------------------");
    		System.out.println("Estudiante " + studentId + " se inscribió al curso " + courseId);
		} else {
			System.out.println("Estudiante o curso no encontrado");
		}
    }// enrollStudent

    public void unEnrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student != null && course != null) {
            student.unEnroll(course);
            System.out.println("----------------------------");
            System.out.println("Estudiante " + studentId + " se dio de baja del curso " + courseId);
        } else {
            System.out.println("Estudidante o curso no encontrado");
        }
    }// unEnrollStudent

    public void displayCourseInformation(String courseId) {
        Course course = courses.get(courseId);
        if (course != null) {
            System.out.println("Curso\n");
            System.out.println("Nombre: " + course.name);
            System.out.println("ID: " + course.id);
            System.out.println("Créditos: " + course.credits);
            System.out.println("----------------------------");
        } else {
            System.out.println("Curso no encontrado");
        }
    }// displayCourseInformation

    public void displayStudentInformation(String studentId){
        Student student = students.get(studentId);
        if (student != null) {
            System.out.println("\nDatos del estudiante\n");
            System.out.println("Nombre: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("\nCursos suscritos:");
            if (student.getEnrolledCourses().isEmpty()){
                System.out.println("Ningún curso suscrito");
            } else {
                for (Course course : student.getEnrolledCourses()){
                    System.out.println("Nombre: " + course.name + " ,ID del curso: " + course.id + " ,créditos totales: " + course.credits);
                }
            }
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }// displayStudentInformation
    
}// class CourseService