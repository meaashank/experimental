package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1915#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
public class C4854a0 {
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K> Map<K, Integer> a(@NotNull Y<T, ? extends K> y10) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            K kA = y10.a(itB.next());
            Object intRef = linkedHashMap.get(kA);
            if (intRef == null && !linkedHashMap.containsKey(kA)) {
                intRef = new Ref.IntRef();
            }
            Ref.IntRef intRef2 = (Ref.IntRef) intRef;
            intRef2.f217902a++;
            linkedHashMap.put(kA, intRef2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.G.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            kotlin.jvm.internal.Y.m(entry).setValue(Integer.valueOf(((Ref.IntRef) entry.getValue()).f217902a));
        }
        return kotlin.jvm.internal.Y.k(linkedHashMap);
    }

    @InterfaceC4850b0
    @Xc.f
    public static final <K, V, R> Map<K, R> b(Map<K, V> map, ed.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> f10) {
        kotlin.jvm.internal.G.p(map, "<this>");
        kotlin.jvm.internal.G.p(f10, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.G.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            kotlin.jvm.internal.Y.m(entry).setValue(f10.invoke(entry));
        }
        return kotlin.jvm.internal.Y.k(map);
    }
}
