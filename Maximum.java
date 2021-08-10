package Day13;

public class Maximum<S extends Comparable<S>>  {
	private S[] inputArray;
    public Maximum(S[] inputArray) {
        this.inputArray = inputArray;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer[] intArr = {2, 3, 4, 5};
        Float[] floatArr = {2.3f, 3.4f, 5.6f, 7.8f};
        String[] stringArr = {"Apple", "Peach", "Banana", "Orange"};
        printMax(intArr, new Maximum<>(intArr).max());
        printMax(floatArr, new Maximum<>(floatArr).max());
        printMax(stringArr, new Maximum<>(stringArr).max());
    }
    private static <S> void printMax(S[] arr, S max) {
        for (S data : arr) {
            System.out.print(data + " ");
        }
        System.out.println("Maximum is " + max);
        System.out.println("Maximum of %s,%s and %s is %s \n " + max);
    }

    private S max() {
        S maximum = Maximum.getMaximum(inputArray);
        return maximum;
    }
    private static <S extends Comparable<S>> S getMaximum(S[] inputArray) {
        S max = inputArray[0];//Initializing the Variable
        for (S item : inputArray) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

