package dao;

import base.BaseDao;
import dto.UrunYorumDto;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorumDto> findAllUrunYorumDtoByUrunId(Long id)
    {
        String sql = " select " +
                " new dto.UrunYorumDto( urun.adi, urun.kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi,kullanici.email,kullanici.telefon,urun_yorum.yorum,urun_yorum.yorumTarihi) " +
                " from UrunYorum urun_yorum " +
                " left join Urun urun  on urun_yorum.urun.id = urun.id " +
                " left join Kullanıcı kullanici on urun_yorum.kullanici.id = kullanici.id " +
                " where urun.id = :id ";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
