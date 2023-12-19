import at.konstantin.DataGenerator;
import at.konstantin.Algorithms.BubbleSort;
import at.konstantin.Algorithms.IAlgorithm;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateData(100);
        IAlgorithm algo = new BubbleSort();
        System.out.println("Input Array: \n" + DataGenerator.printArray(data));
        data = algo.sort(data);
        System.out.println("Sorted Array: \n" + DataGenerator.printArray(data));
    }
}
