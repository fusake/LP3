package lp3.xml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author 31206018
 */
public class EmpregadoExecucao {
    private static void imprimir(List listaEmpregados) {
        System.out.println("Numero de Empregados na Empresa = '" + listaEmpregados.size() + "'.");
        Iterator<Empregado> it = listaEmpregados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException{
        String file = "dados/banco2.xml";
        SAXParserFactory spac = SAXParserFactory.newInstance();
        SAXParser sp = spac.newSAXParser();
        EmpregadoParser handler = new EmpregadoParser();
        sp.parse(file, handler);
        List listaEmpregados = handler.getEmpregados();
        imprimir(listaEmpregados);
    }
    
}
