import java.util.Arrays;
public class Main {
    public static void main(String...args) {
        Sum twoSum = new Sum();
        int[] __nums = {6,5,4,2,2,2};
        int __target = 9;
        String __indices = Arrays.toString(twoSum.getIndices(__target, __nums));
        System.out.println(__indices);
    }
}
