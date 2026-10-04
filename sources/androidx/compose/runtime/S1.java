package androidx.compose.runtime;

import androidx.activity.C1477d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f99336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99337b;

    public S1(@NotNull Object obj, int i10) {
        this.f99336a = obj;
        this.f99337b = i10;
    }

    public static S1 d(S1 s12, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = s12.f99336a;
        }
        if ((i11 & 2) != 0) {
            i10 = s12.f99337b;
        }
        s12.getClass();
        return new S1(obj, i10);
    }

    @NotNull
    public final Object a() {
        return this.f99336a;
    }

    public final int b() {
        return this.f99337b;
    }

    @NotNull
    public final S1 c(@NotNull Object obj, int i10) {
        return new S1(obj, i10);
    }

    public final int e() {
        return this.f99337b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1)) {
            return false;
        }
        S1 s12 = (S1) obj;
        return kotlin.jvm.internal.G.g(this.f99336a, s12.f99336a) && this.f99337b == s12.f99337b;
    }

    @NotNull
    public final Object f() {
        return this.f99336a;
    }

    public int hashCode() {
        return (this.f99336a.hashCode() * 31) + this.f99337b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb2.append(this.f99336a);
        sb2.append(", index=");
        return C1477d.a(sb2, this.f99337b, ')');
    }
}
