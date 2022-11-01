package br.edu.principal;
import br.edu.poligonos.*;
import br.edu.FigurasEspaciais.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contro;
		
		do {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Bem vindo ao Progama: Escolha o tipo de progama:");
			System.out.println("\t1-Figuras planas");
			System.out.println("\t2-Figuras Espaciais");
			System.out.println("Digite a Op�ao desejada:");
			int escolha = sc.nextInt();
			
			if(escolha == 1) {
				System.out.println("Escolha essas Op�oes de Figuras:");
				System.out.println("\t1-Quadrado");
				System.out.println("\t2-Retangulo ou Paralelograma");
				System.out.println("\t3-Circulo");
				System.out.println("\t4-Losangulo");
				System.out.println("\t5-Trap�zio");
				System.out.println("\t6-Pent�gono");
				System.out.println("\t7-hex�gono");
				System.out.println("Digite a Opera��o Desejada:");
				int opcao = sc.nextInt();
			
			    switch(opcao) 
			    {
			
			     case 1: 
			    	 
				     System.out.println("Digite Quanto Mede 1 Lado do Quadrado:");
				     double ladoq = sc.nextDouble();
				     quadrado objq = new quadrado();
				     objq.setLado(ladoq);
				     objq.calcAreaq();
				     objq.calcPeri();
				     System.out.println("�rea do Quadrado: " + objq.getArea());
				     System.out.println("Perimetro do Quadrado: " + objq.getPeri());
				     
				     break;
				     
			     case 2:
			    	 
			    	 System.out.println("Digite a base do objeto:");
				     double baser = sc.nextDouble();
				     System.out.println("Digite a Altura do objeto:");
				     double altura = sc.nextDouble();
				     retangulo objr = new retangulo();
				     objr.setAltura(altura);
				     objr.setBase(baser);
				     objr.calcArear();
				     objr.calcPeri();
				     System.out.println("�rea do Quadrado ou do Paralelograma: " + objr.getArear());
				     System.out.println("Perimetro do Quadrado ou do Paralelograma: " + objr.getPeri());
				     break;
				     
			     case 3:
			    	 
			    	 System.out.println("Digite o Raio do objeto:");
				     double rai = sc.nextDouble();
				     circulo objc = new circulo();
				     objc.setRaio(rai);
				     objc.calcPeri();
				     objc.calcAreac();
				     System.out.println("�rea do Circulo: " + objc.getArea());
				     System.out.println("Perimetro do Circulo: " + objc.getPeri());
			    	 break;
			    	 
			     case 4:
			    	 
			    	 System.out.println("Digite o lado do Losango:");
				     double ladol = sc.nextDouble();
				     System.out.println("Digite a Primeira Diagonal do Losango:");
				     double diag1 = sc.nextDouble();
				     System.out.println("Digite a Segunda Diagonal do Losango:");
				     double diag2 = sc.nextDouble();
				     losango objcL = new losango();
				     objcL.setLado(ladol);
				     objcL.setDiag1(diag1);
				     objcL.setDiag2(diag2);
				     objcL.calcAreaL();
				     System.out.println("A area do Losangulo � " + objcL.getArea());
				     System.out.println("O Perimetro do losangulo � " + objcL.getPeri());
				     break;
			    	 
			     case 5:
			    	 
			    	 System.out.println("Digite o lado do Trap�zio:");
				     double ladoT= sc.nextDouble();
				     System.out.println("Digite a Base menor do Trap�zio:");
				     double basem= sc.nextDouble();
				     System.out.println("Digite a Base Maior do Trap�zio:");
				     double baseM = sc.nextDouble();
				     System.out.println("Digite a Altura do Trap�zio:");
				     double altu = sc.nextDouble();
				     trapezio objcT = new trapezio();
				     objcT.setBasem(basem);
				     objcT.setBaseM(baseM);
				     objcT.setAltura(altu);
				     objcT.setLado(ladoT);
				     objcT.calcAreaT();
				     System.out.println("A area do trap�zio � " + objcT.getArea());
				     System.out.println("O Perimetro do losangulo � " + objcT.getPeri());
				     break;
			    	 
			     case 6:
			    	 
			    	 System.out.println("Digite o lado do Pent�gono:");
				     double ladoP = sc.nextDouble();
				     System.out.println("Digite a Ap�tema do Pentagono:");
				     double apote = sc.nextDouble();
				     pentagono objcP = new pentagono();
				     objcP.setApote(apote);
				     objcP.setLado(ladoP);
				     objcP.calcAreap();
				     System.out.println("A area do Pentagono � " + objcP.getArea());
				     System.out.println("O Perimetro do pentagono � " + objcP.getPeri());
				     
			    	 break;
			    	 
			     case 7:
			    	 
			    	 System.out.println("Digite a Base do hex�gono:");
				     double baseH = sc.nextDouble();
				     System.out.println("Digite a Altura do hexagono:");
				     double alt = sc.nextDouble();
				     System.out.println("Digite o lado do Hex�gono:");
				     double ladoH = sc.nextDouble();
				     hexagono objH = new hexagono();
				     objH.setAltura(alt);
				     objH.setBase(baseH);
				     objH.setLado(ladoH);
				     objH.calcAreahex();
				     System.out.println("A �rea do Hexagono � " + objH.getArea());
				     System.out.println("O Perimetro do Hexagono � " + objH.getPeri());
				     break;
			    	 
			    }
		    }
			if(escolha == 2) {
				System.out.println("Escolha essas Op�oes de Figuras:");
				System.out.println("\t1-Paralelepipedo");
				System.out.println("\t2-Esfera");
				System.out.println("\t3-Cone");
				System.out.println("\t4-Cilindro");
				System.out.println("\t5-Pir�mide");
				System.out.println("\t6-Prisma");
				System.out.println("\t7-Cubo");
				System.out.println("Digite a Opera��o Desejada:");
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
				     objPa.setAr1(lado1);
				     objPa.setAr2(lado2);
				     objPa.setAr3(lado3);
				     objPa.calcAreaPa();
				     System.out.println("A �rea total do paralelepipedo � " + objPa.getArea());
				     System.out.println("O volume do paralelepipedo � " + objPa.getVolume());
				     break;
				     
				 case 2:
					 
				     esfera objE = new esfera();
				     
				     System.out.println("Digite o valor do Raio");
				     double rRaio = sc.nextDouble();
				     objE.recebeRaio(rRaio);
				     
				     
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
				     cilindro objCi = new cilindro();
				     objCi.altura = ha;
				     objCi.raio = raioss;
				     objCi.calcAreaCi();
				     break;
				     
				 case 5:
					 
					 System.out.println("Digite a �rea lateral:");
				     double areaLa = sc.nextDouble();
				     System.out.println("Digite a �rea da Base:");
				     double areaBa = sc.nextDouble();
				     System.out.println("Digite a altura da piramide:");
				     double hal = sc.nextDouble();
				     piramide objPi = new piramide();
				     objPi.altura = hal;
				     objPi.areaBa = areaBa;
				     objPi.areaLa = areaLa;
				     objPi.calcAreaTp();
				     break;
					 
				 case 6:
					 
					 System.out.println("Digite a Soma das �reas:");
				     double soma = sc.nextDouble();
				     System.out.println("Digite a �rea da Base:");
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
				System.out.println("Op�ao invalida");
			}
			System.out.println("\nDeseja Repetir o Progama?: [1] para Sim e [2] para N�o.");
			contro = sc.nextInt();
		}while(contro == 1);
	}	
}
