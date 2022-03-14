package gt.edu.umg.progra3.colas;

public class AutoServicio {

    private Cola cola;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    public String ingresarAuto(String placa){
        //Ingresar codigo aqui
    	cola.enqueue(placa);
        return placa;

    }

    public String proximoAuto(){
        //ingresar codigo aqui
    	return cola.peek();

    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
        //ingresar codigo aqui
    	return cola.deque();

    }

    public int obtenerAutosEnCola(){
        //ingresar codigo aqui
    	return cola.size();

    }
}
