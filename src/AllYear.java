import java.util.ArrayList;

public class AllYear {
    // All year attributes
    private ArrayList<AllSchools> year = new ArrayList<AllSchools>();

    // Year constructor
    public AllYear() {
    }

    // Method: add year
    public void addYear(AllSchools allSchools) {
        this.year.add(allSchools);
    }

    // Method: get/display score for particular year and school
    public void getScore(String spefYear, String spefSchoolName) {
        for (int i = 0; i < year.size(); i++) {
            for (int j = 0; j < year.get(i).getAllSchool().size(); j++) {
                if ((year.get(i).getAllSchool().get(j).getYear().equals(spefYear)) && (year.get(i).getAllSchool().get(j).getSchoolName().equals(spefSchoolName))) {
                    System.out.println("SCHOOL: " + spefSchoolName + "       YEAR: " + spefYear);
                    year.get(i).getAllSchool().get(j).getStudentMarks().displayMarks();
                }
            }
        }
    }
}

