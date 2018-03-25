import java.util.Scanner;
public class Media
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // media dos alunos

        int nalun,notas = 0,h=1,j=0,absorv=0,absorv2=0,end=0;
     String name, nameup = null;


        System.out.println("Quantos alunos tem na turma?");
        Scanner ler = new Scanner(System.in);
        nalun = ler.nextInt();
        while (end==0)
        {
            while (j != nalun)
            {

                System.out.println("nome do aluno "+h+"?");
                Scanner ler3 = new Scanner(System.in);
                name = ler3.nextLine();
                
            	
                System.out.println("nota do aluno "+h+"?");
                Scanner ler2 = new Scanner(System.in);
                notas = ler2.nextInt();

                
                
                if (absorv2 < notas)
                {
                    absorv2=notas;
                    nameup = name;

                }

                absorv2=notas;
                h++;
                j++;
                absorv = absorv + notas;

            }
            nalun=absorv/nalun;

            System.out.println("O aluno "+nameup+" tirou a maior nota "+absorv2+" e a media da turma eh "+nalun);

            end++;

        }

    }

}
