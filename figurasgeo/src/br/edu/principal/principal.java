package br.edu.principal;
import br.edu.poligonos.*;
import java.util.Scanner;


public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contro;
		
		do {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Bem vindo ao Progama: Escolha o tipo de progama:");
			System.out.println("\t1-Figuras planas");
			System.out.println("\t2-Figuras Espaciais");
			System.out.println("Digite a Opçao desejada:");
			int escolha = sc.nextInt();
			
			if(escolha == 1) {
				System.out.println("Escolha essas Opçoes de Figuras:");
				System.out.println("\t1-Quadrado");
				System.out.println("\t2-Retangulo ou Paralelograma");
				System.out.println("\t3-Circulo");
				System.out.println("\t4-Losangulo");
				System.out.println("\t5-Trapézio");
				System.out.println("\t6-Pentágono");
				System.out.println("\t7-hexágono");
				System.out.println("Digite a Operação Desejada:");
				int opcao = sc.nextInt();
			
			    switch(opcao) 
			    {
			
			     case 1: 
			    	 
				     System.out.println("Digite o lado do Quadrado:");
				     double ladoq = sc.nextDouble();
				     quadrado objq = new quadrado();
				     objq.lado = ladoq;
				     objq.calcAreaq();
				     break;
				     
			     case 2:
			    	 
			    	 System.out.println("Digite a base do objeto:");
				     double baser = sc.nextDouble();
				     System.out.println("Digite a Altura do objeto:");
				     double altura = sc.nextDouble();
				     retangulo objr = new retangulo();
				     objr.altura = altura;
				     objr.base = baser; 
				     objr.calcArear();
				     break;
				     
			     case 3:
			    	 
			    	 System.out.println("Digite o Raio do objeto:");
				     double rai = sc.nextDouble();
				     circulo objc = new circulo();
				     objc.raio = rai;
				     objc.calcAreac();
			    	 break;
			     case 4:
			    	 
			    	 System.out.println("Digite o lado do Losango:");
				     double ladol = sc.nextDouble();
				     System.out.println("Digite a Primeira Diagonal do Losango:");
				     double diag1 = sc.nextDouble();
				     System.out.println("Digite a Segunda Diagonal do Losango:");
				     double diag2 = sc.nextDouble();
				     losango objcL = new losango();
				     objcL.diag1 = diag1;
				     objcL.diag2 = diag2;
				     objcL.lado = ladol;
				     objcL.calcAreaL();
				     break;
			    	 
			     case 5:
			    	 
			    	 System.out.println("Digite o lado do Trapézio:");
				     double ladoT = sc.nextDouble();
				     System.out.println("Digite a Base menor do Trapézio:");
				     double basem= sc.nextDouble();
				     System.out.println("Digite a Base Maior do Trapézio:");
				     double baseM = sc.nextDouble();
				     System.out.println("Digite a Altura do Trapézio:");
				     double altu = sc.nextDouble();
				     trapézio objcT = new trapézio();
				     objcT.baseM = baseM;
				     objcT.basem = basem;
				     objcT.lado = ladoT;
				     objcT.altura = altu;
				     objcT.calcAreaT();
				     break;
			    	 
			     case 6:
			    	 
			    	 System.out.println("Digite o lado do Pentágono:");
				     double ladoP = sc.nextDouble();
				     System.out.println("Digite a Apótema do Pentagono:");
				     double apote = sc.nextDouble();
				     pentagono objcP = new pentagono();
				     objcP.lado = ladoP;
				     objcP.apote = apote;
				     objcP.calcAreaP();
			    	 break;
			    	 
			     case 7:
			    	 
			    	 System.out.println("Digite a Base do hexágono:");
				     double baseH = sc.nextDouble();
				     System.out.println("Digite a Altura do hexagono:");
				     double alt = sc.nextDouble();
				     System.out.println("Digite o lado do Hexágono:");
				     double ladoH = sc.nextDouble();
				     hexagono objH = new hexagono();
				     objH.altura = alt;
				     objH.base = baseH;
				     objH.lado = ladoH;
				     objH.calcAreahex();
				     break;
			    	 
			    }
		    }
			if(escolha == 2) {
				System.out.println("Escolha essas Opçoes de Figuras:");
				System.out.println("\t1-Paralelepipedo");
				System.out.println("\t2-Esfera");
				System.out.println("\t3-Cone");
				System.out.println("\t4-Cilindro");
				System.out.println("\t5-Pirâmide");
				System.out.println("\t6-Prisma");
				System.out.println("\t7-Cubo");
				System.out.println("Digite a Operação Desejada:");
				int op = sc.nextInt();
				
				switch(op) 
				{
				
				 case 1:
					 
					 System.out.println("Digite o Primeiro lado do paralelepipedo:");
				     double lado1 = sc.nextDouble();
				     System.out.println("Digite o Segundo lado do paralelepipedo:");
				     double lado2= sc.nextDouble();
				     System.out.println("Digite o Terceiro lado do paralelepipedo:");
				     double lado3 = sc.nextDouble();
				     paralelepipedo objPa = new paralelepipedo();
				     objPa.ar1 = lado1;
				     objPa.ar2 = lado2;
				     objPa.ar3 = lado3;
				     objPa.calcAreaPa();
				     break;
				     
				 case 2:
					 
					 System.out.println("Digite o Raio do objeto:");
				     double raio = sc.nextDouble();
				     esfera objE = new esfera();
				     objE.raio = raio;
				     objE.calcAreaEs();
				     break;
					 
				 case 3:
					 
					 System.out.println("Digite o Raio do objeto:");
				     double raios = sc.nextDouble();
				     System.out.println("Digite a altura do objeto:");
				     double h = sc.nextDouble();
				     System.out.println("Digite a geratriz da Esfera:");
				     double gera = sc.nextDouble();
				     cone objCo = new cone();
				     objCo.altura = h;
				     objCo.geratriz = gera;
				     objCo.raio = raios;
				     objCo.calcAreaCo();
				     break;
					 
				 case 4:
					 
					 System.out.println("Digite o Raio do objeto:");
				     double raioss = sc.nextDouble();
				     System.out.println("Digite a altura do objeto:");
				     double ha = sc.nextDouble();
				     Cilindro objCi = new Cilindro();
				     objCi.altura = ha;
				     objCi.raio = raioss;
				     objCi.calcAreaCi();
				     break;
				     
				 case 5:
					 
					 System.out.println("Digite a Área lateral:");
				     double areaLa = sc.nextDouble();
				     System.out.println("Digite a Área da Base:");
				     double areaBa = sc.nextDouble();
				     System.out.println("Digite a altura da piramide:");
				     double hal = sc.nextDouble();
				     pirâmide objPi = new pirâmide();
				     objPi.altura = hal;
				     objPi.areaBa = areaBa;
				     objPi.areaLa = areaLa;
				     objPi.calcAreaTp();
				     break;
					 
				 case 6:
					 
					 System.out.println("Digite a Soma das Áreas:");
				     double soma = sc.nextDouble();
				     System.out.println("Digite a Área da Base:");
				     double areaBas = sc.nextDouble();
				     System.out.println("Digite a altura do prisma:");
				     double halt = sc.nextDouble();
					 prisma objPri = new prisma();
					 objPri.altura = halt;
					 objPri.areaBa = areaBas;
					 objPri.SomaArea = soma;
					 objPri.calcAreaTc();
					 break;
					 
				     
				 case 7:
					 
					 System.out.println("Digite a aresta do Cubo:");
				     double aresta = sc.nextDouble();
				     cubo objCu = new cubo();
				     objCu.aresta = aresta;
				     objCu.calcAreaTc();
				     break;
					 
				}
			}
			if(escolha == 3) {
				System.out.println("Opçao invalida");
			}
			System.out.println("\nDeseja Repetir o Progama?: [1] para Sim e [2] para Não.");
			contro = sc.nextInt();
		}while(contro == 1);
	}

}
