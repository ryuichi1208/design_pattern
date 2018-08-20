public class Singleton {
	public static void main(String[] args) {
		/* 下記はコンパイルエラー */
		//RegisterNote rn = new  RegisterNote();

		/* インスタンスはgetterを経由して取得 */
		RegisterNote rn = RegisterNote.getInstance();
		rn.resigNum;
	}
}


class RegisterNote{
	private static RegisterNote registerNote = null;
	int resigNum;

	/* コンストラクタをprivateにする */
	private RegisterNote(){ 
		if(registerNote == null) {
			registerNote = new RegisterNote();
		}
	}

	/* インスタンス取得用getter */
	public static RegisterNote getInstance(){
		return registerNote;
	}
}
