#include <jni.h>
#include <cryptlib.h>

extern "C" {
jlong Java_pl_morgwai_ndktutorial_Native_fun
    (JNIEnv* env, jobject o, jint i) {
  long long t = CryptoPP::INFINITE_TIME / i;
  return t;
}
}
