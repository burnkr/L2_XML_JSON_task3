package L2_XML_JSON.task3.XMLElements;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CurrencyParser {
    public List<Rate> parse() {
        List<Rate> rates = null;

        try {
            URL url = new URL("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDEUR%22,%20%22USDUAH%22)&env=store://datatables.org/alltableswithkeys");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            JAXBContext context = JAXBContext.newInstance(Query.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Query query = (Query) unmarshaller.unmarshal(connection.getInputStream());
            rates = new ArrayList<>();
            System.out.println(query.count);
            for (Rate tmp : query.results.rate)
                rates.add(tmp);
        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            return rates;
        }
    }
}
