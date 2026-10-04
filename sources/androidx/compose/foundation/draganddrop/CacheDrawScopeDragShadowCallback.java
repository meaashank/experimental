package androidx.compose.foundation.draganddrop;

import P.n;
import android.graphics.Picture;
import androidx.compose.foundation.L;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.l;
import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.G;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.drawscope.h;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@V({"SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,146:1\n256#2:147\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n*L\n118#1:147\n*E\n"})
public final class CacheDrawScopeDragShadowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Picture f89076a;

    @NotNull
    public final l a(@NotNull CacheDrawScope cacheDrawScope) {
        final Picture picture = new Picture();
        this.f89076a = picture;
        final int iT = (int) n.t(cacheDrawScope.f100479a.e());
        final int iM = (int) n.m(cacheDrawScope.f100479a.e());
        return cacheDrawScope.N(new ed.l<androidx.compose.ui.graphics.drawscope.d, L0>() { // from class: androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback$cachePicture$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull androidx.compose.ui.graphics.drawscope.d dVar) {
                C0 c0B = H.b(picture.beginRecording(iT, iM));
                LayoutDirection layoutDirection = dVar.getLayoutDirection();
                long jE = dVar.e();
                InterfaceC4814e interfaceC4814eA = dVar.l1().a();
                LayoutDirection layoutDirection2 = dVar.l1().getLayoutDirection();
                C0 c0G = dVar.l1().g();
                long jE2 = dVar.l1().e();
                GraphicsLayer graphicsLayerI = dVar.l1().i();
                f fVarL1 = dVar.l1();
                fVarL1.f(dVar);
                fVarL1.d(layoutDirection);
                fVarL1.l(c0B);
                fVarL1.h(jE);
                fVarL1.k(null);
                G g10 = (G) c0B;
                g10.A();
                try {
                    dVar.s1();
                    g10.r();
                    f fVarL12 = dVar.l1();
                    fVarL12.f(interfaceC4814eA);
                    fVarL12.d(layoutDirection2);
                    fVarL12.l(c0G);
                    fVarL12.h(jE2);
                    fVarL12.k(graphicsLayerI);
                    picture.endRecording();
                    H.d(dVar.l1().g()).drawPicture(picture);
                } catch (Throwable th) {
                    g10.r();
                    f fVarL13 = dVar.l1();
                    fVarL13.f(interfaceC4814eA);
                    fVarL13.d(layoutDirection2);
                    fVarL13.l(c0G);
                    fVarL13.h(jE2);
                    fVarL13.k(graphicsLayerI);
                    throw th;
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                e(dVar);
                return L0.f217464a;
            }
        });
    }

    public final void b(@NotNull h hVar) {
        Picture picture = this.f89076a;
        if (picture == null) {
            throw new IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
        }
        H.d(hVar.l1().g()).drawPicture(picture);
    }
}
