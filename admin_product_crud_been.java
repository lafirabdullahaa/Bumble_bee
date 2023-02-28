package javaBeen;

public class admin_product_crud_been {
	
	protected int no;
    protected String product_id;
    protected String name;
    protected String quality;
    protected String price;

    public admin_product_crud_been() {}

    public admin_product_crud_been(String product_id, String name, String quality, String price) {
        super();
        this.product_id = product_id;
        this.name = name;
        this.quality = quality;
        this.price = price;
      
    }

    public admin_product_crud_been(int no, String product_id, String name, String quality, String price) {
        super();
        this.no = no;
        this.product_id = product_id;
        this.name =name;
        this.quality = quality;
        this.price = price;
    }
    

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getProduct_id() {
        return product_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getQuality() {
        return quality;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
