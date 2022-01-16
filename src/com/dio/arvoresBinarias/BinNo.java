package com.dio.arvoresBinarias;

/* Utilizaremos a classe comparable pois ela permite
   comparação entre objetos, que é algo primordial para o desenvolvimento
   de arvores binarias
*/
public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noDir = null;
        this.noEsq = null;
    }

    public BinNo() {
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }

    public T getConteudo() {

        return conteudo;
    }

    public void setConteudo(T conteudo) {

        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {

        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {

        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {

        this.noDir = noDir;
    }
}
