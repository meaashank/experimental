package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class W0 implements InterfaceC1798o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final W0 f94045b = new W0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94046c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94047d = 13;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94048e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94049f = 65279;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f94050g = 0;

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1798o
    public int a(int i10, int i11) {
        if (i11 == 10) {
            return 32;
        }
        return i11 == 13 ? f94049f : i11;
    }

    @NotNull
    public String toString() {
        return "SingleLineCodepointTransformation";
    }
}
