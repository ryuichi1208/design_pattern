public class Singleton {
	public static void main(String[] args) {
		/* インスタンスはgetterを経由して取得 */
		RegisterNote rn =RegisterNote.getInstance();

	}
}


class RegisterNote{
	private static RegisterNote registerNote = new RegisterNote();

	/* コンストラクタをprivateにする */
	private RegisterNote(){}

	public static RegisterNote getInstance(){
		return registerNote;
	}
}
