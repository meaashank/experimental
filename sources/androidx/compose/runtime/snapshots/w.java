package androidx.compose.runtime.snapshots;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f100197a = new Object();

    public static final /* synthetic */ Void b() {
        e();
        throw null;
    }

    public static final /* synthetic */ Void c() {
        f();
        throw null;
    }

    public static final Void e() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    public static final Void f() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final void g(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }
}
