public class Employees {

    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private double payment;
    private int age;

    public Employees(String fullName, String position, String eMail, String phoneNumber, double payment, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printMethod() {
        String print = (" Должность: " + position + " Имя: " + fullName + " Возраст: " + age + " E-Mail: " + eMail +
                " Номер телефона: " + phoneNumber + " Зарплата: " + payment);
        System.out.println(print);

    }
}
