package eldarchallengeDM.modules;

import java.time.LocalDate;

import eldarchallengeDM.exception.ChallengeException;

public class Tarjeta {
    private Marca marca;
    private String numeroTarjeta;
    private String cardholder;
    private LocalDate fechaVencimiento;

    public Tarjeta(Marca marca, String numeroTarjeta, String cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean operacionValida(double importe) {
        return importe < 1000;
    }

    public boolean tarjetaValida() {
        LocalDate hoy = LocalDate.now();
        return fechaVencimiento.isAfter(hoy);
    }

    public boolean esDistinta(Tarjeta otraTarjeta) {
        return !this.numeroTarjeta.equals(otraTarjeta.getNumeroTarjeta());
    }

    public double calcTasa(Marca m, double importe) {
        double tasa = 0.0;
        switch (m.getMarca().toUpperCase()) {
            case "VISA":
                tasa = fechaVencimiento.getYear() / (double) fechaVencimiento.getMonthValue();
                break;
            case "NARA":
                tasa = fechaVencimiento.getDayOfMonth() * 0.5;
                break;
            case "AMEX":
                tasa = fechaVencimiento.getMonthValue() * 0.1;
                break;
            default:
                throw new ChallengeException("Marca no es válida: " + marca);
            
        }
        return tasa * importe / 100;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCardholder() {
        return cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    
}

