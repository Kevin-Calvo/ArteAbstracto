package Lista;
import java.util.ArrayList;
import java.util.List;

import PintorFactory.*;

public class ListaConcreta implements Lista{
	private List<pintor> pintores = new ArrayList<>();
	
	public void agregarPintor(pintor pintor) {
		pintores.add(pintor);
	}
	
	@Override
    public Iterador crearIterador() {
        return new IteradorLista(pintores);
    }
}
