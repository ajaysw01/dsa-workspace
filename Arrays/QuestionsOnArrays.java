import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuestionsOnArrays{
    public static void main(String[] args) {
        //unsorted array
        int[] arr = {2,5,14,5,8,9,1,5,11};
        //sorted array
        int[] nums = {2,3,8,11,13,17,16};

        // System.err.println(linearSearch(arr, 21));

        // System.out.println(binSearch(nums,12));

        // System.out.println(minimumElement(arr));

        // System.out.println(maximumElement(arr));

        // reverseArray(arr);
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println(duplicateElement(new int[]{2,3,4,2,4,9}));
        System.out.println(occurrences(arr, 2));
        
    }

    //linear Searching 
    public static int linearSearch(int[] arr, int key){
        for(int i =0 ;i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    //binarySearch
    public static int binSearch(int[] nums, int key){
        int n = nums.length;
        int low = 0 ; 
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(key==nums[mid]){
                return mid;
            }else if (key<nums[mid]){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }  
        return -1;
    }

    //minimum element in an array
    public static int minimumElement(int[] arr){
        int n = arr.length;
        int min = arr[0];
        for(int i =0 ; i<n ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    //maximum element in an array
    public static int maximumElement(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i =0 ; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //reverse an array
    public static void reverseArray(int[] arr){
        int left = 0 ;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            right--;
            left++;
        }
        
    }

    //print the duplicate element in an array
    public static ArrayList duplicateElement(int[] arr){
        ArrayList list = new ArrayList<>();
        for(int i =0 ;i<arr.length-1;i++){
           for(int j = i+1; j<arr.length; j++){
            if(arr[i]==arr[j]){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
           }
        }
        return list;
    }
    
    //Count number of occurrences (or frequency) in a sorted array
    public static int occurrences(int[] arr, int target){
        int count = 0;
        for(int i =0 ;i<arr.length-1; i++){
            if(target == arr[i]){
                count ++;
            }
        }
        return count;
    }

    public static void leftRotateByOne(int[] arr){

    }
   
}