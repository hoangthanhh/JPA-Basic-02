package QuanLyCongThuc.Services;

import QuanLyCongThuc.Models.MonAn;

import java.util.List;

public interface IMonAn {
    public List<String> timKiemMonAn();
    public MonAn themMonAn(MonAn monAn);
}
