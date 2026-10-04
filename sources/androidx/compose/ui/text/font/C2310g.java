package androidx.compose.ui.text.font;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2310g implements W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104619c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104620b;

    public C2310g(int i10) {
        this.f104620b = i10;
    }

    public static C2310g g(C2310g c2310g, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c2310g.f104620b;
        }
        c2310g.getClass();
        return new C2310g(i10);
    }

    @Override // androidx.compose.ui.text.font.W
    public AbstractC2325w a(AbstractC2325w abstractC2325w) {
        return abstractC2325w;
    }

    @Override // androidx.compose.ui.text.font.W
    @NotNull
    public L b(@NotNull L l10) {
        int i10 = this.f104620b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? l10 : new L(md.u.K(l10.f104572a + i10, 1, 1000));
    }

    @Override // androidx.compose.ui.text.font.W
    public int c(int i10) {
        return i10;
    }

    @Override // androidx.compose.ui.text.font.W
    public int d(int i10) {
        return i10;
    }

    public final int e() {
        return this.f104620b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2310g) && this.f104620b == ((C2310g) obj).f104620b;
    }

    @NotNull
    public final C2310g f(int i10) {
        return new C2310g(i10);
    }

    public int hashCode() {
        return this.f104620b;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f104620b, ')');
    }
}
