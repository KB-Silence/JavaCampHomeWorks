# Day 4 | Homework 1

# Kimlik Doğrulama Servisi (MERNIS) Projeye Nasıl Eklenir ?
Projeye sağ tıklıyoruz (Benim projemin adı homeWork3).  
![hw1](https://user-images.githubusercontent.com/74976052/116870616-83303080-ac1b-11eb-922e-37a7a3feb6cf.png)  
Açılan menüden **New** altında bulunan **Other** seçeneğine tıklıyoruz.  
![hw2](https://user-images.githubusercontent.com/74976052/116870620-83c8c700-ac1b-11eb-86fd-7c264e754233.png)  
**Wizards** altındaki alandan **Web Service** diye arama yapıyoruz ve sonuçlardan **Web Service Client'i** seçip Next butonuna tıklıyoruz.  
![hw3](https://user-images.githubusercontent.com/74976052/116870622-84615d80-ac1b-11eb-998d-a408b41d7b07.png)  
Gelen ekranda **Service definition:** kısmına  **https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl**  bu adresi yapıştırıyoruz ve Finish butonuna tıklıyoruz.  
![hw4](https://user-images.githubusercontent.com/74976052/116870623-84615d80-ac1b-11eb-90f7-36be054d28a2.png)  
### Projeye Mernis'i eklemiş olduk fakat Mernis'in düzgün çalışabilmesi için varsayılan yürütme ortamı sürümünü değiştirmemiz gerekiyor.  
**JavaSE-15 to 1.8**     
Projeye sağ tıklıyoruz ve menünün en altındaki **Properties** seçeneğine tıklıyoruz.  
![hw5](https://user-images.githubusercontent.com/74976052/116870624-84f9f400-ac1b-11eb-90ca-2c301e331ac6.png)  
Açılan ekranda sol tarafta bulunan menüden **Java Compiler** sekmesine geliyoruz ve **Use compliance from execution environment 'JavaSE-15 on the 'Java Build Path'** 
kutusunun tikini kaldırıyoruz. Arından sağ tarafta açılan listeden **1.8** sürümünü seçiyoruz. **Apply / Apply and Close** butonlarına tıklayarak değişiklikleri kaydediyoruz.  
![hw6](https://user-images.githubusercontent.com/74976052/116870625-84f9f400-ac1b-11eb-8cc4-1037fd036123.png)  
### "Attachment support is disabled." Hatası alırsak projemize eklememiz gereken 2 kütüphane var.  
`May 03, 2021 2:48:50 PM org.apache.axis.utils.JavaUtils isAttachmentSupported
WARNING: Unable to find required classes (javax.activation.DataHandler and javax.mail.internet.MimeMultipart). Attachment support is disabled.`  
[**Activation and Mail Jars**](https://jar-download.com/artifacts/javax.mail/mail/1.4.7/source-code) Bu linkten ilgili kütüphaneleri indirip rardan çıkartıyoruz.  
Projeye sağ tıklıyoruz ve menüden **Build Path** altında bulunan **Configure Build Path** seçeneğine tıklıyoruz.  
![hw7](https://user-images.githubusercontent.com/74976052/116870629-85928a80-ac1b-11eb-8a92-ceefaf6d26eb.png)  
Gelen ekranda sol menüden **Java Build Path** sekmesine gidiyoruz ve **Libraries** sekmesini açıyoruz. Sağ tarafta bulunan butonlardan **Add External JARs...** butonuna tıklıyoruz
ve indirdiğimiz jar dosyalarını seçiyoruz. Dosyaları seçtikten sonra **Apply/Apply and Close** butonlarına tıklayarak değişiklikleri kaydediyoruz.  
![hw8](https://user-images.githubusercontent.com/74976052/116870631-85928a80-ac1b-11eb-8a83-41d7e173bcfa.png)  
![hw9](https://user-images.githubusercontent.com/74976052/116870632-862b2100-ac1b-11eb-9818-1acb0e6936dd.png)
