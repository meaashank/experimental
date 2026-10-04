package androidx.compose.foundation.text.selection;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import androidx.compose.foundation.text.Handle;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95011e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handle f95012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SelectionHandleAnchor f95014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95015d;

    public /* synthetic */ s(Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10, C4969v c4969v) {
        this(handle, j10, selectionHandleAnchor, z10);
    }

    public static s f(s sVar, Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handle = sVar.f95012a;
        }
        if ((i10 & 2) != 0) {
            j10 = sVar.f95013b;
        }
        if ((i10 & 4) != 0) {
            selectionHandleAnchor = sVar.f95014c;
        }
        if ((i10 & 8) != 0) {
            z10 = sVar.f95015d;
        }
        sVar.getClass();
        SelectionHandleAnchor selectionHandleAnchor2 = selectionHandleAnchor;
        return new s(handle, j10, selectionHandleAnchor2, z10);
    }

    @NotNull
    public final Handle a() {
        return this.f95012a;
    }

    public final long b() {
        return this.f95013b;
    }

    @NotNull
    public final SelectionHandleAnchor c() {
        return this.f95014c;
    }

    public final boolean d() {
        return this.f95015d;
    }

    @NotNull
    public final s e(@NotNull Handle handle, long j10, @NotNull SelectionHandleAnchor selectionHandleAnchor, boolean z10) {
        return new s(handle, j10, selectionHandleAnchor, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f95012a == sVar.f95012a && P.g.l(this.f95013b, sVar.f95013b) && this.f95014c == sVar.f95014c && this.f95015d == sVar.f95015d;
    }

    @NotNull
    public final SelectionHandleAnchor g() {
        return this.f95014c;
    }

    @NotNull
    public final Handle h() {
        return this.f95012a;
    }

    public int hashCode() {
        return C1635o.a(this.f95015d) + ((this.f95014c.hashCode() + ((C1550p.a(this.f95013b) + (this.f95012a.hashCode() * 31)) * 31)) * 31);
    }

    public final long i() {
        return this.f95013b;
    }

    public final boolean j() {
        return this.f95015d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f95012a);
        sb2.append(", position=");
        sb2.append((Object) P.g.y(this.f95013b));
        sb2.append(", anchor=");
        sb2.append(this.f95014c);
        sb2.append(", visible=");
        return C1636p.a(sb2, this.f95015d, ')');
    }

    public s(Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10) {
        this.f95012a = handle;
        this.f95013b = j10;
        this.f95014c = selectionHandleAnchor;
        this.f95015d = z10;
    }
}
