/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

/**
 * Class OrderDataType.The Order complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.Order
 */
public class OrderDataType extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile OrderDataType instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected OrderDataType() {
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
                    instance = new biz.c24.io.gettingstarted.OrderDataType();
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
        setName("Order");
        setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
        setValidObjectClass(biz.c24.io.gettingstarted.Order.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("ID", 1, 1, biz.c24.io.gettingstarted.OrderDataType.Order_IDDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setPrimaryKey(true);
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("po_number", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_po_numberDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("purchase_date", 0, 1, biz.c24.io.api.data.SQLTimestampDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("shipping_date", 0, 1, biz.c24.io.api.data.SQLDateDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("delivery_time_slot", 0, 1, biz.c24.io.api.data.SQLTimeDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("customer_name", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_customer_nameDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("address", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_addressDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("shipper_name", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_shipper_nameDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("per_ounce_rate", 0, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("day_of_week", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_day_of_weekDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("line_item_description", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_line_item_descriptionDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("per_unit_ounces", 0, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("price", 0, 1, biz.c24.io.api.data.DoubleDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("quantity", 0, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("currency", 0, 1, biz.c24.io.gettingstarted.OrderDataType.Order_currencyDataType.class, biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

    /**
     * Class Order_IDDataType.The Order_ID atomic simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_IDDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_IDDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_IDDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_IDDataType();
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
            setName("Order_ID");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(36);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_addressDataType.The Order_address atomic simple
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
    public static class Order_addressDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_addressDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_addressDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_addressDataType();
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
            setName("Order_address");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(65535);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_currencyDataType.The Order_currency atomic
     * simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_currencyDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_currencyDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_currencyDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_currencyDataType();
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
            setName("Order_currency");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(10);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_customer_nameDataType.The Order_customer_name
     * atomic simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_customer_nameDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_customer_nameDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_customer_nameDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_customer_nameDataType();
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
            setName("Order_customer_name");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(255);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_day_of_weekDataType.The Order_day_of_week atomic
     * simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_day_of_weekDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_day_of_weekDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_day_of_weekDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_day_of_weekDataType();
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
            setName("Order_day_of_week");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(100);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_line_item_descriptionDataType.The
     * Order_line_item_description atomic simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_line_item_descriptionDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_line_item_descriptionDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_line_item_descriptionDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_line_item_descriptionDataType();
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
            setName("Order_line_item_description");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(65535);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_po_numberDataType.The Order_po_number atomic
     * simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_po_numberDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_po_numberDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_po_numberDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_po_numberDataType();
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
            setName("Order_po_number");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(30);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

    /**
     * Class Order_shipper_nameDataType.The Order_shipper_name
     * atomic simple data type.
     * 
     * 
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public static class Order_shipper_nameDataType extends biz.c24.io.api.data.GenericStringDataType {

        /**
         * Field instance.
         */
        protected static volatile biz.c24.io.gettingstarted.OrderDataType.Order_shipper_nameDataType instance;

        /**
         * Field initialized.
         */
        private static volatile boolean initialized;

        protected Order_shipper_nameDataType() {
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
                        instance = new biz.c24.io.gettingstarted.OrderDataType.Order_shipper_nameDataType();
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
            setName("Order_shipper_name");
            setModel(biz.c24.io.gettingstarted.FlatOrderDataModel.getInstance());
            setLocal(true);
            setMaxLength(255);
        }

        /**
         */
        private java.lang.Object readResolve() {
            return getInstance();
        }

    }

}
