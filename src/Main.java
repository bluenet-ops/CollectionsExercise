public class Main{
    public static void main( String[] args){
        CourseService courseService = new CourseService();

        String courseId = "biol_01";
        String studentId = "884545";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
    }

}