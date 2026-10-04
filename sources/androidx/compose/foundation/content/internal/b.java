package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.e;
import androidx.compose.foundation.content.f;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88953e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ReceiveContentNode f88954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e f88955d = new a();

    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88956a;

        public a() {
        }

        @Override // androidx.compose.foundation.content.e
        public void a() {
            int i10 = this.f88956a + 1;
            this.f88956a = i10;
            if (i10 == 1) {
                b.this.f88954c.f88923r.a();
            }
            e eVarD = b.this.d();
            if (eVarD != null) {
                eVarD.a();
            }
        }

        @Override // androidx.compose.foundation.content.e
        public void b() {
            this.f88956a = 0;
            b.this.f88954c.f88923r.b();
        }

        @Override // androidx.compose.foundation.content.e
        @Nullable
        public f c(@NotNull f fVar) {
            f fVarC = b.this.f88954c.f88923r.c(fVar);
            if (fVarC == null) {
                return null;
            }
            e eVarD = b.this.d();
            return eVarD == null ? fVarC : eVarD.c(fVarC);
        }

        @Override // androidx.compose.foundation.content.e
        public void d() {
            int i10 = this.f88956a;
            int i11 = i10 - 1;
            if (i11 < 0) {
                i11 = 0;
            }
            this.f88956a = i11;
            if (i11 == 0 && i10 > 0) {
                b.this.f88954c.f88923r.d();
            }
            e eVarD = b.this.d();
            if (eVarD != null) {
                eVarD.d();
            }
        }

        @Override // androidx.compose.foundation.content.e
        public void onDragEnd() {
            b.this.f88954c.f88923r.onDragEnd();
            this.f88956a = 0;
        }
    }

    public b(@NotNull ReceiveContentNode receiveContentNode) {
        this.f88954c = receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.c
    @NotNull
    public e a() {
        return this.f88955d;
    }

    public final e d() {
        c cVarB = ReceiveContentConfigurationKt.b(this.f88954c);
        if (cVarB != null) {
            return cVarB.a();
        }
        return null;
    }

    @NotNull
    public final ReceiveContentNode e() {
        return this.f88954c;
    }
}
