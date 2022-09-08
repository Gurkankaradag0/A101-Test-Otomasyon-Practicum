package a101;

import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101Practicum 
{
    public WebDriver driver;

    public A101Practicum(WebDriver driver){
        this.driver = driver;
    }

    public void _sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void _println(String string){
        System.out.println(new Date() + " - " + string);
    }

    public String _randMail(int len){
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_.";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public void clickCookiebotAllowAllButton(){
        By locator = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement allowAllButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        allowAllButton.click();
        _println("Cerezler kabul edildi.");
    }

    public void clickGiyimVeAksesuarCategory(){
        WebElement giyimVeAksesuarCategory = driver.findElement(By.xpath("//a[@title='GİYİM & AKSESUAR']"));
        String setUrl = giyimVeAksesuarCategory.getAttribute("href");
        driver.get(setUrl);
        _sleep(1250);
        _println("Giyim & Aksesuar kategorisine tiklandi.");
    }

    public void clickKadinIcGiyimSubCategory(){
        By locator = By.xpath("//li[@class='derin ']/a[@title='Kadın İç Giyim']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement kadinIcGiyimSubCategory = wait.until(ExpectedConditions.elementToBeClickable(locator));
        kadinIcGiyimSubCategory.click();
        _sleep(1250);
        _println("Kadin Ic Giyim alt kategorisine tiklandi.");
    }

    public void clickDizaltiCorapSubCategory(){
        By locator = By.xpath("//li[@class='derin ']/a[@title='Dizaltı Çorap']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dizaltiCorapSubCategory = wait.until(ExpectedConditions.elementToBeClickable(locator));
        dizaltiCorapSubCategory.click();
        _sleep(1250);
        _println("Dizalti Corap alt kategorisine tiklandi.");
    }

    public void clickSiyahFiltre(){
        By locator = By.xpath("//label[text()='SİYAH']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement siyahFiltre = wait.until(ExpectedConditions.elementToBeClickable(locator));
        siyahFiltre.click();
        _sleep(1250);
        _println("Urunler SIYAH olarak filtrelendi.");
    }

    public void clickFirstProduct(){
        By locator = By.xpath("//li[@class='col-md-4 col-sm-6 col-xs-6 set-product-item']/article/a");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(locator));
        firstProduct.click();
        _println("Ilk urun secildi.");
    }

    public String getProductColor(){
        By locator = By.xpath("//div[@class='selected-variant-text']/span");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement productColor = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        _println("Urun renginin SIYAH oldugu kontrol ediliyor.");
        return productColor.getText();
    }

    public void clickSepeteEkleButton(){
        By locator = By.xpath("//div[contains(@class, 'product')]/button[contains(@class,'add')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement sepeteEkleButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        sepeteEkleButton.click();
        _println("Sepete Ekle butonuna basildi.");
    }

    public void clickSepetiGoruntuleButton(){
        By locator = By.xpath("//a[@class='go-to-shop']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement sepetiGoruntuleButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        sepetiGoruntuleButton.click();
        _println("Sepeti Goruntule butonuna basildi.");
    }

    public void clickSepetiOnaylaButton(){
        By locator = By.xpath("//a[contains(@class, 'checkout-button')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement sepetiOnaylaButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        sepetiOnaylaButton.click();
        _println("Sepeti Onayla butonuna basildi.");
    }

    public void clickUyeOlmadanDevamEtButton(){
        By locator = By.xpath("//a[contains(@class, 'auth_')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement uyeOlmadanDevamEtButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        uyeOlmadanDevamEtButton.click();
        _println("Uye Olmadan Devam Et butonuna basildi.");
    }

    public void sendMail(){
		String mail = _randMail(16) + "@gmail.com";
        By locator = By.xpath("//input[@name='user_email']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mailInput = wait.until(ExpectedConditions.elementToBeClickable(locator));
        mailInput.sendKeys(mail);
        _println("Mail girisi yapildi.");
    }

    public void clickDevamEtButton(){
        By locator = By.xpath("//div[@class='auth page-login']/form/button[@type='submit']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement devamEtButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        devamEtButton.click();
        _println("Devam Et butonuna basildi.");
    }

    public void clickYeniAdresOlusturButton(){
        By locator = By.xpath("//a[contains(@class, 'new-address')]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement yeniAdresOlusturButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        yeniAdresOlusturButton.click();
        _println("Yeni Adres Olustur butonuna basildi.");
    }

    public void adresFormunuDoldur(String title, String firstName, String lastName, String phoneNumber, String city, String township, String district, String adress, String postCode){
        WebElement Input_Title = driver.findElement(By.xpath("//input[@name='title']"));
        WebElement Input_FirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        WebElement Input_LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        WebElement Input_PhoneNumber = driver.findElement(By.xpath("//input[@name='phone_number']"));
        Select Input_City = new Select(driver.findElement(By.xpath("//select[@name='city']")));
        Select Input_Township = new Select(driver.findElement(By.xpath("//select[@name='township']")));
        Select Input_District = new Select(driver.findElement(By.xpath("//select[@name='district']")));
        WebElement Input_Adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        WebElement Input_PostCode = driver.findElement(By.xpath("//input[@name='postcode']"));

        _println("Adres Formu dolduruluyor...");

        Input_Title.sendKeys(title);
        Input_FirstName.sendKeys(firstName);
        Input_LastName.sendKeys(lastName);
        Input_PhoneNumber.sendKeys(phoneNumber);
        Input_City.selectByVisibleText(city);
        _sleep(500);
        Input_Township.selectByVisibleText(township);
        _sleep(500);
        Input_District.selectByVisibleText(district);
        Input_Adress.sendKeys(adress);
        Input_PostCode.sendKeys(postCode);

        _println("Adres Formu dolduruldu.");
    }

    public void clickAdresKaydetButton(String adress){
        By locator = By.xpath("//*[@id='js-orders-modal-container']/div/div[2]/form/button[1]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement kaydetButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        kaydetButton.click();

        WebElement Input_Adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        Input_Adress.sendKeys(adress);

        kaydetButton.click();
        _println("Adres Kaydet butonuna basildi.");
    }

    public void clickKargoSecButton(){
        By locator = By.xpath("//label[@class='js-checkout-cargo-item']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement kargoSecButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        kargoSecButton.click();
        _println("Ilk kargo secenegi secildi.");
    }

    public void clickKaydetVeDevamEtButton(){
        By locator = By.xpath("//div[@class='cargo']/button");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement kaydetVeDevamEtButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        kaydetVeDevamEtButton.click();
        _println("Kaydet ve Devam Et butonuna basildi.");
    }

    public Boolean checkOdemeEkrani(){
        try {
            By locator = By.xpath("//b[text()='Başka bir kart ile ödemek istiyorum']");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            _println("Odeme sayfasi kontrol ediliyor...");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
