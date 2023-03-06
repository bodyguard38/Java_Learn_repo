package GitHub;

public class Properties_Code {

    //       Kolay yol

    //Dosya olustur ,intelig'e gel ve file dan  open'a gel ve olusturdugun dosyayi sec diyelim (lesson adinda dosya olusturdun
    //sonra o dosyaya uzerine git sag tikle yeni ve file sec ve ismi lemonade .txt olsun.

    //*"git init" ile basla(git init yapinca biz 3 sanal alan olusturmus oluyoruz 1.working directory/2.staging area ara bolge(ara bolge )
    //3.repository yani commit sonrasi bolge)repository de cok degisiklik yapilmaz cunku etiketlenistir.
    //git add sizi staging area ya gonderir ve degisiklik yapmak mumkundur,git commit sizi repository'e gonderir,git checkout sizi
    //repositoryden working directory'e yollar.
    //git status ile degisiklikleri kontrol edebilirsin
    //* lemonade.txt biseyler ekleyelim sonra kaydet
    //terminale git status dedigimizde degisiklikleri gosterir
    //git add lemonade.txt dersek sadece istedigimiz dosyayi eklemis oluruz.
    //"git commit-m "mesaj yazin"
    //git branch -m master yada main commit yapildiktan sonra yapilir.
    //"git log "=comit gecmisini gosterir.
    //push etmeden once branch main olmali
    //github'ta bit repo acmamiz gerek ve adresini alip ve ismini aliriz origin kopyala yapisir ve yolla.
    //git remote show=sizin originde olup olmadiginizi gosterir.

    //******************************************************************************************
    //   Clone ederek olusturma
    // GutHubtan repo olusturulur (HTTPS) KULLANILIR) ve link alinir
    //Klasor olusturun ,sonra intelije gelin file open ve olusturdunuz kolasoru bulun tiklayin
    //git clone deyim githubtaki linki yapistiriyoruz.
    //git clone size yeni bir klasor acar yani sizin acmaniza gerek yok ve clone yapinca git init demenize gerek yok ve pull yapmis demektir.
    //git clone yaptiniz ve otomatik dosya olustursun istemez iseniz o zaman (git clone <url> .) konur
    //clone ettikten sonra tum dosyalar gelir ve sizde kendi dosyanizin ismini new -file - yenisimle eklersiniz.
    //ignore yapmak istediginiz seyleri commit onesi yapin.
    //tarif yaz ve kaydet
    //git status ile fatal error almis isek yanlis dosya uzerindeyiz "cd dosya ismi ile istenilen dosyaya gecis saglanir
    //git status ile degisikliklere bakilir
    //git add .
    //git commit -m "mesaj"
    //"git push"

    //**************************************************************************************
    //           GURUP CALISMASI
    //Size verilen URL intelij new -project from version control--->size verilen URL yapistirilir ve clone edilir
    //gelen projeye ekleme yapilir
    //git add
    //git commit -m "mesaj"
    //git push etmek icin karsi taraf sizi eklemeli email ile.
    //projeye kisi eklemek icin istenilen projeye gidilir ve setting kismindan collaborators basilir ve add people dan kisi eklenir.
    //git stash working directory biseyler yazdiniz ama eklemek istemezseniz git stash yapin o bir yere bu notu kaydeder.
    //git stash apply geri getirir.
    //git branch yapmadan once git pull yaplip dosyanin son haline bakilir
    //git branch <branch ismi>
    //git branch:hangi brancte oldugunu gosterir.
    //git check out branch ismi
    //yeni bilgi ekle
    //git add
    //git commit
    //git push
    //branch protection icin setting 'e gidiler /branches secilir ve branch protection rules
    //main branch pattern yapariz
    //require a pull request before merging
    //require approval ve create yapilir.
    //***************ONEMLI****************
    //Toplu calismalarda,branch acip push edebiliriz main de push edemeyiz ,branch,i github'a push edince orda branch belli
    //asamalri gecip approval almasi gerekir ve daha sonra main ile merge edilir.
    //githubta compare and pull request gorunur,branch yollandiginda Github'a
    //create pull request yapilmali not incelendikten sonra
    //takim arakadasi kodlari incelemeli ,files changes tiklanir ve review changes's acilir ve approve submit yapilir.
    //en son merge pull request gelir ve ekleme yapilir.
    //confim merge
    //delete branch .branch silinebilir

    //

    //"""git branch"" hangi branch ustunde oldugumuzu gosterir.
    //"git branch -r"takim arkadaslarinin olusturdugu branchlari gorebiliriz
    //"git branch -a " tum branchlari goster hem remote takileri hem localldekileri
    // "git branch name " ile branch olustrulur
    //"git checkout branchname" ile istedigimiz branch'e gecebiliriz,main veya master da isek
    //"git checkout -b ,branch name>" hem branch olusturur hem gecis yaparsiniz
    //git checkout branchlar arasi gecis yapar.
    //git branch -d <branch name> branch silme


    //""""""""""""""""""""""""""pull reuest" benim kodumu ana kod ile birlestir(github ozeligidir)
    //"fork" github tan githuba cekilebilir(baska yerden sevdigin bir proje buldugunda onu kendi githubina atabilirsin
    //"clone " remote dan locale yani kendi bilgisyarina cekmedir.

    //"pwd " bulundugumuz yeri gosterir.
    //"ls"dosyalara bakmak istenildiginde bi cok dosya gosterir.

    //////Dosyayi kendimiz olustur isek dosya olustur ,sonra girbash tan dosyayi al dosyanin icine file olusturmak icin
    //"touch <file ismi yaz> direk file olusur sonra git init yap eklemek istedigin varsa ekle git add yap sonra son halini gor ve
    //"git commit -m " mesajini yaz" gonder.git add . dosya icindeki tum dosyalari takip etmeye baslar,"git add <lemonade txt > yazarsak
    //sadece 1 dosya eklemis oluruz,"git log " commit gecmisini gosterir
//                  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$


    //BRANCH EKLEMEK ICIN:Main de oldugunuzdan emin olun
    //"git branch" <l=isim koyun branc'e>
    //"git branch" localde hangi branchte oldugunuzu gosterir


    //         &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    //Master veya Main olarak degistirme "git branch -m master(main) olarak degisiklik yapilir.
    //"git checkout <branch ismi> ile branclar arasi gecis yaparsiniz.
    //<<<<<<<<<<<<<<<yeni acilan branchta degisisikli yaptigimizda degisiklikleri yine "git add <file ismi ile ornek:lemonade.txtyapariz>
    //ekledigimiz yeni seyler kendi branchimizda yani limon diyelim limon ustunde durur,brach arasi gecis yatigimizda limona eklediklerimizi
    //goremeyiz bu yuzden mainde " git merge limon" desek yani yeni olusturdugumuz branchi eklemis oluruz, olusturulan branclar maine yani ana
    //menuye boyle cekilir



    ///Git yuklendigini anlamak icin ******git --version

    ///  ***********8configurasyonlarini ayarlamak icin ***********

//  git config --global user.name " isiminizi girin "************
    // git config --global user.email "email adresi"***********
    // git config --global core editor "text editor"***********
    //git config --list***********888

    //"""""""""""""GIT REPOSITORY""""""""""""
    //CREATE a local repo
    // git init**********8

    //eger baska merkez bir yerden kendi bilgisayarina cekiceksen
    //git clone <url>**********88

    //see the command
    //git help **********

    //See the status of your repo
    //git status******************

// working directory    """"""""""""" dosya olusturmak""""""""""
    // Staging Area   """"""""""""""""""""" add yapma git add """"""(uzerinde calisma yapilabilir )
    //repository """""""""""""""""git commit yani calismanizin en son hali(burda artik calisma bitmis etiketlenmis)

    //dosya olustur ekleme yap """gir add """" komutu ile staging area gonder

    //""""""""bir dosya eklenecekse """"git add file ismi ile sec
    //""""""""birden fazla dosya ayni anda eklenecekse gir add . yada *  koyariz
    // """"git commit -m  "mesaj yaz" calisma bitti tamamladik tan sonra mesaj yazar repository'e yollariz
    //"""""git commit -am "mesaj yaz" hem add yapar hem commit
    //"""""git commit --amend ""2ile yaptiginiz mesaji degistirmek mumkun.
    //"""""git log """"ile  commit gecmisi gorunur
    // ""git add """ komutu yaptiktan sonra eger working Directory gelmek istenirse """git rm --cached """""ile geri gelinir
    //**********usteki komut staging area dan(add yaptigimiz area), working directorey'e(yani dosyaya) geri getiren komuttur*****************

    //Repository'e eklenen bir dosyayi cikarmak istersek""""""git checkout """""" komutu ile doyayi en basa yani working directory,e
    //gondermek mumkun sanki hic commit yapilmamis gibi.

    //""""git diff""" farki gosterir yani stage are ile commit yaptiktan sonra arada fark var ise

    //""""" GIT INIT-------GIT ADD---------GIT COMMIT -M " MESAJ YAZ" -------GIT PUSH-----


    //"""""""""""""""""""""""""""""""""""GITHUB"""""""""""""""""""""""""""""2
    //Dosyalarin depolandigi bir servistir
    //origin denince akla (uzaktaki yani github taki repo gelmeli


    // """"""git clone<url>""""""""bir kereye mahsus uzaktaki repo adresi clonlanir.
    //"""""git pull""""""""son guncellemeye bakilir bu komutla conflict olmamak icin
// //"""git push""""degisiklik yada ekleme bu komut ile yollanir

    //git remote add origin <url> githuba yeni gonderiyor ise ilk defa uzaktaki github
    // FIRST PUSH "git puch -u origin master
    //ilk push tan sonra artik"""git push """ yeterli

    //***************************"cd " change directory bulundugumuz yerden baska bir yere gitmek icin,gidilecek yeri bilmek gerek
    //cd desktop denilince desktop'a gider(yer degistirme bilgisayar icinde
    //"mkdir lesson" dersek tesktopa gidip lesson clasorunu olusturmus oluruz
// "ls " veya dir (su an icinde bulundugumuz her yeri gosterir)
    //"clear" temizlemek
}
