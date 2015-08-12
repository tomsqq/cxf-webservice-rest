package demo.cxf.rest_spring_cxf;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunqingqing on 15/8/12.
 */
@Component
public class ManagerImpl implements Manager {
    private static final List<Product> productList = new ArrayList<Product>();

    static {
        productList.add(new Product(1, "iphone 5s", 5000));
        productList.add(new Product(2, "ipad mini", 2500));
    }
    public List<Product> fetchName() {
        return productList;
    }
}
