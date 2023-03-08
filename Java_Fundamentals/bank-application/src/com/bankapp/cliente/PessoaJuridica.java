package com.bankapp.cliente;

import com.bankapp.conta.ContaEmpresa;
import com.bankapp.exceptions.CnttPassException;
import com.bankapp.exceptions.LnthPassException;
import com.bankapp.runtimeexceptions.InvalidContent;
import com.bankapp.runtimeexceptions.InvalidLength;

/**
 * <h2> Cria perfil padrão para contas de pessoas Jurídicas </h2>
 * <p> Conteúdo permanece o mesmo, mas a senha possui um total de
 * oito dígitos. </p>
 */
public class PessoaJuridica extends Pessoa {

    private String _cnpj;
    private ContaEmpresa contaJuridica = new ContaEmpresa();

    @Override
    public void setPassword(String password) throws LnthPassException, CnttPassException, InvalidContent, InvalidLength {
        // As contas para pessoa Jurídica exigem 8 dígitos
        try {
            if (password.length() >= 8) {
                if (password.matches("[a-zA-Z0-9]*")) {
                    super.setPassword(password);
                }
                else {
                    throw new InvalidContent();
                }
            }
            else {
                throw new InvalidLength();
            }
        } 
        catch (CnttPassException e) {
            throw new CnttPassException("O conteúdo de sua senha é inválido!\n" + 
                "Os valores permitidos são:\n" +
                "   - Letras Maiúculas e Minúsculas\n" + 
                "   - Números\n");
        }
        catch (InvalidLength e) {
            throw new LnthPassException("A senha deve ter um comprimento de oito dígitos");
        }
    }

    public String get_cnpj() {
        return _cnpj;
    }

    public void set_cnpj(String cnpj) {
        this._cnpj = cnpj;
    }

    public void getsaldo() {contaJuridica.getSaldo();}

    public void setSaldo(int valor) {contaJuridica.setSaldo(valor);}

    public void sacar(int valor) {contaJuridica.sacar(valor);}

    public void depositar(int valor) {contaJuridica.depositar(valor);}

    public void investir(int valor) {contaJuridica.invest(valor);}
}
