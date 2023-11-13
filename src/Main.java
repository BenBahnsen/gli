
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Stream.of(args).forEach(System.out::println);
  }
}