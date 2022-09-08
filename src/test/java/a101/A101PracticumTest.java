package a101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A101PracticumTest extends BaseTest
{
    @Test
    public void Odeme_Ekrani(){
        a101Practicum.clickCookiebotAllowAllButton();
        a101Practicum.clickGiyimVeAksesuarCategory();
        a101Practicum.clickKadinIcGiyimSubCategory();
        a101Practicum.clickDizaltiCorapSubCategory();
        a101Practicum.clickSiyahFiltre();
        a101Practicum.clickFirstProduct();
        Assertions.assertEquals("SİYAH", a101Practicum.getProductColor(), "Seçilen ürün SİYAH değil.");
        a101Practicum._println("Secilen urun SIYAH.");
        a101Practicum.clickSepeteEkleButton();
        a101Practicum.clickSepetiGoruntuleButton();
        a101Practicum.clickSepetiOnaylaButton();
        a101Practicum.clickUyeOlmadanDevamEtButton();
        a101Practicum.sendMail();
        a101Practicum.clickDevamEtButton();
        a101Practicum.clickYeniAdresOlusturButton();
        a101Practicum.adresFormunuDoldur("Title", "FirstName", "LastName",
                                    "5000000000", "İSTANBUL", "ADALAR", 
                                    "MADEN MAH", "Adres St. ", "34000");
        a101Practicum.clickAdresKaydetButton("No: 0");
        a101Practicum.clickKargoSecButton();
        a101Practicum.clickKaydetVeDevamEtButton();
        Assertions.assertTrue(a101Practicum.checkOdemeEkrani(), "Ödeme ekranına ulaşılamadı.");
        a101Practicum._println("Odeme sayfasina ulasildi.");
    }
}
