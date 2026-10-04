package androidx.compose.ui.text;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104390e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final I f104391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final I f104392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final I f104393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final I f104394d;

    public T() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final I a() {
        return this.f104392b;
    }

    @Nullable
    public final I b() {
        return this.f104393c;
    }

    @Nullable
    public final I c() {
        return this.f104394d;
    }

    @Nullable
    public final I d() {
        return this.f104391a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return kotlin.jvm.internal.G.g(this.f104391a, t10.f104391a) && kotlin.jvm.internal.G.g(this.f104392b, t10.f104392b) && kotlin.jvm.internal.G.g(this.f104393c, t10.f104393c) && kotlin.jvm.internal.G.g(this.f104394d, t10.f104394d);
    }

    public int hashCode() {
        I i10 = this.f104391a;
        int iHashCode = (i10 != null ? i10.hashCode() : 0) * 31;
        I i11 = this.f104392b;
        int iHashCode2 = (iHashCode + (i11 != null ? i11.hashCode() : 0)) * 31;
        I i12 = this.f104393c;
        int iHashCode3 = (iHashCode2 + (i12 != null ? i12.hashCode() : 0)) * 31;
        I i13 = this.f104394d;
        return iHashCode3 + (i13 != null ? i13.hashCode() : 0);
    }

    public T(@Nullable I i10, @Nullable I i11, @Nullable I i12, @Nullable I i13) {
        this.f104391a = i10;
        this.f104392b = i11;
        this.f104393c = i12;
        this.f104394d = i13;
    }

    public /* synthetic */ T(I i10, I i11, I i12, I i13, int i14, C4969v c4969v) {
        this((i14 & 1) != 0 ? null : i10, (i14 & 2) != 0 ? null : i11, (i14 & 4) != 0 ? null : i12, (i14 & 8) != 0 ? null : i13);
    }
}
