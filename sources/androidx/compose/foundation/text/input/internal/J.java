package androidx.compose.foundation.text.input.internal;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = androidx.compose.ui.text.Z.l(j10);
        int iK = androidx.compose.ui.text.Z.k(j10);
        if (androidx.compose.ui.text.Z.p(j11, j10)) {
            if (androidx.compose.ui.text.Z.d(j11, j10)) {
                iL = androidx.compose.ui.text.Z.l(j11);
                iK = iL;
            } else {
                if (androidx.compose.ui.text.Z.d(j10, j11)) {
                    iJ = androidx.compose.ui.text.Z.j(j11);
                } else if (androidx.compose.ui.text.Z.e(j11, iL)) {
                    iL = androidx.compose.ui.text.Z.l(j11);
                    iJ = androidx.compose.ui.text.Z.j(j11);
                } else {
                    iK = androidx.compose.ui.text.Z.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > androidx.compose.ui.text.Z.l(j11)) {
            iL -= androidx.compose.ui.text.Z.j(j11);
            iJ = androidx.compose.ui.text.Z.j(j11);
            iK -= iJ;
        }
        return androidx.compose.ui.text.a0.b(iL, iK);
    }
}
