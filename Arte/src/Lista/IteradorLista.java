package Lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PintorFactory.*;

public class IteradorLista implements Iterador {
	private List<pintor> pintores;
	private int posicion = 0;
	
	
	public IteradorLista(List<pintor> pintores) {
		this.pintores = pintores;
	}
	@Override
	public boolean siguiente() {
		return posicion < pintores.size();
	}
	@Override
	public Object next() {
		if (siguiente())
			return pintores.get(posicion++);
		return null;
	}
	
	@Override
	public Object actual() {
		return pintores.get(posicion);

	}
	

}
