package DIP;

public interface IProcesarOrdenDHL {

    void EnviarOrden(Orden orden);
    void CancelarOrden();
    
}