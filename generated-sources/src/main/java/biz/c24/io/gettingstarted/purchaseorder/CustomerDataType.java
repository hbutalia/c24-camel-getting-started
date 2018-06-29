/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class CustomerDataType.The customer complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.Customer
 */
public class CustomerDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile CustomerDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CustomerDataType() {
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
                    instance = new biz.c24.io.gettingstarted.purchaseorder.CustomerDataType();
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
        setName("customer");
        setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.purchaseorder.Customer.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("name", 1, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("address", 1, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
