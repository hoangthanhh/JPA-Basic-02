package QuanLyCongThuc.repository;

import QuanLyCongThuc.Models.CongThuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CongThucRepo extends JpaRepository<CongThuc,Integer> {
    @Query(value = "select \tmonan.tenmon, nguyenlieu.tennguyenlieu, congthuc.soluong, congthuc.donvitinh from congthuc join monan on congthuc.mon_an_id = monan.mon_an_id join nguyenlieu on congthuc.nguyen_lieu_id = nguyenlieu.nguyen_lieu_id where monan.mon_an_id = :monAnId", nativeQuery = true)
    List<Object[]> hienThiDSCongThuc(@Param("monAnId") int monAnId);
}
