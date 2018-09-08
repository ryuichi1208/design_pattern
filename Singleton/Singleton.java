public class Singleton {
	public static void main(String[] args) {
		/* 荳玖ｨ倥�ｯ繧ｳ繝ｳ繝代う繝ｫ繧ｨ繝ｩ繝ｼ */
		//RegisterNote rn = new  RegisterNote();

		/* 繧､繝ｳ繧ｹ繧ｿ繝ｳ繧ｹ縺ｯgetter繧堤ｵ檎罰縺励※蜿門ｾ� */
		RegisterNote rn = RegisterNote.getInstance();
		rn.resigNum;
	}
}


class RegisterNote{
	private static RegisterNote registerNote = null;
	//test
	int resigNum;

	/* 繧ｳ繝ｳ繧ｹ繝医Λ繧ｯ繧ｿ繧恥rivate縺ｫ縺吶ｋ */
	private RegisterNote(){ 
		if(registerNote == null) {
			registerNote = new RegisterNote();
		}
	}

	/* 繧､繝ｳ繧ｹ繧ｿ繝ｳ繧ｹ蜿門ｾ礼畑getter */
	public static RegisterNote getInstance(){
		return registerNote;
	}
}