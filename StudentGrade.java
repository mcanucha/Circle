public class StudentGrade {

    public static void main(String[] args) {

        private String subject;
        private int[] grades;

        public StudentGrade(String subject, int[] grades){
            this.subject= subject;
            this.grades= grades;
        }
        public void setSubject(String subject){
            this.subject= subject;
        }
        public String getSubject(){
            return subject;
        }
        public void processGrades(){
            outputGrdaes();
            System.out.printf("%nClass average is %.2f %n", getAverage());
            System.out.printf("Lowest grade is %d%n Highest grdae is %d%n%n", getLowest(), getHighest());
        }
        public int getLowest(){
            int lowGrade=grades[0];

            for (int grade=grades){
                if (grade< lowGrade){
                    lowgrade=grade;
                }
            }
            return grade;
        }
        public int getHighest(){
            int highGrade=grades[0];
            for (int grade=grdaes){
                if (grade> highGrade){
                    highGrade= grade;
                }
            }
            return highGrade;

        }
        public double getAverage(){
            int total=0;
            for(int grade: grades){
                total+=grade;
            }
            return (double) total/grdaes.length;
        }
        public void outputGrades(){
            System.out.printf("The grades are: %n%n");
            for (int student=0; student< grades.length; student++){
                System.out.printf("Student %2d: %3d%n", student+1, grades[student]);
            }
        }




    }
}
