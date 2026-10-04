package b0;

import A0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,86:1\n33#1,6:87\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:87,6\n*E\n"})
public final class C2741T {
    public static final <T> void a(@NotNull List<? extends T> list, @NotNull ed.l<? super T, L0> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C b(@NotNull List<? extends T> list, @NotNull C c10, @NotNull ed.l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(lVar.invoke(list.get(i10)));
        }
        return c10;
    }

    @NotNull
    public static final <T, R> List<R> c(@NotNull List<? extends T> list, @NotNull ed.p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() == 0 || list.size() == 1) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a.b.C0001a c0001a = list.get(0);
        int iL = kotlin.collections.I.L(list);
        while (i10 < iL) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(pVar.invoke(c0001a, t10));
            c0001a = t10;
        }
        return arrayList;
    }
}
