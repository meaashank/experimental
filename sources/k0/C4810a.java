package k0;

import android.content.Context;
import l0.C5131b;
import l0.InterfaceC5130a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4810a {
    @NotNull
    public static final InterfaceC4814e a(@NotNull Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        InterfaceC5130a interfaceC5130aB = C5131b.f220897a.b(f10);
        if (interfaceC5130aB == null) {
            interfaceC5130aB = new z(f10);
        }
        return new h(f11, f10, interfaceC5130aB);
    }
}
