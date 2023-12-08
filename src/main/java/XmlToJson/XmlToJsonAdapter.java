package XmlToJson;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements IJsonData{
    private XmlData xmlData;

    public XmlToJsonAdapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJson() {
        try {
            // Convertir le XML en JSONObject
            JSONObject jsonObj = XML.toJSONObject(xmlData.getXml());
            // Retourner le JSON sous forme de String
            return jsonObj.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
