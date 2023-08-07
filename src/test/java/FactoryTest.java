import org.example.src.factory.WhateverFactory;
import org.example.src.factory.product_lists.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public void testCreateDefaultProduct_fromWhateverFactory() {
        WhateverFactory whateverFactory = new WhateverFactory();
        Product product = whateverFactory.orderProduct(whateverFactory.DEFAULT_PRODUCT_TYPE);
        assertEquals(product.create(), "Default product");
    }

    @Test
    public void testCreateWhateverProduct_fromWhateverFactory() {
        WhateverFactory whateverFactory = new WhateverFactory();
        Product product = whateverFactory.orderProduct("whatever");
        assertEquals(product.create(), "Whatever product");
    }
}
