public class interview {

    public static void main(String[] args) {
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        String roundName = "";

        switch(roundCode){
            case 1: roundName = "Aptitude Round";
            break;
            case 2: roundName = "Technical Round";
            case 3: roundName = "HR Round";
            case 4: roundName = "Final Review";
            break;
            default: roundName = "Invalid Round";
        }

        String at = attemptsUsed<=3?"Attempt Available":"Attempt limit exhausted";
        System.out.println("Current Round: " + roundName);
        System.out.println("Attempt Status: " +at);

    
}
}
