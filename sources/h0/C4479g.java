package h0;

import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4479g {
    @NotNull
    public static final InterfaceC4482j a() {
        return Build.VERSION.SDK_INT >= 24 ? new C4477e() : new C4473a();
    }
}
