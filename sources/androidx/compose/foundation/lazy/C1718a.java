package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C;
import androidx.compose.foundation.lazy.layout.J;
import androidx.compose.foundation.lazy.layout.O;
import androidx.compose.runtime.T1;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public final class C1718a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C.b f91186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f91187d;

    public C1718a() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.v
    public void a(@NotNull J j10, int i10) {
        int i11 = this.f91184a;
        for (int i12 = 0; i12 < i11; i12++) {
            j10.a(i10 + i12);
        }
    }

    @Override // androidx.compose.foundation.lazy.v
    public /* synthetic */ O b() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.v
    public void c(@NotNull t tVar, float f10, @NotNull o oVar) {
        C.b bVar;
        C.b bVar2;
        C.b bVar3;
        if (oVar.i().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((l) U.u3(oVar.i())).getIndex() + 1 : ((l) U.G2(oVar.i())).getIndex() - 1;
        if (index < 0 || index >= oVar.g()) {
            return;
        }
        if (index != this.f91185b) {
            if (this.f91187d != z10 && (bVar3 = this.f91186c) != null) {
                bVar3.cancel();
            }
            this.f91187d = z10;
            this.f91185b = index;
            this.f91186c = tVar.a(index);
        }
        if (!z10) {
            if (oVar.d() - ((l) U.G2(oVar.i())).getOffset() >= f10 || (bVar = this.f91186c) == null) {
                return;
            }
            bVar.a();
            return;
        }
        l lVar = (l) U.u3(oVar.i());
        if (((lVar.getSize() + lVar.getOffset()) + oVar.h()) - oVar.e() >= (-f10) || (bVar2 = this.f91186c) == null) {
            return;
        }
        bVar2.a();
    }

    @Override // androidx.compose.foundation.lazy.v
    public void d(@NotNull t tVar, @NotNull o oVar) {
        if (this.f91185b == -1 || oVar.i().isEmpty()) {
            return;
        }
        if (this.f91185b != (this.f91187d ? ((l) U.u3(oVar.i())).getIndex() + 1 : ((l) U.G2(oVar.i())).getIndex() - 1)) {
            this.f91185b = -1;
            C.b bVar = this.f91186c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f91186c = null;
        }
    }

    public C1718a(int i10) {
        this.f91184a = i10;
        this.f91185b = -1;
    }

    public /* synthetic */ C1718a(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
