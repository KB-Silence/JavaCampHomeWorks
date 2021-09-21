# Day 5 | Homework 1

## Package.Entites
![desc1](https://user-images.githubusercontent.com/74976052/117489199-0338fc00-af76-11eb-86a3-829bda7cf215.png)  
Kayıt olacak kullanıcının bilgilerini tutabilmemiz ve kontrol edebilmemiz için Entities.concretes altında User classı oluşturdum ve çıplak kalmaması için Entities.abstracts altında oluşturduğum Entity interface'inden implements ettim.  
[İlgili Kodlar => Package.Entities](https://github.com/KB-Silence/JavaCampD5HomeWork/tree/main/homeWork5/src/homeWork5/entities)  
## Package.DataAccess  
![desc2](https://user-images.githubusercontent.com/74976052/117489607-7e9aad80-af76-11eb-8ac7-f34b253b8e15.png)  
Database tarafındaki operasyonları gerçekleştirmek için DataAccess.abstracts altında UserDao adında bir Interface oluşturdum ve gerçekleşecek operasyonların imzalarını belirttim. Ardından operasyonları yönetmek için DataAccess.concretes altında InMemoryUserDao adında bir class oluşturdum. Şu an herhangi bir Database kullanmadığımızdan dolayı simüle etmek için ArrayList<> yapısını kullandım. getAll() operasyonunu, email adresinin daha önce kullanılıp kullanılmadığını ve login işleminde bilgilerin doğrulunu kontrol etmek için oluşturdum.  
[İlgili Kodlar => Package.DataAccess](https://github.com/KB-Silence/JavaCampD5HomeWork/tree/main/homeWork5/src/homeWork5/dataAccess)  

## Package.Core  
![desc4](https://user-images.githubusercontent.com/74976052/117491244-9d01a880-af78-11eb-8660-8730f7faf1ed.png)  
Daha sonraki projelerimde de kullanmak isteyebileceğim yağıları bu katmanda oluşturmaya çalıştım. Core.abstracts içerisinde Interfacelerimi oluşturdum ve gerçekleşecek operasyonların imzalarını belirttim.  
CheckService => eposta,şifre,ad-soyad bilgilerinin belirtilen kuralları sağlayıp sağlamadığını kontrol edecek.  
EmailVerificationService => Kayıt işlemi gerçekleştiği zaman email adresine onaylama maili gönderecek ve onaylanıp onaylanmadığını kontrol edecek.  
OutSourceServices => Dış servisler için entegrasyon(adaptasyon) yapmak için kullanılacak.  
Core.concretes altında CheckManager ve EmailVerificationManager adında 2 sınıf oluşturdum ve ilgili interface'lerden implement ettim.  
CheckManager => Parametre ile gelecek olan email, password, ad-soyad bilgilerinin belirttiğimiz kurallara uyup uymadığına bakacak. Kurallar sağlanıyorsa True döndürecek sağlanmıyorsa ilgili hata mesajını fırlatacak.
EmailVerificationManager => Kayıt olan kullanıcının kayıt olurken girmiş olduğu email adresine doğrulama bağlantısı gönderecek ve onaylandığında ilgili mesajı yazdıracak.
Core.adapters altında dışarıdan aldığımız GoogleLogin servisini kullanabilmek için GoogleLoginManagerAdapter adında bir sınıf oluşturdum. Bu sınıf basitçe Google ile kayıt olma ve giriş yapma işlemlerini simüle ediyor.    
[İlgili Kodlar => Package.Core](https://github.com/KB-Silence/JavaCampD5HomeWork/tree/main/homeWork5/src/homeWork5/core)  

## Package.Business  
![desc3](https://user-images.githubusercontent.com/74976052/117490527-8e66c180-af77-11eb-98ee-be94437c80ce.png)  
Kayıt olma ve giriş yapma işlemleri için öncelikle Business.abstracts altında LoginService adında bir interface oluşturdum ve gerçekleşecek operasyonların imzalarını belirttim. Ardından Business.concretes altında LoginManager adında bir class oluşturdum ve kullanmak istediğim servisleri dependency injection ile sınıfa dahil ettim son olarak operasyonların içini dolurdum.
### LoginManager public void existEmail(String email);  
For döngüsü ile kullanıcı bilgilerinin tutulduğu listeyi tek tek dolaştım ve listede bulunan email bilgisi ile parametreyle gönderilen email bilgisini kontrol ettim. Eğer parametreyle gelen email bilgisi liste içerisinde mevcutsa "E-Posta adresi zaten mevcut." hatasını fırlatacak.
### LoginManager public void register(User user);
CheckService sayesinde ulaştığım operasyonları çağırıyorum ve kullanıcının bilgilerini kontrol ediyorum. Bilgiler belirttiğim kurallara uymuyorsa ilgili hata mesajı ekrana fırlatılacak. Kurallara uyan bilgi ile ilgili mesajı da kontrolden hemen sonra yazdırdım. EmailVerificationService sayesinde ulaştığım operasyoları çağırdım ve doğrulama bağlantısı gönderilmesini sağladım. UserDao sayesinde ulaştığım .add() operasyonunu çağırdım ve kullanıcıyı aynı zamanda Database'e ekledim. Son olarak kullanıcının kayıt işleminin başarılı olduğunu mesaj olarak yazdırdım.

### LoginManager public void login(String email, String password);
CheckService sayesinde ulaştığım operasyonlar ile geçerli bir email ve password bilgisi gelmesi için kontrolleri yaptım aksi taktirde hata mesajı fırlatılacak. Ardından for döngüsü ile kullanıcı bilgilerinin tutulduğu listeyi tek tek dolaştım ve parametreyle gönderilen email-password bilgilerinin kayıtlı olup olmadığını kontrol ettim. Eğer kayıtlıysa kullanıcıya başarıyla giriş yaptığına dair mesajı ekrana yazdırdım. Bilgiler kayıtlı değilse ilgili hata mesajını fırlattım.  

İşlemleri tek bir sınıftan yönetmek istediğim için Business.abstracts altında UserService adında bir interface oluşturdum ve gerçekleşecek operasyonların imzalarını belirttim. Ardından Business.concretes altında UserManager adında bir sınıf oluşturdum ve dependency injection ile ihtiyacım olan servisleri sınıfa dahil ettim.
### UserManager public void register(User user);
LoginService sayesinde ulaştığım kayıt olma operasyonunu çağırdım.
### UserManager public void loign(String email, String password);
LoginService sayesinde ulaştığım giriş yapma operasyonunu çağırdım.
### UserManager public void registerWith();
OutSourceServices sayesinde ulaştığım dış servisten kayıt olma operasyonunu çağırdım.
### UserManager public void loginWith();
OutSourceServices sayesinde ulaştığım dış servisten giriş yapma operasyonunu çağırdım.   
[İlgili Kodlar => Package.Business](https://github.com/KB-Silence/JavaCampD5HomeWork/tree/main/homeWork5/src/homeWork5/business)  

## GoogleLogin  
![desc5](https://user-images.githubusercontent.com/74976052/117493885-3ed6c480-af7c-11eb-8f6b-8a9d3f211951.png)  
Burada basit bir Google Login servisi simüle ettim. İlgili interface ile manageri oluşturdum ve basit 2 operasyon oluşturdum.  
[İlgili Kodlar => GoogleLogin](https://github.com/KB-Silence/JavaCampD5HomeWork/tree/main/homeWork5/src/GoogleLogin)

### ------------------------------------------------------------------------------------------------------------  

# Hata Mesajları Çıktıları  
![except2](https://user-images.githubusercontent.com/74976052/117488776-77bf6b00-af75-11eb-8c41-1349c03a962d.png)  
![except1](https://user-images.githubusercontent.com/74976052/117488778-77bf6b00-af75-11eb-8938-ce55de49b1a5.png)  
![except4](https://user-images.githubusercontent.com/74976052/117494598-359a2780-af7d-11eb-8c94-cff1a8d41800.png)
![except3](https://user-images.githubusercontent.com/74976052/117488773-7726d480-af75-11eb-9d25-3609a568be64.png)  
![except5](https://user-images.githubusercontent.com/74976052/117494594-3468fa80-af7d-11eb-9b50-1ce2be474b06.png)
![except6](https://user-images.githubusercontent.com/74976052/117488768-75f5a780-af75-11eb-9a0e-585bb6fe5516.png)   
### ------------------------------------------------------------------------------------------------------------  

# Programın Çıktısı  
![outputhw5](https://user-images.githubusercontent.com/74976052/117494755-6da16a80-af7d-11eb-9b97-337196bd247f.png)  

# Yapamadığım bazı kısımları [sakirsuleymanoglu](https://github.com/sakirsuleymanoglu) sayesinde tamamladım.  
# Kendisine çok teşekkür ediyorum.
### Eksiklerimi ve yanlışlarımı ya da görüş ve tavsiyelerinizi lütfen **[Instagram](https://www.instagram.com/brkcnsrbstt/)** üzerinden ulaştırın.
