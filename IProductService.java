import java.util.List;

public interface IProductService
{
    void GetPriceByType(Product product);
    int GetTotalPrice(List<Product> products);
}
