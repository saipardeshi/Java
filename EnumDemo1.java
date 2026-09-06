public class EnumDemo1 {

    // Defining an enum - a fixed set of possible values
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        System.out.println("Today is: " + today);

        // Using enum in a switch statement
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday - time to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend - relax!");
                break;
        }

        // Looping through all possible enum values
        System.out.println("All days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // Comparing enums safely
        if (today == Day.WEDNESDAY) {
            System.out.println("Halfway through the week!");
        }
    }
}