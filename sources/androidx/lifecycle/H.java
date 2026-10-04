package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e.InterfaceC4335i;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class H extends Service implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h0 f114002a = new h0(this);

    @Override // androidx.lifecycle.B
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f114002a.a();
    }

    @Override // android.app.Service
    @InterfaceC4335i
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        kotlin.jvm.internal.G.p(intent, "intent");
        this.f114002a.b();
        return null;
    }

    @Override // android.app.Service
    @InterfaceC4335i
    public void onCreate() {
        this.f114002a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @InterfaceC4335i
    public void onDestroy() {
        this.f114002a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC4335i
    @InterfaceC4982o(message = "Deprecated in Java")
    public void onStart(@Nullable Intent intent, int i10) {
        this.f114002a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    @InterfaceC4335i
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
