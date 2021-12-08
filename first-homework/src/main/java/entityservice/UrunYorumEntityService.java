package entityservice;

import dao.UrunDao;
import dao.UrunYorumDao;
import dto.UrunYorumDto;

import java.util.List;

public class UrunYorumEntityService {

    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorumDto> findAllUrunYorumDto(Long id) {
        return urunYorumDao.findAllUrunYorumDtoByUrunId(id);
    }
}
