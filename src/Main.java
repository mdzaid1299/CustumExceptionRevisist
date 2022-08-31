import com.example.demo.MyDemo;
import exception.MyException;

public class Main {
    public static void main(String[] args) {
        MyDemo demo = new MyDemo(5);
        try {
            System.out.println("my balance is " + demo.myBalance());
        } catch (MyException e) {
            System.out.println(e);
            e.printStackTrace();
            System.out.println("maintain amount");
        }
    }
}
