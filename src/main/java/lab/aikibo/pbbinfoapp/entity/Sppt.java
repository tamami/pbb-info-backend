package lab.aikibo.pbbinfoapp.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(SpptPk.class)
@NoArgsConstructor
@RequiredArgsConstructor
public class Sppt {

    @Id @Getter @Setter @NonNull
    private String kdPropinsi;
    @Id @Getter @Setter @NonNull
    private String kdDati2;
    @Id @Getter @Setter @NonNull
    private String kdKecamatan;
    @Id @Getter @Setter @NonNull
    private String kdKelurahan;
    @Id @Getter @Setter @NonNull
    private String kdBlok;
    @Id @Getter @Setter @NonNull
    private String noUrut;
    @Id @Getter @Setter @NonNull
    private String kdJnsOp;
    @Id @Getter @Setter @NonNull
    private String thnPajakSppt;
    @Column @Getter @Setter
    private BigDecimal siklusSppt;
    @Column @Getter @Setter
    private String kdKanwilBank;
    @Column @Getter @Setter
    private String kdKppbbBank;
    @Column @Getter @Setter
    private String kdBankTunggal;
    @Column @Getter @Setter
    private String kdBankPersepsi;
    @Column @Getter @Setter
    private String kdTp;
    @Column @Getter @Setter
    private String nmWpSppt;
    @Column @Getter @Setter
    private String jlnWpSppt;
    @Column @Getter @Setter
    private String blokKavNoWpSppt;
    @Column @Getter @Setter
    private String rwWpSppt;
    @Column @Getter @Setter
    private String rtWpSppt;
    @Column @Getter @Setter
    private String kelurahanWpSppt;
    @Column @Getter @Setter
    private String kotaWpSppt;
    @Column @Getter @Setter
    private String kdPosWpSppt;
    @Column @Getter @Setter
    private String npwpSppt;
    @Column @Getter @Setter
    private String noPersilSppt;
    @Column @Getter @Setter
    private String kdKlsTanah;
    @Column @Getter @Setter
    private String thnAwalKlsTanah;
    @Column @Getter @Setter
    private String kdKlsBng;
    @Column @Getter @Setter
    private String thnAwalKlsBng;
    @Column @Getter @Setter
    private Date tglJatuhTempoSppt;
    @Column @Getter @Setter
    private BigDecimal luasBumiSppt;
    @Column @Getter @Setter
    private BigDecimal luasBngSppt;
    @Column @Getter @Setter
    private BigDecimal njopBumiSppt;
    @Column @Getter @Setter
    private BigDecimal njopBngSppt;
    @Column @Getter @Setter
    private BigDecimal njopSppt;
    @Column @Getter @Setter
    private BigDecimal njoptkpSppt;
    @Column @Getter @Setter
    private BigDecimal njkpSppt;
    @Column @Getter @Setter
    private BigDecimal pbbTerhutangSppt;
    @Column @Getter @Setter
    private BigDecimal faktorPengurangSppt;
    @Column @Getter @Setter
    private BigDecimal pbbYgHarusDibayarSppt;
    @Column @Getter @Setter
    private char statusPembayaranSppt;
    @Column @Getter @Setter
    private char statusTagihanSppt;
    @Column @Getter @Setter
    private char statusCetakSppt;
    @Column @Getter @Setter
    private Date tglTerbitSppt;
    @Column @Getter @Setter
    private Date tglCetakSppt;
    @Column @Getter @Setter
    private String nipPencetakSppt;

}