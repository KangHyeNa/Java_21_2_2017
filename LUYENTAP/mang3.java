package LUYENTAP;

public class mang3 {
	public static void hamDaoNguoc(int[] list) {
		  int[] result = new int[list.length];
		  // vong lap de dao nguoc mang
		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		    
		  }
		  // vong lap foreach de hien thi cac phan tu trong mang dao nguoc
		  for (int a: result) {
		         System.out.print(a+ " ");
		      }
		}
	public static void main(String [] args){
		int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		hamDaoNguoc(arr);
		
	}
}
