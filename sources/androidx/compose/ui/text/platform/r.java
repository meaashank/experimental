package androidx.compose.ui.text.platform;

import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.emoji2.text.c;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public X1<Boolean> f104929a;

    public static final class a extends c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0<Boolean> f104930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f104931b;

        public a(L0<Boolean> l02, r rVar) {
            this.f104930a = l02;
            this.f104931b = rVar;
        }

        @Override // androidx.emoji2.text.c.g
        public void a(@Nullable Throwable th) {
            this.f104931b.f104929a = v.f104944a;
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            this.f104930a.setValue(Boolean.TRUE);
            this.f104931b.f104929a = new w(true);
        }
    }

    public r() {
        this.f104929a = androidx.emoji2.text.c.q() ? c() : null;
    }

    @Override // androidx.compose.ui.text.platform.u
    @NotNull
    public X1<Boolean> a() {
        X1<Boolean> x12 = this.f104929a;
        if (x12 != null) {
            G.m(x12);
            return x12;
        }
        if (!androidx.emoji2.text.c.q()) {
            return v.f104944a;
        }
        X1<Boolean> x1C = c();
        this.f104929a = x1C;
        return x1C;
    }

    public final X1<Boolean> c() {
        androidx.emoji2.text.c cVarC = androidx.emoji2.text.c.c();
        if (cVarC.i() == 1) {
            return new w(true);
        }
        L0 l0G = M1.g(Boolean.FALSE, null, 2, null);
        cVarC.B(new a(l0G, this));
        return l0G;
    }
}
