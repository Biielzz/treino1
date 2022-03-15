package Controller;

public class Teste1 {

	public static void main(String[] args) {
		String Mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int i;
for( i= 0; i<12; i++) {
	System.out.printf("\t O Mes de " + Mes[i] + " tem " + dias[i] + " Dias. \n ");
	}

}
}
