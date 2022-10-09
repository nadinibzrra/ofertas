package ufrn.eaj.tadsfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufrn.eaj.tadsfood.model.Ofertas;

@Repository
public interface OfertasRepository extends JpaRepository < Ofertas, Long > {
}
