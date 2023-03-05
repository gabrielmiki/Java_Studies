package edu.miki.quintasemana.EstruturaDeDados;

/** 
 * <h2> Estrutura de Dados </h2>
 * <p> 
 *  Trabalha com o conceito de nós e seu encadeamento.
 *  Usa também do conceito de generics para não limitar 
 *  o casting durante o uso da classe No.
*/
public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "EstruturaDeDados [conteudo=" + conteudo + "]";
    }
}
