package org.example;

public class App 
{
    public static void main( String[] args )
    {
        FabricaPessoa fabricaPessoa = new FabricaPessoa();
        Pessoa pessoaTeste1 = fabricaPessoa.criarPessoa("teste", 22);
        Pessoa pessoaTeste2 = fabricaPessoa.criarPessoa("teste2", 222);
        System.out.println(pessoaTeste1);
        System.out.println(pessoaTeste2);
    }
}
