package TercerParcialClase.Ejercicios.Proxy;


public class Client {

    public static void main (String [] args){
        // create proxy
        IServidor proxy = new Proxy(new Servidor());

        proxy.carga("Ejercicio",enumTipo.ZIP);
        proxy.descarga();
        proxy.carga("Ejercicio",enumTipo.RAR);
        proxy.descarga();
        proxy.carga("Ejercicio",null);
        proxy.descarga();

    }
}