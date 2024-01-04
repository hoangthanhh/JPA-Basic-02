package QuanLyCongThuc.Controller;

import QuanLyCongThuc.Services.CongThucServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CongThucController {
    @Autowired
    CongThucServices congThucServices;

    @RequestMapping(value = "hienthidscongthuc", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object[]> hienThiDSCongThuc(@RequestParam int monAnId) {
        return congThucServices.hienThiCongThuc(monAnId);
    }
}
