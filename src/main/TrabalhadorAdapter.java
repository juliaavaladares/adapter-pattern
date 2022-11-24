package main;

public class TrabalhadorAdapter extends PessoaFisica {
    private IRegimeTrabalho regimeTrabalho;

    public TrabalhadorAdapter(IRegimeTrabalho regimeTrabalho){
        this.regimeTrabalho = regimeTrabalho;
    }

    public float buscaSalario(){
        if (this.getRegimeTrabalho() == "CLT") {
            regimeTrabalho.setSalario(getSalario() / 2);
        }

        if (this.getRegimeTrabalho() == "CNPJ") {
            regimeTrabalho.setSalario(getSalario() * 2);
        }

        return regimeTrabalho.getSalario();
    }

    public void atualizarSalario(){
        if (this.getRegimeTrabalho() == "CLT") {
            regimeTrabalho.setSalario(getSalario() / 2);
        }

        if (this.getRegimeTrabalho() == "CNPJ") {
            regimeTrabalho.setSalario(getSalario() * 2);
        }

    }

}
