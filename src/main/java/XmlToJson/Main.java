package XmlToJson;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de StockMarketApp
        XmlData xmlData = new XmlData("<stock>hello</stock> <hello>hi</hello> <fine>fine</fine>");
        StockMarketApp stockMarketApp = new StockMarketApp();

        // Traitement des données
        stockMarketApp.processData(xmlData);
    }
}
