package QuanLyCongThuc.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
    @Entity
    @Table(name = "monan")
    public class MonAn {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int monAnId;
        @Column(name = "tenmon")
        @NotNull(message = "Tên món không được để trống")
        private String tenMon;
        @Column(name = "ghichu")
        private String ghiChu;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "loaiMonAnId")
        @JsonIgnoreProperties(value = "monAn")
        private LoaiMonAn loaiMonAn;

        @OneToMany(mappedBy = "monAn")
        @JsonIgnoreProperties(value = "monAn")
        private Set<CongThuc> congThucs;

        public int getMonAnId() {
            return monAnId;
        }

        public void setMonAnId(int monAnId) {
            this.monAnId = monAnId;
        }

        public String getTenMon() {
            return tenMon;
        }

        public void setTenMon(String tenMon) {
            this.tenMon = tenMon;
        }

        public String getGhiChu() {
            return ghiChu;
        }

        public void setGhiChu(String ghiChu) {
            this.ghiChu = ghiChu;
        }

        public LoaiMonAn getLoaiMonAn() {
            return loaiMonAn;
        }

        public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
            this.loaiMonAn = loaiMonAn;
        }

        public Set<CongThuc> getCongThucs() {
            return congThucs;
        }

        public void setCongThucs(Set<CongThuc> congThucs) {
            this.congThucs = congThucs;
        }
    }
