package edu.miki.decimasemana;

public class Carro implements Comparable<Carro> {
    
    String carro;
    

    public Carro(String carro) {
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    /**
     * Retorna um hash gerado a apartir de um atributo
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carro == null) ? 0 : carro.hashCode());
        return result;
    }

    @Override
    /**
     * Faz a comparação entre onbjetos do tipo carro
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (carro == null) {
            if (other.carro != null)
                return false;
        } else if (!carro.equals(other.carro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carro [carro=" + carro + "]";
    }

    // @Override
    // public int compareTo(Carro o) {
    //     if (this.carro.length() < o.carro.length()) {
    //         return -1;
    //     }
    //     else if (this.carro.length() > o.carro.length()) {
    //         return 1;
    //     }
    //     return 0;
    // }
    
    @Override
    public int compareTo(Carro o) {
        return this.getCarro().compareTo(o.getCarro());
    }
}
