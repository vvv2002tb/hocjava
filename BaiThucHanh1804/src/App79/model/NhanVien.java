package App79.model;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){
    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    protected String loaiNhanVien(){
        //lop con phai override lai loai nhan vien
        return "";
    }
    public void xuatThongTin(){
        System.out.println("====Nhan Vien: "+ten+ "====");
        System.out.println("- Loai nhan vien: "+loaiNhanVien());
        System.out.println("- Luong: "+luong+" VND");
    }
}
