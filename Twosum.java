class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int a=nums[i]+nums[j];
                if(a==target){
                    
                   return new int[]{i,j};
                }
            }
            
        }  
        return new int[]{};
    }
    public static void main(String args[])
    {
        int[] nums=new int[1000];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution obj=new Solution();
        int c[]=new int[2];
        c=obj.twoSum(nums,target);
        System.out.println(c);
    }
}