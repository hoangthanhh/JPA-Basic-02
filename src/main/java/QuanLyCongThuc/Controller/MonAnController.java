package QuanLyCongThuc.Controller;

import QuanLyCongThuc.Models.MonAn;
import QuanLyCongThuc.Services.MonAnServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonAnController {
    @Autowired
    private MonAnServices monAnServices;

    @RequestMapping(value = "timkiemmonan", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> timKiemMonAn() {
        return monAnServices.timKiemMonAn();
    }

    @RequestMapping(value = "themmonan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MonAn themMonAn(@RequestBody String monAn) {
        Gson gson = new Gson();
        MonAn mon = gson.fromJson(monAn,MonAn.class);
        return monAnServices.themMonAn(mon);
    }
}
