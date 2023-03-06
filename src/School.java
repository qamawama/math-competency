public class School {
    // School attributes
    private String name;
    private  String year;
    private  SchoolAddress address;
    private PrincipalName principalName;
    private AllMarks studentMarks;
    private double averageScore;
    private double stdDevScore;

    // School constructor
    public School(String name,String year){
        this.name = name;
        this.year = year;
    }

    // Method: get school name
    public String getSchoolName(){
        return name;
    }

    // Method: get year
    public String getYear(){
        return year;
    }

    // Method: set school address
    public void setSchoolAddress(SchoolAddress address){
        this.address = address;
    }

    // Method: set principal name
    public void setPrincipalName(PrincipalName principalName){
        this.principalName = principalName;
    }

    // Method: set school's marks
    public void setMarks(AllMarks allmarks){
        this.studentMarks = allmarks;
        //System.out.println("Marks dataset added successfully");
    }

    //Method: get school's marks
    public AllMarks getStudentMarks(){
        return this.studentMarks;
    }

    // Method: get school's average score
    public double getAvgScore(){
        this.averageScore = studentMarks.calcAverage();
        return this.averageScore;
    }

    // Method: get school's standard deviation score
    public double getStdDevScore(){
        this.stdDevScore = studentMarks.calcStdDev();
        return this.stdDevScore;
    }

}
