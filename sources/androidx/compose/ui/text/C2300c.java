package androidx.compose.ui.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2300c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f104415a = false;

    @NotNull
    public static final G a(@Nullable E e10, @Nullable D d10) {
        return new G(e10, d10);
    }

    @NotNull
    public static final D b(@NotNull D d10, @NotNull D d11, float f10) {
        return d10.f104230a == d11.f104230a ? d10 : new D(((C2330h) SpanStyleKt.d(new C2330h(d10.f104231b), new C2330h(d11.f104231b), f10)).f104676a, ((Boolean) SpanStyleKt.d(Boolean.valueOf(d10.f104230a), Boolean.valueOf(d11.f104230a), f10)).booleanValue());
    }

    @NotNull
    public static final E c(@NotNull E e10, @NotNull E e11, float f10) {
        return e10;
    }
}
