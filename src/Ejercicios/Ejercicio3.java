package Ejercicios;
import javax.swing.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		int diametro = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el vaslor del diametro"));
		float area = (diametro*diametro)+3.1416f;
		
		JOptionPane.showMessageDialog(null, "El area del circulo es "+area);
		
		
	}
}
