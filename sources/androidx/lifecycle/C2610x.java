package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2610x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2610x f114384a = new C2610x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f114385b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.x$a */
    @e.f0
    public static final class a extends C2601n {
        @Override // androidx.lifecycle.C2601n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            kotlin.jvm.internal.G.p(activity, "activity");
            X.f114159b.d(activity);
        }
    }

    @dd.o
    public static final void a(@NotNull Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        if (f114385b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.G.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
