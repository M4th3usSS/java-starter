package modulo02;

public class TiposPrimitivos {
    public static void main(String[] args) {

        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;

        /* char */

        c = 65;
        System.out.println("====================================");
        System.out.println("char");
        System.out.println("====================================");
        System.out.println("valor de c como char = " + c);
        System.out.printf("valor de c como numero = %d\n", (int) c);
        System.out.println("------------------------------------");


        /* byte e variantes de inteiro */

        b = 10;
        s = b;
        i = s;
        System.out.println("====================================");
        System.out.println("inteiros");
        System.out.println("====================================");
        System.out.println("i = s = b = " + i);

        i *= 100;

        System.out.println("novo valor i = " + i);

        b = (byte) i;

        System.out.println("novo valor de b = " + b);

        /*
            O que ocorre é que no lugar de o Java lançar uma exceção
            ou converter para zero ele retira a parte binária do int
            e deixa apenas a do byte e apresena o que restou.

            Observe o esquema abaixo:

            i = 1000 em binário ---> 00000000 0000000 0000011 11101000
            b = 1000 em binário ---> -------- ------- ------- 11101000

            Veja que boa parte do número é perdido. Se você pegar o que
            sobrou no b e fizer uma conversão de binário para decimal
            usando complemento de dois vai chegar ao número -24.

            Portanto, saiba que o Java vai deixar você fazer esse tipo
            de conversão porque ele acha que você, programador, sabe
            que poderá perder bits nessa conversão!
        */

        l = i;

        System.out.println("valor de l = " + l);
        System.out.println("------------------------------------");

        /* ponto flutuante */

        System.out.println("====================================");
        System.out.println("ponto flutuante");
        System.out.println("====================================");

        d = 125.32;
        System.out.println("valor de d = " + d);
        d = 123.32d;
        System.out.println("valor de d = " + d);
        d = 125.32f;
        System.out.println("valor de d = " + d);

        /*
            no primeiro caso atribuimos 125.32 à variavel d.
            sem problema, funciona legal, como podemos ver
            na Saída da impressão.

            Logo depois atribuimos 125.23d. Mas para que serve
            esse "d" depois do valor? Indica que estou afirmando
            para o Java que a constante (123.32) é um double.

            Os dois casos acima são idênticos. Como assim ? Para
            o Java, o tipo padrão de um literal com ponto
            flutuante é double. Portanto, não precisa colocar o
            "d" depois do literal se quiser que ele seja double.

            literal ---> 125.32

            Mas o terceiro caso é interessante. Atribuimos à
            variável d o seguinte valor: 125.32f. Dessa vez estamos
            inserindo um float num doble. Problema nenhum, pois
            o float é 32 bit e o double é 64 bit. Mas. observe a Saída
            da impressão. Por que o número depois da casa decimal ficou
            tão quebrado ?
        */

        f = (float) 125.32;
        System.out.println("valor de f = " + f);
        f = 125.32f;
        System.out.println("valor de f = " + f);
        f = (float) 124.32d;
        System.out.println("valor de f = " + f);
        System.out.println("------------------------------------");

        /*
            Mesma coisa que foi feita com o Double, mas dessa
            vez com o float.

            Logo no primeiro caso já é necessário fazer um casting.
            Lembre-se: o tipo padrão de um número literal em
            ponto flutuante é double.

            No segundo caso nada é preciso.

            No terceiro caso novamente a presença no casting
            já que estamos informando explicitamente que o literal
            é do tipo double.

            É bom lembrar que ao converter de double para float pode
            haver perda de bits.
        */

        /* booleano */

        System.out.println("====================================");
        System.out.println("booleano");
        System.out.println("====================================");

        bo = true;
        System.out.println("valor de bo = " + bo);

        bo = (1 > 2);
        System.out.println("valor de bo = " + bo);

        bo = (f == d);
        System.out.println("valor de bo = " + bo);
        System.out.println("------------------------------------");


        /* alternadno entre tipos */

        System.out.println("====================================");
        System.out.println("brincando com os tipos");
        System.out.println("====================================");

        System.out.println("posso converter int para float ?");
        System.out.println("i antes da conversão = " + i);
        System.out.println("f antes da conversão = " + f);
        f = i;
        System.out.println("i depois da conversao = " + i);
        System.out.println("f depois da conversao = " + f);

        System.out.println("--");

        f = (float) d;

        System.out.println("posso converter float para int?");
        System.out.println("i antes da conversao = " + i);
        System.out.println("f antes da conversao = " + f);
        i = (int)f;
        System.out.println("i depois da conversao = " + i);
        System.out.println("f depois da conversao = " + f);
        System.out.println("------------------------------------");

    }
}
