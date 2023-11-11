package PintorFactory;

import PintorFactory.PintorPoligono;
import PintorFactory.PintorPunto;
import PintorFactory.PintorRaya;
import PintorFactory.pintor;
import Observer.*;

public class pintorFactory {
	public static pintor pintorFactory(String tipo) {
        if (tipo.equalsIgnoreCase("puntos")) {
            return  new PintorPunto();
        } else if (tipo.equalsIgnoreCase("rayas")) {
            return new PintorRaya();
        } else if (tipo.equalsIgnoreCase("poligonos")) {
            return new PintorPoligono();
        } else {
            throw new IllegalArgumentException("Tipo de pintor no válido");
        }
    }
}
