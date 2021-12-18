package net.osgg.xmlsaxparser;

/**
 * INTEGRANTES:
 * Jonathan Cujilema 6685
   Nina Sinaluisa 6727 
   Luis Cuji 6770
 *
 */
//////////////////////////////////////////////////////////////////////////////////////////////
public class App 
{
    public static void main( String[] args )
    {
        SaxParser sp = new SaxParser("Lista.xml");
        try {
			sp.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
