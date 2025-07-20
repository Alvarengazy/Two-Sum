import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class twosum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanha de usa array : ");
        int array = scanner.nextInt();
        int[] nums = new int[array];

        System.out.print("Digite os valores da array");
        for (int numeros = 0; numeros < array; numeros++) {
            nums[numeros] = scanner.nextInt();
        }

        System.out.print("Digite o valor de Target");
        int target = scanner.nextInt();

        twosum sol = new twosum();
        int[] result = sol.twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("Nenhum par encontrado.");
        } else {
            System.out.println("Índices dos números que somam ao target: " + Arrays.toString(result));
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}