/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class CurrencyCodeEnum.The CurrencyCode enumeration.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class CurrencyCodeEnum extends biz.c24.io.api.data.DefaultEnumeration {

    /**
     * Field instance.
     */
    private static biz.c24.io.api.data.Enumeration instance;

    private CurrencyCodeEnum() {
        setName("CurrencyCode");
        addEntry("GBP", "British Pounds", null);
        addEntry("USD", "US Dollars", null);
        addEntry("EUR", "Euros", null);
    }

    /**
     */
    public static biz.c24.io.api.data.Enumeration getInstance() {
        if (instance == null)
            instance = new biz.c24.io.gettingstarted.purchaseorder.CurrencyCodeEnum();

        return instance;
    }

}
