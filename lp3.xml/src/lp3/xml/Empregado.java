/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.xml;

/**
 *
 * @author 31206018
 */
public class Empregado {

    private String primeiroNome, ultimoNome, email, departamento, endereco, tipo;
    private double salario;

    public Empregado() {
    }

    public Empregado(String primeiroNome, String ultimoNome, String email, String departamento, String endereco, String tipo, double salario) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.departamento = departamento;
        this.endereco = endereco;
        this.tipo = tipo;
        this.salario = salario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Detalhes do Empregado - " + "primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", email=" + email + ", departamento=" + departamento + ", endereco=" + endereco + ", tipo=" + tipo + ", salario=" + salario + '}';
    }
   
    
}

