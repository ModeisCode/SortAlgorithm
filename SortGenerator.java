public class SortGenerator implements Sort{
    Algorithm algorithm;

    SortGenerator(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void sort() {
        this.algorithm.sort();
    }
}
