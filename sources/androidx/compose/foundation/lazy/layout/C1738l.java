package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.B;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
public final class C1738l {
    @NotNull
    public static final List<Integer> a(@NotNull InterfaceC1743q interfaceC1743q, @NotNull B b10, @NotNull C1734h c1734h) {
        md.l lVar;
        if (!c1734h.f91823a.V() && b10.f91535a.isEmpty()) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        if (c1734h.f91823a.V()) {
            lVar = new md.l(c1734h.c(), Math.min(c1734h.b(), interfaceC1743q.getItemCount() - 1), 1);
        } else {
            md.l.f221146e.getClass();
            lVar = md.l.f221147f;
        }
        int size = b10.f91535a.size();
        for (int i10 = 0; i10 < size; i10++) {
            B.a aVar = b10.get(i10);
            int iA = r.a(interfaceC1743q, aVar.getKey(), aVar.getIndex());
            int i11 = lVar.f221139a;
            if ((iA > lVar.f221140b || i11 > iA) && iA >= 0 && iA < interfaceC1743q.getItemCount()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int i12 = lVar.f221139a;
        int i13 = lVar.f221140b;
        if (i12 <= i13) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }
}
