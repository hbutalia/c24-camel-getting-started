/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

/**
 * Class FlatOrderDocumentRootElement.The Document Root element.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class FlatOrderDocumentRootElement extends biz.c24.io.api.data.Element {

    /**
     * Field instance.
     */
    private static volatile FlatOrderDocumentRootElement instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    public FlatOrderDocumentRootElement() {
        this(true);
    }

    private FlatOrderDocumentRootElement(boolean init) {
        super("DocumentRoot", 1, 1, biz.c24.io.gettingstarted.FlatOrderDocumentRootElement.FlatOrderDocumentRootDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());

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
                    instance = new biz.c24.io.gettingstarted.FlatOrderDocumentRootElement(false);
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
     * Class FlatOrderDocumentRootDataType.The Document Root
     * complex data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     * @see biz.c24.io.gettingstarted.FlatOrderDocumentRoot
     */
    public static class FlatOrderDocumentRootDataType extends biz.c24.io.api.data.ComplexDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.FlatOrderDocumentRootElement.FlatOrderDocumentRootDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected FlatOrderDocumentRootDataType() {
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
                        instance = new biz.c24.io.gettingstarted.FlatOrderDocumentRootElement.FlatOrderDocumentRootDataType();
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
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setDatabaseColumnName("Document Root");
            setLocal(true);
            setValidObjectClass(biz.c24.io.gettingstarted.FlatOrderDocumentRoot.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("Order", 1, 1, biz.c24.io.gettingstarted.OrderDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
            element.setIgnoredElement(false);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
