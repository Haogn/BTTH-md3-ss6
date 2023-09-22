package thuchanh.th2;

public class Main {
    public static void main(String[] args) {
        // khởi tạo các đối tượng từ lớp Student bằng phương thức taho ô tham số
        Student student1 = new Student(1,"Nguyễn Văn A", true, 19, "Hà nội", "Java");
        Student student2 = new Student(2,"Nguyễn Văn B", true, 22, "Bắc Giang", "React JS");
        Student student3 = new Student(3,"Nguyễn Thị C", false, 20, "Quảng Ninh", "Note JS");
        // Hiển thị tất cả thông tin của đối tượng bằng phương thức display()
        System.out.println("____________ THÔNG TIN SINH VIÊN 1 ____________ ");
        student1.display();

        System.out.println("____________ THÔNG TIN SINH VIÊN 2 ____________ ");
        student2.display();

        System.out.println("____________ THÔNG TIN SINH VIÊN 3 ____________ ");
        student3.display();


    }
}
