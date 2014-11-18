
public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]matrix=new int[4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=5;
		matrix[0][2]=55;
		matrix[0][3]=65;
		matrix[0][4]=45;
		
		matrix[1][0]=54;
		matrix[1][1]=68;
		matrix[1][2]=54;
		matrix[1][3]=23;
		matrix[1][4]=23;
		
		matrix[2][0]=77;
		matrix[2][1]=85;
		matrix[2][2]=20;
		matrix[2][3]=58;
		matrix[2][4]=66;
		
		matrix[3][0]=89;
		matrix[3][1]=98;
		matrix[3][2]=65;
		matrix[3][3]=23;
		matrix[3][4]=23;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}

	}

}
