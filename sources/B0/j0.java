package b0;

import android.text.StaticLayout;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(33)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f120646a = new j0();

    @dd.o
    @InterfaceC4345t
    public static final boolean a(@NotNull StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    @dd.o
    @InterfaceC4345t
    public static final void b(@NotNull StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(i0.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
