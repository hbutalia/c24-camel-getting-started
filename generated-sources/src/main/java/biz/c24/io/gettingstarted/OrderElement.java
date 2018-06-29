/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

/**
 * Class OrderElement.The Order element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class OrderElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile OrderElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public OrderElement() {
        this(true);
    }

    private OrderElement(boolean init) {
        super("Order", 1, 1, biz.c24.io.gettingstarted.OrderDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());

        if (init)
            init();
    }

    /**
     */
    public static biz.c24.io.api.data.Element getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.io.gettingstarted.OrderElement(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     */
    private void init() {
        setIgnoredElement(false);
    }

}
