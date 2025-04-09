public class additionOfTwoMatrixes {
    public static void main(String args[]){
        int rows=2;
        int columns=5;
        int arr1[][]={{2,4,6,3,4},{7,4,3,2,5}};
        int arr2[][]={{4,6,2,1,4},{9,7,5,4,3}};
        int sum [][]=new int [rows] [columns];
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("successfully added two matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
