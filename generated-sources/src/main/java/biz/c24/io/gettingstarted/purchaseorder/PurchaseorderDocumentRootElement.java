/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

/**
 * Class PurchaseorderDocumentRootElement.The Document Root
 * element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class PurchaseorderDocumentRootElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile PurchaseorderDocumentRootElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public PurchaseorderDocumentRootElement() {
        this(true);
    }

    private PurchaseorderDocumentRootElement(boolean init) {
        super("DocumentRoot", 1, 1, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement.PurchaseorderDocumentRootDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());

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
                    instance = new biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement(false);
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
        setDatabaseColumnName("Document Root");
        setIgnoredElement(false);
    }

    /**
     * Class PurchaseorderDocumentRootDataType.The Document Root
     * complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see
     * biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot
     */
    public static class PurchaseorderDocumentRootDataType extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement.PurchaseorderDocumentRootDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected PurchaseorderDocumentRootDataType() {
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
                        instance = new biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement.PurchaseorderDocumentRootDataType();
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
            setName("DocumentRoot");
            setModel(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance());
            setDatabaseColumnName("Document Root");
            setLocal(true);
            setValidObjectClass(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("purchase_order", 1, 1, biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.class, biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
