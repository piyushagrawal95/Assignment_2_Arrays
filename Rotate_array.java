package Assignment_2_Arrays;

public class Rotate_array {
    static void rotateArr(int arr[], int d, int n) {
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
        // add your code here
    }
    static void rotate(int[]arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    
}
