
/**
 * Write a description of class Array3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array3
{
    public int maxSpan(int[] nums) {
        int span=1;
        int count=0;

        for(int i=0;i<nums.length;i++) {
  
            for(int j=nums.length-1;j>0;j--) {
                if(nums[j]==nums[i]) {
                    count=j-i+1;
      
                    if(count>span) span=count;
      
                }
    
    
            }

        }
        if(nums.length==0) span=0;

        return span;

    }

    public int[] fix34(int[] nums) {
        int [] arr=new int[nums.length];
  
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==4) {
                for(int j=0;j<nums.length;j++) {
     
                    if(nums[j]==3) {
                        int aux=nums[i];
                        nums[i]=nums[j+1];
                        nums[j+1]=aux;
       
                    }
                }
            }
        }
  
  
        return nums;
    }

    public int[] fix45(int[] nums) {
        int def=0,k=0;
 
        int [] auxArr= new int[nums.length];
 
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=4 && nums[i]!=5) {
                auxArr[def++]=nums[i];
            }
    
        }
  
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==4) {
                nums[i+=1]=5;
            }
            else
            nums[i]=auxArr[k++];
        }



        return nums;
    }
    
    public boolean linearIn(int[] outer, int[] inner) {

        int acum=0;
        int aux=0;


        for(int i=0;i<outer.length;i++) {
            if(inner.length==0) return true;
            if(outer[i]==inner[aux]){ 
                acum++;
                aux++;
            }
            else if(outer[i]>inner[aux]){
                return false;
            }

            if( acum==inner.length) return true;
  
        }



        return false;

    }

    public int[] seriesUp(int n) {
        int iterator=0;
        int [] k= new int [(n*(n+1))/2];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
     
                k[iterator++]=j;
            }
    
        }
  
        return k;
    
    }


}
