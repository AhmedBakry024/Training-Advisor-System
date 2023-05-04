import java.util.Vector;

public class Materials 
{
    private static Vector<String> materialsVector = new Vector<String>();
    //setters
    public void setMaterialsVector(String material)
    {
        this.materialsVector.add(material);
    }
    //getters
    public static Vector<String> getMaterialsVector()
    {
        return materialsVector;
    }
    
}
