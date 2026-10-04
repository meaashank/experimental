package n0;

import A0.a;
import U6.j;
import ed.l;
import ed.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.collections.N;
import kotlin.collections.U;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n33#1,6:596\n33#1,6:602\n33#1,6:608\n33#1,6:614\n33#1,6:620\n33#1,6:626\n33#1,6:632\n33#1,6:638\n69#1,6:644\n69#1,4:650\n74#1:655\n33#1,6:656\n33#1,6:662\n33#1,6:668\n33#1,6:674\n33#1,6:680\n1#2:654\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n87#1:596,6\n102#1:602,6\n117#1:608,6\n134#1:614,6\n153#1:620,6\n201#1:626,6\n237#1:632,6\n258#1:638,6\n279#1:644,6\n300#1:650,4\n300#1:655\n418#1:656,6\n464#1:662,6\n510#1:668,6\n526#1:674,6\n545#1:680,6\n*E\n"})
public final class C5237d {
    public static final <S, T extends S> S A(@NotNull List<? extends T> list, @NotNull p<? super S, ? super T, ? extends S> pVar) {
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) U.G2(list);
        int iL = I.L(list);
        int i10 = 1;
        if (1 <= iL) {
            while (true) {
                sInvoke = pVar.invoke(sInvoke, list.get(i10));
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    public static final <T> int B(@NotNull List<? extends T> list, @NotNull l<? super T, Integer> lVar) {
        int size = list.size();
        int iIntValue = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iIntValue += lVar.invoke(list.get(i10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T, R, V> List<V> C(@NotNull List<? extends T> list, @NotNull List<? extends R> list2, @NotNull p<? super T, ? super R, ? extends V> pVar) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(pVar.invoke(list.get(i10), list2.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> D(@NotNull List<? extends T> list, @NotNull p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() == 0 || list.size() == 1) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a.b.C0001a c0001a = list.get(0);
        int iL = I.L(list);
        while (i10 < iL) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(pVar.invoke(c0001a, t10));
            c0001a = t10;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(Appendable appendable, T t10, l<? super T, ? extends CharSequence> lVar) throws IOException {
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    public static final <T> boolean b(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!lVar.invoke(list.get(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean c(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (lVar.invoke(list.get(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, K> List<T> d(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends K> lVar) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (hashSet.add(lVar.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> e(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (lVar.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> f(@NotNull List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T g(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (lVar.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T h(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (lVar.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> i(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends Iterable<? extends R>> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            N.s0(arrayList, lVar.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R j(@NotNull List<? extends T> list, R r10, @NotNull p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = pVar.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> void k(@NotNull List<? extends T> list, @NotNull l<? super T, L0> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    public static final <T> void l(@NotNull List<? extends T> list, @NotNull p<? super Integer, ? super T, L0> pVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    public static final <T> void m(@NotNull List<? extends T> list, @NotNull l<? super T, L0> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            lVar.invoke(list.get(size));
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    public static final <T, A extends Appendable> A n(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable o(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) throws IOException {
        n(list, appendable, (i11 & 2) != 0 ? j.f68738d : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
        return appendable;
    }

    @NotNull
    public static final <T> String p(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable l<? super T, ? extends CharSequence> lVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        n(list, sb2, charSequence, charSequence2, charSequence3, i10, charSequence4, lVar);
        return sb2.toString();
    }

    public static /* synthetic */ String q(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return p(list, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T r(@NotNull List<? extends T> list, @NotNull l<? super T, Boolean> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i10 = size - 1;
            T t10 = list.get(size);
            if (lVar.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            size = i10;
        }
    }

    @NotNull
    public static final <T, R> List<R> s(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(lVar.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> t(@NotNull List<? extends T> list, @NotNull p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(pVar.invoke(Integer.valueOf(i10), list.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> u(@NotNull List<? extends T> list, @NotNull p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = pVar.invoke(Integer.valueOf(i10), list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> v(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = lVar.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C w(@NotNull List<? extends T> list, @NotNull C c10, @NotNull l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(lVar.invoke(list.get(i10)));
        }
        return c10;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T x(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = lVar.invoke(t10);
        int iL = I.L(list);
        int i10 = 1;
        if (1 <= iL) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = lVar.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> R y(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = lVar.invoke(list.get(0));
        int iL = I.L(list);
        int i10 = 1;
        if (1 <= iL) {
            while (true) {
                R rInvoke2 = lVar.invoke(list.get(i10));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T z(@NotNull List<? extends T> list, @NotNull l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = lVar.invoke(t10);
        int iL = I.L(list);
        int i10 = 1;
        if (1 <= iL) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = lVar.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }
}
