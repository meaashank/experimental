package b0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import d0.C4284a;
import d0.C4293j;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(34)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2753f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2753f f120643a = new C2753f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120644b = 0;

    public static final boolean b(ed.p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
    }

    @InterfaceC4345t
    @Nullable
    public final int[] c(@NotNull r0 r0Var, @NotNull RectF rectF, int i10, @NotNull final ed.p<? super RectF, ? super RectF, Boolean> pVar) {
        SegmentFinder segmentFinderA;
        if (i10 == 1) {
            segmentFinderA = C4284a.f194540a.a(new C4293j(r0Var.f120692g.getText(), r0Var.T()));
        } else {
            C2751d.a();
            segmentFinderA = C2748a.a(C2750c.a(r0Var.f120692g.getText(), r0Var.f120686a));
        }
        return r0Var.f120692g.getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: b0.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C2753f.b(pVar, rectF2, rectF3);
            }
        });
    }
}
