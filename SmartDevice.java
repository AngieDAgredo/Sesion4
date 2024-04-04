public class SmartDevice {

    public String marca;
    public String almacenamiento;
    public boolean BT;
    public boolean GPS;
    public boolean wifi;
    public boolean touch;
    public double bateria;

    public SmartDevice (String marca, String almacenamiento, boolean BT, boolean GPS,boolean wifi, boolean touch, double bateria){

        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.BT = BT;
        this.GPS = GPS;
        this.wifi = wifi;
        this.touch = touch;
        this.bateria = bateria;

    }

    public SmartDevice() {
    }
}
