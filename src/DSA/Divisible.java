package DSA;
import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        String name="1234";

        Integer num=Integer.valueOf(name);

        int ans=199;

        int sum=num+ans;

        //System.out.println(sum);
        int nums[]={1,2,3,4,5};
        int firstlargest=nums[0];
        int secondlargest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstlargest){
                secondlargest=firstlargest;
                firstlargest=nums[i];
            }
            else if(nums[i]>secondlargest && secondlargest!=nums[i]){
                {
                    secondlargest = nums[i];
                }
            }
        }
        System.out.println(secondlargest);
    }
}
