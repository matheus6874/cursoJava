package exercicioImpostoDeRenda;

public class ContribuintesPf extends Contribuintes{
    private Double gastosSaude;

    public ContribuintesPf(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculIamposto(){
        double valor = 0;
        if (gastosSaude > 0){
            if (getRendaAnual() < 20000.00){
                valor = getRendaAnual() * 0.15;
            }else {
                valor = getRendaAnual() * 0.25;
            }
        }

        valor = valor - (gastosSaude * 0.5);

        return valor;
    }
}
