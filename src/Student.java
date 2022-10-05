public class Student {
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    private double averageTestScores;

    public Student(String firstName, String lastName, int gradYear) {
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void addTestScore(double newTestScores) {
        accumulatedTestScores = newTestScores;
        testScoreCount += 1;
    }

    public boolean isPassing() {
        if (averageTestScores >= 65) {
            return true;
        } else {
            return false;
        }
    }
    public double averageTestScore() {
        double averageTestScore= accumulatedTestScores / testScoreCount;
        return averageTestScore;


    }


    public void printStudentInfo(){
        System.out.println("Students full name: " + firstName + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Scores: " + averageTestScores);
        System.out.println("Is passing: "+ isPassing());

    }




}
