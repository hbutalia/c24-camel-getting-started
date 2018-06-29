/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * Document Root. <p/>
 * 
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>purchase_order</b> of type {@link
 * biz.c24.io.gettingstarted.purchaseorder.Purchase_order} (1)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement.PurchaseorderDocumentRootDataType
 */
public class PurchaseorderDocumentRoot extends biz.c24.io.api.data.DocumentRoot {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"purchase_order"};

    /**
     * Field purchase_order.
     */
    private biz.c24.io.gettingstarted.purchaseorder.Purchase_order purchase_order;

    public PurchaseorderDocumentRoot() {
        this(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRootElement.PurchaseorderDocumentRootDataType.getInstance().getNullDefiningElementDecl());
    }

    public PurchaseorderDocumentRoot(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public PurchaseorderDocumentRoot(biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot clone) {
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
                setPurchase_order((biz.c24.io.gettingstarted.purchaseorder.Purchase_order) value);
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
        return new biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot obj = (biz.c24.io.gettingstarted.purchaseorder.PurchaseorderDocumentRoot) clone;
        obj.purchase_order = (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) biz.c24.io.api.Utils.cloneDeep(this.purchase_order, obj, "purchase_order");
    }

    /**
     * Creates, adds and returns a new purchase_order (1).
     * 
     * @return The new value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Purchase_order createPurchase_order() {
        biz.c24.io.gettingstarted.purchaseorder.Purchase_order obj = (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) getElementDecl("purchase_order").createObject();
        setPurchase_order(obj);
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
     * <b>purchase_order</b>.
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
                return getPurchase_order();
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
                return this.purchase_order == null ? 0 : 1;
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
                return this.purchase_order != null && this.purchase_order.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of purchase_order (1).
     * 
     * @return The value.
     */
    public biz.c24.io.gettingstarted.purchaseorder.Purchase_order getPurchase_order() {
        return this.purchase_order;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are:
     * <b>purchase_order</b>.
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
                return this.purchase_order;
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.purchase_order == null ? 0 : 1;
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(purchase_order);
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
                setPurchase_order(null);
                return;
            default:
            super.removeElement(name, index);
        }
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
                setPurchase_order((biz.c24.io.gettingstarted.purchaseorder.Purchase_order) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of purchase_order (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPurchase_order(biz.c24.io.gettingstarted.purchaseorder.Purchase_order value) {
        this.purchase_order = value;
        if (this.purchase_order != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.purchase_order).setParent(this, "purchase_order");
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.purchase_order);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.purchase_order = (biz.c24.io.gettingstarted.purchaseorder.Purchase_order) in.readObject();
    }

}
