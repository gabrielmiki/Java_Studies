package edu.miki.quintasemana;

public class MeuObjeto {
    
    int num;

    
    public MeuObjeto(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MeuObjeto [num=" + num + "]";
    }
}
