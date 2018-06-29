/*
 * $Id$
 */

package nonamespace;

/**
 * Class PurchaseOrderToFlatOrderTransform.
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class PurchaseOrderToFlatOrderTransform extends biz.c24.io.api.transform.java8.Transform {

    /**
     * Field SINGLEPORECORD.
     */
    public final nonamespace.PurchaseOrderToFlatOrderTransform.A0 SINGLEPORECORD = new nonamespace.PurchaseOrderToFlatOrderTransform.A0();

    {
        register(SINGLEPORECORD);
    }

    public PurchaseOrderToFlatOrderTransform() {
        super(new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.OrdersDataType.getInstance()});
    }

    public PurchaseOrderToFlatOrderTransform(biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements) {
        super(new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.OrdersDataType.getInstance()}, inputElements, outputElements);
    }

    protected PurchaseOrderToFlatOrderTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes) {
        super(inputTypes, outputTypes);
    }

    protected PurchaseOrderToFlatOrderTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes, biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements) {
        super(inputTypes, outputTypes, inputElements, outputElements);
    }

    public java.lang.String getName() {
        return "PurchaseOrderToFlatOrder.tfd";
    }

    public java.lang.Object[][] transform(final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException {
        return transform((TransformContext)null, inArr);
    }

    public java.lang.Object[][] transform(biz.c24.io.api.transform.Map.TransformContext context,final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException {
        checkRequiredInputs(inArr);
        java.lang.Object[][] outArr = transform(context, inArr, init(inArr));
        checkRequiredOutputs(outArr);
        return outArr;
    }

    protected java.lang.Object[][] transform(biz.c24.io.api.transform.Map.TransformContext context,java.lang.Object[][] inArr,java.lang.Object[][] outArr) throws biz.c24.io.api.data.ValidationException {
        java.lang.Object purchaseOrderToFlatOrderTransform_in0_line_items = resolveElement(inArr[0],"line_items",false);
        java.lang.Object purchaseOrderToFlatOrderTransform_out0_Orders_Content = transform(context, "OrdersO00000" ,SINGLEPORECORD, new java.lang.Object[] {inArr[0], purchaseOrderToFlatOrderTransform_in0_line_items}, 0, null);
        if(purchaseOrderToFlatOrderTransform_out0_Orders_Content != null){
            initElement(context, outArr[0], "Orders", purchaseOrderToFlatOrderTransform_out0_Orders_Content);
        }
        return outArr;
    }

    public biz.c24.io.gettingstarted.Orders transform(final biz.c24.io.gettingstarted.purchaseorder.Purchase_order input1) throws biz.c24.io.api.data.ValidationException {
        return transform((TransformContext)null, input1);
    }

    public biz.c24.io.gettingstarted.Orders transform(biz.c24.io.api.transform.Map.TransformContext context,final biz.c24.io.gettingstarted.purchaseorder.Purchase_order input1) throws biz.c24.io.api.data.ValidationException {
        java.lang.Object[][] outArr = transform(context, new java.lang.Object[][]{{input1}});
        return (biz.c24.io.gettingstarted.Orders) (outArr.length > 0 && outArr[0].length > 0 ? outArr[0][0] : null);
    }

    /**
     * Class A0.
     * <br><strong>Produced by C24 Integration Objects
     * (http://www.c24tech.com)</br>
     * 
     * 
     * @author C24 Integration Objects;
     * @version $Revision$ $Date$
     */
    public class A0 extends biz.c24.io.api.transform.java8.Transform {

        public A0() {
            super(new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.getInstance(), biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.OrderDataType.getInstance()});
        }

        public A0(biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements) {
            super(new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.purchaseorder.Purchase_orderDataType.getInstance(), biz.c24.io.gettingstarted.purchaseorder.Line_itemDataType.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.io.gettingstarted.OrderDataType.getInstance()}, inputElements, outputElements);
        }

        protected A0(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes) {
            super(inputTypes, outputTypes);
        }

        protected A0(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes, biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements) {
            super(inputTypes, outputTypes, inputElements, outputElements);
        }

        public java.lang.String getName() {
            return "SinglePORecord";
        }

        public java.lang.Object[][] transform(final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException {
            return transform((TransformContext)null, inArr);
        }

        public java.lang.Object[][] transform(biz.c24.io.api.transform.Map.TransformContext context,final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException {
            checkRequiredInputs(inArr);
            java.lang.Object[][] outArr = transform(context, inArr, init(inArr));
            checkRequiredOutputs(outArr);
            return outArr;
        }

        protected java.lang.Object[][] transform(biz.c24.io.api.transform.Map.TransformContext context,java.lang.Object[][] inArr,java.lang.Object[][] outArr) throws biz.c24.io.api.data.ValidationException {
            java.lang.Object a0_in0_delivery_time_slot = resolveElement(inArr[0],"delivery_time_slot",false);
            java.lang.Object a0_in0_purchase_date = resolveElement(inArr[0],"purchase_date",false);
            java.lang.Object a0_in0_shipping_date = resolveElement(inArr[0],"shipping_date",false);
            java.lang.Object a0_in0_customer = resolveElement(inArr[0],"customer",false);
            java.lang.Object a0_in0_customer_address = resolveElement(a0_in0_customer,"address",false);
            java.lang.Object a0_in1_currency = resolveElement(inArr[1],"currency",false);
            java.lang.Object a0_in0_customer_name = resolveElement(a0_in0_customer,"name",false);
            java.lang.Object a0_in0_shipper = resolveElement(inArr[0],"shipper",false);
            java.lang.Object a0_in0_shipper_day_of_week = resolveElement(a0_in0_shipper,"day_of_week",false);
            java.lang.Object a0_in1_description = resolveElement(inArr[1],"description",false);
            java.lang.Object a0_in0_shipper_per_ounce_rate = resolveElement(a0_in0_shipper,"per_ounce_rate",false);
            java.lang.Object a0_in1_per_unit_ounces = resolveElement(inArr[1],"per_unit_ounces",false);
            java.lang.Object a0_in0_po_number = resolveElement(inArr[0],"po_number",false);
            java.lang.Object a0_in1_price = resolveElement(inArr[1],"price",false);
            java.lang.Object a0_in1_quantity = resolveElement(inArr[1],"quantity",false);
            java.lang.Object a0_in0_shipper_name = resolveElement(a0_in0_shipper,"name",false);
            java.lang.Object a0_out0_ID_Content = generateId(new java.lang.Object[] {});
            java.lang.Object a0_out0_po_number_Content = a0_in0_po_number;
            java.lang.Object a0_out0_purchase_date_Content = CONVERTDATE.f(context,"purchasedateO00000", a0_in0_purchase_date, biz.c24.io.api.data.SQLTimestampDataType.getInstance());
            java.lang.Object a0_out0_shipping_date_Content = CONVERTDATE.f(context,"shippingdateO00000", a0_in0_shipping_date, biz.c24.io.api.data.SQLDateDataType.getInstance());
            java.lang.Object a0_out0_delivery_time_slot_Content = CONVERTDATE.f(context,"deliverytimeslotO00000", a0_in0_delivery_time_slot, biz.c24.io.api.data.SQLTimeDataType.getInstance());
            java.lang.Object a0_out0_customer_name_Content = a0_in0_customer_name;
            java.lang.Object a0_out0_address_Content = a0_in0_customer_address;
            java.lang.Object a0_out0_shipper_name_Content = a0_in0_shipper_name;
            java.lang.Object a0_out0_per_ounce_rate_Content = a0_in0_shipper_per_ounce_rate;
            java.lang.Object a0_out0_day_of_week_Content = a0_in0_shipper_day_of_week;
            java.lang.Object a0_out0_line_item_description_Content = a0_in1_description;
            java.lang.Object a0_out0_per_unit_ounces_Content = a0_in1_per_unit_ounces;
            java.lang.Object a0_out0_price_Content = a0_in1_price;
            java.lang.Object a0_out0_quantity_Content = a0_in1_quantity;
            java.lang.Object a0_out0_currency_Content = a0_in1_currency;
            if(a0_out0_ID_Content != null || a0_out0_po_number_Content != null || a0_out0_purchase_date_Content != null || a0_out0_shipping_date_Content != null || a0_out0_delivery_time_slot_Content != null || a0_out0_customer_name_Content != null || a0_out0_address_Content != null || a0_out0_shipper_name_Content != null || a0_out0_per_ounce_rate_Content != null || a0_out0_day_of_week_Content != null || a0_out0_line_item_description_Content != null || a0_out0_per_unit_ounces_Content != null || a0_out0_price_Content != null || a0_out0_quantity_Content != null || a0_out0_currency_Content != null){
                initElement(context, outArr[0], "ID", a0_out0_ID_Content);
                initElement(context, outArr[0], "po_number", a0_out0_po_number_Content);
                initElement(context, outArr[0], "purchase_date", a0_out0_purchase_date_Content);
                initElement(context, outArr[0], "shipping_date", a0_out0_shipping_date_Content);
                initElement(context, outArr[0], "delivery_time_slot", a0_out0_delivery_time_slot_Content);
                initElement(context, outArr[0], "customer_name", a0_out0_customer_name_Content);
                initElement(context, outArr[0], "address", a0_out0_address_Content);
                initElement(context, outArr[0], "shipper_name", a0_out0_shipper_name_Content);
                initElement(context, outArr[0], "per_ounce_rate", a0_out0_per_ounce_rate_Content);
                initElement(context, outArr[0], "day_of_week", a0_out0_day_of_week_Content);
                initElement(context, outArr[0], "line_item_description", a0_out0_line_item_description_Content);
                initElement(context, outArr[0], "per_unit_ounces", a0_out0_per_unit_ounces_Content);
                initElement(context, outArr[0], "price", a0_out0_price_Content);
                initElement(context, outArr[0], "quantity", a0_out0_quantity_Content);
                initElement(context, outArr[0], "currency", a0_out0_currency_Content);
            }
            return outArr;
        }

        private java.lang.String _generateId() {
                return java.util.UUID.randomUUID().toString();
        }

        public java.lang.Object generateId(java.lang.Object[] args) {
            java.util.List in = combinations(args);
            java.util.List out = new java.util.LinkedList();
            for (java.util.Iterator it = in.iterator(); it.hasNext(); )
            {
                java.util.List list = (java.util.List) it.next();
                try
                {
                    out.add(_generateId());
                }
                catch (Throwable t)
                {
                    if (getLog().isEnabledFor(org.apache.log4j.Level.WARN)) getLog().warn(new biz.c24.io.api.LogEntry("JAVAMETHOD 'generateId()'- exception: "+t.getMessage()));
                        throw new biz.c24.io.api.transform.JavaFunctionCodeException("Java code of JAVAMETHOD 'generateId()' throws the exception", t);
                }
            }
            if (out.size() == 1)
                return out.get(0);
            else if (out.size() == 0)
                return null;
            else
                return out;
        }

    }

}
