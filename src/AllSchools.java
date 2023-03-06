import java.util.ArrayList;

// all schools
public class AllSchools {
    // all school attributes
    private int numSchool;
    // create new array of school
    private ArrayList<School> allSchool = new ArrayList<School>();
    private AllMarks allmarks;

    // all schools constructor
    public AllSchools() {

    }

    // Method: add new school into list of all schools
    public void addSchool(School newSchool) {
        this.allSchool.add(newSchool);
        //System.out.println("School added successfully");
    }

    // Method: get index of arraylist
    public int getIndex(ArrayList<School> allSchool, String schoolname) {
        int index = 0;
        for (int i = 0; i < allSchool.size(); i++) {
            if (allSchool.get(i).getSchoolName().equals(schoolname)) {
                index = i;
            }
        }
        return index;
    }

    // Method: remove school from list of all schools
    public void removeSchool(String schoolname) {
        int index = getIndex(allSchool, schoolname);
        this.allSchool.remove(index);
        System.out.println("School " + schoolname + " removed successfully");
    }

    // Method: get all school array
    public ArrayList<School> getAllSchool() {
        return this.allSchool;
    }

    // Method: display all school and average score
    public void getAllAvgScore() {
        for (int i = 0; i < allSchool.size(); i++) {
            double average = this.allSchool.get(i).getAvgScore();
            String name = this.allSchool.get(i).getSchoolName();
            System.out.println(name + " --> " + average);
        }
    }

    public void getAllStdDevScore(){
        for(int i = 0; i < allSchool.size(); i++){
            double stdDev = this.allSchool.get(i).getStdDevScore();
            String name = this.allSchool.get(i).getSchoolName();
            System.out.println(name + " --> " + stdDev);
        }
    }
}
