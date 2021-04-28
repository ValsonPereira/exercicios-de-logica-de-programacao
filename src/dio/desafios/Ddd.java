/* Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

DDD ====> Destination
61  ====> Brasília
71  ====> Salvador
11  ====> Sao Paulo
21  ====> Rio de Janeiro
32  ====> Juiz de Fora
19  ====> Campinas
27  ====> Vitoria
31  ====> Belo Horizonte

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada.
Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
*/

package dio.desafios;
import java.io.IOException;
import java.util.Scanner;

public class Ddd {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int DDD = leitor.nextInt();
        switch (DDD) {
            case 61: System.out.println("Brasilia"); break;
            //continue o desafio
            case 71: System.out.println("Salvador"); break;
            case 11: System.out.println("Sao Paulo"); break;
            case 21: System.out.println("Rio de Janeiro"); break;
            case 32: System.out.println("Juiz de Fora"); break;
            case 19: System.out.println("Campinas"); break;
            case 27: System.out.println("Vitoria"); break;
            case 31: System.out.println("Belo Horizonte"); break;

            default: System.out.println("DDD nao cadastrado");
        }
    }

}
