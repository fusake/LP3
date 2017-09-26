/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp3.xml;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author 31206018
 */
public class ContaParser extends DefaultHandler {

    private Conta conta;
    private String temp;
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();

    public void characters(char[] buffer, int start, int lenght) {
        temp = new String(buffer, start, lenght);
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        temp = "";
        if (qName.equalsIgnoreCase("Conta")) {
            conta = new Conta();
            conta.setTipo(attributes.getValue("type"));

        }

    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Conta")) {
            listaContas.add(conta);
        } else if (qName.equalsIgnoreCase("Nome")) {
            conta.setNome(temp);
        } else if (qName.equalsIgnoreCase("Id")) {
            conta.setId(Integer.parseInt(temp));
        } else if (qName.equalsIgnoreCase("Valor")) {
            conta.setValor(Integer.parseInt(temp));
        }
    }
    
    public  List getContas(){
        return listaContas;
    }
    
}