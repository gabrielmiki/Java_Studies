package com.bankapp.cliente;

import com.bankapp.conta.ContaPessoa;
import com.bankapp.exceptions.CnttPassException;
import com.bankapp.exceptions.LnthPassException;
import com.bankapp.runtimeexceptions.InvalidContent;
import com.bankapp.runtimeexceptions.InvalidLength;

/**
 * <h2> Cria perfil padrão para contas de pessoas físicas </h2>
 * <p> O conteúdo da senha permanece o mesmo, mas a qantidade 
 * de caracteres é de seis. </p>
 */
public class PessoaFisica extends Pessoa {

    private String _cpf;
    ContaPessoa contaPessoa = new ContaPessoa();

    @Override
    public void setPassword(String password) throws LnthPassException, CnttPassException, InvalidContent, InvalidLength {
        // As contas para pessoa Jurídica exigem 8 dígitos
        try {
            if (password.length() >= 6) {
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
            throw new LnthPassException("A senha deve ter um comprimento de seis dígitos");
        }
    }

    public String get_cpf() {
        return _cpf;
    }

    public void set_cpf(String cpf) {
        this._cpf = cpf;
    }

    public void getsaldo() {contaPessoa.getSaldo();}

    public void setSaldo(int valor) {contaPessoa.setSaldo(valor);}

    public void sacar(int valor) {contaPessoa.sacar(valor);}

    public void depositar(int valor) {contaPessoa.depositar(valor);}

    public void investir(int valor) {contaPessoa.invest(valor);}
}