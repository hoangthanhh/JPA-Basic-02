package QuanLyCongThuc.Services;

import QuanLyCongThuc.repository.CongThucRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongThucServices implements ICongThuc {
    @Autowired
    CongThucRepo congThucRepo;
    @Override
    public List<Object[]> hienThiCongThuc(int monAnId) {
        List<Object[]> list = congThucRepo.hienThiDSCongThuc(monAnId);
        return list;
    }
}
