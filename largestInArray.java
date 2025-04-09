public class largestInArray{
    public static void main(String args []){
        int arr1[]=new int [] {1,4,3,7,6,9,3,2,5,6,3};
        int temp=arr1[0];
        for (int i=1;i<arr1.length;i++){
            if(temp<arr1[i]){
                temp=arr1[i];
            }
        }
        System.out.println("the largest in the array is ="+temp);
    }
}