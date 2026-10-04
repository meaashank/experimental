package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.C2411j;
import androidx.work.m;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f120309a;

    public a() {
        this.f120309a = C2411j.a(Looper.getMainLooper());
    }

    @Override // androidx.work.m
    public void a(@NonNull Runnable runnable) {
        this.f120309a.removeCallbacks(runnable);
    }

    @Override // androidx.work.m
    public void b(long delayInMillis, @NonNull Runnable runnable) {
        this.f120309a.postDelayed(runnable, delayInMillis);
    }

    @NonNull
    public Handler c() {
        return this.f120309a;
    }

    @f0
    public a(@NonNull Handler handler) {
        this.f120309a = handler;
    }
}
