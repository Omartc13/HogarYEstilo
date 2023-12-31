package Modelo;

/**
 *
 * @author Omar Tc
 */
public class RegProducto {

    private int cantidad;
    private double precio;

    public RegProducto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double CalcGananciaUnitaria(double PVenUni, double PUnidad) {
        double GananciaUni;
        GananciaUni = PVenUni - PUnidad;
        return GananciaUni;
    }

    public double CalcGananciaTotal(double gananciaUnitaria, int cantidad){
        double GananciaTot;
        GananciaTot= gananciaUnitaria*cantidad;
        return GananciaTot;
    }
    
    public double PrecTotalPorRegistro(int cantidad, double PUnidad) {
        double PrecTot;
        PrecTot = cantidad * PUnidad;
        return PrecTot;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
