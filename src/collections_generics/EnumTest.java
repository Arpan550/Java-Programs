package collections_generics;

// Enum for days of the week
enum WeekDay {
    // Enum constants with associated boolean indicating if it's a weekday (true) or weekend (false)
    MONDAY(true, false),
    TUESDAY(true, false),
    WEDNESDAY(true, false),
    THURSDAY(true, false),
    FRIDAY(true, false),
    SATURDAY(false, true),
    SUNDAY(false, true);

    // Private field to store if it's a weekday or weekend
    private final boolean isWeekDay;
    private final boolean isWeekend;

    // Constructor to initialize the enum constants
    WeekDay(boolean isWeekDay, boolean isWeekend) {
        this.isWeekDay = isWeekDay;
        this.isWeekend = isWeekend;
    }

    // Public method to check if the day is a weekday
    public boolean isWeekDay() {
        return isWeekDay;
    }
    public boolean isWeekend(){
        return isWeekend;
    }
}


public class EnumTest {
    public static void main(String[] args) {
        // Printing all days in a week
        System.out.println("All days in a week:");
        System.out.println(WeekDay.MONDAY);
        System.out.println(WeekDay.TUESDAY);
        System.out.println(WeekDay.WEDNESDAY);
        System.out.println(WeekDay.THURSDAY);
        System.out.println(WeekDay.FRIDAY);
        System.out.println(WeekDay.SATURDAY);
        System.out.println(WeekDay.SUNDAY);

        // Printing days list using values() method of enum
        System.out.print("\nDays list: ");
        for (WeekDay day : WeekDay.values()) {
            System.out.print(day + " ");
        }


        System.out.println("\n\nChecking if MONDAY is a weekday: " + WeekDay.MONDAY.isWeekDay());
        System.out.println("Checking if SATURDAY is a weekday: " + WeekDay.SATURDAY.isWeekDay());

        System.out.println("\n\nChecking if MONDAY is a weekend: " + WeekDay.MONDAY.isWeekend());
        System.out.println("Checking if SATURDAY is a weekend: " + WeekDay.SATURDAY.isWeekend());
    }
}
