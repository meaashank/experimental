package kc;

import android.os.Handler;
import android.os.Message;
import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import uc.C5666a;

/* JADX INFO: renamed from: kc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4840b extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f217425b;

    /* JADX INFO: renamed from: kc.b$a */
    public static final class a extends H.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f217426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f217427b;

        public a(Handler handler) {
            this.f217426a = handler;
        }

        @Override // hc.H.c
        public io.reactivex.disposables.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f217427b) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableB0 = C5666a.b0(runnable);
            Handler handler = this.f217426a;
            RunnableC0820b runnableC0820b = new RunnableC0820b(handler, runnableB0);
            Message messageObtain = Message.obtain(handler, runnableC0820b);
            messageObtain.obj = this;
            this.f217426a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f217427b) {
                return runnableC0820b;
            }
            this.f217426a.removeCallbacks(runnableC0820b);
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f217427b = true;
            this.f217426a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f217427b;
        }
    }

    /* JADX INFO: renamed from: kc.b$b, reason: collision with other inner class name */
    public static final class RunnableC0820b implements Runnable, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f217428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f217429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f217430c;

        public RunnableC0820b(Handler handler, Runnable runnable) {
            this.f217428a = handler;
            this.f217429b = runnable;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f217430c = true;
            this.f217428a.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f217430c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f217429b.run();
            } catch (Throwable th) {
                C5666a.Y(th);
            }
        }
    }

    public C4840b(Handler handler) {
        this.f217425b = handler;
    }

    @Override // hc.H
    public H.c c() {
        return new a(this.f217425b);
    }

    @Override // hc.H
    public io.reactivex.disposables.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableB0 = C5666a.b0(runnable);
        Handler handler = this.f217425b;
        RunnableC0820b runnableC0820b = new RunnableC0820b(handler, runnableB0);
        handler.postDelayed(runnableC0820b, timeUnit.toMillis(j10));
        return runnableC0820b;
    }
}
