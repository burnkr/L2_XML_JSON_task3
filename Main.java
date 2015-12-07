package L2_XML_JSON.task3;

import L2_XML_JSON.task3.XMLElements.CurrencyParser;
import L2_XML_JSON.task3.XMLElements.Rate;

public class Main {
    public static void main(String[] args) {
        CurrencyParser parser = new CurrencyParser();
        for (Rate rate : parser.parse()) {
            System.out.println(rate.name + "\n" +
            "Rate: " + rate.rate + "\n" +
            "Date: " + rate.date + "\n" +
            "Time: " + rate.time + "\n" +
            "Bid: " + rate.bid + "\n" +
            "Ask: " + rate.ask + "\n");
        }
    }
}
