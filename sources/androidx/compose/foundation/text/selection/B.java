package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.S;
import androidx.compose.ui.text.input.L;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class B extends AbstractC1830a<B> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f94670k = 0;

    public B(AnnotatedString annotatedString, long j10, S s10, L l10, C c10) {
        super(annotatedString, j10, s10, l10, c10);
    }

    public B(AnnotatedString annotatedString, long j10, S s10, L l10, C c10, C4969v c4969v) {
        super(annotatedString, j10, s10, l10, c10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public B(AnnotatedString annotatedString, long j10, S s10, L l10, C c10, int i10, C4969v c4969v) {
        S s11 = (i10 & 4) != 0 ? null : s10;
        if ((i10 & 8) != 0) {
            L.f104710a.getClass();
            l10 = L.a.f104712b;
        }
        super(annotatedString, j10, s11, l10, (i10 & 16) != 0 ? new C() : c10);
    }
}
