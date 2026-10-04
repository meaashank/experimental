package Jb;

import androidx.collection.C1550p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58212b;

    public i(int i10, long j10) {
        this.f58211a = i10;
        this.f58212b = j10;
    }

    public static i d(i iVar, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iVar.f58211a;
        }
        if ((i11 & 2) != 0) {
            j10 = iVar.f58212b;
        }
        iVar.getClass();
        return new i(i10, j10);
    }

    public final int a() {
        return this.f58211a;
    }

    public final long b() {
        return this.f58212b;
    }

    @NotNull
    public final i c(int i10, long j10) {
        return new i(i10, j10);
    }

    public final long e() {
        return this.f58212b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58211a == iVar.f58211a && this.f58212b == iVar.f58212b;
    }

    public final int f() {
        return this.f58211a;
    }

    public int hashCode() {
        return C1550p.a(this.f58212b) + (this.f58211a * 31);
    }

    @NotNull
    public String toString() {
        return "FileSliceInfo(slicingCount=" + this.f58211a + ", bytesPerFileSlice=" + this.f58212b + ")";
    }
}
