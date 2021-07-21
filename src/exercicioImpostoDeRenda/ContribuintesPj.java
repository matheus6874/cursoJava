package exercicioImpostoDeRenda;

public class ContribuintesPj extends Contribuintes{
    private Integer numeroFuncionarios;

    public ContribuintesPj(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calculIamposto() {
        if (numeroFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }else{
            return getRendaAnual() * 0.16;
        }
    }
}
