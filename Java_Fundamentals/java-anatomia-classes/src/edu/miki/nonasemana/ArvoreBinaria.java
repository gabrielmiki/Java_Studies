package edu.miki.nonasemana;

public class ArvoreBinaria<T extends Comparable<T>> {
    
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);

        this.raiz = inserir(this.raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {

        if (atual == null) {
            return novoNo;            
        }
        else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(this.inserir(atual, novoNo));
        }
        else {
            atual.setNoDir(this.inserir(atual, novoNo));
        }

        return atual;
    }

    public void exibirInOrdem() {

        System.out.println("\nExibindo em Ordem");

        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {

        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());

            System.out.print(atual.getConteudo() + ", ");

            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {

        System.out.println("\nExibindo em PosOrdem");

        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {

        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());

            exibirInOrdem(atual.getNoDir());

            System.out.print(atual.getConteudo() + ", ");            
        }
    }

    public void exibirPreOrdem() {

        System.out.println("\nExibindo em PreOrdem");

        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {

        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");

            exibirInOrdem(atual.getNoEsq());

            exibirInOrdem(atual.getNoDir());                        
        }
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> noPai = null;
            BinNo<T> noFilho = null;
            BinNo<T> tmp = null;

            while ((atual != null) && (atual.getConteudo().equals(conteudo))) {
                noPai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                }
                else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo nao encontrado! Bloco try.");
            }

            if (noPai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                }
                else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                }
                else {
                    for (
                        tmp = atual, noFilho = atual.getNoEsq();
                        noFilho.getNoDir() != null;
                        tmp = noFilho, noFilho = noFilho.getNoEsq()
                    ) {
                        if (noFilho != atual.getNoEsq()) {
                            tmp.setNoDir(noFilho.getNoEsq());
                            noFilho.setNoEsq(this.raiz.getNoEsq());
                        }
                    }

                    noFilho.setNoDir(this.raiz.getNoDir());
                    this.raiz = noFilho;
                }
            }
            else if (atual.getNoDir() == null) {
                if (noPai.getNoEsq() == atual) {
                    noPai.setNoEsq(atual.getNoEsq());
                }
                else {
                    noPai.setNoDir(atual.getNoEsq());
                }
            }
            else if (atual.getNoEsq() == null) {
                if (noPai.getNoEsq() == atual) {
                    noPai.setNoEsq(atual.getNoDir());
                }
                else {
                    noPai.setNoDir(atual.getNoDir());
                }
            }
            else {
                for (
                    tmp = atual, noFilho = atual.getNoEsq();
                    noFilho.getNoDir() != null;
                    tmp = noFilho, noFilho = noFilho.getNoDir()
                ) {
                    if (noFilho != atual.getNoEsq()) {
                        tmp.setNoDir(noFilho.getNoEsq());
                        noFilho.setNoEsq(atual.getNoEsq());
                    }

                    noFilho.setNoDir(atual.getNoDir());

                    if (noPai.getNoEsq() == atual) {
                       noPai.setNoEsq(noFilho);
                    }
                    else {
                        noPai.setNoDir(noFilho);
                    }
                }
            }

        }
        catch (NullPointerException e) {
            System.out.println("Conteudo nao encontrado! Bloco Catch.");
        }
    }
}