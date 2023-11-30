package quiz;

import java.util.Scanner;

    public class quiz {
        public static void main(String[] orgs) {
            Scanner leia = new Scanner(System.in);

            cabecalho cabecalho1 = new cabecalho();
            System.out.println("===================================================================================================================");

            cabecalho1.nome = "Nome: Antonio Pereira da Silva Filho";
            cabecalho1.professor = "Professor: Brenno Pimenta";
            cabecalho1.materia = "Materia: Algoritimo e programação II";
            cabecalho1.faculdade = "Faculdade: UNIFAN";

            cabecalho1.escrevaCabecalho();
            System.out.println("===================================================================================================================");

            int acertos = 0;

            questao Q1 = new questao();

            Q1.pergunta = "1) Qual opção contém apenas carros da Hyundai??";
            Q1.opcaoA = "A - Accent, Accord, Pajero.";
            Q1.opcaoB = "B - Azera, ix35, Santa Fé.";
            Q1.opcaoC = "C - Ecosport, Elantra, Sonata.";
            Q1.opcaoD = "D - Hilux, Veracruz, X60.";
            Q1.opcaoE = "E - Cayenne, HB20, Tucson.";
            Q1.escrevaquestao();
            Q1.correta = "b";
            System.out.println("Escreva a resposta correta");
            String resposta = leia.nextLine();
            if (resposta.equals(Q1.iscorreta(resposta))) {
            } else {
            }
            if (resposta.equals(Q1.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");


            questao Q2 = new questao();

            Q2.pergunta = "Qual opção contém apenas carros que não são da Volkswagen?";
            Q2.opcaoA = "A - CrossFox, Fox, Gol.";
            Q2.opcaoB = "B - Celer, QQ, Tiggo.";
            Q2.opcaoC = "C - Golf, SpaceFox, Touareg.";
            Q2.opcaoD = "D - Saveiro, Tiguan, Voyage.";
            Q2.opcaoE = "E - Brasília, Parati, Santana.";
            Q2.escrevaquestao();
            Q2.correta = "b";
            System.out.println("Escreva a resposta correta");
            String resposta2 = leia.nextLine();
            if (resposta.equals(Q2.iscorreta(resposta))) {
            } else {
            }
            if (resposta2.equals(Q2.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q3 = new questao();

            Q3.pergunta = "Qual foi o carro da Chevrolet mais vendido em 2011?";
            Q3.opcaoA = "A - Corsa Sedan.";
            Q3.opcaoB = "B - Agile.";
            Q3.opcaoC = "C - Prisma.";
            Q3.opcaoD = "D - Montana.";
            Q3.opcaoE = "E - Celta.";
            Q3.escrevaquestao();
            Q3.correta = "e";
            System.out.println("Escreva a resposta correta");
            String resposta3 = leia.nextLine();
            if (resposta.equals(Q2.iscorreta(resposta))) {
            } else {
            }
            if (resposta3.equals(Q3.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q4 = new questao();

            Q4.pergunta = "4) Qual o carro mais vendido em 2004?";
            Q4.opcaoA = "A - Fiat Palio.";
            Q4.opcaoB = "B - Chevrolet Corsa.";
            Q4.opcaoC = "C - Chevrolet Celta.";
            Q4.opcaoD = "D - Volkswagen Gol";
            Q4.opcaoE = "E - Fiat Uno";
            Q4.escrevaquestao();
            Q4.correta = "d";
            System.out.println("Escreva a resposta correta");
            String resposta4 = leia.nextLine();
            if (resposta.equals(Q4.iscorreta(resposta))) {
            } else {
            }
            if (resposta4.equals(Q4.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q5 = new questao();

            Q5.pergunta = "5) Assinale a única alternativa que o carro Citroën C4 Picasso não contém.?";
            Q5.opcaoA = "A - Troca de marchas no volante.";
            Q5.opcaoB = "B - Acelerador.";
            Q5.opcaoC = "C - Freio.";
            Q5.opcaoD = "D - Embreagem.";
            Q5.opcaoE = "E - Quatro portas.";
            Q5.escrevaquestao();
            Q5.correta = "d";
            System.out.println("Escreva a resposta correta");
            String resposta5 = leia.nextLine();
            if (resposta.equals(Q5.iscorreta(resposta))) {
            } else {
            }
            if (resposta5.equals(Q5.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q6 = new questao();

            Q6.pergunta = "6) Qual o carro da Renault que mais fez sucesso em 2015?";
            Q6.opcaoA = "A - Sandero.";
            Q6.opcaoB = "B - Duster.";
            Q6.opcaoC = "C - Logan.";
            Q6.opcaoD = "D - Clio.";
            Q6.opcaoE = "E - Fluence.";
            Q6.escrevaquestao();
            Q6.correta = "a";
            System.out.println("Escreva a resposta correta");
            String resposta6 = leia.nextLine();
            if (resposta.equals(Q6.iscorreta(resposta))) {
            } else {
            }
            if (resposta6.equals(Q6.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q7 = new questao();

            Q7.pergunta = "7) Qual desses carros da Chevrolet não é uma picape?";
            Q7.opcaoA = "A - S-10.";
            Q7.opcaoB = "B - Montana.";
            Q7.opcaoC = "C - Corsa Pick-up.";
            Q7.opcaoD = "D - Captiva.";
            Q7.opcaoE = "E - D-20.";
            Q7.escrevaquestao();
            Q7.correta = "d";
            System.out.println("Escreva a resposta correta");
            String resposta7 = leia.nextLine();
            if (resposta.equals(Q7.iscorreta(resposta))) {
            } else {
            }
            if (resposta7.equals(Q7.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q8 = new questao();

            Q8.pergunta = "8) Qual desses carros tem espaço para sete passageiros?";
            Q8.opcaoA = "A - Chevrolet Spin.";
            Q8.opcaoB = "B - Nissan Grand Livina.";
            Q8.opcaoC = "C - JAC T8.";
            Q8.opcaoD = "D - Fiat Freemont.";
            Q8.opcaoE = "E - Todas as alternativas anteriores..";
            Q8.escrevaquestao();
            Q8.correta = "e";
            System.out.println("Escreva a resposta correta");
            String resposta8 = leia.nextLine();
            if (resposta.equals(Q8.iscorreta(resposta))) {
            } else {
            }
            if (resposta8.equals(Q8.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q9 = new questao();

            Q9.pergunta = "9) О nоvо mоdеlо dо Нуundаі Ѕаntа Fé сuѕtа mаіѕ dе R$100.000; о Fіаt 500 роѕѕuі 4 роrtаѕ; о Сhеvrоlеt Тrаіlblаzеr tеm еѕраçо раrа 7 раѕѕаgеіrоѕ; о Сіtrоën С4 Рісаѕѕо роѕѕuі trоса dе mаrсhаѕ nо vоlаntе; о саrrо Ассоrd é dа mаrса Rеnаult. Quаl а ѕеquênсіа соrrеtа?";
            Q9.opcaoA = "A - F-V-V-F-V.";
            Q9.opcaoB = "B - V-F-V-V-F.";
            Q9.opcaoC = "C - V-V-V-V-F.";
            Q9.opcaoD = "D - V-F-F-V-F.";
            Q9.opcaoE = "E - F-F-V-V-V.";
            Q9.escrevaquestao();
            Q9.correta = "b";
            System.out.println("Escreva a resposta correta");
            String resposta9 = leia.nextLine();
            if (resposta.equals(Q9.iscorreta(resposta))) {
            } else {
            }
            if (resposta9.equals(Q9.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q10 = new questao();

            Q10.pergunta = "10) Marque 1 para Honda e 2 para Hyundai. Enumere os carros pela sua marca respectivamente: Sonata, Azera, HR-V, Accent, Civic. Qual a sequência correta?";
            Q10.opcaoA = "A - 1-2-2-2-2.";
            Q10.opcaoB = "B - 2-1-2-1-2.";
            Q10.opcaoC = "C - 2-2-1-2-1.";
            Q10.opcaoD = "D - 1-2-2-1-1.";
            Q10.opcaoE = "E - 1-1-1-2-1.";
            Q10.escrevaquestao();
            Q10.correta = "c";
            System.out.println("Escreva a resposta correta");
            String resposta10 = leia.nextLine();
            if (resposta.equals(Q10.iscorreta(resposta))) {
            } else {
            }
            if (resposta10.equals(Q10.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q11 = new questao();

            Q11.pergunta = "11) Quais são as respectivas marcas dos veículo A4, C180, X5?";
            Q11.opcaoA = "A - BMW, Audi, Mitsubishi.";
            Q11.opcaoB = "B - Alfa Romeo, Bentley, Ferrari.";
            Q11.opcaoC = "C - Audi, Mercedes-Benz, BMW.";
            Q11.opcaoD = "D - Mercedes-Benz, BMW, Nissan.";
            Q11.opcaoE = "E - Hyundai, Honda, Peugeot.";
            Q11.escrevaquestao();
            Q11.correta = "c";
            System.out.println("Escreva a resposta correta");
            String resposta11 = leia.nextLine();
            if (resposta.equals(Q11.iscorreta(resposta))) {
            } else {
            }
            if (resposta11.equals(Q11.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);
            }

            System.out.println("===================================================================================================================");

            questao Q12 = new questao();

            Q12.pergunta = "12) Assinale o único veículo que não faz parte da montadora Ford.";
            Q12.opcaoA = "A - Fusion.";
            Q12.opcaoB = "B - Fusca.";
            Q12.opcaoC = "C - Focus.";
            Q12.opcaoD = "D - Fiesta.";
            Q12.opcaoE = "E - ka.";
            Q12.escrevaquestao();
            Q12.correta = "b";
            System.out.println("Escreva a resposta correta");
            String resposta12 = leia.nextLine();
            if (resposta.equals(Q12.iscorreta(resposta))) {
            } else {
            }
            if (resposta12.equals(Q12.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q13 = new questao();

            Q13.pergunta = "13) Соnѕіdеrе А раrа Аudі, В раrа ВМW, С раrа Сіtrоën, D раrа Dоdgе, Е раrа Еffа. Соnѕіdеrе оѕ vеíсulоѕ Х4, С4 Lоungе, Durаngо, М100 е А3. Маrquе а ѕеquênсіа соrrеtа.";
            Q13.opcaoA = "A - A-B-C-D-E.";
            Q13.opcaoB = "B - E-C-A-D-B.";
            Q13.opcaoC = "C - B-C-D-E-A.";
            Q13.opcaoD = "D - D-B-C-A-E.";
            Q13.opcaoE = "E - C-B-D-E-A.";
            Q13.escrevaquestao();
            Q13.correta = "c";
            System.out.println("Escreva a resposta correta");
            String resposta13 = leia.nextLine();
            if (resposta.equals(Q13.iscorreta(resposta))) {
            } else {
            }
            if (resposta13.equals(Q13.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
            System.out.println("===================================================================================================================");

            questao Q14 = new questao();

            Q14.pergunta = "14) O veículo Chevrolet Corsa Sedan foi o mais vendido de 2015. Verdadeiro ou falso?";
            Q14.opcaoA = "A - Verdadeiro.";
            Q14.opcaoB = "B - Falso.";
            Q14.escrevaquestao();
            Q14.correta = "b";
            System.out.println("Escreva a resposta correta");
            String resposta14 = leia.nextLine();
            if (resposta.equals(Q14.iscorreta(resposta))) {
            } else {
            }
            if (resposta14.equals(Q14.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }

            System.out.println("===================================================================================================================");

            questao Q15 = new questao();

            Q15.pergunta = "15) Qual desses veículos não é da marca Kia?.?";
            Q15.opcaoA = "A - Picanto.";
            Q15.opcaoB = "B - Soul.";
            Q15.opcaoC = "C - Sorento.";
            Q15.opcaoD = "D - Cielo.";
            Q15.opcaoE = "E - Mohave.";
            Q15.escrevaquestao();
            Q15.correta = "d";
            System.out.println("Escreva a resposta correta");
            String resposta15 = leia.nextLine();
            if (resposta.equals(Q15.iscorreta(resposta))) {
            } else {
            }
            if (resposta15.equals(Q15.correta)) {
                acertos = acertos + 1;
                System.out.println("acertos: " + acertos);
            } else {
                System.out.println("acertos: " + acertos);

            }
        }
    }

