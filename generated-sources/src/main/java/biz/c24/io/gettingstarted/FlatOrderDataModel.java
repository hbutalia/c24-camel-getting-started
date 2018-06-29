/*
 * $Id$
 */

package biz.c24.io.gettingstarted;

/**
 * Class FlatOrderDataModel.The FlatOrder data model.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24tech.com)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class FlatOrderDataModel extends biz.c24.io.api.data.DataModel {

    /**
     * Field instance.
     */
    private static volatile FlatOrderDataModel instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected FlatOrderDataModel(boolean init) {
        if (init)
            init();
    }

    /**
     * Gets the singleton instance.
     * 
     * @return The instance.
     */
    public static biz.c24.io.gettingstarted.FlatOrderDataModel getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.io.gettingstarted.FlatOrderDataModel(false);
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
        setName("FlatOrder");
        setTargetNamespace("http://c24.biz/io/gettingstarted");
        setElementFormDefault(biz.c24.io.api.data.FormEnum.QUALIFIED);
        setAttributeFormDefault(biz.c24.io.api.data.FormEnum.UNQUALIFIED);
        setIdGeneratorMethodDefault(biz.c24.io.api.data.IDGeneratorMethodEnum.NATIVE);
    }

}
