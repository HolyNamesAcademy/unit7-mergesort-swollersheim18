import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by hgotu on 3/19/2018.
 */
public class MainTest extends Main {
    @Test
    public void selectionSort() throws Exception {
        // Arrange
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(3, 8, 14, 2, 5, 7, 9, 6, 1, 4, 12));

        // Act
        ArrayList<Integer> sortedArrayList = selectionSort(arrayList);

        // Assert
        ArrayList<Integer> expectedArrayList = new ArrayList<>();
        expectedArrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 14));
        assertTrue(sortedArrayList.equals(expectedArrayList));
    }

    @Test
    public void linearSearch() throws Exception {
        // Arrange
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 3, 4, 6, 8, 9, 11, 13, 14, 17));

        // Act
        int index = linearSearch(arrayList, 8);

        // Assert
        assertEquals(4, index);
    }

    @Test
    public void binarySearch() throws Exception {
        // Arrange
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 3, 4, 6, 8, 9, 11, 13, 14, 17));

        // Act
        int index = linearSearch(arrayList, 8);

        // Assert
        assertEquals(4, index);
    }

}