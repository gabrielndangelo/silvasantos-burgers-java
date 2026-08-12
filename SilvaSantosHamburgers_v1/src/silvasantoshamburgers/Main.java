/*
 * =========================================================
 * Projeto: SilvaSanto's Burgers
 * Versão: 1.0
 * Autor: Gabriel Dangelo
 * Data: 07/08/2026
 *
 * Descrição:
 * Primeiro microprojeto desenvolvido em Java.
 * Simulação de uma lanchonete de fast-food fictícia via atendimento
 * digital, com cardápio, pedidos e formas de pagamento.
 *
 * Conteúdos utilizados:
 * - Variáveis e tipos de dados
 * - Scanner
 * - if/else 
 * - switch/case
 * - while
 * - do/while
 * =========================================================
 */


package silvasantoshamburgers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double preco = 0;  // será a variável que irá armazenar o preço e a soma 
		double dinheiro = 0;
		double pix = 0;
		double diferenca = 0;
		
		char combo; // variável que irá interrogar se o cliente quer acompanhamento
		int bebidas; // variável que irá verificar a opção de bebida
		int sobremesa; // variável que irá verificar a opção de sobremesa
		int bebidacombo; // variável que será utilizada somente como representação de opção de bebida
		int acompcombo; // variável que será utilizada somente como representação de opção de acompanhamento
		
		
		
		char quer_continuar; // variável que irá verificar se o usuário vai continuar pedindo mais coisas // 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println(" SilvaSantos HAMBURGERS");
		System.out.println("------------------------");
		System.out.println("Olá, Cliente! Você está no SilvaSantos.");
		System.out.println("Você é cadastrado em nosso clube de vantagens?");
		System.out.println("(1) SIM  (2) NÃO");
		
		/* O programa irá interrogar o cliente se ele
		 é cadastrado ou não */
		
		/* Se for, será somente recebido, senão, ele poderá 
		 * optar pelo cadastro*/
		
		int login = sc.nextInt();
		boolean cadastro = false;
		
		switch (login) {
		case 1:
			
			System.out.print("Digite seu nome: ");
			String nome = sc.next();
			
			System.out.println("BEM-VINDO, " + nome.toUpperCase() + "!");
			
			cadastro = true;  // o programa verifica se o cadastro tá feito e retorna verdadeiro
			
		break;
		case 2:
			System.out.println("Deseja se cadastrar? (1) SIM (2) NÃO");
			
			int se_cadastrar = sc.nextInt();
			
				switch (se_cadastrar) {
				case 1:
					System.out.print("Qual o seu nome?  ");
					String novo_nome = sc.next();
					System.out.print("Seu E-mail: ");
					String email = sc.next();
					System.out.println("BEM-VINDO AO CLUBE DE VANTAGENS DO SILVASANTO'S, " + novo_nome.toUpperCase() + "!");
					
					cadastro = true;   // o programa verifica se o cadastro tá feito e retorna verdadeiro
					
				break;
				default:
				}
			
		break;
		default:	
		break;
		}
		
		/* Agora, o programa irá mostrar 
		 as opções do cardápio */
		
		do {
		System.out.println("-----------------------------------------------");
		System.out.println("                 CARDÁPIO                      ");
		System.out.println("-----------------------------------------------");

		System.out.println("SANDUÍCHES          | PREÇO | COMBO");
		System.out.println("(1) Hamburger       | 10.90 | 22.80");
		System.out.println("(2) X-Burger        | 10.90 | 22.80");
		System.out.println("(3) SilVegano       | 12.90 | 24.80");
		System.out.println("(4) X-Salada        | 13.90 | 25.80");
		System.out.println("(5) SilvaFrango     | 16.90 | 28.80");
		System.out.println("(6) SilvaBacon      | 16.90 | 28.80");
		System.out.println("(7) Grande Silva    | 17.90 | 29.80");
		System.out.println("(8) SilvaDuplo      | 17.90 | 29.80");
		System.out.println("(9) X-Tudo          | 17.90 | 29.80");

		System.out.println("-----------------------------------------------");

		System.out.println("ACOMPANHAMENTOS");
		System.out.println("(10) SilvaFritas    | 12.90");
		System.out.println("(11) Aneis de Cebola| 12.90");
		System.out.println("(12) Nuggets        | 12.90");

		System.out.println("-----------------------------------------------");

		System.out.println("BEBIDAS");
		System.out.println("(13) Refrigerante   |  7.90");
		System.out.println("(14) Suco           |  7.90");
		System.out.println("(15) Agua           |  3.50");
		System.out.println("(16) SilvaBeer      |  10.90");

		System.out.println("-----------------------------------------------");

		System.out.println("SOBREMESAS");
		System.out.println("(17) Silvashake");
		System.out.println("(18) Acai");
		System.out.println("(19) Sorvete Casquinha | 3.00");
		System.out.println("(20) Sundae | 7.00");

		System.out.println("-----------------------------------------------");

		System.out.println("OUTROS");
		System.out.println("(21) SilvaCafe      |  3.50");
		System.out.println("(22) SilvaParaBaixinhos | 25.90");

		System.out.println("-----------------------------------------------");
		
		/* O cliente será interrogado pelo preço 
		  do produto escolhido */
		
		System.out.print("Digite o número do pedido: ");
		int numPedido = sc.nextInt();
		
		/* Em seguida, os preços serao mostrados na tela */
		
		switch (numPedido) {
		
		case 1,2:
			
			System.out.print("Combo? (S) (N) ");
			combo = sc.next().toLowerCase().charAt(0);  // ver se o cliente irá querer o produto individual ou acompanhado
			
			if (combo == 's') {
				preco = preco + 22.80; 
				
				System.out.println("ACOMPANHAMENTO");
				System.out.println("(1) SILVAFRITAS");
				System.out.println("(2) ANEIS DE CEBOLA");
				acompcombo = sc.nextInt();
				
				System.out.println("QUAL SERÁ A BEBIDA (500ml)?");
				System.out.println ("(1) COCA-COLA");
				System.out.println ("(2) GUARANÁ");
				System.out.println ("(3) FANTA");
				System.out.println ("(4) DEL VALLE");
				bebidacombo = sc.nextInt();
			}
			else {
			preco = preco + 10.90;
			}
			
			
		break;
		
		case 3:
			
			System.out.print("Combo? (S) (N) ");
			combo = sc.next().toLowerCase().charAt(0);
			
			if (combo == 's') {
				preco = preco + 24.80;
				
				System.out.println("ACOMPANHAMENTO");
				System.out.println("(1) SILVAFRITAS");
				System.out.println("(2) ANEIS DE CEBOLA");
				acompcombo = sc.nextInt();
				
				System.out.println("QUAL SERÁ A BEBIDA (500ml)?");
				System.out.println ("(1) COCA-COLA");
				System.out.println ("(2) GUARANÁ");
				System.out.println ("(3) FANTA");
				System.out.println ("(4) DEL VALLE");
				bebidacombo = sc.nextInt();
			}
			else {
			preco = preco + 12.90;
			}
			
			
		break;
		
		case 4:
			
			System.out.print("Combo? (S) (N) ");
			combo = sc.next().toLowerCase().charAt(0);
			
			if (combo == 's') {
				preco = preco + 25.80;
				
				System.out.println("ACOMPANHAMENTO");
				System.out.println("(1) SILVAFRITAS");
				System.out.println("(2) ANEIS DE CEBOLA");
				acompcombo = sc.nextInt();
				
				System.out.println("QUAL SERÁ A BEBIDA (500ml)?");
				System.out.println ("(1) COCA-COLA");
				System.out.println ("(2) GUARANÁ");
				System.out.println ("(3) FANTA");
				System.out.println ("(4) DEL VALLE");
				bebidacombo = sc.nextInt();
			
			}
			else {
			preco = preco + 13.90;
			}
			
			
		break;
		
		case 5,6:
			
			System.out.print("Combo? (S) (N) ");
			combo = sc.next().toLowerCase().charAt(0);
			
			if (combo == 's') {
				preco = preco + 28.80;
				
				System.out.println("ACOMPANHAMENTO");
				System.out.println("(1) SILVAFRITAS");
				System.out.println("(2) ANEIS DE CEBOLA");
				acompcombo = sc.nextInt();
				
				System.out.println("QUAL SERÁ A BEBIDA (500ml)?");
				System.out.println ("(1) COCA-COLA");
				System.out.println ("(2) GUARANÁ");
				System.out.println ("(3) FANTA");
				System.out.println ("(4) DEL VALLE");
				bebidacombo = sc.nextInt();
			}
			else {
			preco = preco + 16.90;
			}
			
			
		break;
		
        case 7,8,9:
			
			System.out.print("Combo? (S) (N) ");
			combo = sc.next().toLowerCase().charAt(0);
			
			if (combo == 's') {
				preco = preco + 29.80; 
				
				System.out.println("ACOMPANHAMENTO");
				System.out.println("(1) SILVAFRITAS");
				System.out.println("(2) ANEIS DE CEBOLA");
				acompcombo = sc.nextInt();
				
				System.out.println("QUAL SERÁ A BEBIDA (500ml)?");
				System.out.println ("(1) COCA-COLA");
				System.out.println ("(2) GUARANÁ");
				System.out.println ("(3) FANTA");
				System.out.println ("(4) DEL VALLE");
				bebidacombo = sc.nextInt();
				
			}
			else {
			preco = preco + 17.90;
			}
			
			
		break;
		
        case 10,11,12:
        	
        	System.out.println("(P) PEQUENA - 10.90");
            System.out.println("(M) MÉDIA - 12.90");
            System.out.println("(G) GRANDE - 15.90");
        	char pmg = sc.next().toLowerCase().charAt(0);
        	
        		switch (pmg) {
        		case 'p':
        			preco = preco + 10.90;
        		break;
        		case 'm':
        			preco = preco + 12.90;
        		break;
        		case 'g': 
        			preco = preco + 15.90;
        		break;
        		default:
        	    break;
        		}
        	
        break;
        
        case 13,14:
        	System.out.println("Refrigerantes");
            System.out.println("(1) Coca-cola");
            System.out.println("(2) Coca-cola zero");
            System.out.println("(3) Guaraná");
            System.out.println("(4) Sprite");
            System.out.println("(5) Laranja");
            System.out.println("(6) Uva");
            System.out.println("Sucos");
            System.out.println("(7) Laranja");
            System.out.println("(8) Uva");
            bebidas = sc.nextInt();
        	preco = preco + 7.90;
        	
        	
        break;
        
        case 15:
        	
        	preco = preco + 3.90;
        	
        	
        break;
        
        case 16:
        	preco = preco + 10.90;
        	
        	
        break;
        
       case 17, 18:
        	
    	    System.out.println("(1) AÇAÍ  (2) SILVASHAKE");
       		sobremesa = sc.nextInt();
       		
       		switch (sobremesa) {
       		case 1:
       			System.out.println("SABORES DO AÇAÍ");
       			System.out.println("(1) Banana");
				System.out.println("(2) Morango");
				System.out.println("(3) com Guaraná");
				int saboracai = sc.nextInt();
			break;
       		case 2:
       			System.out.println("SABORES DO SILVASHAKE");
       			System.out.println("(1) Chocolate");
				System.out.println("(2) Morango");
				System.out.println("(3) Paçoca");
				System.out.println("(4) Ovomaltine");
				int saborshake = sc.nextInt();
       		break;	
       		default:
       		break;
       		}
       
        	System.out.println("(P) PEQUENO - 8.90");
            System.out.println("(M) MÉDIO - 11.90");
            System.out.println("(G) GRANDE - 16.90");
        	char pmg2 = sc.next().toLowerCase().charAt(0);
        	
        		switch (pmg2) {
        		case 'p':
        			preco = preco + 8.90;
        		break;
        		case 'm':
        			preco = preco + 11.90;
        		break;
        		case 'g': 
        			preco = preco + 16.90;
        		break;
        		default:
        	    break;
        		}
        break;
        case 19:
        	System.out.println("SABORES DO SORVETE");
   			System.out.println("(1) Chocolate");
			System.out.println("(2) Baunilha");
			System.out.println("(3) Mista");
			int saborcasquinha = sc.nextInt();
    	    preco = preco + 3.00;
    	    
    	    
    	break;
        case 20:
        	
        	System.out.println("SABORES DO SUNDAE");
   			System.out.println("(1) Chocolate");
			System.out.println("(2) Morango");
			System.out.println("(3) Paçoca");
			System.out.println("(4) Ovomaltine");
			int saborsundae = sc.nextInt();
        	preco = preco + 7.00;
        	
        	
        break;
        case 21:
        	
        	System.out.println("SilvaCafé");
        	preco = preco + 3.50;
        	
        	
        break;
        case 22:
        	System.out.println ("SilvaParaBaixinhos");
        	System.out.println ("QUAL SERÁ A BEBIDA (300ml)?");
        	System.out.println ("(1) COCA-COLA");
        	System.out.println ("(2) GUARANÁ");
        	System.out.println ("(3) FANTA");
        	System.out.println ("(4) DEL VALLE");
            int bebidaspb = sc.nextInt();
            System.out.println ("OPÇÃO DE PROTEINA: ");
            System.out.println ("(1) HAMBURGER");
            System.out.println ("(2) CHEESEBURGER");
            System.out.println ("(3) NUGGETS");
            int proteinaspb = sc.nextInt();
            System.out.println ("OPÇÃO DE SOBREMESA: ");
            System.out.println ("(1) DANONINHO");
            System.out.println ("(2) MAÇÃ");
            System.out.println ("(3) TORTA DE MAÇÃ");
            System.out.println ("(4) MAIS UMA SILVAFRITAS PEQUENA");
            int sobspb = sc.nextInt();
        	preco = preco + 25.90;
        	
        	
        break;
        default:
        break;
		}
		
		System.out.print("VAI QUERER MAIS ALGUMA COISA? (S) (N)");  // interrogação ao usuário para ver se ele irá continuar
		quer_continuar = sc.next().toLowerCase().charAt(0);
		} while (quer_continuar == 's'); 
		
		System.out.printf("TOTAL: R$ %.2f%n", preco);
		System.out.println("------------------------------");
		System.out.println("Qual será a sua forma de pagamento? ");
		System.out.println("(1) PARA CARTÃO");
		System.out.println("(2) PARA PIX");
		System.out.println("(3) PARA DINHEIRO");
		int pgto = sc.nextInt();    // leitura da forma de pagamento
		
		switch (pgto) {
		case 1:
			
			int senha_credito = 0000;  // senha da simulação do cartão de crédito
			int digite_credito;   // valor que será lido pelo usuário para ver se ele leu a senha certa
			int tentativas = 0;
			
			  System.out.printf("TOTAL: R$ %.2f%n",preco);
			  
			  do {
				  
		      System.out.print("Digite a senha: ");
		     
		      digite_credito = sc.nextInt();
		      
		           if (digite_credito != senha_credito) {
		           tentativas = tentativas + 1;
		           System.out.println("SENHA INVÁLIDA");
		           }
		           
			  } while (digite_credito != senha_credito && tentativas < 3);
			  
			  if (digite_credito == senha_credito) {
		           System.out.println("PAGAMENTO APROVADO");
		           System.out.println("OBRIGADO POR SER NOSSO CLIENTE! VOLTE SEMPRE!");
		           }
			  else {
				  System.out.println("Cartão bloqueado");
			  }
		           
		  break;
		  
		  case 2:
			  
		      System.out.printf("TOTAL: R$ %.2f%n",preco);
		      System.out.println("");
		      System.out.println("ENDEREÇO PIX: ARCOS DOURADOS S.A");
		      
		      do {
		      System.out.println("Digite o valor: ");
		      pix = sc.nextDouble();
		      
		           if (pix < preco) {
		           System.out.println("PEDIDO INSUFICIENTE");
		           }
		       
		      } while (pix < preco);
		      
		      
		      if (pix >= preco) {
		           System.out.println("OBRIGADO POR SER NOSSO CLIENTE! VOLTE SEMPRE!");
		           }
		      
		   break;
		   
		  case 3:
			  
			 
			  while (dinheiro < preco) {
				  
		      System.out.print("DIRIJA-SE AO CAIXA E ENVIE SEU VALOR: R$ ");
		      dinheiro = sc.nextDouble();
		      diferenca = preco - dinheiro;
		      
		      if (dinheiro < preco) {
		         System.out.printf("FALTAM R$ %.2f%n",diferenca);
		         } 
		          
		      
			  }
			  
			  if (dinheiro >= preco) {
		    	  double troco = dinheiro - preco;
		    	  
		    	   if (dinheiro > preco) {
		           System.out.printf("TROCO: R$ %.2f%n",troco);
		    	   }
		    	   
		           System.out.println("OBRIGADO POR SER NOSSO CLIENTE! VOLTE SEMPRE!");
		      }
		       
		   break;
		   default:
			   System.out.println("VOLTE SEMPRE!");
	       break;
		
	}

		sc.close();
}
}
