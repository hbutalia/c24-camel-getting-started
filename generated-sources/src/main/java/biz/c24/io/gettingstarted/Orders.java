/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Orders. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>Orders</b> of type {@link
 * biz.c24.io.gettingstarted.Order} (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.OrdersDataType
 */
public class Orders extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 4L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Orders"};

    /**
     * Field orders.
     */
    private java.util.List<biz.c24.io.gettingstarted.Order> orders;

    public Orders() {
        this(biz.c24.io.gettingstarted.OrdersDataType.getInstance().getNullDefiningElementDecl());
    }

    public Orders(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Orders(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Orders(biz.c24.io.gettingstarted.Orders clone) {
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
                addOrders((biz.c24.io.gettingstarted.Order) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Orders (0..*).
     * 
     * @param value
     * @param value The new Orders.
     */
    public void addOrders(biz.c24.io.gettingstarted.Order value) {
         if(this.orders == null) { 
            this.orders = new java.util.ArrayList<biz.c24.io.gettingstarted.Order>();
        }
        this.orders.add(value);
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Orders");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * 
     * @see #cloneDeep()
     */
    public java.lang.Object clone() {
        return new biz.c24.io.gettingstarted.Orders(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.Orders(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.Orders obj = (biz.c24.io.gettingstarted.Orders) clone;
        obj.orders = (java.util.List<biz.c24.io.gettingstarted.Order>) biz.c24.io.api.Utils.cloneDeep(this.orders, obj, "Orders");
    }

    /**
     * Creates, adds and returns a new Orders (0..*).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.Order createOrders() {
        biz.c24.io.gettingstarted.Order obj = (biz.c24.io.gettingstarted.Order) getElementDecl("Orders").createObject();
        addOrders(obj);
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
     * The legal value(s) for <code>name</code> are: <b>orders</b>.
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
            if (this.orders == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.orders.get(index);
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
                return this.orders == null ? 0 : this.orders.size();
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
                return getOrdersIndex((biz.c24.io.gettingstarted.Order) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Orders (0..*).
     * 
     * @return The value.
     */
    public java.util.List<biz.c24.io.gettingstarted.Order> getOrders() {
        if (this.orders == null)
            return new java.util.ArrayList<biz.c24.io.gettingstarted.Order>();
        else
            return this.orders;
    }

    /**
     * Gets the value of Orders by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public biz.c24.io.gettingstarted.Order getOrders(int ordinal) {
        if (this.orders == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.orders.get(ordinal);
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The Orders to get the index of.
     * @return The index.
     */
    public int getOrdersIndex(biz.c24.io.gettingstarted.Order value) {
        if (this.orders == null)
            return -1;
        for (int i=0; i<this.orders.size(); i++)
            if (this.orders.get(i) == value)
                return i;
        return -1;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>orders</b>.
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
            if (this.orders == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.orders.get(index);
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.orders == null ? 0 : this.orders.size();
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(orders);
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
                removeOrders(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Orders (0..*).
     * 
     * @param index
     * @param index The index of the Orders to get.
     */
    public void removeOrders(int index) {
        if (this.orders == null || index > this.orders.size() - 1) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.orders.remove(index);
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
                    setOrders((java.util.List<biz.c24.io.gettingstarted.Order>)value);
                } else if (this.orders == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.orders.set(index, (biz.c24.io.gettingstarted.Order) value);
                    ((biz.c24.io.api.data.ComplexDataObject) this.orders.get(index)).setParent(this, "Orders");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of Orders (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setOrders(java.util.List value) {
        biz.c24.io.api.Utils.clearNulls(value);
        this.orders = value;
        for (int i=0; this.orders != null && i<this.orders.size(); i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.orders.get(i)).setParent(this, "Orders");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.orders);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.orders = (java.util.List<biz.c24.io.gettingstarted.Order>) in.readObject();
    }

}
