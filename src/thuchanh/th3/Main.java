package thuchanh.th3;

public class Main {
    public static void main(String[] args) {
        // tao 2 danh muc nhu sau
        Category dm1 = new Category(1, "Quan") ;
        Category dm2 = new Category(2, "Ao") ;
        // tao cac san pham thuoc danh muc 1
        Product product1 = new Product(1,"Quan au", 200000, dm1) ;
        Product product2 = new Product(2,"Quan Jean" , 3000000, dm1) ;
        // tao cac san pham thuoc danh muc 2
        Product product3 = new Product(3,"So mi cong so", 250000, dm2) ;
        Product product4 = new Product(4,"So mi an choi", 4000000, dm2) ;

        // hien thi
        System.out.println("Tat cac san pham ");
        product1.display();
        System.out.println("___________________");
        product2.display();
        System.out.println("___________________");
        product3.display();
        System.out.println("___________________");
        product4.display();
    }
}
