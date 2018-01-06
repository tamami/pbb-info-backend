package lab.aikibo.pbbinfoapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab.aikibo.pbbinfoapp.entity.Sppt;
import lab.aikibo.pbbinfoapp.entity.SpptPk;

@Repository
public interface SpptRepo extends JpaRepository<Sppt, SpptPk> {
    
    List<Sppt> findByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOp(
        String kdPropinsi, String kdDati2, String kdKecamatan, String kdKelurahan, String kdBlok,
        String noUrut, String kdJnsOp
    );

}