package App79.model;
import App79.util.Configs;
public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten){
        this.ten=ten; 
    }
    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }
    public void tinhLuong(){
        if(loaiChucVu==Configs.NHAN_VIEN_LINH){
            if(ngayLamThem>=1){
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem*800000;
            }else{
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH ;
            }

        }else{
            if (ngayLamThem >= 1) {
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * 800000;
            } else {
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
            }
        }
    }
    public void xuatThongTin() {
        System.out.println("ten nhan vien : "+ ten );
        System.out.println("loai chuc vu :"+ loaiChucVu);
        System.out.println("ngay lam them :"+ngayLamThem);
        System.out.println("Luong:" + luong);
        System.out.println("=======================");

    }
    
}
