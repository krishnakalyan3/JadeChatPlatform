
package chat.ontology;

/**
   Vocabulary containing symbols used within the chat application.
   @author Giovanni Caire - TILAB
 */
public interface ChatVocabulary {
	// ONTOLOGY NAME
  public static final String ONTOLOGY_NAME = "Chat-ontology";
	
	// VOCABULARY
  public static final String JOINED = "joined";
  public static final String JOINED_WHO = "who";

  public static final String LEFT = "left";
  public static final String LEFT_WHO = "who";

  public static final String SPOKEN = "spoken";
  public static final String SPOKEN_WHAT = "what";
}