public class Main {
    public static void main(String[] args) {
        BaseQuery base = new BaseQuery();
        base.addData("(Name, Age) VALUES ('ANNA',35)");
        base.addData("(Name, Age) VALUES ('DANY',52)");
        base.addData("(Name, Age) VALUES ('JOY',23)");
        base.createTableIfNotExist("salary (" + "  id INTEGER, " + " Salary INTEGER)");
        base.selectStaffOlderThan(50);
//base.deleteStaffOlderThan(23);

    }
}
