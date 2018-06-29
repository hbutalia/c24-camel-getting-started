/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * line_item. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>description</b> of type {@link java.lang.String} (1)</li>
 * <li><b>per_unit_ounces</b> of type {@link java.math.BigDecimal}
 * (1)</li>
 * <li><b>price</b> of type <code>double</code> (1)</li>
 * <li><b>quantity</b> of type <code>int</code> (1)</li>
 * <li><b>currency</b> of type {@link java.lang.String} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType
 */
public class Line_item extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"currency", "description", "per_unit_ounces", "price", "quantity"};

    /**
     * Field description.
     */
    private java.lang.String description;

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

    public Line_item() {
        this(biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.getInstance().getNullDefiningElementDecl());
    }

    public Line_item(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Line_item(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Line_item(biz.c24.io.gettingstarted.purchaseorder.Line_item clone) {
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
            case 1:
                setDescription((java.lang.String) value);
                return;
            case 2:
                setPer_unit_ounces(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 3:
                setPrice(biz.c24.io.api.Utils.doubleValue(value));
                return;
            case 4:
                setQuantity(biz.c24.io.api.Utils.intValue(value));
                return;
            case 0:
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
        return new biz.c24.io.gettingstarted.purchaseorder.Line_item(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.purchaseorder.Line_item(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.purchaseorder.Line_item obj = (biz.c24.io.gettingstarted.purchaseorder.Line_item) clone;
        obj.description = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.description, obj, "description");
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
     * Gets the value of currency (1).
     * 
     * @return The value.
     */
    public java.lang.String getCurrency() {
        return this.currency;
    }

    /**
     */
    public biz.c24.io.gettingstarted.purchaseorder.CurrencyCodeJavaEnum getCurrencyEnum() {
        return this.currency == null ? null : biz.c24.io.gettingstarted.purchaseorder.CurrencyCodeJavaEnum.valueOf(currency.toString().toUpperCase());
    }

    /**
     * Gets the value of description (1).
     * 
     * @return The value.
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>description, per_unit_ounces, price, quantity,
     * currency</b>.
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
            case 1:
                return getDescription();
            case 2:
                return getPer_unit_ounces();
            case 3:
                return getPrice();
            case 4:
                return getQuantity();
            case 0:
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
            case 1:
                return this.description == null ? 0 : 1;
            case 2:
                return this.per_unit_ounces == null ? 0 : 1;
            case 3:
                return this.ispriceSet ? 1 : 0;
            case 4:
                return this.isquantitySet ? 1 : 0;
            case 0:
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
            case 1:
                return this.description != null && this.description.equals(element) ? 0 : -1;
            case 2:
                return this.per_unit_ounces != null && this.per_unit_ounces.equals(element) ? 0 : -1;
            case 3:
                return this.ispriceSet ? (this.price == biz.c24.io.api.Utils.doubleValue(element) ? 0 : -1) : -1;
            case 4:
                return this.isquantitySet ? (this.quantity == biz.c24.io.api.Utils.intValue(element) ? 0 : -1) : -1;
            case 0:
                return this.currency != null && this.currency.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of per_unit_ounces (1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getPer_unit_ounces() {
        return this.per_unit_ounces;
    }

    /**
     * Gets the value of price (1).
     * 
     * @return The value.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Gets the value of quantity (1).
     * 
     * @return The value.
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>description, per_unit_ounces, price, quantity,
     * currency</b>.
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
            case 1:
                return this.description;
            case 2:
                return this.per_unit_ounces;
            case 3:
                return this.price;
            case 4:
                return this.quantity;
            case 0:
                return this.currency;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.description == null ? 0 : 1;
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
        result = 31 * result + hashCodeOf(description);
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
            case 1:
                setDescription(null);
                return;
            case 2:
                setPer_unit_ounces(null);
                return;
            case 3:
                setPrice(0);
                this.ispriceSet = false;
                return;
            case 4:
                setQuantity(0);
                this.isquantitySet = false;
                return;
            case 0:
                setCurrency(null);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of currency (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setCurrency(java.lang.String value) {
        this.currency = value;
    }

    /**
     * 
     * 
     * @param value
     */
    public void setCurrencyEnum(biz.c24.io.gettingstarted.purchaseorder.CurrencyCodeJavaEnum value) {
        setCurrency(value == null ? null : value.getValue());
    }

    /**
     * [Virtual Element] Sets the value of description (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDescription(java.lang.String value) {
        this.description = value;
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
            case 1:
                setDescription((java.lang.String) value);
                return;
            case 2:
                setPer_unit_ounces(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 3:
                setPrice(biz.c24.io.api.Utils.doubleValue(value));
                return;
            case 4:
                setQuantity(biz.c24.io.api.Utils.intValue(value));
                return;
            case 0:
                setCurrency((java.lang.String) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of per_unit_ounces (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPer_unit_ounces(java.math.BigDecimal value) {
        this.per_unit_ounces = value;
    }

    /**
     * [Virtual Element] Sets the value of price (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPrice(double value) {
        this.price = value;
        this.ispriceSet = true;
    }

    /**
     * [Virtual Element] Sets the value of quantity (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setQuantity(int value) {
        this.quantity = value;
        this.isquantitySet = true;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.description);
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
        this.description = (java.lang.String) in.readObject();
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
