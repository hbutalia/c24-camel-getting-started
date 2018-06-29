/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class ShipperDataType.The shipper complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.Shipper
 */
public class ShipperDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ShipperDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ShipperDataType() {
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
                    instance = new biz.c24.io.gettingstarted.purchaseorder.ShipperDataType();
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
        setName("shipper");
        setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.purchaseorder.Shipper.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("name", 1, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("per_ounce_rate", 1, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("day_of_week", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, biz.c24.io.gettingstarted.purchaseorder.ShipperDataType.DayOfWeekDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class DayOfWeekDataType.The DayOfWeek atomic simple data
     * type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class DayOfWeekDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.purchaseorder.ShipperDataType.DayOfWeekDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected DayOfWeekDataType() {
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
                        instance = new biz.c24.io.gettingstarted.purchaseorder.ShipperDataType.DayOfWeekDataType();
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
            setName("DayOfWeek");
            setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
            setLocal(true);
            addValidator(biz.c24.io.gettingstarted.purchaseorder.DayOfWeekEnum.getInstance());
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
