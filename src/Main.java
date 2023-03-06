import java.util.*;
public class Main {
    public static void main(String[] args) {

        AllYear allYear = new AllYear();

        // YEAR 2020...
        AllSchools year2020 = new AllSchools();
        // SCHOOL 1
        School mrsmtdk = new School("MRSM Terendak","2020");
        SchoolAddress address = new SchoolAddress("Masjid Tanah","Melaka");
        mrsmtdk.setSchoolAddress(address);
        PrincipalName principalname = new PrincipalName("Haji","Kadir");
        mrsmtdk.setPrincipalName(principalname);

        AllMarks mrsmtdk2020Marks = new AllMarks();
        Marks marks = new Marks(59,"1415","Qamarina","5A3");
        mrsmtdk2020Marks.addMarks(marks);
        marks = new Marks(70,"1479","Aini","5A3");
        mrsmtdk2020Marks.addMarks(marks);
        marks = new Marks(30,"1200","Irfan","5B2");
        mrsmtdk2020Marks.addMarks(marks);
        mrsmtdk.setMarks(mrsmtdk2020Marks);

        year2020.addSchool(mrsmtdk);


        // SCHOOL 2
        School smkp = new School("SMK Putatan","2020");
        SchoolAddress address1 = new SchoolAddress("Kota Kinabalu","Sabah");
        smkp.setSchoolAddress(address1);
        PrincipalName principalname1 = new PrincipalName("Zahin","Shukran");
        smkp.setPrincipalName(principalname1);

        AllMarks smkp2020Marks = new AllMarks();
        Marks marks1 = new Marks(80,"3219","Yun","Razi");
        smkp2020Marks.addMarks(marks1);
        marks1 = new Marks(50,"1470","Nabil","Razi");
        smkp2020Marks.addMarks(marks1);
        smkp.setMarks(smkp2020Marks);

        year2020.addSchool(smkp);

        // after finishing creating school objects for Year 2020, we add them in our All Year record
        allYear.addYear(year2020);



        // YEAR 2022...
        AllSchools year2022 = new AllSchools();
        // SCHOOL 1
        School integomb = new School("SBPI Gombak","2022");
        SchoolAddress address2 = new SchoolAddress("Gombak","Selangor");
        integomb.setSchoolAddress(address2);
        PrincipalName principalname2 = new PrincipalName("Ahmad","Zachary");
        integomb.setPrincipalName(principalname2);

        AllMarks integomb2022Marks = new AllMarks();
        Marks marks2 = new Marks(58,"1111","Azra","5S");
        integomb2022Marks.addMarks(marks2);
        marks2 = new Marks(90,"2222","Asep","5T");
        integomb2022Marks.addMarks(marks2);
        integomb.setMarks(integomb2022Marks);

        year2022.addSchool(integomb);

        allYear.addYear(year2022);

        //---------------------------------------------------------------------------------------------------------
        //                                  APPLICATION PROGRAM
        // GET SCORE FOR PARTICULAR YEAR AND SCHOOL
        System.out.println();
        System.out.println("DISPLAYING DATA......");
        allYear.getScore("2020","MRSM Terendak");

        // LIST OUT THE AVERAGE SCORE FOR EACH SCHOOL
        System.out.println();
        System.out.println("DISPLAYING AVERAGE SCORE...");
        year2020.getAllAvgScore();
        year2022.getAllAvgScore();

        // LIST OUT THE STANDARD DEVIATION FOR EACH SCHOOL
        System.out.println();
        System.out.println("DISPLAYING STANDARD DEVIATION...");
        year2020.getAllStdDevScore();
        year2022.getAllStdDevScore();

    }
}