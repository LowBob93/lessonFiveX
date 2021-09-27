public class MainClass {
    public static void main(String[] args) {
        System.out.println("Информация о сотрудниках старше 40 лет: ");
        arrayEmployerFill();
    }

    public static void arrayEmployerFill() {
        Employees[] empArray = new Employees[5];
        empArray[0] = new Employees("Jhon Jhonson", "Master-Сhif",
                "JJ2211@gmail.com", "89281212152", 70000.0, 46);
        empArray[1] = new Employees("Alex theOne", "Janitor",
                "superClean@gmail.com", "89281515120", 25000.0, 37);
        empArray[2] = new Employees("Joe Logan", "Supervisor",
                "forTheHorde@gmail.com", "89188581010", 125000.0, 42);
        empArray[3] = new Employees("Tim Shif", "HR",
                "catch@gmail.com", "89188101225", 35000.0, 22);
        empArray[4] = new Employees("Thomas Anderson", "Neo",
                "neo@Matrix.com", "0110100010100", 40000.0, 41);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() >= 40) {
                empArray[i].printMethod();
            }
        }
    }


}

