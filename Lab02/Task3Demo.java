public class Task3Demo {
    public static void main(){
        Student s1 = new Student();
        s1.name="M.Arman Hamza";

        //TEsting Valid calls.
        s1.enroll("CSC241");
        s1.enroll("CSC241", 1);
        s1.enroll(241); 
        //Testing Invalid calls.
        //s1.enroll(arman);
        //s1.enroll(4,"arman");

    }
}
