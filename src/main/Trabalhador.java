package main;

public class Trabalhador {
    IRegimeTrabalho regimeTrabalho;
    TrabalhadorAdapter persistencia;

    public Trabalhador() {
        regimeTrabalho = new PessoaJuridica();
        persistencia = new TrabalhadorAdapter(regimeTrabalho);
    }

    public void setSalario(float salario) {
        regimeTrabalho.setSalario(salario);
        persistencia.atualizarSalario();
    }

    public float getregimeTrabalho() {
        return persistencia.buscaSalario();
    }
    
}
