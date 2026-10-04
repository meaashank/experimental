package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import e.InterfaceC4345t;
import e.T;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x2.InterfaceC5780b;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallerInitializer implements InterfaceC5780b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f116150a = 5000;

    @T(16)
    public static class a {
        @InterfaceC4345t
        public static void b(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.m
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    @T(28)
    public static class b {
        @InterfaceC4345t
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void g(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                i.j(context);
            }
        });
    }

    @Override // x2.InterfaceC5780b
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        e(context.getApplicationContext());
        return new c();
    }

    @Override // x2.InterfaceC5780b
    @NonNull
    public List<Class<? extends InterfaceC5780b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    @T(16)
    public void e(@NonNull final Context context) {
        a.b(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f116215a.f(context);
            }
        });
    }

    public void f(@NonNull final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
