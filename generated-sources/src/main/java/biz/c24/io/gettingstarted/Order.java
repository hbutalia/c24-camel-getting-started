/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Order. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>ID</b> of type {@link java.lang.String} (1)</li>
 * <li><b>po_number</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>purchase_date</b> of type {@link java.sql.Timestamp}
 * (0..1)</li>
 * <li><b>shipping_date</b> of type {@link java.sql.Date}
 * (0..1)</li>
 * <li><b>delivery_time_slot</b> of type {@link java.sql.Time}
 * (0..1)</li>
 * <li><b>customer_name</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>address</b> of type {@link java.lang.String} (0..1)</li>
 * <li><b>shipper_name</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>per_ounce_rate</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>day_of_week</b> of type {@link java.lang.String}
 * (0..1)</li>
 * <li><b>line_item_description</b> of type {@link
 * java.lang.String} (0..1)</li>
 * <li><b>per_unit_ounces</b> of type {@link java.math.BigDecimal}
 * (0..1)</li>
 * <li><b>price</b> of type <code>double</code> (0..1)</li>
 * <li><b>quantity</b> of type <code>int</code> (0..1)</li>
 * <li><b>currency</b> of type {@link java.lang.String} (0..1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.OrderDataType
 */
public class Order extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 4L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"ID", "address", "currency", "customer_name", "day_of_week", "delivery_time_slot", "line_item_description", "per_ounce_rate", "per_unit_ounces", "po_number", "price", "purchase_date", "quantity", "shipper_name", "shipping_date"};

    /**
     * Field iD.
     */
    private java.lang.String iD;

    /**
     * Field po_number.
     */
    private java.lang.String po_number;

    /**
     * Field purchase_date.
     */
    private java.sql.Timestamp purchase_date;

    /**
     * Field shipping_date.
     */
    private java.sql.Date shipping_date;

    /**
     * Field delivery_time_slot.
     */
    private java.sql.Time delivery_time_slot;

    /**
     * Field customer_name.
     */
    private java.lang.String customer_name;

    /**
     * Field address.
     */
    private java.lang.String address;

    /**
     * Field shipper_name.
     */
    private java.lang.String shipper_name;

    /**
     * Field per_ounce_rate.
     */
    private java.math.BigDecimal per_ounce_rate;

    /**
     * Field day_of_week.
     */
    private java.lang.String day_of_week;

    /**
     * Field line_item_description.
     */
    private java.lang.String line_item_description;

    /**
     * Field per_unit_ounces.
     */
    private java.math.BigDecimal per_unit_ounces;

    /**
     * Field price.
     */
    private double price;

    /**
     * Field ispriceSet.
     */
    private boolean ispriceSet;

    /**
     * Field quantity.
     */
    private int quantity;

    /**
     * Field isquantitySet.
     */
    private boolean isquantitySet;

    /**
     * Field currency.
     */
    private java.lang.String currency;

    public Order() {
        this(biz.c24.io.gettingstarted.OrderDataType.getInstance().getNullDefiningElementDecl());
    }

    public Order(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Order(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Order(biz.c24.io.gettingstarted.Order clone) {
        super(clone);
    }

    /**
     * Adds <code>value</code> as an element called
     * <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     */
    public void addElement(java.lang.String name,java.lang.Object value) {
        name = makeSubstitution(name, -1);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 0:
                setID((java.lang.String) value);
                return;
            case 9:
                setPo_number((java.lang.String) value);
                return;
            case 11:
                setPurchase_date((java.sql.Timestamp) value);
                return;
            case 14:
                setShipping_date((java.sql.Date) value);
                return;
            case 5:
                setDelivery_time_slot((java.sql.Time) value);
                return;
            case 3:
                setCustomer_name((java.lang.String) value);
                return;
            case 1:
                setAddress((java.lang.String) value);
                return;
            case 13:
                setShipper_name((java.lang.String) value);
                return;
            case 7:
                setPer_ounce_rate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setDay_of_week((java.lang.String) value);
                return;
            case 6:
                setLine_item_description((java.lang.String) value);
                return;
            case 8:
                setPer_unit_ounces(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 10:
                setPrice(biz.c24.io.api.Utils.doubleValue(value));
                return;
            case 12:
                setQuantity(biz.c24.io.api.Utils.intValue(value));
                return;
            case 2:
                setCurrency((java.lang.String) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new biz.c24.io.gettingstarted.Order(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.Order(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.Order obj = (biz.c24.io.gettingstarted.Order) clone;
        obj.iD = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.iD, obj, "ID");
        obj.po_number = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.po_number, obj, "po_number");
        obj.purchase_date = (java.sql.Timestamp) biz.c24.io.api.Utils.cloneDeep(this.purchase_date, obj, "purchase_date");
        obj.shipping_date = (java.sql.Date) biz.c24.io.api.Utils.cloneDeep(this.shipping_date, obj, "shipping_date");
        obj.delivery_time_slot = (java.sql.Time) biz.c24.io.api.Utils.cloneDeep(this.delivery_time_slot, obj, "delivery_time_slot");
        obj.customer_name = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.customer_name, obj, "customer_name");
        obj.address = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.address, obj, "address");
        obj.shipper_name = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.shipper_name, obj, "shipper_name");
        obj.per_ounce_rate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.per_ounce_rate, obj, "per_ounce_rate");
        obj.day_of_week = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.day_of_week, obj, "day_of_week");
        obj.line_item_description = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.line_item_description, obj, "line_item_description");
        obj.per_unit_ounces = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.per_unit_ounces, obj, "per_unit_ounces");
        obj.ispriceSet = this.ispriceSet;
        obj.price = this.price;
        obj.isquantitySet = this.isquantitySet;
        obj.quantity = this.quantity;
        obj.currency = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.currency, obj, "currency");
    }

    public boolean equals(java.lang.Object obj) {

        if(obj == null)
            return false;
        else if(obj instanceof biz.c24.io.api.data.ComplexDataObject)
            return equalContents((biz.c24.io.api.data.ComplexDataObject) obj, true, true, true, true);
        else
            return obj.equals(this);
    }

    /**
     * Gets the value of address (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getAddress() {
        return this.address;
    }

    /**
     * Gets the value of currency (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the value of customer_name (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getCustomer_name() {
        return this.customer_name;
    }

    /**
     * Gets the value of day_of_week (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getDay_of_week() {
        return this.day_of_week;
    }

    /**
     * Gets the value of delivery_time_slot (0..1).
     * 
     * @return The value.
     */
    public java.sql.Time getDelivery_time_slot() {
        return this.delivery_time_slot;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>iD,
     * po_number, purchase_date, shipping_date, delivery_time_slot,
     * customer_name, address, shipper_name, per_ounce_rate,
     * day_of_week, line_item_description, per_unit_ounces, price,
     * quantity, currency</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return getID();
            case 9:
                return getPo_number();
            case 11:
                return getPurchase_date();
            case 14:
                return getShipping_date();
            case 5:
                return getDelivery_time_slot();
            case 3:
                return getCustomer_name();
            case 1:
                return getAddress();
            case 13:
                return getShipper_name();
            case 7:
                return getPer_ounce_rate();
            case 4:
                return getDay_of_week();
            case 6:
                return getLine_item_description();
            case 8:
                return getPer_unit_ounces();
            case 10:
                return getPrice();
            case 12:
                return getQuantity();
            case 2:
                return getCurrency();
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Returns the count of elements called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     */
    public int getElementCount(java.lang.String name) {
        if (null == name) throw new NullPointerException(toString() + " was asked to calculate elements without name");
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return this.iD == null ? 0 : 1;
            case 9:
                return this.po_number == null ? 0 : 1;
            case 11:
                return this.purchase_date == null ? 0 : 1;
            case 14:
                return this.shipping_date == null ? 0 : 1;
            case 5:
                return this.delivery_time_slot == null ? 0 : 1;
            case 3:
                return this.customer_name == null ? 0 : 1;
            case 1:
                return this.address == null ? 0 : 1;
            case 13:
                return this.shipper_name == null ? 0 : 1;
            case 7:
                return this.per_ounce_rate == null ? 0 : 1;
            case 4:
                return this.day_of_week == null ? 0 : 1;
            case 6:
                return this.line_item_description == null ? 0 : 1;
            case 8:
                return this.per_unit_ounces == null ? 0 : 1;
            case 10:
                return this.ispriceSet ? 1 : 0;
            case 12:
                return this.isquantitySet ? 1 : 0;
            case 2:
                return this.currency == null ? 0 : 1;
            default:
                return super.getElementCount(name);
        }
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param element
     */
    public int getElementIndex(java.lang.String name,java.lang.Object element) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return this.iD != null && this.iD.equals(element) ? 0 : -1;
            case 9:
                return this.po_number != null && this.po_number.equals(element) ? 0 : -1;
            case 11:
                return this.purchase_date != null && this.purchase_date.equals(element) ? 0 : -1;
            case 14:
                return this.shipping_date != null && this.shipping_date.equals(element) ? 0 : -1;
            case 5:
                return this.delivery_time_slot != null && this.delivery_time_slot.equals(element) ? 0 : -1;
            case 3:
                return this.customer_name != null && this.customer_name.equals(element) ? 0 : -1;
            case 1:
                return this.address != null && this.address.equals(element) ? 0 : -1;
            case 13:
                return this.shipper_name != null && this.shipper_name.equals(element) ? 0 : -1;
            case 7:
                return this.per_ounce_rate != null && this.per_ounce_rate.equals(element) ? 0 : -1;
            case 4:
                return this.day_of_week != null && this.day_of_week.equals(element) ? 0 : -1;
            case 6:
                return this.line_item_description != null && this.line_item_description.equals(element) ? 0 : -1;
            case 8:
                return this.per_unit_ounces != null && this.per_unit_ounces.equals(element) ? 0 : -1;
            case 10:
                return this.ispriceSet ? (this.price == biz.c24.io.api.Utils.doubleValue(element) ? 0 : -1) : -1;
            case 12:
                return this.isquantitySet ? (this.quantity == biz.c24.io.api.Utils.intValue(element) ? 0 : -1) : -1;
            case 2:
                return this.currency != null && this.currency.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of ID (1).
     * 
     * @return The value.
     */
    public java.lang.String getID() {
        return this.iD;
    }

    /**
     * Gets the value of line_item_description (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getLine_item_description() {
        return this.line_item_description;
    }

    /**
     * Gets the value of per_ounce_rate (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getPer_ounce_rate() {
        return this.per_ounce_rate;
    }

    /**
     * Gets the value of per_unit_ounces (0..1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getPer_unit_ounces() {
        return this.per_unit_ounces;
    }

    /**
     * Gets the value of po_number (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getPo_number() {
        return this.po_number;
    }

    /**
     * Gets the value of price (0..1).
     * 
     * @return The value.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the value of purchase_date (0..1).
     * 
     * @return The value.
     */
    public java.sql.Timestamp getPurchase_date() {
        return this.purchase_date;
    }

    /**
     * Gets the value of quantity (0..1).
     * 
     * @return The value.
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>iD,
     * po_number, purchase_date, shipping_date, delivery_time_slot,
     * customer_name, address, shipper_name, per_ounce_rate,
     * day_of_week, line_item_description, per_unit_ounces, price,
     * quantity, currency</b>.
     * 
     * @param name
     * @param index
     */
    public java.lang.Object getRawElement(java.lang.String name,int index) {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return this.iD;
            case 9:
                return this.po_number;
            case 11:
                return this.purchase_date;
            case 14:
                return this.shipping_date;
            case 5:
                return this.delivery_time_slot;
            case 3:
                return this.customer_name;
            case 1:
                return this.address;
            case 13:
                return this.shipper_name;
            case 7:
                return this.per_ounce_rate;
            case 4:
                return this.day_of_week;
            case 6:
                return this.line_item_description;
            case 8:
                return this.per_unit_ounces;
            case 10:
                return this.price;
            case 12:
                return this.quantity;
            case 2:
                return this.currency;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of shipper_name (0..1).
     * 
     * @return The value.
     */
    public java.lang.String getShipper_name() {
        return this.shipper_name;
    }

    /**
     * Gets the value of shipping_date (0..1).
     * 
     * @return The value.
     */
    public java.sql.Date getShipping_date() {
        return this.shipping_date;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.iD == null ? 0 : 1;
        count += this.po_number == null ? 0 : 1;
        count += this.purchase_date == null ? 0 : 1;
        count += this.shipping_date == null ? 0 : 1;
        count += this.delivery_time_slot == null ? 0 : 1;
        count += this.customer_name == null ? 0 : 1;
        count += this.address == null ? 0 : 1;
        count += this.shipper_name == null ? 0 : 1;
        count += this.per_ounce_rate == null ? 0 : 1;
        count += this.day_of_week == null ? 0 : 1;
        count += this.line_item_description == null ? 0 : 1;
        count += this.per_unit_ounces == null ? 0 : 1;
        count += this.ispriceSet ? 1 : 0;
        count += this.isquantitySet ? 1 : 0;
        count += this.currency == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(iD);
        result = 31 * result + hashCodeOf(po_number);
        result = 31 * result + hashCodeOf(purchase_date);
        result = 31 * result + hashCodeOf(shipping_date);
        result = 31 * result + hashCodeOf(delivery_time_slot);
        result = 31 * result + hashCodeOf(customer_name);
        result = 31 * result + hashCodeOf(address);
        result = 31 * result + hashCodeOf(shipper_name);
        result = 31 * result + hashCodeOf(per_ounce_rate);
        result = 31 * result + hashCodeOf(day_of_week);
        result = 31 * result + hashCodeOf(line_item_description);
        result = 31 * result + hashCodeOf(per_unit_ounces);
        result = 31 * result + hashCodeOf(price);
        result = 31 * result + hashCodeOf(ispriceSet);
        result = 31 * result + hashCodeOf(quantity);
        result = 31 * result + hashCodeOf(isquantitySet);
        result = 31 * result + hashCodeOf(currency);
        return result;
    }

    /**
     * Tests whether price has been set.
     */
    public boolean isPriceSet() {
        return ispriceSet;
    }

    /**
     * Tests whether quantity has been set.
     */
    public boolean isQuantitySet() {
        return isquantitySet;
    }

    /**
     * Removes the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param index
     */
    public void removeElement(java.lang.String name,int index) {
        name = unmakeSubstitution(name, index);
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        switch (i)
        {
            case 0:
                setID(null);
                return;
            case 9:
                setPo_number(null);
                return;
            case 11:
                setPurchase_date(null);
                return;
            case 14:
                setShipping_date(null);
                return;
            case 5:
                setDelivery_time_slot(null);
                return;
            case 3:
                setCustomer_name(null);
                return;
            case 1:
                setAddress(null);
                return;
            case 13:
                setShipper_name(null);
                return;
            case 7:
                setPer_ounce_rate(null);
                return;
            case 4:
                setDay_of_week(null);
                return;
            case 6:
                setLine_item_description(null);
                return;
            case 8:
                setPer_unit_ounces(null);
                return;
            case 10:
                setPrice(0);
                this.ispriceSet = false;
                return;
            case 12:
                setQuantity(0);
                this.isquantitySet = false;
                return;
            case 2:
                setCurrency(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of address (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    /**
     * [Virtual Element] Sets the value of currency (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCurrency(java.lang.String value) {
        this.currency = value;
    }

    /**
     * [Virtual Element] Sets the value of customer_name (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCustomer_name(java.lang.String value) {
        this.customer_name = value;
    }

    /**
     * [Virtual Element] Sets the value of day_of_week (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDay_of_week(java.lang.String value) {
        this.day_of_week = value;
    }

    /**
     * [Virtual Element] Sets the value of delivery_time_slot
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDelivery_time_slot(java.sql.Time value) {
        this.delivery_time_slot = value;
    }

    /**
     * Sets <code>value</code> as an element called
     * <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in
     * {@link #getElement}.
     * 
     * @param name
     * @param value
     * @param index
     */
    public void setElement(java.lang.String name,int index,java.lang.Object value) {
        name = makeSubstitution(name, index);
        int i = (Arrays.binarySearch(NATIVE_ELEMENTS, name));
        switch (i)
        {
            case 0:
                setID((java.lang.String) value);
                return;
            case 9:
                setPo_number((java.lang.String) value);
                return;
            case 11:
                setPurchase_date((java.sql.Timestamp) value);
                return;
            case 14:
                setShipping_date((java.sql.Date) value);
                return;
            case 5:
                setDelivery_time_slot((java.sql.Time) value);
                return;
            case 3:
                setCustomer_name((java.lang.String) value);
                return;
            case 1:
                setAddress((java.lang.String) value);
                return;
            case 13:
                setShipper_name((java.lang.String) value);
                return;
            case 7:
                setPer_ounce_rate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 4:
                setDay_of_week((java.lang.String) value);
                return;
            case 6:
                setLine_item_description((java.lang.String) value);
                return;
            case 8:
                setPer_unit_ounces(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 10:
                setPrice(biz.c24.io.api.Utils.doubleValue(value));
                return;
            case 12:
                setQuantity(biz.c24.io.api.Utils.intValue(value));
                return;
            case 2:
                setCurrency((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of ID (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setID(java.lang.String value) {
        this.iD = value;
    }

    /**
     * [Virtual Element] Sets the value of line_item_description
     * (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setLine_item_description(java.lang.String value) {
        this.line_item_description = value;
    }

    /**
     * [Virtual Element] Sets the value of per_ounce_rate (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPer_ounce_rate(java.math.BigDecimal value) {
        this.per_ounce_rate = value;
    }

    /**
     * [Virtual Element] Sets the value of per_unit_ounces (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPer_unit_ounces(java.math.BigDecimal value) {
        this.per_unit_ounces = value;
    }

    /**
     * [Virtual Element] Sets the value of po_number (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPo_number(java.lang.String value) {
        this.po_number = value;
    }

    /**
     * [Virtual Element] Sets the value of price (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrice(double value) {
        this.price = value;
        this.ispriceSet = true;
    }

    /**
     * [Virtual Element] Sets the value of purchase_date (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurchase_date(java.sql.Timestamp value) {
        this.purchase_date = value;
    }

    /**
     * [Virtual Element] Sets the value of quantity (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setQuantity(int value) {
        this.quantity = value;
        this.isquantitySet = true;
    }

    /**
     * [Virtual Element] Sets the value of shipper_name (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setShipper_name(java.lang.String value) {
        this.shipper_name = value;
    }

    /**
     * [Virtual Element] Sets the value of shipping_date (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setShipping_date(java.sql.Date value) {
        this.shipping_date = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.iD);
        out.writeObject(this.po_number);
        out.writeObject(this.purchase_date);
        out.writeObject(this.shipping_date);
        out.writeObject(this.delivery_time_slot);
        out.writeObject(this.customer_name);
        out.writeObject(this.address);
        out.writeObject(this.shipper_name);
        out.writeObject(this.per_ounce_rate);
        out.writeObject(this.day_of_week);
        out.writeObject(this.line_item_description);
        out.writeObject(this.per_unit_ounces);
        out.writeBoolean(this.ispriceSet);
        if (this.ispriceSet)
            out.writeDouble(this.price);
        out.writeBoolean(this.isquantitySet);
        if (this.isquantitySet)
            out.writeInt(this.quantity);
        out.writeObject(this.currency);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.iD = (java.lang.String) in.readObject();
        this.po_number = (java.lang.String) in.readObject();
        this.purchase_date = (java.sql.Timestamp) in.readObject();
        this.shipping_date = (java.sql.Date) in.readObject();
        this.delivery_time_slot = (java.sql.Time) in.readObject();
        this.customer_name = (java.lang.String) in.readObject();
        this.address = (java.lang.String) in.readObject();
        this.shipper_name = (java.lang.String) in.readObject();
        this.per_ounce_rate = (java.math.BigDecimal) in.readObject();
        this.day_of_week = (java.lang.String) in.readObject();
        this.line_item_description = (java.lang.String) in.readObject();
        this.per_unit_ounces = (java.math.BigDecimal) in.readObject();
        this.ispriceSet = in.readBoolean();
        if (this.ispriceSet)
            this.price = in.readDouble();
        this.isquantitySet = in.readBoolean();
        if (this.isquantitySet)
            this.quantity = in.readInt();
        this.currency = (java.lang.String) in.readObject();
    }

}
