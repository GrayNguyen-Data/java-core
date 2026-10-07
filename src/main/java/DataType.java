
import java.time.LocalDate;
import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        // Cú pháp khởi tạo biến
        // <Kiểu dữ liệu> <tên biến> = [giá trị khởi tạo];

        // kiểu số nguyên: byte, short, int, long
        // giá trị mặc định: 0

        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực: float, double
        // giá trị mặc định: 0.0
        float score = 9.8f;
        System.out.println("score = " + score);

        // kiểu boolean
        // giá trị mặc định là false
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);


        //Kiểu kí tự: char (2bytes)
        //Bọc kí tự trong dấu nháy đơn
        // giá trị mặc định: \u0000
        char c = 'K';
        System.out.println("c = " + c);

        // kiểu chuỗi kí tự: String
        //Bọc chuỗi kí tự trong dấu nháy kép
        // giá trị mặc định: null
        String email = "toan.nd@gmail.com";
        System.out.println("email = " + email);

        // kiểu thời gian: LocalDate, LocalTime, LocalDateTime
        // giá trị mặc định: null
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        // kiểu enum
        // giá trị mặc định là null
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        // kiểu mảng: array
        // giá trị mặc định là null
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = new String[]{"táo", "cam", "dâu"};
        //chỉ số bắt đầu từ 0
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("numbers[4] = " + numbers[numbers.length - 1]);
        System.out.println("fruits[0] = " + fruits[0]);
    }
}
