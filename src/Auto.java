public class Auto {
    private String placa;
    private String duenio;
    private int anio;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Auto(){

    }

    public Auto(String placa, String duenio, int anio) {
        this.placa = placa;
        this.duenio = duenio;
        this.anio = anio;
    }
}
