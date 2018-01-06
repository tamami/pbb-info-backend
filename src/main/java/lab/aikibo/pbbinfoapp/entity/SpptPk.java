package lab.aikibo.pbbinfoapp.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SpptPk implements Serializable {

    @Getter @Setter
    private String kdPropinsi;
    @Getter @Setter
    private String kdDati2;
    @Getter @Setter
    private String kdKecamatan;
    @Getter @Setter
    private String kdKelurahan;
    @Getter @Setter
    private String kdBlok;
    @Getter @Setter
    private String noUrut;
    @Getter @Setter
    private String kdJnsOp;
    @Getter @Setter
    private String thnPajakSppt;

}