package uygulamalar;

import dto.UrunDetayDto;
import dto.UrunYorumDto;
import entityservice.UrunEntityService;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class FindAllUrunYorumDtoApp {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumDto> yorumList = service.findAllUrunYorumDto(1L);

        for (UrunYorumDto urunYorumDto : yorumList) {
            System.out.println(urunYorumDto);
        }
    }
}
