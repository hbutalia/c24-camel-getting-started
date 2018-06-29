/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class Line_itemDataType.The line_item complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.Line_item
 */
public class Line_itemDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile Line_itemDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Line_itemDataType() {
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
                    instance = new biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType();
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
        setName("line_item");
        setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.purchaseorder.Line_item.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("description", 1, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("per_unit_ounces", 1, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("price", 1, 1, biz.c24.io.api.data.DoubleDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("quantity", 1, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("currency", 1, 1, biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.CurrencyCodeDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class CurrencyCodeDataType.The Currency Code atomic simple
     * data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class CurrencyCodeDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.CurrencyCodeDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected CurrencyCodeDataType() {
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
                        instance = new biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.CurrencyCodeDataType();
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
            setName("CurrencyCode");
            setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
            setDatabaseColumnName("Currency Code");
            setLocal(true);
            setMinLength(3);
            setMaxLength(3);
            addValidator(biz.c24.io.gettingstarted.purchaseorder.CurrencyCodeEnum.getInstance());
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
