# Day 4 | Homework 2

![outputhw4](https://user-images.githubusercontent.com/74976052/116949424-cd9cc600-ac8a-11eb-8554-7ce84e65474c.png)  

User için Entities , Interface, UserManager , BaseUserManager yapılarını oluşturdum ve ilgili operasyonları ekledim.  
`add(), remove(), update() operasyonları.  `  
Bilgilerin doğruluğunu kontrol etmek için ilgili Interface ve Adapters yapısın oluşturdum ve operasyonları ekledim.  
` Mernis ile kayıt olan kullanıcının girdiği bilgilerin doğruluğunu kontrol ettim. `   
Game için Entities, Interface, GameManager, BaseGameManager yapılarını oluşturdum ve ilgili operasyonları ekledim.  
` add(), remove(), update(), listGames() operasyonları. `   
Campaign için Entites, Interface, CampaignManager, BaseCampaignManager yapılarını oluşturdum ve ilgili operasyonları ekledim.  
`newCampaign(), deleteCampaign(), updateCampaign(), listCampaigns() operasyonları`  
Kampanyanın indirim oranına göre fiyatı hesaplamak için Interface ve Class yapılarını oluşturdum ve ilgili operasyonları ekledim.  
`getPriceAfterCampaign` operasyonu.  
Sale işlemleri için Interface, SaleManager, BaseSaleManager yapılarını oluşturdum ve ilgili operasyonları ekledim.  
`addToCart(), deleteFromCart(), buy()`  


### Kısa Özet:  
- Kullanıcı kayıt işlemleri için User adında class oluşturdum ve user'ın bazı özelliklerini belirttim. Sonrasında constructor ve getter/setter yapılarını oluşturdum.  
- User ile alakalı operasyonları gerçekleştirebilemk için UserService adında Interface yapımı oluşturdum. Ardından BaseUserManager ve UserManager 
classlarını oluşturup ilgili miras alma(inheritance) işlemlerini yaptım.
- Mernis Kimlik Doğrulama Servisini kullanarak kayıt olan kullanıcının bilgilerini kontrol etmek için UserCheckManager sınıfımı, UserCheckService Interface'imi 
ve MernisServiceManager adında adapter classımı oluşturarak UserManager sınıfında doğrulamayı yapacak kod bloğunu yazdım.
- Oyun işlemleri için Game adında class oluşturdum ve game'in bazı özelliklerini belirttim. Sonrasında constructor ve getter/setter yapılarını oluşturdum.
- Game ile alakalı operasyonları gerçekleştirebilmek için GameService adında Interface yapımı oluşturdum. Ardından GameManager ve BaseGameManager sınıflarımı oluşturup 
ilgili miras alma işlemlerini yaptım.
- Kampanya işlemleri için Campaign adında class oluşturdum ve campaign'in bazı özelliklerini belirttik. Sonrasında constructor ve getter/setter yapılarını oluşturdum.
- Kampanya ile alakalı operasyonları gerçekleştirebilmek için CampaignService adında interface yapımı oluşturdum. Arından CampaignManager ve BaseCampaignManager sınıflarımı 
oluşturup ilgili miras alma işlemlerini gerçekleştirdim.
- Kampanya fiyatını hesaplamak için farklı bir yol denedim. CampaignCalculateService adında bir interface oluşturdum ve CampaignCalculateManager adında oluşturduğum sınıfa 
implements ettim. Fiyatı hesaplayacak ve return edecek metod yapımı oluşturdum. 
- Sale işlemleri için SaleService adında bir interface oluşturdum. Ardında SaleManager ve BaseSaleManager sınıflarımı oluşturup ilgili miras alma işlemlerini yaptım. 
- SaleManager sınıfında buy() operasyonuna oluşturduğum CampaignCalculateService interfacinde bir obje inject ettim ve oyunun değerini ve kampanyanın indirim değerini parametre olarak 
gönderip işlem sonucunu return ettim.
- Son olarak Main sınıfında gerekli nesneleri oluşturdum ve programı çalıştırdım.

### Ayrıca:
- Mernis Kimlik Doğrulama Sistemini projelerinize eklemek için: **[Buradaki Repository'ye Bakabilirsinz](https://github.com/KB-Silence/JavaCampD4HomeWork1)**
- Eksiklerimi ve yanlışlarımı ya da görüş ve tavsiyelerinizi lütfen **[Instagram](https://www.instagram.com/brkcnsrbstt/)** üzerinden ulaştırın.
