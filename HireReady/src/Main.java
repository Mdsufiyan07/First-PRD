public class Main{
    public static void main(String[] args){
       String candidateName = "Mohammed Sufiyan U S";
    int registrationNumber = 47;
    String degree = "BE ISE";
    int graduationYear = 2026;
    double degreePercentage = 80;
    int activeBacklogs = 0;
    int aptitudeCorrectAnswers = 19;
    int aptitudeTotalQuestions = 20;
    int codingTestCasesPassed = 99;
    int codingTotalCases = 100;
    int communicationScore = 95;
    boolean projectCompleted = true;
    boolean profileVerified = true;


double aptitudePercentage = (double) aptitudeCorrectAnswers / aptitudeTotalQuestions * 100.0;



double codingPercentage = (double) codingTestCasesPassed / codingTotalCases * 100.0;





    System.out.println("============================================");
     System.out.println("CAMPUS PLACEMENT APPLICATION REPORT");
    System.out.println("============================================");

System.out.println("Candidate Name          :" + candidateName);
System.out.println("Registration Number     : "+ registrationNumber);
System.out.println("Degree                  : "+ degree);
System.out.println("Graduation Year         : "+ graduationYear);
System.out.println("Degree Percentage       : "+ degreePercentage);
System.out.println("Active Backlogs         : "+ activeBacklogs);

 System.err.println("-----------------------------------------------");

System.out.println("Aptitude Score          : 47 / 50");
System.out.println("Aptitude Percentage     : "+ aptitudePercentage);
System.out.println("Coding Test Cases       : "+codingTestCasesPassed +" /  100");
System.out.println("Coding Percentage       : "+ codingPercentage);
System.out.println("Communication Score     : "+ communicationScore);
System.out.println("Project Completed       : "+ projectCompleted);
System.out.println("Profile Verified        : "+ profileVerified);

System.err.println("-----------------------------------------------");

    if(degreePercentage>=60 && activeBacklogs==0 && (graduationYear == 2025 || graduationYear == 2026 || graduationYear == 2027) && aptitudePercentage>=60 && codingTestCasesPassed>=70 && communicationScore>=60 && projectCompleted==true && profileVerified==true){
        System.out.println("Degree Eligibility : Eligible");
System.out.println("Backlog Eligibility : Eligible");
System.out.println("Graduation Year : Eligible");
System.out.println("Aptitude Eligibility : Eligible");
System.out.println("Coding Eligibility : Eligible");
System.out.println("Communication Status : Eligible");
System.out.println("                                                 ");
System.out.println("------------------------------------------------");
System.out.println("Application Status :   Eligible to Apply");
        System.out.println("Next Action : Submit the company application");
        System.out.println("=========================================");
    }
    else{
        System.out.println("Application Status : Not Eligible for placement");
    }
    }
}