
public class Hw01 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <=9 ; i++ ) {
			for( int j = 2 ; j <= 9 ; j++ ) {
				System.out.print(j + " * " + i + " = " + j*i);
				if( j*i < 10 ) {
					System.out.print("    ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}

}
