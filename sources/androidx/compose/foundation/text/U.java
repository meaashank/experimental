package androidx.compose.foundation.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class U implements androidx.compose.ui.text.input.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.L f93549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93551d;

    public U(@NotNull androidx.compose.ui.text.input.L l10, int i10, int i11) {
        this.f93549b = l10;
        this.f93550c = i10;
        this.f93551d = i11;
    }

    @Override // androidx.compose.ui.text.input.L
    public int a(int i10) {
        int iA = this.f93549b.a(i10);
        if (i10 >= 0 && i10 <= this.f93551d) {
            V.h(iA, this.f93550c, i10);
        }
        return iA;
    }

    @Override // androidx.compose.ui.text.input.L
    public int b(int i10) {
        int iB = this.f93549b.b(i10);
        if (i10 >= 0 && i10 <= this.f93550c) {
            V.g(iB, this.f93551d, i10);
        }
        return iB;
    }
}
