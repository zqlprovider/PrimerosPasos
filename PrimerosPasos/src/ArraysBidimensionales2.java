
public class ArraysBidimensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix={
				{12,32,34,45,67},
				{65,76,348,98,90},
				{4,56,67,87,88},
				{32,43,45,7,78},
		};
		
		for(int[]fila:matrix){
			for(int z:fila){
				System.out.print(z+" ");
			}
			System.out.println("");
		}

	}

}
