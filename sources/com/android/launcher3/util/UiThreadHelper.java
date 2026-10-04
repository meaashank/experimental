package com.android.launcher3.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public class UiThreadHelper {
    private static final int MSG_HIDE_KEYBOARD = 1;
    private static Handler sHandler;
    private static HandlerThread sHandlerThread;

    public static class UiCallbacks implements Handler.Callback {
        private final InputMethodManager mIMM;

        public UiCallbacks(Context context) {
            this.mIMM = (InputMethodManager) context.getSystemService(G7.a.f45348f);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            this.mIMM.hideSoftInputFromWindow((IBinder) message.obj, 0);
            return true;
        }
    }

    public static Looper getBackgroundLooper() {
        if (sHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("UiThreadHelper", -2);
            sHandlerThread = handlerThread;
            handlerThread.start();
        }
        return sHandlerThread.getLooper();
    }

    private static Handler getHandler(Context context) {
        if (sHandler == null) {
            sHandler = new Handler(getBackgroundLooper(), new UiCallbacks(context.getApplicationContext()));
        }
        return sHandler;
    }

    public static void hideKeyboardAsync(Context context, IBinder iBinder) {
        Message.obtain(getHandler(context), 1, iBinder).sendToTarget();
    }
}
