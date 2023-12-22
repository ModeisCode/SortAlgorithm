public class Main {
    public static void main(String[] args) {


        int[] arr = {8,2,5,3,4,7,6,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        MergeSortAlgorithm merge = new MergeSortAlgorithm();
        Sort sort = new SortGenerator(merge);
        sort.sort();











    }
}