/*
 * $Id$
 */

package biz.c24.io.gettingstarted.purchaseorder;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Arrays;

/**
 * shipper. <p/>
 * 
 * This object is composed of the following <i>elements</i>:
 * <ul>
 * <li><b>name</b> of type {@link java.lang.String} (1)</li>
 * <li><b>per_ounce_rate</b> of type {@link java.math.BigDecimal}
 * (1)</li>
 * <li><b>day_of_week</b> of type {@link java.lang.String}
 * (0..*)</li>
 * </ul>
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see biz.c24.io.gettingstarted.purchaseorder.ShipperDataType
 */
public class Shipper extends biz.c24.io.api.data.ComplexDataObject {

    /**
     * Field serialVersionUID.
     */
    private static final long serialVersionUID = 18L;

    /**
     * Field NATIVE_ELEMENTS.
     */
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"day_of_week", "name", "per_ounce_rate"};

    /**
     * Field name.
     */
    private java.lang.String name;

    /**
     * Field per_ounce_rate.
     */
    private java.math.BigDecimal per_ounce_rate;

    /**
     * Field day_of_week.
     */
    private java.util.List<java.lang.String> day_of_week;

    public Shipper() {
        this(biz.c24.io.gettingstarted.purchaseorder.ShipperDataType.getInstance().getNullDefiningElementDecl());
    }

    public Shipper(biz.c24.io.api.data.Element definingElementDecl) {
        super(definingElementDecl);
    }

    public Shipper(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type) {
        super(definingElementDecl, type);
    }

    public Shipper(biz.c24.io.gettingstarted.purchaseorder.Shipper clone) {
        super(clone);
    }

    /**
     * Adds a day_of_week (0..*).
     * 
     * @param value
     * @param value The new day_of_week.
     */
    public void addDay_of_week(java.lang.String value) {
         if(this.day_of_week == null) { 
            this.day_of_week = new java.util.ArrayList<java.lang.String>();
        }
        this.day_of_week.add(value);
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
                setNameElement((java.lang.String) value);
                return;
            case 2:
                setPer_ounce_rate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                addDay_of_week((java.lang.String) value);
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
        return new biz.c24.io.gettingstarted.purchaseorder.Shipper(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * 
     * @return The new object.
     * @see #clone()
     */
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.io.gettingstarted.purchaseorder.Shipper(this);
        cloneDeep(obj);
        return obj;
    }

    /**
     * 
     * 
     * @param clone
     */
    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException {
        biz.c24.io.gettingstarted.purchaseorder.Shipper obj = (biz.c24.io.gettingstarted.purchaseorder.Shipper) clone;
        obj.name = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.name, obj, "name");
        obj.per_ounce_rate = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.per_ounce_rate, obj, "per_ounce_rate");
        obj.day_of_week = (java.util.List<java.lang.String>) biz.c24.io.api.Utils.cloneDeep(this.day_of_week, obj, "day_of_week");
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
     * Gets the value of day_of_week (0..*).
     * 
     * @return The value.
     */
    public java.util.List<java.lang.String> getDay_of_week() {
        if (this.day_of_week == null)
            return new java.util.ArrayList<java.lang.String>();
        else
            return this.day_of_week;
    }

    /**
     * Gets the value of day_of_week by ordinal position in the
     * collection.
     * 
     * @param ordinal
     */
    public java.lang.String getDay_of_week(int ordinal) {
        if (this.day_of_week == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.day_of_week.get(ordinal);
    }

    /**
     */
    public java.util.List<biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum> getDay_of_weekEnum() {
        java.util.List<biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum> enumList = new java.util.ArrayList<biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum>();
        if(day_of_week != null) {
            for(String value: day_of_week) {
                enumList.add(biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum.valueOf(value.toString().toUpperCase()));
            }
        }
        return enumList;
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * 
     * @param value
     * @param value The day_of_week to get the index of.
     * @return The index.
     */
    public int getDay_of_weekIndex(java.lang.String value) {
        if (this.day_of_week == null)
            return -1;
        for (int i=0; i<this.day_of_week.size(); i++)
            if (this.day_of_week.get(i) == value)
                return i;
        return -1;
    }

    /**
     * Returns the element called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>name,
     * per_ounce_rate, day_of_week</b>.
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
                return getNameElement();
            case 2:
                return getPer_ounce_rate();
            case 0:
            if (this.day_of_week == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.day_of_week.get(index);
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
                return this.name == null ? 0 : 1;
            case 2:
                return this.per_ounce_rate == null ? 0 : 1;
            case 0:
                return this.day_of_week == null ? 0 : this.day_of_week.size();
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
                return this.name != null && this.name.equals(element) ? 0 : -1;
            case 2:
                return this.per_ounce_rate != null && this.per_ounce_rate.equals(element) ? 0 : -1;
            case 0:
                return getDay_of_weekIndex((java.lang.String) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of name (1).
     * 
     * @return The value.
     */
    public java.lang.String getNameElement() {
        return this.name;
    }

    /**
     * Gets the value of per_ounce_rate (1).
     * 
     * @return The value.
     */
    public java.math.BigDecimal getPer_ounce_rate() {
        return this.per_ounce_rate;
    }

    /**
     * Returns the raw element data called <code>name</code> at
     * <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>name,
     * per_ounce_rate, day_of_week</b>.
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
                return this.name;
            case 2:
                return this.per_ounce_rate;
            case 0:
            if (this.day_of_week == null)
                throw new java.lang.IndexOutOfBoundsException();
            else
                return this.day_of_week.get(index);
            default:
                return super.getElement(name, index);
        }
    }

    /**
     */
    public int getTotalElementCount() {
        int count = 0;
        count += this.name == null ? 0 : 1;
        count += this.per_ounce_rate == null ? 0 : 1;
        count += this.day_of_week == null ? 0 : this.day_of_week.size();
        return count;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + hashCodeOf(serialVersionUID);
        result = 31 * result + hashCodeOf(NATIVE_ELEMENTS);
        result = 31 * result + hashCodeOf(name);
        result = 31 * result + hashCodeOf(per_ounce_rate);
        result = 31 * result + hashCodeOf(day_of_week);
        return result;
    }

    /**
     * Removes a day_of_week (0..*).
     * 
     * @param index
     * @param index The index of the day_of_week to get.
     */
    public void removeDay_of_week(int index) {
        if (this.day_of_week == null || index > this.day_of_week.size() - 1) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.day_of_week.remove(index);
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
                setNameElement(null);
                return;
            case 2:
                setPer_ounce_rate(null);
                return;
            case 0:
                removeDay_of_week(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * [Virtual Element] Sets the value of day_of_week (0..*).
     * 
     * @param value
     * @param value The new value.
     */
    public void setDay_of_week(java.util.List value) {
        biz.c24.io.api.Utils.clearNulls(value);
        this.day_of_week = value;
    }

    /**
     * 
     * 
     * @param values
     */
    public void setDay_of_weekEnum(java.util.List values) {
        java.util.List<java.lang.String> valueList = new java.util.ArrayList<java.lang.String>();
        if(values != null) {
            for(biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum enumValue : (java.util.List<biz.c24.io.gettingstarted.purchaseorder.DayOfWeekJavaEnum>) values) {
                valueList.add(enumValue.getValue());
            }
        }
        this.day_of_week = valueList;
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
                setNameElement((java.lang.String) value);
                return;
            case 2:
                setPer_ounce_rate(biz.c24.io.api.Utils.decimalValue(value));
                return;
            case 0:
                if (value != null && value instanceof java.util.List) {
                    setDay_of_week((java.util.List<java.lang.String>)value);
                } else if (this.day_of_week == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                } else if (value == null) {
                    removeElement(name, index);
                } else {
                    this.day_of_week.set(index, (java.lang.String) value);
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * [Virtual Element] Sets the value of name (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setNameElement(java.lang.String value) {
        this.name = value;
    }

    /**
     * [Virtual Element] Sets the value of per_ounce_rate (1).
     * 
     * @param value
     * @param value The new value.
     */
    public void setPer_ounce_rate(java.math.BigDecimal value) {
        this.per_ounce_rate = value;
    }

    /**
     * 
     * 
     * @param out
     */
    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeObject(this.name);
        out.writeObject(this.per_ounce_rate);
        out.writeObject(this.day_of_week);
    }

    /**
     * 
     * 
     * @param in
     */
    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
        this.name = (java.lang.String) in.readObject();
        this.per_ounce_rate = (java.math.BigDecimal) in.readObject();
        this.day_of_week = (java.util.List<java.lang.String>) in.readObject();
    }

}
