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
