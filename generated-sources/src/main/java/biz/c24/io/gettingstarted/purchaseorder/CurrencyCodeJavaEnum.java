/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Enumeration CurrencyCodeJavaEnum.
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
public enum CurrencyCodeJavaEnum {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant GBP
     */
    GBP("GBP"),
    /**
     * Constant USD
     */
    USD("USD"),
    /**
     * Constant EUR
     */
    EUR("EUR");
    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field value.
     */
    private final String value;

    private CurrencyCodeJavaEnum(String value) {
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
