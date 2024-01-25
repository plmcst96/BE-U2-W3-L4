package cristinapalmisani.BEU2W3L3.chaiOfResponsibility;

public class GradoUfficiale extends Ufficiale{

    private String grado;
    private double stipendio;

    public GradoUfficiale(String grado, double stipendio) {
        this.grado = grado;
        this.stipendio = stipendio;
    }

    @Override
    public boolean check(double amount) {
        if (stipendio >= amount){
            System.out.println("Il " + grado + " percepisce almeno " + amount);
        }
        return checkNext(amount);
    }
}
