class matrix{
	public static void main(String args[]){
		int rows = 2;
		int columns = 4;
		int [][] matrixa= {{2,3,5,7},{5,7,8,3}};
		int [][] matrixb = {{3,6,2,4},{6,2,3,4}};
		int [][] sum=new int [rows][columns];
		for (int i=0;i<rows;i++){
			for (int j=0;j<columns;j++){
				sum[i][j]=matrixa[i][j]+matrixb[i][j];
				}
			}
		for (int i=0;i<rows;i++){
			for (int j=0;j<columns;j++){
				System.out.print(sum[i][j]+" ");
				}
			}
		}
	}