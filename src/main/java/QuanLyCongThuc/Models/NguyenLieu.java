package QuanLyCongThuc.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "nguyenlieu")
public class NguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nguyenLieuId;
    @Column(name = "tennguyenlieu")
    @NotNull(message = "Tên nguyên liệu không được để trống")
    private String tenNguyenLieu;

    @OneToMany(mappedBy = "nguyenLieu")
    @JsonIgnoreProperties(value = "nguyenLieu")
    private Set<CongThuc> congThucs;

    public int getNguyenLieuId() {
        return nguyenLieuId;
    }

    public void setNguyenLieuId(int nguyenLieuId) {
        this.nguyenLieuId = nguyenLieuId;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public Set<CongThuc> getCongThucs() {
        return congThucs;
    }

    public void setCongThucs(Set<CongThuc> congThucs) {
        this.congThucs = congThucs;
    }
}
