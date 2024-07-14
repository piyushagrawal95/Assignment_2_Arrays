package Assignment_2_Arrays;

public class Check_if_array_is_sorted_and_rotated {
    public boolean check(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        if(count==1){
            if(nums[0]>=nums[nums.length-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
       
        
        
    }
    
}
