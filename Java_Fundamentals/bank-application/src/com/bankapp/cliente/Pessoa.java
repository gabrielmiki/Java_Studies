package com.bankapp.cliente;

import com.bankapp.exceptions.CnttPassException;
import com.bankapp.exceptions.LnthPassException;

/**
 * <h2> Cria perfil padrão para contas </h2>
 * <p> Dada a presença dos atributos nome da conta
 * e senha em todos os modelos de classe. </p>
 */
public class Pessoa {

    private String nomeConta;
    private String password;

    public String getNomeConta() {
        return nomeConta;
    }
    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) throws LnthPassException, CnttPassException {
        this.password = password;
    }

}
