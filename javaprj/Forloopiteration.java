package javaprj;

public class Forloopiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int x = 1 ;x <= 5;x++)
//		{
//			for(int y = 1;y<=10;y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int x = 1 ;x <= 10;x++)
//		{
//			for(int y = 10;y>=x;y--) {
//				System.out.print("*");
//			}
//			for(int z = 1;z<=x;z++)
//			{
//				System.out.print("");
//			}
//			System.out.println();
//		}
//		int x = 1;
//		while(x<=10)
//		{
//			System.out.println(x);
//			x++;
//		}
		for(int a = 0; a < 11; a++) {
		      
		      for(int c = 1; c <= a; c++) {
		        System.out.print(" ");
		      }
		      for(int b = 10; b >= a; b--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
	}

}
