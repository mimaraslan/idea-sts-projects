package com.mimaraslan.okul;

import com.mimaraslan.utils.Dersler;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {

    // fields
    private Dersler ad;
    private  Ogretmen ogretmen;
    private int not1;
    private int not2;

    // TODO Notlar listeye çevirlecek.
    //  List<Integer> notlar;

    public int ortalama(){
        return (getNot1() + getNot2())/2;
    }
}
