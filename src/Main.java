import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        if(arrayList.size() == 0)
        {
            return;
        }
        else
        {
            sort(arrayList, 0, arrayList.size()+1);
        }
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        if(arrayList.size() == 1)
        {
            return;
        }
        else if(lo<hi && (hi-lo)>=2)
        {
            ArrayList<Integer> lower = new ArrayList<>();
            ArrayList<Integer> higher = new ArrayList<>();
            int mid = (lo + hi)/2 -1;
            for(int x = lo; x < mid; x++)
            {
                lower.add(arrayList.get(x));
            }
            for(int x = mid; x < hi; x++)
            {
                higher.add(arrayList.get(x));
            }
            sort(lower, lo, mid);
            sort(higher, mid, hi);

            merge(arrayList, lo, mid, hi);
        }
    }

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */
    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = lo; int j = mid;
        if(lo > 0)
        {
            for(int x = 0; x < lo; x++)
            {
                merged.add(arrayList.get(x));
            }
        }
        while(i<= mid && j<=hi-1)
        {
            if(arrayList.get(i)<= arrayList.get(j))
            {
                merged.add(arrayList.get(i));
                i++;
            }
            else
            {
                merged.add(arrayList.get(j));
                j++;
            }
        }
        if(i <= mid)
        {
            for(int x = i; x < mid; x++) {
                merged.add(arrayList.get(x));
            }
        }
        if(hi < arrayList.size())
        {
            for(int x = hi; x < arrayList.size(); x++)
            {
                merged.add(arrayList.get(x));
            }
        }

        //I did this because "arrayList = merged;" wasn't working
        arrayList.clear();
        for(int x = 0; x < merged.size(); x++)
        {
            arrayList.add(merged.get(x));
        }
    }
}
