package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.C2037h2;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @V({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,791:1\n33#2,7:792\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n*L\n745#1:792,7\n*E\n"})
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f101078a;

        public a(f fVar) {
            this.f101078a = fVar;
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public long Y() {
            return P.o.b(this.f101078a.e());
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void a(@NotNull float[] fArr) {
            this.f101078a.g().B(fArr);
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void b(float f10, float f11, float f12, float f13, int i10) {
            this.f101078a.g().b(f10, f11, f12, f13, i10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void c(float f10, float f11) {
            this.f101078a.g().c(f10, f11);
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void d(@NotNull Path path, int i10) {
            this.f101078a.g().d(path, i10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public long e() {
            return this.f101078a.e();
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void f(float f10, float f11, long j10) {
            C0 c0G = this.f101078a.g();
            c0G.c(P.g.p(j10), P.g.r(j10));
            c0G.n(f10, f11);
            c0G.c(-P.g.p(j10), -P.g.r(j10));
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void g(float f10, long j10) {
            C0 c0G = this.f101078a.g();
            c0G.c(P.g.p(j10), P.g.r(j10));
            c0G.y(f10);
            c0G.c(-P.g.p(j10), -P.g.r(j10));
        }

        @Override // androidx.compose.ui.graphics.drawscope.m
        public void h(float f10, float f11, float f12, float f13) {
            C0 c0G = this.f101078a.g();
            f fVar = this.f101078a;
            long jA = P.o.a(P.n.t(fVar.e()) - (f12 + f10), P.n.m(this.f101078a.e()) - (f13 + f11));
            if (!(P.n.t(jA) >= 0.0f && P.n.m(jA) >= 0.0f)) {
                C2037h2.b("Width and height must be greater than or equal to zero");
                throw null;
            }
            fVar.h(jA);
            c0G.c(f10, f11);
        }
    }

    public static final m a(f fVar) {
        return new a(fVar);
    }

    public static final m b(f fVar) {
        return new a(fVar);
    }
}
