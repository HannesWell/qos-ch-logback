package ch.qos.logback.core;

public class CoreGlobal {

  // Note that the line.separator property can be looked up even by
  // applets.
  public static final String LINE_SEPARATOR = System.getProperty("line.separator");
  public static final int LINE_SEPARATOR_LEN = LINE_SEPARATOR.length();
 
  
  public static final String CODES_URL = "http://logback.qos.ch/codes.html";
  
  /**
   * Customized pattern conversion rules are stored under this key in the
   * {@link Context} object store.
   */
  public static final String PATTERN_RULE_REGISTRY = "PATTERN_RULE_REGISTRY";
  
  public static final String ISO8601_STR = "ISO8601";
  public static final String ISO8601_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";
 
  /**
   * Time format used in Common Log Format
   */
  static public final String CLF_DATE_PATTERN = "dd/MM/yyyy:HH:mm:ss Z";
  
  /**
   * The key used in locating the evaluator map in context's object map.
   */
  static public final String EVALUATOR_MAP = "EVALUATOR_MAP";

  /**
   * By convention, we assume that the static method named "valueOf" taking 
   * a string argument can restore a given object from its string 
   * representation.
   * 
   * <p>Classes participating in this convention must be declared
   * as stringStorable in a (logback) context.
   */
  static public final String VALUE_OF = "valueOf";
  
  /**
   * An empty string.
   */
  public final static String EMPTY_STRING = "";
  
  /**
   * An empty string array.
   */
  public final static String[] EMPTY_STRING_ARRAY = new String[] {};
  
  /**
   * An empty Class array.
   */
  public final static Class[] EMPTY_CLASS_ARRAY = new Class[] {};
  public final static String CAUSED_BY = "Caused by: ";
  
  
  public final static char PERCENT_CHAR = '%';
}
