package androidx.compose.foundation.text;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1757d implements androidx.compose.ui.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1757d f93566a = new C1757d();

    @Override // androidx.compose.ui.t
    public float G1() {
        return 1.0f;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // androidx.compose.ui.t, kotlin.coroutines.i.b
    public i.c getKey() {
        return androidx.compose.ui.t.f104180N2;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }
}
