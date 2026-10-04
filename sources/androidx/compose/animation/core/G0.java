package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class G0<T> implements F<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87666d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final G f87669c;

    public G0() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof G0) {
            G0 g02 = (G0) obj;
            if (g02.f87667a == this.f87667a && g02.f87668b == this.f87668b && kotlin.jvm.internal.G.g(g02.f87669c, this.f87669c)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f87668b;
    }

    public final int g() {
        return this.f87667a;
    }

    @NotNull
    public final G h() {
        return this.f87669c;
    }

    public int hashCode() {
        return ((this.f87669c.hashCode() + (this.f87667a * 31)) * 31) + this.f87668b;
    }

    @Override // androidx.compose.animation.core.U, androidx.compose.animation.core.InterfaceC1587h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC1603p> a1<V> a(@NotNull H0<T, V> h02) {
        return new a1<>(this.f87667a, this.f87668b, this.f87669c);
    }

    public G0(int i10, int i11, @NotNull G g10) {
        this.f87667a = i10;
        this.f87668b = i11;
        this.f87669c = g10;
    }

    public /* synthetic */ G0(int i10, int i11, G g10, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? P.d() : g10);
    }
}
