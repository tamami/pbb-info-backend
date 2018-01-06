package lab.aikibo.pbbinfoapp.controller;

import java.util.List;
import java.util.Observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lab.aikibo.pbbinfoapp.entity.Sppt;
import lab.aikibo.pbbinfoapp.entity.SpptPk;
import lab.aikibo.pbbinfoapp.repo.SpptRepo;

@RestController
public class ApiController {

    @Autowired
    private SpptRepo spptRepo;

    @RequestMapping("api/sppt")
    public Observable<Sppt[]> getDaftarSppt(@RequestParam("nop") String nop) {
        System.out.println("nop : " + nop);
        System.out.println("kd Propinsi : " + nop.substring(0,2));

        
        return spptRepo.findByKdPropinsiAndKdDati2AndKdKecamatanAndKdKelurahanAndKdBlokAndNoUrutAndKdJnsOp(
            nop.substring(0,2), nop.substring(2,4), nop.substring(4,7), nop.substring(7,10), 
            nop.substring(10,13), nop.substring(13,17), nop.substring(17,18));
    }

}