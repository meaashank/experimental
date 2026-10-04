package xc;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import zc.W;

/* JADX INFO: renamed from: xc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5806c extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f240596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f240597c;

    /* JADX INFO: renamed from: xc.c$a */
    public static final class a extends W.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f240598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f240599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f240600c;

        public a(Handler handler, boolean z10) {
            this.f240598a = handler;
            this.f240599b = z10;
        }

        @Override // zc.W.c
        @SuppressLint({"NewApi"})
        public d c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f240600c) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableB0 = Ic.a.b0(runnable);
            Handler handler = this.f240598a;
            b bVar = new b(handler, runnableB0);
            Message messageObtain = Message.obtain(handler, bVar);
            messageObtain.obj = this;
            if (this.f240599b) {
                messageObtain.setAsynchronous(true);
            }
            this.f240598a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f240600c) {
                return bVar;
            }
            this.f240598a.removeCallbacks(bVar);
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f240600c = true;
            this.f240598a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f240600c;
        }
    }

    /* JADX INFO: renamed from: xc.c$b */
    public static final class b implements Runnable, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f240601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f240602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f240603c;

        public b(Handler handler, Runnable runnable) {
            this.f240601a = handler;
            this.f240602b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f240601a.removeCallbacks(this);
            this.f240603c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f240603c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f240602b.run();
            } catch (Throwable th) {
                Ic.a.Y(th);
            }
        }
    }

    public C5806c(Handler handler, boolean z10) {
        this.f240596b = handler;
        this.f240597c = z10;
    }

    @Override // zc.W
    public W.c c() {
        return new a(this.f240596b, this.f240597c);
    }

    @Override // zc.W
    @SuppressLint({"NewApi"})
    public d f(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableB0 = Ic.a.b0(runnable);
        Handler handler = this.f240596b;
        b bVar = new b(handler, runnableB0);
        Message messageObtain = Message.obtain(handler, bVar);
        if (this.f240597c) {
            messageObtain.setAsynchronous(true);
        }
        this.f240596b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return bVar;
    }
}
