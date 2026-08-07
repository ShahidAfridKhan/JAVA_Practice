package DSA;
import java.util.*;
public class Skipping {
    public static void itratefunction(int nums[],int n,int p){
        while(n>0){
            Arrays.sort(nums);
            n--;
            for(int i=0;i<nums.length;i=i+p){
                nums[i]=nums[i]*p;
            }
        }
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        System.out.println(max+" "+min);
    }
    public static void main(String[] args) {
        int nums[]={9,2,10,1};
        Skipping s=new Skipping();
        s.itratefunction(nums,2,2);

    }
}

/*

2pack:10;
4pack:20;

10;

int pack4=10%4;

int pack4cost=2*20;

int pack2=pzck4*10;

int sum=pack2+pack4cost;
 */
