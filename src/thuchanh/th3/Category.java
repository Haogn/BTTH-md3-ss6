package thuchanh.th3;

public class Category {
    int categoryId ;
    String categoryName ;

    // phuong thuc khoi tao khong tham so
    public Category() {

    }

    // phuong thuc khoi tao 2 tham so

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName= categoryName ;
    }

    public void display() {
        System.out.println("Ma danh muc : " + categoryId + "\n"
                        + "Ten danh muc " + categoryName
        );
    }
}
