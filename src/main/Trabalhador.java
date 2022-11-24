package main;

public class Trabalhador {
    IRegimeTrabalho regimeTrabalho;
    TrabalhadorAdapter persistencia;

    public Trabalhador() {
        regimeTrabalho = new PessoaJuridica();
        persistencia = new TrabalhadorAdapter(regimeTrabalho);
    }

    public void setSalario(float salario) {
        System.out.println("Salario: " + salario);
        regimeTrabalho.setSalario(salario);
        persistencia.atualizarSalario();
    }

    public float getSalario() {
        System.out.println("Salario: " + persistencia.buscaSalario());
        return persistencia.buscaSalario();
    }
    
    public String getRegimeDeTrabalho() {
        return persistencia.getRegimeTrabalho();
    }
    
    public void setRegimeTrabalho(String regimeTrabalho) {
        if (regimeTrabalho == "CLT" || regimeTrabalho == "CNPJ") {
            persistencia.setRegimeTrabalho(regimeTrabalho);    
            return;
        }

        System.err.println("Regime de trabalho inválido!");        
    }
    
}
