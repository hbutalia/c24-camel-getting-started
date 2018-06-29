/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * purchase_order. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>po_number</b> of type {@link java.lang.String} (1)</li>
 * <li><b>purchase_date</b> of type {@link java.time.ZonedDateTime}
 * (1)</li>
 * <li><b>shipping_date</b> of type {@link java.time.LocalDate}
 * (1)</li>
 * <li><b>delivery_time_slot</b> of type {@link
 * java.time.LocalTime} (1)</li>
 * <li><b>customer</b> of type {@link
 * biz.c24.io.gettingstarted.purchaseorder.Customer} (1)</li>
 * <li><b>shipper</b> of type {@link
 * biz.c24.io.gettingstarted.purchaseorder.Shipper} (0..1)</li>
 * <li><b>line_items</b> of type {@link
 * biz.c24.io.gettingstarted.purchaseorder.Line_item} (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType
 */
public class Purchase_order extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"customer", "delivery_time_slot", "line_items", "po_number", "purchase_date", "shipper", "shipping_date"};

    /**
     * Field po_number.
     */
    private java.lang.String po_number;

    /**
     * Field purchase_date.
     */
    private java.time.ZonedDateTime purchase_date;

    /**
     * Field shipping_date.
     */
    private java.time.LocalDate shipping_date;

    /**
     * Field delivery_time_slot.
     */
    private java.time.LocalTime delivery_time_slot;

    /**
     * Field customer.
     */
    private biz.c24.io.gettingstarted.purchaseorder.Customer customer;

    /**
     * Field shipper.
     */
    private biz.c24.io.gettingstarted.purchaseorder.Shipper shipper;

    /**
     * Field line_items.
     */
    private java.util.List<biz.c24.io.gettingstarted.purchaseorder.Line_item> line_items;

    public Purchase_order() {
        this(biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.getInstance().getNullDefiningElementDecl());
    }

    public Purchase_order(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Purchase_order(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Purchase_order(biz.c24.io.gettingstarted.purchaseorder.Purchase_order clone) {
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
            case 3:
                setPo_number((java.lang.String) value);
                return;
            case 4:
                setPurchase_date((java.time.ZonedDateTime)(value));
                return;
            case 6:
                setShipping_date((java.time.LocalDate)(value));
                return;
            case 1:
                setDelivery_time_slot((java.time.LocalTime)(value));
                return;
            case 0:
                setCustomer((biz.c24.io.gettingstarted.purchaseorder.Customer) value);
                return;
            case 5:
                setShipper((biz.c24.io.gettingstarted.purchaseorder.Shipper) value);
                return;
            case 2:
                addLine_items((biz.c24.io.gettingstarted.purchaseorder.Line_item) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a line_items (0..*).
     * 
     * @param value
     * @param value The new line_items.
     */
    public void addLine_items(biz.c24.io.gettingstarted.purchaseorder.Line_item value) {
         if(this.line_items == null) { 
            this.line_items = new java.util.ArrayList<biz.c24.io.gettingstarted.purchaseorder.Line_item>();
        }
        this.line_items.add(value);
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "line_items");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new biz.c24.io.gettingstarted.purchaseorder.Purchase_order(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.purchaseorder.Purchase_order(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.purchaseorder.Purchase_order obj = (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) clone;
        obj.po_number = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.po_number, obj, "po_number");
        obj.purchase_date = (java.time.ZonedDateTime) biz.c24.io.api.Utils.cloneDeep(this.purchase_date, obj, "purchase_date");
        obj.shipping_date = (java.time.LocalDate) biz.c24.io.api.Utils.cloneDeep(this.shipping_date, obj, "shipping_date");
        obj.delivery_time_slot = (java.time.LocalTime) biz.c24.io.api.Utils.cloneDeep(this.delivery_time_slot, obj, "delivery_time_slot");
        obj.customer = (biz.c24.io.gettingstarted.purchaseorder.Customer) biz.c24.io.api.Utils.cloneDeep(this.customer, obj, "customer");
        obj.shipper = (biz.c24.io.gettingstarted.purchaseorder.Shipper) biz.c24.io.api.Utils.cloneDeep(this.shipper, obj, "shipper");
        obj.line_items = (java.util.List<biz.c24.io.gettingstarted.purchaseorder.Line_item>) biz.c24.io.api.Utils.cloneDeep(this.line_items, obj, "line_items");
    }

    /**
     * Creates, adds and returns a new customer (1).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Customer createCustomer() {
        biz.c24.io.gettingstarted.purchaseorder.Customer obj = (biz.c24.io.gettingstarted.purchaseorder.Customer) getElementDecl("customer").createObject();
        setCustomer(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new line_items (0..*).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Line_item createLine_items() {
        biz.c24.io.gettingstarted.purchaseorder.Line_item obj = (biz.c24.io.gettingstarted.purchaseorder.Line_item) getElementDecl("line_items").createObject();
        addLine_items(obj);
        return obj;
    }

    /**
     * Creates, adds and returns a new shipper (0..1).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Shipper createShipper() {
        biz.c24.io.gettingstarted.purchaseorder.Shipper obj = (biz.c24.io.gettingstarted.purchaseorder.Shipper) getElementDecl("shipper").createObject();
        setShipper(obj);
        return obj;
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
     * Gets the value of customer (1).
     * 
     * @return The value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Customer getCustomer() {
        return this.customer;
    }

    /**
     * Gets the value of delivery_time_slot (1).
     * 
     * @return The value.
     */
    public java.time.LocalTime getDelivery_time_slot() {
        return this.delivery_time_slot;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>po_number,
     * purchase_date, shipping_date, delivery_time_slot, customer,
     * shipper, line_items</b>.
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
            case 3:
                return getPo_number();
            case 4:
                return getPurchase_date();
            case 6:
                return getShipping_date();
            case 1:
                return getDelivery_time_slot();
            case 0:
                return getCustomer();
            case 5:
                return getShipper();
            case 2:
            if (this.line_items == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.line_items.get(index);
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
            case 3:
                return this.po_number == null ? 0 : 1;
            case 4:
                return this.purchase_date == null ? 0 : 1;
            case 6:
                return this.shipping_date == null ? 0 : 1;
            case 1:
                return this.delivery_time_slot == null ? 0 : 1;
            case 0:
                return this.customer == null ? 0 : 1;
            case 5:
                return this.shipper == null ? 0 : 1;
            case 2:
                return this.line_items == null ? 0 : this.line_items.size();
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
            case 3:
                return this.po_number != null && this.po_number.equals(element) ? 0 : -1;
            case 4:
                return this.purchase_date != null && this.purchase_date.equals(element) ? 0 : -1;
            case 6:
                return this.shipping_date != null && this.shipping_date.equals(element) ? 0 : -1;
            case 1:
                return this.delivery_time_slot != null && this.delivery_time_slot.equals(element) ? 0 : -1;
            case 0:
                return this.customer != null && this.customer.equals(element) ? 0 : -1;
            case 5:
                return this.shipper != null && this.shipper.equals(element) ? 0 : -1;
            case 2:
                return getLine_itemsIndex((biz.c24.io.gettingstarted.purchaseorder.Line_item) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of line_items (0..*).
     * 
     * @return The value.
     */
    public java.util.List<biz.c24.io.gettingstarted.purchaseorder.Line_item> getLine_items() {
        if (this.line_items == null)
            return new java.util.ArrayList<biz.c24.io.gettingstarted.purchaseorder.Line_item>();
        else
            return this.line_items;
    }

    /**
     * Gets the value of line_items by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public biz.c24.io.gettingstarted.purchaseorder.Line_item getLine_items(int ordinal) {
        if (this.line_items == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.line_items.get(ordinal);
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The line_items to get the index of.
     * @return The index.
     */
    public int getLine_itemsIndex(biz.c24.io.gettingstarted.purchaseorder.Line_item value) {
        if (this.line_items == null)
            return -1;
        for (int i=0; i<this.line_items.size(); i++)
            if (this.line_items.get(i) == value)
                return i;
        return -1;
    }

    /**
     * Gets the value of po_number (1).
     * 
     * @return The value.
     */
    public java.lang.String getPo_number() {
        return this.po_number;
    }

    /**
     * Gets the value of purchase_date (1).
     * 
     * @return The value.
     */
    public java.time.ZonedDateTime getPurchase_date() {
        return this.purchase_date;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>po_number,
     * purchase_date, shipping_date, delivery_time_slot, customer,
     * shipper, line_items</b>.
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
            case 3:
                return this.po_number;
            case 4:
                return this.purchase_date;
            case 6:
                return this.shipping_date;
            case 1:
                return this.delivery_time_slot;
            case 0:
                return this.customer;
            case 5:
                return this.shipper;
            case 2:
            if (this.line_items == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.line_items.get(index);
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Gets the value of shipper (0..1).
     * 
     * @return The value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Shipper getShipper() {
        return this.shipper;
    }

    /**
     * Gets the value of shipping_date (1).
     * 
     * @return The value.
     */
    public java.time.LocalDate getShipping_date() {
        return this.shipping_date;
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.po_number == null ? 0 : 1;
        count += this.purchase_date == null ? 0 : 1;
        count += this.shipping_date == null ? 0 : 1;
        count += this.delivery_time_slot == null ? 0 : 1;
        count += this.customer == null ? 0 : 1;
        count += this.shipper == null ? 0 : 1;
        count += this.line_items == null ? 0 : this.line_items.size();
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(po_number);
        result = 31 * result + hashCodeOf(purchase_date);
        result = 31 * result + hashCodeOf(shipping_date);
        result = 31 * result + hashCodeOf(delivery_time_slot);
        result = 31 * result + hashCodeOf(customer);
        result = 31 * result + hashCodeOf(shipper);
        result = 31 * result + hashCodeOf(line_items);
        return result;
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
            case 3:
                setPo_number(null);
                return;
            case 4:
                setPurchase_date(null);
                return;
            case 6:
                setShipping_date(null);
                return;
            case 1:
                setDelivery_time_slot(null);
                return;
            case 0:
                setCustomer(null);
                return;
            case 5:
                setShipper(null);
                return;
            case 2:
                removeLine_items(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a line_items (0..*).
     * 
     * @param index
     * @param index The index of the line_items to get.
     */
    public void removeLine_items(int index) {
        if (this.line_items == null || index > this.line_items.size() - 1) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.line_items.remove(index);
    }

    /**
     * [Virtual Element] Sets the value of customer (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCustomer(biz.c24.io.gettingstarted.purchaseorder.Customer value) {
        this.customer = value;
        if (this.customer != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.customer).setParent(this, "customer");
    }

    /**
     * [Virtual Element] Sets the value of delivery_time_slot (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDelivery_time_slot(java.time.LocalTime value) {
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
            case 3:
                setPo_number((java.lang.String) value);
                return;
            case 4:
                setPurchase_date((java.time.ZonedDateTime)(value));
                return;
            case 6:
                setShipping_date((java.time.LocalDate)(value));
                return;
            case 1:
                setDelivery_time_slot((java.time.LocalTime)(value));
                return;
            case 0:
                setCustomer((biz.c24.io.gettingstarted.purchaseorder.Customer) value);
                return;
            case 5:
                setShipper((biz.c24.io.gettingstarted.purchaseorder.Shipper) value);
                return;
            case 2:
                if (value != null && value instanceof java.util.List) {
                    setLine_items((java.util.List<biz.c24.io.gettingstarted.purchaseorder.Line_item>)value);
                } else if (this.line_items == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.line_items.set(index, (biz.c24.io.gettingstarted.purchaseorder.Line_item) value);
                    ((biz.c24.io.api.data.ComplexDataObject) this.line_items.get(index)).setParent(this, "line_items");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of line_items (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setLine_items(java.util.List value) {
        biz.c24.io.api.Utils.clearNulls(value);
        this.line_items = value;
        for (int i=0; this.line_items != null && i<this.line_items.size(); i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.line_items.get(i)).setParent(this, "line_items");
    }

    /**
     * [Virtual Element] Sets the value of po_number (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPo_number(java.lang.String value) {
        this.po_number = value;
    }

    /**
     * [Virtual Element] Sets the value of purchase_date (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurchase_date(java.time.ZonedDateTime value) {
        this.purchase_date = value;
    }

    /**
     * [Virtual Element] Sets the value of shipper (0..1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setShipper(biz.c24.io.gettingstarted.purchaseorder.Shipper value) {
        this.shipper = value;
        if (this.shipper != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.shipper).setParent(this, "shipper");
    }

    /**
     * [Virtual Element] Sets the value of shipping_date (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setShipping_date(java.time.LocalDate value) {
        this.shipping_date = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.po_number);
        out.writeObject(this.purchase_date);
        out.writeObject(this.shipping_date);
        out.writeObject(this.delivery_time_slot);
        out.writeObject(this.customer);
        out.writeObject(this.shipper);
        out.writeObject(this.line_items);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.po_number = (java.lang.String) in.readObject();
        this.purchase_date = (java.time.ZonedDateTime) in.readObject();
        this.shipping_date = (java.time.LocalDate) in.readObject();
        this.delivery_time_slot = (java.time.LocalTime) in.readObject();
        this.customer = (biz.c24.io.gettingstarted.purchaseorder.Customer) in.readObject();
        this.shipper = (biz.c24.io.gettingstarted.purchaseorder.Shipper) in.readObject();
        this.line_items = (java.util.List<biz.c24.io.gettingstarted.purchaseorder.Line_item>) in.readObject();
    }

}
