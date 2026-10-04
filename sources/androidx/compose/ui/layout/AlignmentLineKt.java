package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AlignmentLineKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2182q f102376a = new C2182q(AlignmentLineKt$FirstBaseline$1.f102378a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2182q f102377b = new C2182q(AlignmentLineKt$LastBaseline$1.f102379a);

    @NotNull
    public static final C2182q a() {
        return f102376a;
    }

    @NotNull
    public static final C2182q b() {
        return f102377b;
    }

    public static final int c(@NotNull AbstractC2155a abstractC2155a, int i10, int i11) {
        return abstractC2155a.f102540a.invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
