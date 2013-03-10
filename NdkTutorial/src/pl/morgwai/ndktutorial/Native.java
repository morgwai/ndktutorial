package pl.morgwai.ndktutorial;

public class Native {

	static {
		System.loadLibrary("stlport_shared");
		//System.loadLibrary("gnustl_shared");
		System.loadLibrary("cryptopp");
		System.loadLibrary("crypt_user");
	}

	public native long fun(int i);
}
