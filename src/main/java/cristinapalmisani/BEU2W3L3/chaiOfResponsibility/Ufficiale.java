package cristinapalmisani.BEU2W3L3.chaiOfResponsibility;

public abstract class Ufficiale {
    private Ufficiale next;

    public static Ufficiale link(Ufficiale first, Ufficiale... ufficiali){
        Ufficiale head = first;
        for (Ufficiale ufficiale : ufficiali){
            head.next = ufficiale;
            head = ufficiale;
        }
        return first;
    }

    public abstract boolean check(double amount);

    protected boolean checkNext(double amount){
        if (next == null){
            return true;
        }
        return next.check(amount);
    }
}
