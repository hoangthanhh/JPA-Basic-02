package QuanLyCongThuc.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "congthuc")
public class CongThuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int congThucId;
    @Column(name = "soluong")
    @NotNull(message = "Số lượng không được để trống")
    private int soLuong;
    @Column(name = "donvitinh")
    @NotNull(message = "Đơn vị tính không được để trống")
    private String donViTinh;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "nguyenLieuId")
    @JsonIgnoreProperties(value = "congThucs")
    private NguyenLieu nguyenLieu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "monAnId")
    @JsonIgnoreProperties(value = "congThucs")
    private MonAn monAn;

    public int getCongThucId() {
        return congThucId;
    }

    public void setCongThucId(int congThucId) {
        this.congThucId = congThucId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public NguyenLieu getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(NguyenLieu nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }
}
