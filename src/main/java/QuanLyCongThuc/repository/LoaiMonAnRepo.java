package QuanLyCongThuc.repository;

import QuanLyCongThuc.Models.CongThuc;
import QuanLyCongThuc.Models.LoaiMonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiMonAnRepo extends JpaRepository<LoaiMonAn,Integer> {
}
