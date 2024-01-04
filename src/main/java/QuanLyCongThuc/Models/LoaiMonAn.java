package QuanLyCongThuc.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;
    @Entity
    @Table(name = "loaimonan")
    public class LoaiMonAn {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int loaiMonAnId;
        @Column(name = "tenloai")
        @NotNull(message = "Tên loại món ăn không được để trống")
        private String tenLoai;

        @OneToMany(mappedBy = "loaiMonAn")
        @JsonIgnoreProperties(value = "loaiMonAn")
        private Set<MonAn> monAns;

        public int getLoaiMonAnId() {
            return loaiMonAnId;
        }

        public void setLoaiMonAnId(int loaiMonAnId) {
            this.loaiMonAnId = loaiMonAnId;
        }

        public String getTenLoai() {
            return tenLoai;
        }

        public void setTenLoai(String tenLoai) {
            this.tenLoai = tenLoai;
        }

        public Set<MonAn> getMonAns() {
            return monAns;
        }

        public void setMonAns(Set<MonAn> monAns) {
            this.monAns = monAns;
        }
    }
