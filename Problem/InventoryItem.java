package Problem;

public class InventoryItem extends Product{
    private String productCode;
    public InventoryItem(String productName, double price , String productCode)
    {
        super(productName, price);
        this.productcode=productCode;
    }
    public String getProductCode(){
        return productCode;
    }
    public void setProductCode(String productCode){
        this.productCode=productCode;
    }
    public void displayDetails(){
        
    }
} 
