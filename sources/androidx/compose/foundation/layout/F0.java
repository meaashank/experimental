package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AbstractC1673d;
import androidx.compose.foundation.layout.B;
import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class F0 extends p.d implements androidx.compose.ui.node.n0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f90367o = 0;

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a extends F0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f90368q = 8;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public ed.l<? super androidx.compose.ui.layout.Y, Integer> f90369p;

        public a(@NotNull ed.l<? super androidx.compose.ui.layout.Y, Integer> lVar) {
            this.f90369p = lVar;
        }

        @NotNull
        public final ed.l<androidx.compose.ui.layout.Y, Integer> e3() {
            return this.f90369p;
        }

        public final void f3(@NotNull ed.l<? super androidx.compose.ui.layout.Y, Integer> lVar) {
            this.f90369p = lVar;
        }

        @Override // androidx.compose.foundation.layout.F0, androidx.compose.ui.node.n0
        @NotNull
        public Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
            A0 a02 = obj instanceof A0 ? (A0) obj : null;
            if (a02 == null) {
                a02 = new A0(0.0f, false, null, null, 15, null);
            }
            B.c cVar = B.f90242a;
            AbstractC1673d.a aVar = new AbstractC1673d.a(this.f90369p);
            cVar.getClass();
            a02.f90176c = new B.a(aVar);
            return a02;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class b extends F0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f90370q = 8;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public AbstractC2155a f90371p;

        public b(@NotNull AbstractC2155a abstractC2155a) {
            this.f90371p = abstractC2155a;
        }

        @NotNull
        public final AbstractC2155a e3() {
            return this.f90371p;
        }

        public final void f3(@NotNull AbstractC2155a abstractC2155a) {
            this.f90371p = abstractC2155a;
        }

        @Override // androidx.compose.foundation.layout.F0, androidx.compose.ui.node.n0
        @NotNull
        public Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
            A0 a02 = obj instanceof A0 ? (A0) obj : null;
            if (a02 == null) {
                a02 = new A0(0.0f, false, null, null, 15, null);
            }
            B.c cVar = B.f90242a;
            AbstractC1673d.b bVar = new AbstractC1673d.b(this.f90371p);
            cVar.getClass();
            a02.f90176c = new B.a(bVar);
            return a02;
        }
    }

    public F0() {
    }

    @Override // androidx.compose.ui.node.n0
    @Nullable
    public abstract Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj);

    public F0(C4969v c4969v) {
    }
}
