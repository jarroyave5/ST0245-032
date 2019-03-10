
/**
 * Write a description of class Array2 here.
 * This is the second point of lab 2,Data Strucutures and Algorithms
 * Universidad EAFIT
 * 
 * @author Juan Andrés Arroyave y Gustavo López.
 * @version (a version number or a date)
 */
public class Array2
{
    
    public Array2()
    {
    
    }

    public int countEvens(int[] nums) {
  
        int count=0;
        for(int i=0;i<nums.length;i++) {
        if(nums[i]%2==0) count++;
        }

        return count;
    }   
    
    public boolean has12(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                for(int j=i+1;j<nums.length;j++) if(nums[j]==2) return true;
      
    }   
    
    
   }
  
   return false;
   }

   
   public boolean sum28(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++) {
           if(nums[i]==2) count+=nums[i];
        }
        return count==2*2*2;
    }
    
    
    public int[] evenOdd(int[] nums) {
        int count = 0;
    for (int i = 0; i < nums.length; i++) {

        if (nums[i] % 2 == 0) {

            int temp = nums[i];

            nums[i] = nums[count];
            nums[count] = temp;

            count++;

        }

    }

    return nums;
   }
    
   public boolean tripleUp(int[] nums) {
   for(int i=0;i<nums.length-2;i++) {
    
    if(nums[i+1]==nums[i]+1 && nums[i+2]==nums[i+1]+1)
    return true;
   }
  
  return false;
 }

        
}
