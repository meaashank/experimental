package U2;

import androidx.annotation.NonNull;
import e.f0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class n implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f68437b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Runnable f68439d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f68436a = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f68438c = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f68440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f68441b;

        public a(@NonNull n serialExecutor, @NonNull Runnable runnable) {
            this.f68440a = serialExecutor;
            this.f68441b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f68441b.run();
            } finally {
                this.f68440a.c();
            }
        }
    }

    public n(@NonNull Executor executor) {
        this.f68437b = executor;
    }

    @NonNull
    @f0
    public Executor a() {
        return this.f68437b;
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f68438c) {
            z10 = !this.f68436a.isEmpty();
        }
        return z10;
    }

    public void c() {
        synchronized (this.f68438c) {
            try {
                a aVarPoll = this.f68436a.poll();
                this.f68439d = aVarPoll;
                if (aVarPoll != null) {
                    this.f68437b.execute(this.f68439d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable command) {
        synchronized (this.f68438c) {
            try {
                this.f68436a.add(new a(this, command));
                if (this.f68439d == null) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
