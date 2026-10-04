package androidx.compose.ui.text.input;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2355y {
    public static final int a(int i10, int i11, @NotNull InterfaceC4376a<Integer> interfaceC4376a) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? interfaceC4376a.invoke().intValue() : i12;
    }

    public static final int b(int i10, int i11, @NotNull InterfaceC4376a<Integer> interfaceC4376a) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? interfaceC4376a.invoke().intValue() : i12;
    }
}
