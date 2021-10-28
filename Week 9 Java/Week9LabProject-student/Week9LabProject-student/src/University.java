import java.util.ArrayList;

public class University {
    // l1 Instance Variables
    private String UniversityName;
    private int worldRank;
    private ArrayList<String> faculties;
    private ArrayList<String> students;
    private ArrayList<String> enrollment;

    // l2 Accessors
    public String getUniversityName{
        for (int i = 0; i < UniversityName.length(); i++){
            if (str1.length() < 3){
                System.out.println("Invalid entry");
            }
            else{
                System.out.println(getUniversityName);
            }
        }

    }
    public int getWorldRank{
        if (worldRank < 0){
            System.out.println("Invalid entry");
        }
        else{
            System.out.println(getWorldRank);
        }
    }

    // l3 Mutators
    public void setUniversityName(string newUniversityName){

    }

    public void setWorldRank(int newWorldRank){

    }

    //L3
    public University(String initUniversityName, int initWorldRank){
        setUniversityName(initUniversityName);
        setWorldRank(initWorldRank);

    }

    // L4
    public String toString(){
        String output = "";
        output += "The university name is: " + universityName;
        output += "| World rank: " + worldRank;
        return output;
    }

    //l5
    public boolean addStudent(String StudentName){
        ArrayList<String> studentList = new ArrayList<String>();

        for (int i = 0; i < studentList.length(); i++) {
            if(studentList[i].length < 2){
                return False;
            }
            else{
                return True;
            }
        }

    }


    //L7
    public boolean addEnrollment(String studentName, String facultyName){
        boolean retVal = false;


        ArrayList<string> arL = new ArrayList();
        arL.add("FIT");
        arL.add("Business");
        return retVal;
    }


}
