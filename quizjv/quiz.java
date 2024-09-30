//Faculdade UNIFAN
//Aluno: Carlos Eduardo Sousa Costa
//Professor: Brenno
//---------------------------------------------------------
//Seja bem vindo ao programa: Quiz de capitais de 15 países
//---------------------------------------------------------
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. Qual é a capital da França?\n a) Londres\n b) Berlim\n c) Paris\n d) Madrid",
            "2. Qual é a capital do Brasil?\n a) Buenos Aires\n b) Londres\n c) Brasília\n d) Rio de Janeiro",
           "3. Qual é a capital dos Estados Unidos?\n a) Nova York\n b) Washington\n c) Chicago \n d) Londres",
            "4. Qual é a capital do México?\n a) Cidade do México\n b) Cancún\n c) Distrito Federal\n d) Novo México",
            "5. Qual é a capital da Holanda?\n a) Haarlem\n b) Amsterdã\n c) Moscou\n d) Berlim",
            "6. Qual é a capital da Alemanha?\n a) Berlim\n b) Londres\n c) Paris\n d) MSdrid",
            "7. Qual é a capital da Russía?\n a) Berlim\n b) Moscou\n c) Londres\n d) Tokyo",
            "8. Qual é a capital do Paraguai?\n a) Montevidéu\n b) Assunção\n c) Madrid\n d) El Salvador",
            "9. Qual é a capital do Uruguai?\n a) Assunção\n b) América\n c) MOntevidéu\n d) Rio de Janeiro",
            "10. Qual é a capital do Canadá?\n a) Toronto\n b) Ohio\n c) Ottawa\n d)Londres",
            "11. Qual é a capital da Itália?\n a) Londres\n b) Berlim\n c) Paris\n d) Roma",
        };

        char[] answers = {'c', 'c', 'b', 'a', 'b', 'a', 'b', 'b', 'c', 'c','d','a','a','a','c'};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Digite sua resposta (a/b/c/d): ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correto!\n");
                score++;
            } else {
                System.out.println("Incorreto! A resposta correta era: " + answers[i] + "\n");
            }
        }

        System.out.println("Seu score final é: " + score + "/" + questions.length);
        scanner.close();
    }
}
