package androidx.compose.ui.text.input;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2341j {
    public static final boolean b(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }
}
