package Logic;

import gui.VentanaOperaciones;

public class aplicacion {

	
	public void presentarVentana(){
		
		try { 
			VentanaOperaciones frame = new VentanaOperaciones();
			frame.setVisible(true);
		}catch (Exception e){
				e.printStackTrace();
			}
			
		}
	
	
	
	
	final float [][] monedas = {
			{1, 56.71f, 0.21f , 0.18f, 29.69f },
			{0.017f , 1 , 0.0037f, 0.0033f, 0.52f},
			{4.75f , 269.97f , 1, 0.90f, 141.37f},
			{5.27f, 299.44f, 1.10f, 1 , 156.81f},
			{0.03f, 1.90f, 0.007f, 0.006f, 1}
	};	
	
	
	
	
	
	

	public float converter(int source, int destination, float value ) {
		
		float result = value * monedas[source][destination];
		
		return result;
		
		
	
	}
		
	
	
}
