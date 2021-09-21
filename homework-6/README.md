# Day 6 | Homework 1
*Veritabanı tasarımı ve kodları için -> [PostgreSQL HRMS](https://github.com/KB-Silence/JavaCampD6HomeWork1)*

### Package.Entities.Concretes
![entities](https://user-images.githubusercontent.com/74976052/119957075-6da7ef80-bfaa-11eb-9cf2-c52d078a149e.png)  
Veri tabanındaki tablolara ve verilere ulaşabilmek için isimlendirme kurallarına dikkat ederek Entity(varlık) sınıflarımı oluşturdum. Spring Boot anotasyonları ile tabloları ilgili sınıflar ile kolonları da ilgili alanlar(fields) ile ilişkilendirdim ve Lombok anotasyonları ile de sınıflarımın Getter/Setter, Parametreli/Parametresiz Constructor yapılarını oluşturdum.  
**[İlgili Kodlar -> Entities](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/entities/concretes)**  

### Package.DataAccess.Abstracts
![dataaccess](https://user-images.githubusercontent.com/74976052/119973135-c59b2200-bfbb-11eb-8683-3db3d4746241.png)  
Database tarafında verilere ulaşmak ve çeşitli sorgular oluşturmak için ilgili sınıflarımın Dao(DataAccessObject) interfacelerini oluşturdum ve bütün interface'leri JpaRepository'den extends ettim. **JpaRepository**'den gelen hazır metotlara/sorgulara ek olarak farklı sorgular ile kontroller gerçekleştirmek için isimlendirme kurallarına özen göstererek **findBy** metotlarımın imzalarını oluşturdum.  
**[İlgili Kodlar -> DataAccess](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/dataAccess/abstracts)**

### Package.Core
![core_packages](https://user-images.githubusercontent.com/74976052/119974618-8e2d7500-bfbd-11eb-9ce2-6923cc77c74b.png)

### Package.Core.Abstracts
İş arayanları ve iş verenleri doğrulamak/onaylamak için kullanacağım operasyonların servislerini(interface) ve metot imzalarını oluşturdum. Mernis olarak FakeMernis simüle ettim.  
**[İlgili Kodlar -> Core.Abstracts](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/core/abstracts)**

### Package.Core.Adapters
İş arayanların kimlik doğrulamasını yapacak olan FakeMernis servisini sisteme dahil etmek için Adapter sınıfımı oluşturdum. Spring Boot ile gelen @Service anotasyonunu ekledim. Böylece sisteme bu sınıfın servis görevi göreceğini belirtmiş oldum.  
**[İlgili Kodlar -> Core.Adapters](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/core/adapters)**

### Package.Core.Concretes
İş verenlerin ve iş arayanların doğrulama/onaylama operasyonları için somut sınıflarımı oluşturdum. İlgili servislerden implement ettim ve metotları doldurdum. Bu sınıflarıma da @Service anotasyonunu ekledim.  
**[İlgili Kodlar -> Core.Concretes](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/core/concretes)**

### Package.Core.Utilities.Results
![utilities_result](https://user-images.githubusercontent.com/74976052/119974148-034c7a80-bfbd-11eb-9f96-329dffe03544.png)  
Results ve DataResults yapılarını oluşturdum.  
**[İlgili Kodlar -> utilities.Results](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/core/utilities/results)**  

### Package.Business
![business_packages](https://user-images.githubusercontent.com/74976052/119976018-35f77280-bfbf-11eb-902d-05beae3a058d.png)  

### Package.Business.Abstracts
Veritabanındaki verileri listelemek ve veriler üzerinde değişiklik yapmak, aynı zamanda bu işlemleri gerçekleştirmeden önce belli kurallar belirleyerek bu kurallara göre işlemleri gerçekleştirmek için kullanacağım operasyonların servislerini(interface) ve metot imzalarını oluşturdum. İşlemleri datalar ile yapacağım için metot imzalarımı DataResult yapısında oluşturdum.  
**[İlgili Kodlar -> Business.Abstracts](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/business/abstracts)**

### Package.Business.Concretes
İlgili servisin ilgili yönetici(Manager) sınıflarını oluşturdum ve implementasyonlarını gerçekleştirdim. Metotları sorumluluklarına göre iş kurallarını da belirleyerek doldurdum. İlgili tablolarda değişiklikler yapabilmek için ilgili sınıflarda gerekli dependency injectionları gerçekleştirdim. Inject ettiğim servislere(interface) instance olabilecek sınıfları otomatik olarak bulması ve bu sınıflardan instance oluşturması için Spring Boot ile gelen @Autowired anotasyonunu kullandım. Bu sınıfları ayrıca servis olarak kullanacağım için @Service anotasyonunu da bütün sınıflara ekledim.  
**[İlgili Kodlar -> Business.Concretes](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/business/concretes)**  

### Package.Api.Controllers
![api_controllers](https://user-images.githubusercontent.com/74976052/119978013-c636b700-bfc1-11eb-88f4-7bbb51e70325.png)  
Request gönderilen sayfaların alakalı operasyonları yerine getirebilmesi için ilgili sınıfların controller yapılarını oluşturdum. Her bir sınıf için;  controller(denetçi,kontrolör) olduğunu sisteme belirtmek için @RestController, belirtilen adrese istek geldiğinde controller'ın çalışmasını sağlamak için @RequestMapping, belirtilen servise istek geldiğinde veri getirmek için @GetMapping ve belirtilen servise istek geldiğinde veri göndermek için @PostMapping anotasyonlarını kullandım. Sınıfların ilgili tablolarda/verilerde işlem yapabilmesi için gerekli servislerin dependency injectionlarını yaptım ve bu servislere karşılık gelebilecek sınıfları otomatik bulup, instance oluşturması için @Autowired anotasyonunu kullandım. Son olarak controller sınıflarımın metotlarını oluşturdum.  
**[İlgili Kodlar -> Api.Controllers](https://github.com/KB-Silence/JavaCampD7HomeWork/tree/main/hrms/src/main/java/kilobyte/hrms/api/controllers)**  
![swaggerui](https://user-images.githubusercontent.com/74976052/119986777-f172d380-bfcc-11eb-9a14-6a26f0b78497.png)  
### *Eksiklerim ve yanlışlarım için ya da görüş ve tavsiyeleriniz için **[Instagram](https://www.instagram.com/brkcnsrbstt/)** ya da Discord üzerinden iletişim kurabilirsiniz.*
*Discord Kullanıcı Adı: **Berkcan#9907***
