package Observer;

public class Pintura {	
	public Sujeto sujeto;
	
	public Pintura(Sujeto Sujeto) {
		this.sujeto = Sujeto;
	}
	
	public void publicar(int x1, int y1, int x2, int y2) {
		sujeto.actualizar(x1,y1,x2,y2); 
	}

}

