class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int p[]=new int[c];
        int i=0,j=0,k=0;
        while(i<a && j<b){
            if(nums1[i]<nums2[j]){
                p[k]=nums1[i];
                i++;
            }
            else{
                p[k]=nums2[j];
                j++;
            }
            k++;
        } 
        while(i<a){
            p[k]=nums1[i];
            i++;
            k++;
        }
        while(j<b){
            p[k]=nums2[j];
            j++;
            k++;
        }
        if(c%2==0){
            double m=(p[(c/2)-1]+p[c/2])/2.0;
            return m;
        }
        else{
            double m=p[c/2];
            return m;
        }
    }
}
