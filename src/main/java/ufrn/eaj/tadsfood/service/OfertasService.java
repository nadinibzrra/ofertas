package ufrn.eaj.tadsfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufrn.eaj.tadsfood.model.Ofertas;
import ufrn.eaj.tadsfood.repository.OfertasRepository;

import java.util.List;

@Service
public class OfertasService {

    private OfertasRepository ofertasRepository;

    @Autowired
    public void setOfertasRepository(OfertasRepository ofertasRepository) {
        this.ofertasRepository = ofertasRepository;
    }

    public List<Ofertas> findAll(){
        return ofertasRepository.findAll();
    }

    public Ofertas save(Ofertas oferta){
        return ofertasRepository.save(oferta);
    }
}
