LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := crypt_user
LOCAL_SRC_FILES := crypt_user.cpp
LOCAL_SHARED_LIBRARIES := cryptopp

include $(BUILD_SHARED_LIBRARY)
