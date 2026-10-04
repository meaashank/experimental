package kotlin.collections;

import A0.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
public class C4856b0 extends C4854a0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> c(@NotNull Y<T, ? extends K> y10, @NotNull ed.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y10.a(next);
            a.b bVar = (Object) linkedHashMap.get(objA);
            linkedHashMap.put(objA, operation.x(objA, bVar, next, Boolean.valueOf(bVar == null && !linkedHashMap.containsKey(objA))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M d(@NotNull Y<T, ? extends K> y10, @NotNull M destination, @NotNull ed.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y10.a(next);
            a.b bVar = (Object) destination.get(objA);
            destination.put(objA, operation.x(objA, bVar, next, Boolean.valueOf(bVar == null && !destination.containsKey(objA))));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, M extends Map<? super K, Integer>> M e(@NotNull Y<T, ? extends K> y10, @NotNull M destination) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            K kA = y10.a(itB.next());
            Object obj = destination.get(kA);
            if (obj == null && !destination.containsKey(kA)) {
                obj = 0;
            }
            destination.put(kA, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> f(@NotNull Y<T, ? extends K> y10, @NotNull ed.p<? super K, ? super T, ? extends R> initialValueSelector, @NotNull ed.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.G.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y10.a(next);
            R rInvoke = (Object) linkedHashMap.get(objA);
            if (rInvoke == null && !linkedHashMap.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            linkedHashMap.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R> Map<K, R> g(@NotNull Y<T, ? extends K> y10, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = y10.a(next);
            a.b.C0001a c0001a = (Object) linkedHashMap.get(kA);
            if (c0001a == null && !linkedHashMap.containsKey(kA)) {
                c0001a = (Object) r10;
            }
            linkedHashMap.put(kA, operation.invoke(c0001a, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M h(@NotNull Y<T, ? extends K> y10, @NotNull M destination, @NotNull ed.p<? super K, ? super T, ? extends R> initialValueSelector, @NotNull ed.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            Object objA = y10.a(next);
            R rInvoke = (Object) destination.get(objA);
            if (rInvoke == null && !destination.containsKey(objA)) {
                rInvoke = initialValueSelector.invoke(objA, next);
            }
            destination.put(objA, operation.invoke(objA, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <T, K, R, M extends Map<? super K, R>> M i(@NotNull Y<T, ? extends K> y10, @NotNull M destination, R r10, @NotNull ed.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator<T> itB = y10.b();
        while (itB.hasNext()) {
            ?? next = itB.next();
            K kA = y10.a(next);
            a.b.C0001a c0001a = (Object) destination.get(kA);
            if (c0001a == null && !destination.containsKey(kA)) {
                c0001a = (Object) r10;
            }
            destination.put(kA, operation.invoke(c0001a, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <S, T extends S, K> Map<K, S> j(@NotNull Y<T, ? extends K> y10, @NotNull ed.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = y10.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = y10.a(sInvoke);
            a.b bVar = (Object) linkedHashMap.get(objA);
            if (!(bVar == null && !linkedHashMap.containsKey(objA))) {
                sInvoke = operation.invoke(objA, bVar, sInvoke);
            }
            linkedHashMap.put(objA, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@NotNull Y<T, ? extends K> y10, @NotNull M destination, @NotNull ed.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.G.p(y10, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(operation, "operation");
        Iterator itB = y10.b();
        while (itB.hasNext()) {
            S sInvoke = (Object) itB.next();
            Object objA = y10.a(sInvoke);
            a.b bVar = (Object) destination.get(objA);
            if (!(bVar == null && !destination.containsKey(objA))) {
                sInvoke = operation.invoke(objA, bVar, sInvoke);
            }
            destination.put(objA, sInvoke);
        }
        return destination;
    }
}
