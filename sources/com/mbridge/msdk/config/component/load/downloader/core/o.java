package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f154574a;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f154575a;

        public a(Runnable runnable) {
            this.f154575a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f154574a);
            } catch (Throwable th) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th.getMessage());
            }
            try {
                this.f154575a.run();
            } catch (Exception e10) {
                com.mbridge.msdk.config.component.common.express.node.m.a(e10, new StringBuilder("runnable error : "), "PriorityThreadFactory");
            }
        }
    }

    public o(int i10) {
        this.f154574a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
