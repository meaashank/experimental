package androidx.compose.ui.platform;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2270p0 extends AbstractC2281t0 implements p.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f103908e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f103909d;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.p0$a */
    public final class a implements p.c {
        public a() {
        }

        @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
        public Object M(Object obj, ed.p pVar) {
            return pVar.invoke(this, obj);
        }

        @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
        public /* synthetic */ boolean O(ed.l lVar) {
            return androidx.compose.ui.q.b(this, lVar);
        }

        @Override // androidx.compose.ui.p
        public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
            return androidx.compose.ui.o.a(this, pVar);
        }

        @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
        public /* synthetic */ boolean S(ed.l lVar) {
            return androidx.compose.ui.q.a(this, lVar);
        }

        @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
        public Object l0(Object obj, ed.p pVar) {
            return pVar.invoke(obj, this);
        }
    }

    public C2270p0(@NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        super(lVar);
        this.f103909d = new a();
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return androidx.compose.ui.q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
        return androidx.compose.ui.o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return androidx.compose.ui.q.a(this, lVar);
    }

    @NotNull
    public final a e() {
        return this.f103909d;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
