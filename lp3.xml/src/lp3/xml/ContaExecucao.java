package lp3.xml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Handler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author 31206018
 */
public class ContaExecucao {

    private static void imprimir(List listaContas) {
        System.out.println("Numero de Contas no Banco = '" + listaContas.size() + "'.");
        Iterator<Conta> it = listaContas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException{
        String file = "dados/banco.xml";
        SAXParserFactory spac = SAXParserFactory.newInstance();
        SAXParser sp = spac.newSAXParser();
        ContaParser handler = new ContaParser();
        sp.parse(file, handler);
        List listaContas = handler.getContas();
        imprimir(listaContas);
    }
}
