package pl.morgwai.ndktutorial;

import android.util.Log;

public class Native {

	public static final String LOG_TAG = Native.class.getSimpleName();

	static {
		try {
			System.loadLibrary("stlport_shared");
		} catch (UnsatisfiedLinkError e) {
			Log.i(LOG_TAG, "stlport not found");
		}
		try {
			System.loadLibrary("gnustl_shared");
		} catch (UnsatisfiedLinkError e) {
			Log.i(LOG_TAG, "gnustl not found");
		}
		System.loadLibrary("cryptopp");
		System.loadLibrary("crypt_user");
	}

	public native long fun(int i);
}
