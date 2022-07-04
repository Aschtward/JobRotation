package questao3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CalculaFaturamento {
	
	public CalculaFaturamento(String path) {
		
		Faturamento[] fat;
	
		try {
			DocumentBuilderFactory fabric = DocumentBuilderFactory.newInstance();
			DocumentBuilder generator = fabric.newDocumentBuilder();
			Document documento = generator.parse(path);
			NodeList lista = documento.getElementsByTagName("faturamento");
			
			int size = lista.getLength();
			
			fat = new Faturamento[size];
			
			for(int i = 0; i < size;i++) {
				Node faturamento = lista.item(i);
				String dia = "";
				Double valor = 0.0;
				if(faturamento.getNodeType() == Node.ELEMENT_NODE) {
					
					Element elemento = (Element) faturamento;
					NodeList childList = elemento.getChildNodes();
					
					for(int j = 0; j < childList.getLength(); j++) {
						Node child = childList.item(j);
						if(child.getNodeType() == Node.ELEMENT_NODE) {
							Element childElement = (Element) child;
							
							switch(childElement.getTagName()) {
								case "dia":
									dia = childElement.getTextContent();
									break;
								case "valor":
									valor = Double.valueOf(childElement.getTextContent());
									break;
							}
						}
					}
					fat[i] = new Faturamento(dia,valor);
				}
			}
			Faturamento menor = menorValor(fat);
			Faturamento maior = maiorValor(fat);
			Double media = media(fat);
			
			System.out.println("O maior valor : " + maior.getValor() + " e ocorreu no dia: " + maior.getDia()
			+ " O menor valor e " + menor.getValor() + " e ocorreu no dia: " + menor.getDia());
			
			System.out.println("A media foi : " + media + " e os dias que superaram a media foram: ");
			for(int k = 0; k < fat.length; k++) {
				if(fat[k].getValor() > media)
					System.out.println("Dia :" + fat[k].getDia());
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	public Faturamento menorValor(Faturamento[] fat) {
		Double menorAtual = fat[0].getValor();
		int index = 0;
		for(int i = 0; i < fat.length;i++) {
			if(menorAtual > fat[i].getValor()) {
				menorAtual = fat[i].getValor();
				index = i;
			}
		}
		return fat[index];
	}
	
	public Faturamento maiorValor(Faturamento[] fat) {
		Double maiorAtual = 0.0;
		int index = 0;
		for(int i = 0; i < fat.length;i++) {
			if(maiorAtual < fat[i].getValor()) {
				maiorAtual = fat[i].getValor();
				index = i;
			}
		}
		return fat[index];
	}
	
	public Double media(Faturamento[] fat) {
		int diasNormais = 0;
		Double valorTotal = 0.0;
		for(int i = 0; i < fat.length;i++) {
			if(fat[i].getValor() > 0.0) {
				diasNormais++;
				valorTotal += fat[i].getValor();
			}
		}
		return (valorTotal/diasNormais);
	}
}
