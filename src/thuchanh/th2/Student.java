package thuchanh.th2;

public class Student {
    int studentId ;
    String studentName ;
    boolean sex ;
    String className ;
    int age ;
    String address ;

    // khoi tao contructer
    public Student() {

    }

    // phuong thuc khoi tao ra tham so
    public Student(int studenId, String studentName, boolean sex , int age , String address, String className ) {
        this.studentId = studenId;
        this.studentName = studentName;
        this.className= className  ;
        this.sex = sex ;
        this.age = age ;
        this.address = address ;
    }

    public void display () {
        System.out.println("Mã sinh viên " + studentId + "\n"
                + "Tên sinh viên : " + studentName + "\n"
                + "Tuổi : " + age + "\n"
                + "Giới tính : " + sex + "\n"
                + "Lớp : " + className + "\n"
                + "Địa chỉ : " + address + "\n"
        );
    }
}
