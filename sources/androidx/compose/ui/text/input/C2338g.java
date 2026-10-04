package androidx.compose.ui.text.input;

import androidx.activity.C1477d;
import androidx.collection.M0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,570:1\n23#2,3:571\n32#2,4:574\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:571,3\n273#1:574,4\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2338g implements InterfaceC2340i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104797c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104799b;

    public C2338g(int i10, int i11) {
        this.f104798a = i10;
        this.f104799b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(M0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        int i10 = c2342k.f104811c;
        int i11 = this.f104799b;
        int iB = i10 + i11;
        if (((i10 ^ iB) & (i11 ^ iB)) < 0) {
            iB = c2342k.f104809a.b();
        }
        c2342k.c(c2342k.f104811c, Math.min(iB, c2342k.f104809a.b()));
        int i12 = c2342k.f104810b;
        int i13 = this.f104798a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        c2342k.c(Math.max(0, i14), c2342k.f104810b);
    }

    public final int b() {
        return this.f104799b;
    }

    public final int c() {
        return this.f104798a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2338g)) {
            return false;
        }
        C2338g c2338g = (C2338g) obj;
        return this.f104798a == c2338g.f104798a && this.f104799b == c2338g.f104799b;
    }

    public int hashCode() {
        return (this.f104798a * 31) + this.f104799b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f104798a);
        sb2.append(", lengthAfterCursor=");
        return C1477d.a(sb2, this.f104799b, ')');
    }
}
