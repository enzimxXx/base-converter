import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Baseconverter {
    public static void main(String[] args) throws IOException {
        int menu = 0;
        int baseDestino = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem Vindos ao Programa de Conversão Entre Bases\n");

        while (true) {
            System.out.println("Digite 1 para Converter entre Bases\nDigite 2 para Sair");
            menu = leitor.nextInt();
            if (menu == 1) {
                System.out.println("Digite a Base de Entrada\n 1 Decimal\n 2 Binario\n 3 Octal\n 4 Hexadecimal");
                menu = leitor.nextInt();
                System.out.println("Digite a Base de Destino\n 1 Decimal\n 2 Binario\n 3 Octal\n 4 Hexadecimal");
                baseDestino = leitor.nextInt();
                {
                    if (baseDestino == 1) {
                        System.out.println("Entre com o valor:");
                        int idec = leitor.nextInt();
                        int ibin = Integer.parseInt(String.valueOf(idec));
                        System.out.println("Decimal: " + ibin);
                    } else if (baseDestino == 2) {
                        System.out.println("Entre com o valor:");
                        String sbin = leitor.next();
                        String bin = Integer.toBinaryString(Integer.parseInt(sbin));
                        System.out.println("Binario: " + bin);
                    } else if (baseDestino == 3) {
                        System.out.println("Entre com o valor:");
                        String soct = leitor.next();
                        String oct = Integer.toOctalString(Integer.parseInt(soct));
                        System.out.println("Octal: " + oct);

                    } else if (baseDestino == 4) {
                        System.out.println("Entre com o valor:");
                        String shex = leitor.next();
                        String hex = Integer.toHexString(Integer.parseInt(shex));
                        System.out.println("Hexa decimal: " + hex.toUpperCase());
                    }
                }
            } else if (menu == 2) {
                System.exit(0);
            }
        }
    }
}
