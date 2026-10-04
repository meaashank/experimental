package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    @e.T(23)
    public static class a {
        public static void a(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i10, intent, onFinished, handler, str, bundle);
        }
    }

    @e.T(26)
    public static class b {
        public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
            return PendingIntent.getForegroundService(context, i10, intent, i11);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    public static class d implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public PendingIntent.OnFinished f110976b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f110975a = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f110977c = false;

        public d(@Nullable PendingIntent.OnFinished onFinished) {
            this.f110976b = onFinished;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f110977c) {
                this.f110976b = null;
            }
            this.f110975a.countDown();
        }

        public void d() {
            this.f110977c = true;
        }

        @Nullable
        public PendingIntent.OnFinished k() {
            if (this.f110976b == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.T
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
                    this.f110978a.l(pendingIntent, intent, i10, str, bundle);
                }
            };
        }

        public final void l(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
            boolean z10 = false;
            while (true) {
                try {
                    this.f110975a.await();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i10 = i10;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th) {
                    if (!z10) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.f110976b;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i10, str, bundle);
                this.f110976b = null;
            }
        }
    }

    public static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    @NonNull
    public static PendingIntent b(@NonNull Context context, int i10, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, @Nullable Bundle bundle, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11), bundle);
    }

    @NonNull
    public static PendingIntent c(@NonNull Context context, int i10, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11));
    }

    @Nullable
    public static PendingIntent d(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @Nullable Bundle bundle, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11), bundle);
    }

    @Nullable
    public static PendingIntent e(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }

    @Nullable
    public static PendingIntent f(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getBroadcast(context, i10, intent, a(z10, i11));
    }

    @NonNull
    @e.T(26)
    public static PendingIntent g(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return b.a(context, i10, intent, a(z10, i11));
    }

    @Nullable
    public static PendingIntent h(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getService(context, i10, intent, a(z10, i11));
    }

    @SuppressLint({"LambdaLast"})
    public static void i(@NonNull PendingIntent pendingIntent, int i10, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(i10, dVar.k(), handler);
            dVar.f110977c = true;
            dVar.close();
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void j(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        k(pendingIntent, context, i10, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void k(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(context, i10, intent, onFinished, handler, str, bundle);
            dVar.f110977c = true;
            dVar.close();
        } finally {
        }
    }
}
