/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class Purchase_orderElement.The purchase_order element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Purchase_orderElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile Purchase_orderElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public Purchase_orderElement() {
        this(true);
    }

    private Purchase_orderElement(boolean init) {
        super("purchase_order", 1, 1, biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());

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
                    instance = new biz.c24.io.gettingstarted.purchaseorder.Purchase_orderElement(false);
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
