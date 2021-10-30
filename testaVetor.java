/*
 Programa que faz a leitura de uma sequência de N números e calcula quantos números na sequência são maiores que a madia dos N números lidos. A quantidade de números N é informado pelo usuário
*/
// importa biblioteca Scanner
import java.util.Scanner; 
public class testaVetor{
    public static void main(String[] args) {
    // DECLARACAO DE VARIAVEIS
    int N, cont,idx;
    int vetor[];
    double soma, media;
    // declara uma varivael de leitura do tipo 
    // Scanner
    Scanner ler = new Scanner(System.in);
    
    
    // ENTRADA DE DADOS
    // imprime uma mensagem na tela
    System.out.print("digite o valor de N:");
    // le informacao digitada no teclado
    N = ler.nextInt();

    vetor = new int[N];

    // PROCESSAMENTO
    soma = 0;
    idx = 0;
    cont=1;
    while(cont<=N){ // laco infinito
      System.out.print("digite o "+cont+"o numero:");
      vetor[idx] = ler.nextInt();
      soma = soma + vetor[idx];
      cont = cont + 1;
      //idx = idx + 1;
      idx++;
    }
    // ja sabemos a soma, podemos calcular a media
    media = soma / N;

    // conta quantos numeros sao maiores que a media
    idx = 0;
    cont = 0;
    while(idx < N){
      if( vetor[idx] > media)
        cont++; // cont = cont + 1
      idx++;
    }
    // SAIDA
    System.out.println("soma="+soma);
    //System.out.println("media="+media);
    System.out.printf("media=%.1f\n",media);

    System.out.println("qtd numeros maiores que media="+cont);
  }
}
