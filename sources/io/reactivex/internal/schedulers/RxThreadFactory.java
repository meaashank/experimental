package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207007c;

    public static final class a extends Thread implements h {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f207005a + SignatureVisitor.SUPER + incrementAndGet();
        Thread aVar = this.f207007c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f207006b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return android.support.v4.media.e.a(new StringBuilder("RxThreadFactory["), this.f207005a, "]");
    }

    public RxThreadFactory(String str, int i10) {
        this(str, i10, false);
    }

    public RxThreadFactory(String str, int i10, boolean z10) {
        this.f207005a = str;
        this.f207006b = i10;
        this.f207007c = z10;
    }
}
