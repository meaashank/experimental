package androidx.lifecycle;

import android.app.Application;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2589b extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Application f114177b;

    public C2589b(@NotNull Application application) {
        kotlin.jvm.internal.G.p(application, "application");
        this.f114177b = application;
    }

    @NotNull
    public <T extends Application> T h() {
        T t10 = (T) this.f114177b;
        kotlin.jvm.internal.G.n(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
