package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f211754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f211755c;

    public static final class a extends Thread implements h {
        public a(Runnable run, String name) {
            super(run, name);
        }
    }

    public RxThreadFactory(String prefix) {
        this(prefix, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@yc.e Runnable r10) {
        String str = this.f211753a + SignatureVisitor.SUPER + incrementAndGet();
        Thread aVar = this.f211755c ? new a(r10, str) : new Thread(r10, str);
        aVar.setPriority(this.f211754b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return android.support.v4.media.e.a(new StringBuilder("RxThreadFactory["), this.f211753a, "]");
    }

    public RxThreadFactory(String prefix, int priority) {
        this(prefix, priority, false);
    }

    public RxThreadFactory(String prefix, int priority, boolean nonBlocking) {
        this.f211753a = prefix;
        this.f211754b = priority;
        this.f211755c = nonBlocking;
    }
}
