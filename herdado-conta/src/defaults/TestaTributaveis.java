package defaults;

public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222,2223);
        cc.deposita(100.0);

        SeguroVida sv = new SeguroVida();

        CalculadorImposto cal = new CalculadorImposto();
        cal.registra(cc);
        cal.registra(sv);

        System.out.println(cal.getTotalImposto());
    }
}
