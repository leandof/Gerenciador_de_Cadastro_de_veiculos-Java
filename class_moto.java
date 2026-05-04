public class Moto extends Veiculo{
    private int cilindragen;
    public Moto(String modelo, int ano, String cor , int cilindragen, double valor,int quantidade ){
        super(modelo, ano, cor, valor, quantidade );
        this.cilindragen = cilindragen;
    }


    public int getCilindragen() {
        return cilindragen;
    }

    public void setCilindragen(int cilindragen) {
        this.cilindragen = cilindragen;
    }

    @Override
    public void buzina() {
        System.out.println("bim bim buzina da (moto)  ");
    }

    @Override
    public void acelera() {
        System.out.println("50 mk por hora ");
    }
    @Override
    public String toString() {
        return super.toString() + "cilindragem " + getCilindragen();
    }
}
