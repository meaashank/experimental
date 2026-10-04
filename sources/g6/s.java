package g6;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
public class s implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202273a;

    public s(int i10) {
        this.f202273a = i10;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        try {
            Process.setThreadPriority(this.f202273a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() { // from class: g6.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f202271a.b(runnable);
            }
        });
    }
}
