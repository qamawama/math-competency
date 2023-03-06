import java.util.ArrayList;

public class AllMarks {
    // All marks attributes
    private double averageMark;
    private double stdDevMark;
    // create a list of all marks
    private ArrayList<Marks> allmarks = new ArrayList<Marks>();

    // all marks constructor
    public AllMarks(){
    }

    // Method: add marks into list
    public void addMarks(Marks marks){
        this.allmarks.add(marks);
    }

    // Method: Display marks of one school
    public void displayMarks(){
        for (int i = 0; i < this.allmarks.size(); i++){
            System.out.println("#" + (i+1));
            System.out.println("SCORE: " + this.allmarks.get(i).getScore());
            System.out.println("ID: " + this.allmarks.get(i).getId());
            System.out.println("NAME: " + this.allmarks.get(i).getName());
            System.out.println("CLASS NAME: " + this.allmarks.get(i).getClassName());
        }
    }

    // Method: calc average score
    public double calcAverage(){
        double sum = 0;
        for (int i = 0; i < this.allmarks.size(); i++){
            sum += this.allmarks.get(i).getScore();
        }
        this.averageMark = sum / this.allmarks.size();
        return this.averageMark;
    }

    // Method: calc standard deviation for score
    public double calcStdDev(){
        double value = 0;
        double sqValue = 0;
        double sum = 0;
        for (int i = 0; i < this.allmarks.size(); i++){
            value = this.allmarks.get(i).getScore() - this.averageMark;
            sqValue = Math.pow(value,2.0);
            sum += sqValue;
        }
        this.stdDevMark = Math.sqrt((sum/this.allmarks.size()));
        return this.stdDevMark;
    }
}
