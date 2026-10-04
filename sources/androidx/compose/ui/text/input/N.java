package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.L;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class N implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104722c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f104723b;

    public N() {
        this((char) 0, 1, null);
    }

    @Override // androidx.compose.ui.text.input.g0
    @NotNull
    public e0 a(@NotNull AnnotatedString annotatedString) {
        AnnotatedString annotatedString2 = new AnnotatedString(kotlin.text.F.x2(String.valueOf(this.f104723b), annotatedString.f104196a.length()), null, null, 6, null);
        L.f104710a.getClass();
        return new e0(annotatedString2, L.a.f104712b);
    }

    public final char b() {
        return this.f104723b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && this.f104723b == ((N) obj).f104723b;
    }

    public int hashCode() {
        return this.f104723b;
    }

    public N(char c10) {
        this.f104723b = c10;
    }

    public /* synthetic */ N(char c10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? (char) 8226 : c10);
    }
}
