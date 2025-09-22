import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        //DECLARATION OF VARIABLES
        String name;
        int age;
        float height;
        float weight;
        int jerseyNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        System.out.println("Enter your height: ");
        height = input.nextFloat();

        System.out.println("Enter your weight: ");
        weight = input.nextFloat();

        System.out.println("Enter your jersey number: ");
        jerseyNumber = input.nextInt();

        System.out.println("Player: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "lbs");
        System.out.println("Jersey Number: " + jerseyNumber);

        //HEIGHT AND WEIGHT CASTING
        final double POUND = 0.45359237;
        final int METER = 100;

        int newWeight = (int) (weight * POUND);
        System.out.println("New Weight: " + newWeight + "kg");

        int newHeight = (int) (height * METER);
        System.out.println("New Height: " + newHeight + "cm");

        //INCREMENT & DECREMENT OF AGE AND JERSEY NUMBER
        System.out.println("Age: " + age);
        int newAge = ++age;

        System.out.println(" Jersey Number: " + jerseyNumber);
        int newJerseyNumber = --jerseyNumber;


        System.out.println("New Age: " + newAge);
        System.out.println("New Jersey Number: " + newJerseyNumber);

        //AGE AND WEIGHT ELIGIBILITY

        boolean eligible = (age >= 18 && age <= 35 && newWeight < 90);
        if (eligible) {
            System.out.println("Eligibility - Eligible");
        } else {
            System.out.println("Eligibility - Not eligible");
        }

        boolean under_age_weight = (age < 18 || newWeight >= 90);
        if (under_age_weight) {
            System.out.println("Player has a problem(either too young or too heavy");

        }

        if (!eligible) {
            System.out.println("Eligibility - Not eligible");
        }

        //CATEGORY OF PLAYERS
        String category;
        if (age < 20) {
            category = "Rising Star";
            System.out.println("(" + category+ ")"+ age);
        } else if (age >= 20 && age < 30) {
            category = "Prime Star";
            System.out.println("(" + category+ ") " + age);
        } else {
            category = "Veteran";
            System.out.println("("+ category+ ") " + age);
        }

        //POSITION WITH JERSEY
        switch (jerseyNumber) {
            case 1:
                System.out.println("Position: GoalKeeper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Position: Player position not found");
                break;
        }
        //ATTACKER JERSEY
        boolean attackerJersey = (jerseyNumber==7 || jerseyNumber==9|| jerseyNumber==10 || jerseyNumber==11);
        if (attackerJersey){
            System.out.println("Attacker jersey : Yes");
        }
        else{
            System.out.println("Attacker jersey : No");
        }

        //LINEUP SELECTION
        if (category.equals("Prime Star")) {
            if (newWeight < 80) {
                System.out.println("Lineup Decision: Starting lineup");
            } else {
                System.out.println("Lineup Decision: Bench");
            }
        }
        else {
            System.out.println("Bench");
        }

        //FINAL DECISION( PLAY OR REST)
        String finalDecision = eligible? "Play" : "Rest";
        System.out.println("Final decision : " + finalDecision);

        //UNWANTED FALL THROUGH DEMO
        switch (jerseyNumber) {
            case 1:
                System.out.println("GoalKeeper");
                break;
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player position not found");
                break;
        }
















    }
}
