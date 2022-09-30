import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        System.out.println(sevenBoom(new int[]{10, 10, 17}));
    }


    public static String sevenBoom(int[] list) {
        return Arrays.stream(list).mapToObj(String::valueOf).anyMatch(val -> val.contains("7")) ? "Boom!":"there is no 7 in the array";
    }
}
