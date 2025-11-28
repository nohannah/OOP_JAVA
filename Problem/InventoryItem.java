package Problem;

public class InventoryItem extends Product{
    private String ProductCode;
    public InventoryItem(String productName, double price , String ProductCode)
    {
        super(productName, price);
        this.ProductCode=ProductCode;
    }
    public String getProductCode(){
        return ProductCode;
    }
    public void setProductCode(String productCode){
        this.ProductCode=ProductCode;
    }
    public void displayDetails(){
        System.out.println("Product Name: " + getProductName()+ ", Price: " + getPrice() + ", Product Code: " + ProductCode);
    }

} 
