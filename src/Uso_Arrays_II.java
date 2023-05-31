import javax.swing.*;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		
		/*paises[0]="Mexico";
		paises[1]="Argentina";
		paises[2]="Brasil";
		paises[3]="Estados Unidos";
		paises[4]="Canada";
		paises[5]="España";
		paises[6]="Italia";
		paises[7]="Inglaterra";
		
		/*for (int i=0;i<paises.length;i++) {
			
			System.out.println("País " + (i+1) + " " + paises[i]);
		}*/
		
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
		}
		
		for(String elemento:paises) {
			
			System.out.println("Pais " + elemento);
		}
		

	}

}
