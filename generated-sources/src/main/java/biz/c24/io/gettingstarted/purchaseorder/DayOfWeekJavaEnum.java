/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Enumeration DayOfWeekJavaEnum.
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public enum DayOfWeekJavaEnum {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant _1
     */
    _1("1"),
    /**
     * Constant _2
     */
    _2("2"),
    /**
     * Constant _3
     */
    _3("3"),
    /**
     * Constant _4
     */
    _4("4"),
    /**
     * Constant _5
     */
    _5("5"),
    /**
     * Constant _6
     */
    _6("6"),
    /**
     * Constant _7
     */
    _7("7");
    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field value.
     */
    private final String value;

    private DayOfWeekJavaEnum(String value) {
        this.value = value;
    }

    /**
     */
    public String getValue() {
        return value;
    }

    /**
     */
    public String toString() {
        return java.lang.String.valueOf(getValue());
    }

}
