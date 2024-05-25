

class Solution
{
  static void insert(int arr[],int i)
  {
       int temp=arr[i];
       i=i-1;
       while(i>=0 && arr[i]>temp){
           arr[i+1]=arr[i];
           i--;
       }
       arr[i+1]=temp;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      int i=1;
      for(;i<n;i++){
          insert(arr,i);
      }//code here
  }
}