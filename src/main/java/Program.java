public class Program {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nguyen duc toan";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        int sum = s1.sum(3,5);
        System.out.println(sum);
    }
}
