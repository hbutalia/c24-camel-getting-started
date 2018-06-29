/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class DayOfWeekEnum.The DayOfWeek enumeration.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class DayOfWeekEnum extends biz.c24.io.api.data.DefaultEnumeration {

    /**
     * Field instance.
     */
    private static biz.c24.io.api.data.Enumeration instance;

    private DayOfWeekEnum() {
        setName("DayOfWeek");
        addEntry("1", "Monday", null);
        addEntry("2", "Tuesday", null);
        addEntry("3", "Wednesday", null);
        addEntry("4", "Thursday", null);
        addEntry("5", "Friday", null);
        addEntry("6", "Saturday", null);
        addEntry("7", "Sunday", null);
    }

    /**
     */
    public static biz.c24.io.api.data.Enumeration getInstance() {
        if (instance == null)
            instance = new biz.c24.io.gettingstarted.purchaseorder.DayOfWeekEnum();

        return instance;
    }

}
