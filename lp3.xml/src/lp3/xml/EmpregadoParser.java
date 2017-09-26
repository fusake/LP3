package lp3.xml;

/**
 *
 * @author 31206018
 */
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmpregadoParser extends DefaultHandler{
    private Empregado empregado;
    private String temp;
    private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();

    public void characters(char[] buffer, int start, int lenght) {
        temp = new String(buffer, start, lenght);
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        temp = "";
        if (qName.equalsIgnoreCase("Empregado")) {
            empregado = new Empregado();
            empregado.setTipo("id");

        }

    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Empregado")) {
            listaEmpregados.add(empregado);
        } else if (qName.equalsIgnoreCase("PrimeiroNome")) {
            empregado.setPrimeiroNome(temp);
        } else if (qName.equalsIgnoreCase("UltimoNome")) {
            empregado.setUltimoNome(temp);
        } else if (qName.equalsIgnoreCase("Email")) {
            empregado.setEmail(qName);
        }else if (qName.equalsIgnoreCase("Departamento")) {
            empregado.setDepartamento(temp);
        }else if (qName.equalsIgnoreCase("Salario")) {
            empregado.setSalario(Double.parseDouble(temp));
        }else if (qName.equalsIgnoreCase("Endereco")) {
            empregado.setEndereco(temp);
        }
    }
    
    public  List getEmpregados(){
        return listaEmpregados;
    }
    
}
