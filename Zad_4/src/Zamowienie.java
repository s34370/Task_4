import java.util.ArrayList;

public class Zamowienie {
private int id;
private Klient klient;
private Produkt produkty;
private int[] ilosci;
private String dataZamowienia;
private String status;

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public Klient getKlient(){
    return klient;
}
public void setKlient(Klient klient){
    this.klient = klient;
}
public Produkt getProdukt(){
    return Produkt;
}
public void setProdukt(Produkt Produkt){
    this.Produkt = Produkt;
}
public int[] getIlosci(){
    return ilosci;
}
public void setIlosci(int[] ilosci){
    this.ilosci = ilosci;
}
public String getDataZamowienia(){
    return dataZamowienia;
}
public void setDataZamowienia(String dataZamowienia){
    this.dataZamowienia = dataZamowienia;
}
public String getStatus(){
    return status;
}
public void setStatus(String status){
    this.status = status;
}

}
