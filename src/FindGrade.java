public class FindGrade{
    public static void main(String[]args){
        int grade = Integer.parseInt(args[0]);

        if (90 <= grade && grade<= 100){
            System.out.println("Your grade is: A");;
        }
        else if (80 <= grade && grade <= 90) {
            System.out.println("Your grade is: B");;
        }
        else if (70 <= grade && grade <= 80) {
            System.out.println("Your grade is: C");
        }
        else if (60 <= grade && grade <= 70){
            System.out.println("Your grade is: D");
        }
        else
            System.out.println("Your grade is: F");
    }
}