/*****************************************************
 * class V6Driver
 * ...for testing implementation of Iterable interface
 *    (ability to run a FOREACH loop over your LList)
 * Assumes local version of List.java, overriding Java built-in interface
 *****************************************************/
import java.util.Iterator;

public class V6Driver {

    public static void main( String[] args ) {

	List<String> wu = new LList<String>();

	System.out.println(wu);
	wu.add("RZA");
	wu.add("GZA");
	wu.add("ODB");
	wu.add("Inspectah Deck");
	wu.add("Raekwon the Chef");
	wu.add("U-God");
	wu.add("Ghostface");
	wu.add("Method Man");
	System.out.println(wu);

	for( String s : wu ) {
	    System.out.println( s + " raps for the Wu");
	}

	Iterator<String> itr = wu.iterator();
	while ( itr.hasNext() ){
	    String current = itr.next();
	    if ( current.equals("RZA") || current.equals("GZA") || current.equals("U-God") || current.equals("Method Man") ){
		itr.remove();
		System.out.println("removed");
	    }
	    else
		System.out.println( current );
	}
    }

}//end class
