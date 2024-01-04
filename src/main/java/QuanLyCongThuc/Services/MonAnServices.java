package QuanLyCongThuc.Services;

import QuanLyCongThuc.Models.CongThuc;
import QuanLyCongThuc.Models.MonAn;
import QuanLyCongThuc.repository.CongThucRepo;
import QuanLyCongThuc.repository.MonAnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonAnServices implements IMonAn{
    @Autowired
    private MonAnRepo monAnRepo;
    @Autowired
    private CongThucRepo congThucRepo;

    @Override
    public List<String> timKiemMonAn() {
        List<String > list = monAnRepo.timKiemMonAn();
        return list;
    }

    @Override
    public MonAn themMonAn(MonAn monAn) {
        MonAn ma = monAnRepo.save(monAn);

        for (CongThuc congThuc: monAn.getCongThucs()) {
            congThuc.setMonAn(ma);
            congThucRepo.save(congThuc);
        }
        ma.setCongThucs(monAn.getCongThucs());
        monAnRepo.save(ma);
        return ma;
    }
}
