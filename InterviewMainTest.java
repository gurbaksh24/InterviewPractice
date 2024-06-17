import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InterviewMainTest {

    @org.junit.jupiter.api.Test
    void maxProductArray() {
        List<Integer> input = new ArrayList<>(Arrays.asList(2,3,-1,4));
        assertEquals(InterviewMain.maxProductArray(input), 6);
    }
}