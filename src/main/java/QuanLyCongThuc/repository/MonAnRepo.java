package QuanLyCongThuc.repository;

import QuanLyCongThuc.Models.CongThuc;
import QuanLyCongThuc.Models.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonAnRepo extends JpaRepository<MonAn,Integer> {
    @Query(value = "SELECT DISTINCT m.tenmon FROM monan m JOIN congthuc ct ON m.mon_an_id = ct.mon_an_id JOIN nguyenlieu nl on ct.nguyen_lieu_id = nl.nguyen_lieu_id WHERE nl.tennguyenlieu IN ('Hành', 'Tỏi')", nativeQuery = true)
    List<String> timKiemMonAn();
}
