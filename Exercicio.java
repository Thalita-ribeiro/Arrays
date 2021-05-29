package arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAluno = new double[4];

        notasAluno[0] = 7.9;
        notasAluno[1] = 8;
        notasAluno[2] = 6.7;
        notasAluno[3] = 9.7;

        double totalAlunos = 0;
        for (double nota : notasAluno) {
            totalAlunos += nota;
        }
        System.out.println(totalAlunos / notasAluno.length);
    }
}
