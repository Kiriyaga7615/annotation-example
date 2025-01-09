package app;

public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Finds the max element in array")
    @Author(firstName = "firstName", lastName = "lastName")
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Finds the min element in array")
    @Author(firstName = "firstName1", lastName = "lastName1")
    public int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
