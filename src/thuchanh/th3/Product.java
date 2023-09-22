package thuchanh.th3;

public class Product {
   int productId ;
   String productName ;
   float productPrice ;
   Category category;
   public Product() {

   }
   // phuong thuc khoi tao + tham so
    public Product(int productId, String productName, float productPrice, Category category) {
       this.productId= productId;
       this.productName=productName;
       this.productPrice=productPrice;
       this.category= category;
    }

    public void display() {
        System.out.println("Ma san pham : " + productId + "\n"
        + "Ten san pham : " + productName + "\n"
        + "Gia : " + productPrice + "\n"
        + "Danh muc : " + category.categoryName);
    }


}
