package homeWork;

public class Main {

	public static void main(String[] args) {
		
		HeadSide headSide = new HeadSide("Kodlama.io", "Kurslarım", "Tüm Kurslar", "Kampa Hazırlık", "Sık Sorulan Sorular", "pp1.jpg");
		HeadSide[] mainPageHead = {headSide};
		for (HeadSide mainHead : mainPageHead) {
			System.out.print(mainHead.title+"\t\t\t   "
					+mainHead.myCourses+"\t"
					+mainHead.allCourses+"\t   "
					+mainHead.prepareCamp+"\t"
					+mainHead.faQuestions+"\t"
					+mainHead.pPicture + "\n\n\n");
		}
		MainSide mainSide = new MainSide("Kategori: Tümü", "Eğitmen: Tümü", "Kurs Bul", "Yazılım Geliştirici Yerleştirme Kampı(JAVA + REACT)",
										 "/////////////////////////-------", "Engin Demiroğ", 88, "Tamamlandı");
		MainSide[] mainPageMain = {mainSide};
		for (MainSide mainMain : mainPageMain) {
			System.out.println(mainMain.category+"\t"
					+mainMain.instructor+"\t\t\t\t"
					+mainMain.search+"\n\n\n");
		}
		for (int i=1; i <= 7; i++) {
			System.out.println("</>javareactjavareact</>");
		}
		for (MainSide mainMain2 : mainPageMain) {
			System.out.println("\n"+mainMain2.title+"\n"
					+mainMain2.progressBar+"\n"
					+mainMain2.instructorName+"\t\t\t"
					+mainMain2.progress+"%\n"
					+"\t\t\t  "+mainMain2.isCompleted);
			
		}
		FootSide footSide = new FootSide("© Kodlama.io 2021", "Kullanım Koşulları", "Gizlilik Politikası");
		FootSide[] mainPageFoot = {footSide};
		for (FootSide mainFoot : mainPageFoot) {
			System.out.println("\n\n"+mainFoot.copyRight+"\t\t\t"+mainFoot.termsOfUse
					+"\n\t\t\t\t\t"+mainFoot.privacyPolicy+"\n\n\n\n");
		}
		HeadSideManager headSideManager = new HeadSideManager();
		headSideManager.onClickLogo();
		headSideManager.onClickMyCourses();
		headSideManager.onClickAllCourses();
		headSideManager.onClickPrepareCamp();
		headSideManager.onClickFaq();
		headSideManager.onClickPicture();
		System.out.println("--------------------------------------------------------------------------------------------");
		MainSideManager mainSideManager = new MainSideManager();
		mainSideManager.onClickCategory();
		mainSideManager.onClickInstructor();
		mainSideManager.onClickSearch();
		mainSideManager.onClickCourseCard();
		System.out.println("--------------------------------------------------------------------------------------------");
		FootSideManager footSideManager = new FootSideManager();
		footSideManager.onClickTermsOfUse();
		footSideManager.onClickPrivacyPolicy();
	}
}