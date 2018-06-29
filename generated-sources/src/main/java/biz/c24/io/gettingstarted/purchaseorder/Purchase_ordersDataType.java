/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class Purchase_ordersDataType.The purchase_orders complex data
 * type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.Purchase_orders
 */
public class Purchase_ordersDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile Purchase_ordersDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Purchase_ordersDataType() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.io.gettingstarted.purchaseorder.Purchase_ordersDataType();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("purchase_orders");
        setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.purchaseorder.Purchase_orders.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("purchase_orders", 1, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
