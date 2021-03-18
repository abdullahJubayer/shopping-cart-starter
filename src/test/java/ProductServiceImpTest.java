import com.bazlur.shoppingcart.dto.ProductDTO;
import com.bazlur.shoppingcart.repo.ProductRepo;
import com.bazlur.shoppingcart.repo.ProductRepoImp;
import com.bazlur.shoppingcart.servie.ProductService;
import com.bazlur.shoppingcart.servie.ProductServiceImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImpTest {
    private static final ProductDTO xiaomiPhone=new ProductDTO("MI A3","White Color",21000.00);
    private static final ProductDTO iPhone=new ProductDTO("Iphone 8X","Black Color",81000.00);
    private ProductRepo productRepo;
    private ProductService productService;

    @Before
    public void setUp() throws Exception{
        productRepo=mock(ProductRepo.class);
        productService=new ProductServiceImp(productRepo);
    }

    @Test
    public void testFindAllSortedProduct(){
        when(productRepo.getAllProduct()).thenReturn(List.of(xiaomiPhone,iPhone));
        var sortedProduct=productService.findAllSortedProduct();
        Assert.assertEquals(iPhone.getName() ,sortedProduct.get(0).getName());
        Assert.assertEquals(xiaomiPhone.getName() ,sortedProduct.get(1).getName());
    }
}
