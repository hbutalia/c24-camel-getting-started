/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

/**
 * Class OrdersDataType.The Orders complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.Orders
 */
public class OrdersDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile OrdersDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected OrdersDataType() {
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
                    instance = new biz.c24.io.gettingstarted.OrdersDataType();
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
        setName("Orders");
        setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.Orders.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Orders", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, biz.c24.io.gettingstarted.OrderDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
