package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,169:1\n310#2:170\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n128#1:170\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1834e implements androidx.compose.ui.window.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94977d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f94978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f94979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f94980c;

    public C1834e(@NotNull androidx.compose.ui.c cVar, @NotNull i iVar) {
        this.f94978a = cVar;
        this.f94979b = iVar;
        P.g.f65503b.getClass();
        this.f94980c = P.g.f65504c;
    }

    @Override // androidx.compose.ui.window.j
    public long a(@NotNull k0.v vVar, long j10, @NotNull LayoutDirection layoutDirection, long j11) {
        long jA = this.f94979b.a();
        if (!P.h.d(jA)) {
            jA = this.f94980c;
        }
        this.f94980c = jA;
        androidx.compose.ui.c cVar = this.f94978a;
        k0.x.f214338b.getClass();
        return k0.t.r(k0.t.r(vVar.E(), k0.u.g(jA)), cVar.a(j11, k0.x.f214339c, layoutDirection));
    }
}
