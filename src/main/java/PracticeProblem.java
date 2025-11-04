public class PracticeProblem {

	public static void main(String args[]) {
		
	}
    public static int[] compareSearch(int[] array, int number) {
        int[] result = new int[2];

        // Sequential search
        int sequentialLoops = 0;
        for (int i = 0; i < array.length; i++) {
            sequentialLoops++;
            if (array[i] == number) {
                break;
            }
        }
        result[0] = sequentialLoops;

        // Binary search
        int binaryLoops = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            binaryLoops++;
            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                break;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        result[1] = binaryLoops;

        return result;
    }

    /**
     * Compares sequential search vs binary search for finding a word in an array
     * @param array The String array to search (must be sorted for binary search)
     * @param word The word to find
     * @return Array where [0] = sequential loops, [1] = binary loops
     */
    public static int[] compareStringSearch(String[] array, String word) {
        int[] result = new int[2];

        // Sequential search
        int sequentialLoops = 0;
        for (int i = 0; i < array.length; i++) {
            sequentialLoops++;
            if (array[i].equals(word)) {
                break;
            }
        }
        result[0] = sequentialLoops;

        // Binary search
        int binaryLoops = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            binaryLoops++;
            int mid = left + (right - left) / 2;

            int comparison = array[mid].compareTo(word);

            if (comparison == 0) {
                break;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        result[1] = binaryLoops;

        return result;
    }
}
