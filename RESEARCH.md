Özet
Java’da multithread kavramı Thread sınıfı ve Runnable interface üzerine kuruludur. 
Bu ödebde yeni bir thread yaratmak ve ona bir görev atamak için Runnable sınıfı implemente edildi ve run() metodu override edilerek yeni bir task oluşturuldu ve bu oluşturulan task, bir thread objesine verilip çalıştırıldı.

run() metodu oluşturulan thread çalıştığı zaman çağrılacak olan metoddur ve farklı bir thread tarafından çalıştırılır.
Oluşturulan Thread, start() metodunu kullanılarak çalıştırılır.

Bu ödevde Ana Thread'de CocukTask isminde bir ornekTask yaratıldı ve bu ornekTask yeni yaratılan bir threade verilerek çalıştırıldı. 
Bu noktadan itibaren iki thread paralel olarak çalıştı ve ekrana çıktı üretti. Bu işlemi yaparken de belli aralıklarla çalışan threadler sleep() metodu çağrılarak durduruldu.

Uygulama tarafından yaratılan bütün threadler son bulduğunda uygulama da son bulur.



