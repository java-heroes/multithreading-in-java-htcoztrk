## Özet
Java’da multithread kavramı Thread sınıfı ve Runnable interface üzerine kuruludur. 
Bu ödebde yeni bir thread yaratmak ve ona bir görev atamak için Runnable sınıfı implemente edildi ve run() metodu override edilerek yeni bir task oluşturuldu ve bu oluşturulan task, bir thread objesine verilip çalıştırıldı.

run() metodu oluşturulan thread çalıştığı zaman çağrılacak olan metoddur ve farklı bir thread tarafından çalıştırılır.
Oluşturulan Thread, start() metodunu kullanılarak çalıştırılır.

Bu ödevde Ana Thread'de CocukTask isminde bir ornekTask yaratıldı ve bu ornekTask yeni yaratılan bir threade verilerek çalıştırıldı. 
Bu noktadan itibaren iki thread paralel olarak çalıştı ve ekrana çıktı üretti. Bu işlemi yaparken de belli aralıklarla çalışan threadler sleep() metodu çağrılarak durduruldu.

Uygulama tarafından yaratılan bütün threadler son bulduğunda uygulama da son bulur.
### Thread Emniyeti
Bir process’in birden fazla işi aynı anda yapmasını sağlayan yapılara thread denir. 
Bir uygulamada en az bir adet thread olması gerekir. Bu mecburi thread genellikle "main thread" olarak isimlendirilir ve bu thread sonlandığında normal şartlarda uygulamanın sonlaması beklenir.
### Avantaj ve Dezavantajlar

  *  Java Çoklu kalıtımı desteklemediği için Runnable arayüzünün kullanımı faydalı olacaktır,interface bize daha fazla esneklik sağlar. 
  * Bir java uygulaması, varsayılan olarak birim zamanda tek bir iş yapacaktır. Bu ana iş parçası Main Thread olarak adlandırılır. Bir iş parçası içerisinde çağrılan tüm metotlar birbirlerinin bitişini beklemek zorundadır. Yani akış ardışıkdır. Bu ardışık mantık ve tek thread bazı durumlarda uygulama geliştirmemizi kısıtlar veya yetersiz performansa sebebiyet verir. Bu gibi durumlar Thread kullanmamızı gerektirir. 
 *  Real Time uygulamalarda single-threading kullanılamaz çünkü bu tip uygulamalarda sistemin gerçek zamanlı olarak tepki vermesi gereken işlemler vardır. 
 

 

* Thread kullanımının bazı sakıncaları da mevcuttur.

   1- Fazla sayıda thread kullanmamız uygulamayı karmaşık hale getirebilir.
   
   2- Thread’lerin kullandığı paylaşımlı veriler, sınıf örnekleri olabilir ve bunlara çok dikkat edilmesi gerekir.
   
   3-Thread’ler kendi local stacklerine sahiptir. Fazla sayıda thread daha fazla memory demektir. Out of Memory hatası alma ihtimalimiz artar.
   
   4-Fazla sayıda thread CPU switch işlemine ve performans kaybına sebep olur.

  
 Kaynaklar:
 * https://bilisim.io/2017/01/06/thread-nedir-ve-nasil-tanimlanir/
 * https://medium.com/s%C4%B1f%C4%B1rdan-i%CC%87leri-d%C3%BCzeye-java-e%C4%9Fitim-serisi/multithreaded-programlama-1-k%C4%B1s%C4%B1m-40904a219a18
 * https://www.cihanyakar.com/threadler/ 



