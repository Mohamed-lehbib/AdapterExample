package XmlToJson;

public class StockMarketApp {
    public void processData(XmlData xmlData) {
        // Obtenez vos données XML
        //XmlData xmlData = new XmlData("<stock>hello</stock> <hello>hi</hello>");

        // Utilisez l'adaptateur pour convertir les données XML en JSON
        IJsonData jsonData = new XmlToJsonAdapter(xmlData);

        // Maintenant, jsonData peut être utilisé avec la bibliothèque d'analyse qui accepte JSON
        String json = jsonData.getJson();
        // Envoyez json à la bibliothèque d'analyse
        System.out.println(json);
    }
}
