public class Main {
    public static void main(String[] args) {
        NewDateInterface dateAdapter = new CalendarToNewDateAdapter();

        dateAdapter.setYear(2023);
        dateAdapter.setMonth(11);
        dateAdapter.setDay(11);

        System.out.println("Initial date: " + dateAdapter.getDay() + "-" + dateAdapter.getMonth() + "-" + dateAdapter.getYear());

        dateAdapter.advanceDays(5);

        System.out.println("Date after advancing 5 days: " + dateAdapter.getDay() + "-" + dateAdapter.getMonth() + "-" + dateAdapter.getYear());

        dateAdapter.advanceDays(30);

        System.out.println("Date after advancing 30 more days: " + dateAdapter.getDay() + "-" + dateAdapter.getMonth() + "-" + dateAdapter.getYear());
    }
}