/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * purchase_orders. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>purchase_orders</b> of type {@link
 * biz.c24.io.gettingstarted.purchaseorder.Purchase_order}
 * (1..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * biz.c24.io.gettingstarted.purchaseorder.Purchase_ordersDataType
 */
public class Purchase_orders extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"purchase_orders"};

    /**
     * Field purchase_orders.
     */
    private java.util.List<biz.c24.io.gettingstarted.purchaseorder.Purchase_order> purchase_orders;

    public Purchase_orders() {
        this(biz.c24.io.gettingstarted.purchaseorder.Purchase_ordersDataType.getInstance().getNullDefiningElementDecl());
    }

    public Purchase_orders(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Purchase_orders(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Purchase_orders(biz.c24.io.gettingstarted.purchaseorder.Purchase_orders clone) {
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
                addPurchase_orders((biz.c24.io.gettingstarted.purchaseorder.Purchase_order) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a purchase_orders (1..*).
     * 
     * @param value
     * @param value The new purchase_orders.
     */
    public void addPurchase_orders(biz.c24.io.gettingstarted.purchaseorder.Purchase_order value) {
         if(this.purchase_orders == null) { 
            this.purchase_orders = new java.util.ArrayList<biz.c24.io.gettingstarted.purchaseorder.Purchase_order>();
        }
        this.purchase_orders.add(value);
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "purchase_orders");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new biz.c24.io.gettingstarted.purchaseorder.Purchase_orders(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.purchaseorder.Purchase_orders(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.purchaseorder.Purchase_orders obj = (biz.c24.io.gettingstarted.purchaseorder.Purchase_orders) clone;
        obj.purchase_orders = (java.util.List<biz.c24.io.gettingstarted.purchaseorder.Purchase_order>) biz.c24.io.api.Utils.cloneDeep(this.purchase_orders, obj, "purchase_orders");
    }

    /**
     * Creates, adds and returns a new purchase_orders (1..*).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Purchase_order createPurchase_orders() {
        biz.c24.io.gettingstarted.purchaseorder.Purchase_order obj = (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) getElementDecl("purchase_orders").createObject();
        addPurchase_orders(obj);
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
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>purchase_orders</b>.
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
            if (this.purchase_orders == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.purchase_orders.get(index);
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
                return this.purchase_orders == null ? 0 : this.purchase_orders.size();
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
                return getPurchase_ordersIndex((biz.c24.io.gettingstarted.purchaseorder.Purchase_order) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of purchase_orders (1..*).
     * 
     * @return The value.
     */
    public java.util.List<biz.c24.io.gettingstarted.purchaseorder.Purchase_order> getPurchase_orders() {
        if (this.purchase_orders == null)
            return new java.util.ArrayList<biz.c24.io.gettingstarted.purchaseorder.Purchase_order>();
        else
            return this.purchase_orders;
    }

    /**
     * Gets the value of purchase_orders by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public biz.c24.io.gettingstarted.purchaseorder.Purchase_order getPurchase_orders(int ordinal) {
        if (this.purchase_orders == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.purchase_orders.get(ordinal);
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * 
     * @param value
     * @param value The purchase_orders to get the index of.
     * @return The index.
     */
    public int getPurchase_ordersIndex(biz.c24.io.gettingstarted.purchaseorder.Purchase_order value) {
        if (this.purchase_orders == null)
            return -1;
        for (int i=0; i<this.purchase_orders.size(); i++)
            if (this.purchase_orders.get(i) == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>purchase_orders</b>.
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
            if (this.purchase_orders == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.purchase_orders.get(index);
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.purchase_orders == null ? 0 : this.purchase_orders.size();
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(purchase_orders);
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
            case 0:
                removePurchase_orders(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a purchase_orders (1..*).
     * 
     * @param index
     * @param index The index of the purchase_orders to get.
     */
    public void removePurchase_orders(int index) {
        if (this.purchase_orders == null || index > this.purchase_orders.size() - 1) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.purchase_orders.remove(index);
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
                if (value != null && value instanceof java.util.List) {
                    setPurchase_orders((java.util.List<biz.c24.io.gettingstarted.purchaseorder.Purchase_order>)value);
                } else if (this.purchase_orders == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.purchase_orders.set(index, (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) value);
                    ((biz.c24.io.api.data.ComplexDataObject) this.purchase_orders.get(index)).setParent(this, "purchase_orders");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of purchase_orders (1..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurchase_orders(java.util.List value) {
        biz.c24.io.api.Utils.clearNulls(value);
        this.purchase_orders = value;
        for (int i=0; this.purchase_orders != null && i<this.purchase_orders.size(); i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.purchase_orders.get(i)).setParent(this, "purchase_orders");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.purchase_orders);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.purchase_orders = (java.util.List<biz.c24.io.gettingstarted.purchaseorder.Purchase_order>) in.readObject();
    }

}
