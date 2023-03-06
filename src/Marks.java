public class Marks {
    // marks attributes
    private double score;
    private String id;
    private String name;
    private String className;

    // marks constructor
    public Marks(float score,String id,String name,String className){
        this.score = score;
        this.id = id;
        this.name = name;
        this.className = className;
    }

    // Method: get score
    public double getScore(){
        return score;
    }

    //Method: get id
    public String getId(){
        return id;
    }

    //Method: get name
    public String getName(){
        return name;
    }

    //Method: get class name
    public String getClassName(){
        return className;
    }
}
