package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import e.InterfaceC4326A;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {

    @InterfaceC4326A("sLock")
    private static volatile Handler NOt;
    private static final Object ZRu = new Object();

    @InterfaceC4326A("sLock")
    private static final LinkedList<Runnable> mZ = new LinkedList<>();
    private static Object uR = new Object();

    public static class ZRu extends Handler {
        public ZRu(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    mZ.mZ();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler NOt() {
        Handler handler;
        if (NOt != null) {
            return NOt;
        }
        synchronized (ZRu) {
            try {
                if (NOt == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    NOt = new ZRu(handlerThread.getLooper());
                }
                handler = NOt;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ() {
        LinkedList linkedList;
        synchronized (uR) {
            try {
                synchronized (ZRu) {
                    LinkedList<Runnable> linkedList2 = mZ;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    NOt().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void ZRu(Runnable runnable, boolean z10) {
        try {
            Handler handlerNOt = NOt();
            synchronized (ZRu) {
                try {
                    mZ.add(runnable);
                    if (z10) {
                        handlerNOt.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerNOt.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
