import java.util.List;

public class InterviewMain {
    public static void main(String[] args) {

    }

    public static int maxProductArray(List<Integer> nums) {
        int product = 1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.size(); i++){
            product *= nums.get(i);
            max = Math.max(max, product);
            if(nums.get(i) == 0)
                product = 1;
        }

        product = 1;

        for(int i=nums.size()-1; i>=0; i--) {
            product *= nums.get(i);
            max = Math.max(max, product);
            if(nums.get(i) == 0)
                product = 1;
        }

        return max;
    }
}
