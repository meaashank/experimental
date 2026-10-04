package kotlin.text;

import androidx.collection.N0;
import androidx.compose.runtime.C1922j1;
import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.B0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.C4858c0;
import kotlin.collections.C4860d0;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.m0;
import kotlin.random.Random;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2584:1\n131#1,2:2585\n224#1,5:2587\n513#1,5:2593\n513#1,5:2598\n471#1:2603\n1207#1,2:2604\n472#1,2:2606\n1209#1:2608\n474#1:2609\n471#1:2610\n1207#1,2:2611\n472#1,2:2613\n1209#1:2615\n474#1:2616\n1207#1,3:2617\n502#1,2:2620\n502#1,2:2622\n764#1,4:2624\n731#1,4:2628\n748#1,4:2632\n797#1,4:2636\n900#1,5:2640\n942#1,3:2645\n945#1,3:2655\n961#1,3:2658\n964#1,3:2668\n1065#1,3:2685\n1033#1,4:2688\n1021#1:2692\n1207#1,2:2693\n1209#1:2696\n1022#1:2697\n1207#1,3:2698\n1055#1:2701\n1198#1:2702\n1199#1:2704\n1056#1:2705\n1198#1,2:2706\n1207#1,3:2708\n2088#1,2:2711\n2090#1,6:2714\n2112#1,2:2720\n2114#1,6:2723\n2529#1,6:2729\n2559#1,7:2735\n1#2:2592\n1#2:2695\n1#2:2703\n1#2:2713\n1#2:2722\n383#3,7:2648\n383#3,7:2661\n383#3,7:2671\n383#3,7:2678\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n57#1:2585,2\n67#1:2587,5\n428#1:2593,5\n437#1:2598,5\n448#1:2603\n448#1:2604,2\n448#1:2606,2\n448#1:2608\n448#1:2609\n459#1:2610\n459#1:2611,2\n459#1:2613,2\n459#1:2615\n459#1:2616\n471#1:2617,3\n483#1:2620,2\n492#1:2622,2\n688#1:2624,4\n703#1:2628,4\n717#1:2632,4\n783#1:2636,4\n858#1:2640,5\n916#1:2645,3\n916#1:2655,3\n929#1:2658,3\n929#1:2668,3\n990#1:2685,3\n1000#1:2688,4\n1010#1:2692\n1010#1:2693,2\n1010#1:2696\n1010#1:2697\n1021#1:2698,3\n1046#1:2701\n1046#1:2702\n1046#1:2704\n1046#1:2705\n1055#1:2706,2\n1894#1:2708,3\n2182#1:2711,2\n2182#1:2714,6\n2199#1:2720,2\n2199#1:2723,6\n2518#1:2729,6\n2546#1:2735,7\n1010#1:2695\n1046#1:2703\n2182#1:2713\n2199#1:2722\n916#1:2648,7\n929#1:2661,7\n944#1:2671,7\n963#1:2678,7\n*E\n"})
public class U extends N {

    @kotlin.jvm.internal.V({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2573#2:71\n*E\n"})
    public static final class a implements Iterable<Character>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f218277a;

        public a(CharSequence charSequence) {
            this.f218277a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return M.W3(this.f218277a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,730:1\n2581#2:731\n*E\n"})
    public static final class b implements InterfaceC5000m<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f218278a;

        public b(CharSequence charSequence) {
            this.f218278a = charSequence;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Character> iterator() {
            return M.W3(this.f218278a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    @kotlin.jvm.internal.V({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2584:1\n*E\n"})
    public static final class c<K> implements kotlin.collections.Y<Character, K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f218279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<Character, K> f218280b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CharSequence charSequence, ed.l<? super Character, ? extends K> lVar) {
            this.f218279a = charSequence;
            this.f218280b = lVar;
        }

        @Override // kotlin.collections.Y
        public Object a(Character ch) {
            Character ch2 = ch;
            ch2.charValue();
            return this.f218280b.invoke(ch2);
        }

        @Override // kotlin.collections.Y
        public Iterator<Character> b() {
            return M.W3(this.f218279a);
        }

        public K c(char c10) {
            return this.f218280b.invoke(Character.valueOf(c10));
        }
    }

    public static char A7(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char A8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        if (iC3 != 0) {
            R rInvoke = lVar.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= iC3) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    R rInvoke2 = lVar.invoke(Character.valueOf(cCharAt2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        cCharAt = cCharAt2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iC3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfUInt")
    public static final int A9(CharSequence charSequence, ed.l<? super Character, x0> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            i10 += ((x0) L.a(charSequence, i11, selector)).f218498a;
        }
        return i10;
    }

    public static final char B7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double B8(CharSequence charSequence, ed.l<? super Character, Double> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) L.a(charSequence, 0, lVar)).doubleValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) L.a(charSequence, i10, lVar)).doubleValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "sumOfULong")
    @kotlin.V
    public static final long B9(CharSequence charSequence, ed.l<? super Character, B0> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long j10 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            j10 += ((B0) L.a(charSequence, i10, selector)).f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <R> R C7(CharSequence charSequence, ed.l<? super Character, ? extends R> transform) {
        R r10;
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        while (true) {
            if (i10 >= charSequence.length()) {
                r10 = null;
                break;
            }
            r10 = (R) L.a(charSequence, i10, transform);
            if (r10 != null) {
                break;
            }
            i10++;
        }
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float C8(CharSequence charSequence, ed.l<? super Character, Float> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) L.a(charSequence, 0, lVar)).floatValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) L.a(charSequence, i10, lVar)).floatValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @NotNull
    public static final CharSequence C9(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i10 > length) {
            i10 = length;
        }
        return charSequence.subSequence(0, i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final <R> R D7(CharSequence charSequence, ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R r10 = (R) L.a(charSequence, i10, transform);
            if (r10 != null) {
                return r10;
            }
        }
        return null;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R D8(CharSequence charSequence, ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) L.a(charSequence, 0, lVar);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Comparable comparable = (Comparable) L.a(charSequence, i10, lVar);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @NotNull
    public static String D9(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Nullable
    public static final Character E7(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R E8(CharSequence charSequence, ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        R r10 = (R) L.a(charSequence, 0, lVar);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Comparable comparable = (Comparable) L.a(charSequence, i10, lVar);
                if (r10.compareTo(comparable) > 0) {
                    r10 = (R) comparable;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @NotNull
    public static final CharSequence E9(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i10 > length) {
            i10 = length;
        }
        return charSequence.subSequence(length - i10, length);
    }

    @Nullable
    public static final Character F7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double F8(CharSequence charSequence, ed.l<? super Character, Double> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        double dDoubleValue = ((Number) L.a(charSequence, 0, lVar)).doubleValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) L.a(charSequence, i10, lVar)).doubleValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    public static final String F9(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(length - i10);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final <R> List<R> G7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            kotlin.collections.N.s0(arrayList, (Iterable) L.a(charSequence, i10, transform));
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float G8(CharSequence charSequence, ed.l<? super Character, Float> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        float fFloatValue = ((Number) L.a(charSequence, 0, lVar)).floatValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, ((Number) L.a(charSequence, i10, lVar)).floatValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final CharSequence G9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int iC3 = M.C3(charSequence); -1 < iC3; iC3--) {
            if (!((Boolean) L.a(charSequence, iC3, predicate)).booleanValue()) {
                return charSequence.subSequence(iC3 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "flatMapIndexedIterable")
    @kotlin.V
    public static final <R> List<R> H7(CharSequence charSequence, ed.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            kotlin.collections.N.s0(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R H8(CharSequence charSequence, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) L.a(charSequence, 0, selector);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Object obj = (Object) L.a(charSequence, i10, selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @NotNull
    public static final String H9(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int iC3 = M.C3(str); -1 < iC3; iC3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iC3))).booleanValue()) {
                String strSubstring = str.substring(iC3 + 1);
                kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static Iterator I6(CharSequence charSequence) {
        return M.W3(charSequence);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    @dd.j(name = "flatMapIndexedIterableTo")
    @kotlin.V
    public static final <R, C extends Collection<? super R>> C I7(CharSequence charSequence, C destination, ed.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            kotlin.collections.N.s0(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R I8(CharSequence charSequence, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r10 = (Object) L.a(charSequence, 0, selector);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Object obj = (Object) L.a(charSequence, i10, selector);
                if (comparator.compare(r10, obj) > 0) {
                    r10 = (R) obj;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @NotNull
    public static final CharSequence I9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> lVar) {
        int iA = K.a(charSequence, "<this>", lVar, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (!((Boolean) L.a(charSequence, i10, lVar)).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C J7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            kotlin.collections.N.s0(destination, (Iterable) L.a(charSequence, i10, transform));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character J8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.G.t(cCharAt, cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final String J9(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(0, i10);
                kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final <R> R K7(@NotNull CharSequence charSequence, R r10, @NotNull ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minOrThrow")
    public static final char K8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.G.t(cCharAt, cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @kotlin.C
    @NotNull
    public static <C extends Collection<? super Character>> C K9(@NotNull CharSequence charSequence, @NotNull C destination) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }

    public static final boolean L6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!((Boolean) L.a(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R L7(@NotNull CharSequence charSequence, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character L8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final HashSet<Character> L9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 128) {
            length = 128;
        }
        HashSet<Character> hashSet = new HashSet<>(m0.j(length));
        K9(charSequence, hashSet);
        return hashSet;
    }

    public static final boolean M6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final <R> R M7(@NotNull CharSequence charSequence, R r10, @NotNull ed.p<? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int iC3 = M.C3(charSequence); iC3 >= 0; iC3--) {
            r10 = operation.invoke(Character.valueOf(charSequence.charAt(iC3)), r10);
        }
        return r10;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "minWithOrThrow")
    public static final char M8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @NotNull
    public static final List<Character> M9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? N9(charSequence) : kotlin.collections.H.l(Character.valueOf(charSequence.charAt(0))) : EmptyList.f217510a;
    }

    public static final boolean N6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) L.a(charSequence, i10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> R N7(@NotNull CharSequence charSequence, R r10, @NotNull ed.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        for (int iC3 = M.C3(charSequence); iC3 >= 0; iC3--) {
            r10 = operation.invoke(Integer.valueOf(iC3), Character.valueOf(charSequence.charAt(iC3)), r10);
        }
        return r10;
    }

    public static final boolean N8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @NotNull
    public static final List<Character> N9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        ArrayList arrayList = new ArrayList(charSequence.length());
        K9(charSequence, arrayList);
        return arrayList;
    }

    @NotNull
    public static final Iterable<Character> O6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? EmptyList.f217510a : new a(charSequence);
    }

    public static final void O7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, L0> action) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            action.invoke(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final boolean O8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) L.a(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Set<Character> O9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return EmptySet.f217512a;
        }
        if (length == 1) {
            return kotlin.collections.x0.f(Character.valueOf(charSequence.charAt(0)));
        }
        int length2 = charSequence.length();
        if (length2 > 128) {
            length2 = 128;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m0.j(length2));
        K9(charSequence, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static final InterfaceC5000m<Character> P6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? C4994g.f218169a : new b(charSequence);
    }

    public static final void P7(@NotNull CharSequence charSequence, @NotNull ed.p<? super Integer, ? super Character, L0> action) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <S extends CharSequence> S P8(@NotNull S s10, @NotNull ed.l<? super Character, L0> action) {
        kotlin.jvm.internal.G.p(s10, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        for (int i10 = 0; i10 < s10.length(); i10++) {
            action.invoke(Character.valueOf(s10.charAt(i10)));
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<String> P9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return Q9(charSequence, i10, i11, z10, new O());
    }

    @NotNull
    public static final <K, V> Map<K, V> Q6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iJ = m0.j(charSequence.length());
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair pair = (Pair) L.a(charSequence, i10, transform);
            linkedHashMap.put(pair.f217467a, pair.f217468b);
        }
        return linkedHashMap;
    }

    @Xc.f
    public static final char Q7(CharSequence charSequence, int i10, ed.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <S extends CharSequence> S Q8(@NotNull S s10, @NotNull ed.p<? super Integer, ? super Character, L0> action) {
        kotlin.jvm.internal.G.p(s10, "<this>");
        kotlin.jvm.internal.G.p(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s10.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(s10.charAt(i10)));
            i10++;
            i11++;
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <R> List<R> Q9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10, @NotNull ed.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, Character> R6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        int iJ = m0.j(charSequence.length());
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @Nullable
    public static final Character R7(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    @NotNull
    public static final Pair<CharSequence, CharSequence> R8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new Pair<>(sb2, sb3);
    }

    public static /* synthetic */ List R9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return P9(charSequence, i10, i11, z10);
    }

    @NotNull
    public static final <K, V> Map<K, V> S6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        int iJ = m0.j(charSequence.length());
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> S7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = kotlin.collections.A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Pair<String, String> S8(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new Pair<>(sb2.toString(), sb3.toString());
    }

    public static /* synthetic */ List S9(CharSequence charSequence, int i10, int i11, boolean z10, ed.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return Q9(charSequence, i10, i11, z10, lVar);
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M T6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> T7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objA = linkedHashMap.get(kInvoke);
            if (objA == null) {
                objA = kotlin.collections.A.a(linkedHashMap, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final char T8(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return U8(charSequence, Random.f218007a);
    }

    public static final String T9(CharSequence it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it.toString();
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @kotlin.C
    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M U7(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.3")
    public static char U8(@NotNull CharSequence charSequence, @NotNull Random random) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.q(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final InterfaceC5000m<String> U9(@NotNull CharSequence charSequence, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return V9(charSequence, i10, i11, z10, new P());
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M V6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Pair pair = (Pair) L.a(charSequence, i10, transform);
            destination.put(pair.f217467a, pair.f217468b);
        }
        return destination;
    }

    @kotlin.C
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M V7(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends K> keySelector, @NotNull ed.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        kotlin.jvm.internal.G.p(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            K kInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objA = destination.get(kInvoke);
            if (objA == null) {
                objA = C1922j1.a(destination, kInvoke);
            }
            ((List) objA).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Character V8(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return W8(charSequence, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <R> InterfaceC5000m<R> V9(@NotNull final CharSequence charSequence, final int i10, int i11, boolean z10, @NotNull final ed.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        return SequencesKt___SequencesKt.N1(kotlin.collections.U.E1(md.u.D1(z10 ? M.B3(charSequence) : md.u.Y1(0, (charSequence.length() - i10) + 1), i11)), new ed.l() { // from class: kotlin.text.T
            @Override // ed.l
            public final Object invoke(Object obj) {
                return U.Z9(i10, charSequence, transform, ((Integer) obj).intValue());
            }
        });
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <V> Map<Character, V> W6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        int length = charSequence.length();
        if (length > 128) {
            length = 128;
        }
        int iJ = m0.j(length);
        if (iJ < 16) {
            iJ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iJ);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static final <K> kotlin.collections.Y<Character, K> W7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        return new c(charSequence, keySelector);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character W8(@NotNull CharSequence charSequence, @NotNull Random random) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.q(charSequence.length())));
    }

    public static /* synthetic */ InterfaceC5000m W9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return U9(charSequence, i10, i11, z10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static final <V, M extends Map<? super Character, ? super V>> M X6(@NotNull CharSequence charSequence, @NotNull M destination, @NotNull ed.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(valueSelector, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final int X7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> lVar) {
        int iA = K.a(charSequence, "<this>", lVar, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (((Boolean) L.a(charSequence, i10, lVar)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final char X8(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static /* synthetic */ InterfaceC5000m X9(CharSequence charSequence, int i10, int i11, boolean z10, ed.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return V9(charSequence, i10, i11, z10, lVar);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<String> Y6(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return P9(charSequence, i10, i10, true);
    }

    public static final int Y7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) L.a(charSequence, length, predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static final char Y8(@NotNull CharSequence charSequence, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final String Y9(CharSequence it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it.toString();
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <R> List<R> Z6(@NotNull CharSequence charSequence, int i10, @NotNull ed.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        return Q9(charSequence, i10, i10, true, transform);
    }

    public static char Z7(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(M.C3(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character Z8(@NotNull CharSequence charSequence, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final Object Z9(int i10, CharSequence charSequence, ed.l lVar, int i11) {
        int length = i10 + i11;
        if (length < 0 || length > charSequence.length()) {
            length = charSequence.length();
        }
        return lVar.invoke(charSequence.subSequence(i11, length));
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final InterfaceC5000m<String> a7(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return b7(charSequence, i10, new Q());
    }

    public static final char a8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character a9(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                cCharAt = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))).charValue();
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final Iterable<C4858c0<Character>> aa(@NotNull final CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return new C4860d0(new InterfaceC4376a() { // from class: kotlin.text.S
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return M.W3(charSequence);
            }
        });
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <R> InterfaceC5000m<R> b7(@NotNull CharSequence charSequence, int i10, @NotNull ed.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        return V9(charSequence, i10, i10, true, transform);
    }

    @Nullable
    public static final Character b8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char b9(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iC3 = M.C3(charSequence);
        if (iC3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iC3);
        for (int i10 = iC3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    public static final Iterator ba(CharSequence charSequence) {
        return M.W3(charSequence);
    }

    public static final String c7(CharSequence it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it.toString();
    }

    @Nullable
    public static final Character c8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final char c9(@NotNull CharSequence charSequence, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iC3 = M.C3(charSequence);
        if (iC3 < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(iC3);
        for (int i10 = iC3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return cCharAt;
    }

    @NotNull
    public static final List<Pair<Character, Character>> ca(@NotNull CharSequence charSequence, @NotNull CharSequence other) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    @Xc.f
    public static final int d7(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length();
    }

    @NotNull
    public static final <R> List<R> d8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character d9(@NotNull CharSequence charSequence, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iC3 = M.C3(charSequence);
        if (iC3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iC3);
        for (int i10 = iC3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @NotNull
    public static final <V> List<V> da(@NotNull CharSequence charSequence, @NotNull CharSequence other, @NotNull ed.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    public static final int e7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (((Boolean) L.a(charSequence, i11, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final <R> List<R> e8(@NotNull CharSequence charSequence, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character e9(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        int iC3 = M.C3(charSequence);
        if (iC3 < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(iC3);
        for (int i10 = iC3 - 1; i10 >= 0; i10--) {
            cCharAt = operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt)).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<Pair<Character, Character>> ea(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(new Pair(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence f7(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i10 > length) {
            i10 = length;
        }
        return charSequence.subSequence(i10, charSequence.length());
    }

    @NotNull
    public static final <R> List<R> f8(@NotNull CharSequence charSequence, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static CharSequence f9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <R> List<R> fa(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            i10++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @NotNull
    public static final String g7(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C g8(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @Xc.f
    public static final String g9(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return f9(str).toString();
    }

    @NotNull
    public static final CharSequence h7(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = charSequence.length() - i10;
        if (length < 0) {
            length = 0;
        }
        return C9(charSequence, length);
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C h8(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <R> List<R> h9(@NotNull CharSequence charSequence, R r10, @NotNull ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.H.l(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static String i7(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length() - i10;
        if (length < 0) {
            length = 0;
        }
        return D9(str, length);
    }

    @NotNull
    public static final <R> List<R> i8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objA = L.a(charSequence, i10, transform);
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <R> List<R> i9(@NotNull CharSequence charSequence, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.H.l(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence j7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int iC3 = M.C3(charSequence); -1 < iC3; iC3--) {
            if (!((Boolean) L.a(charSequence, iC3, predicate)).booleanValue()) {
                return charSequence.subSequence(0, iC3 + 1);
            }
        }
        return "";
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C j8(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objA = L.a(charSequence, i10, transform);
            if (objA != null) {
                destination.add(objA);
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final List<Character> j9(@NotNull CharSequence charSequence, @NotNull ed.p<? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return EmptyList.f217510a;
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @NotNull
    public static final String k7(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int iC3 = M.C3(str); -1 < iC3; iC3--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(iC3))).booleanValue()) {
                String strSubstring = str.substring(0, iC3 + 1);
                kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @kotlin.C
    @NotNull
    public static final <R, C extends Collection<? super R>> C k8(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final List<Character> k9(@NotNull CharSequence charSequence, @NotNull ed.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return EmptyList.f217510a;
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence l7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> lVar) {
        int iA = K.a(charSequence, "<this>", lVar, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (!((Boolean) L.a(charSequence, i10, lVar)).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character l8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        if (iC3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = lVar.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = lVar.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <R> List<R> l9(@NotNull CharSequence charSequence, R r10, @NotNull ed.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.H.l(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final String m7(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String strSubstring = str.substring(i10);
                kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char m8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        if (iC3 != 0) {
            R rInvoke = lVar.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= iC3) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    R rInvoke2 = lVar.invoke(Character.valueOf(cCharAt2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        cCharAt = cCharAt2;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == iC3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <R> List<R> m9(@NotNull CharSequence charSequence, R r10, @NotNull ed.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.H.l(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @Xc.f
    public static final char n7(CharSequence charSequence, int i10, ed.l<? super Integer, Character> defaultValue) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= charSequence.length()) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final double n8(CharSequence charSequence, ed.l<? super Character, Double> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) L.a(charSequence, 0, lVar)).doubleValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) L.a(charSequence, i10, lVar)).doubleValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    public static final char n9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @Xc.f
    public static final Character o7(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return R7(charSequence, i10);
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final float o8(CharSequence charSequence, ed.l<? super Character, Float> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) L.a(charSequence, 0, lVar)).floatValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) L.a(charSequence, i10, lVar)).floatValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    public static final char o9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        kotlin.jvm.internal.G.n(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    @NotNull
    public static final CharSequence p7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R p8(CharSequence charSequence, ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (R) L.a(charSequence, 0, lVar);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Comparable comparable = (Comparable) L.a(charSequence, i10, lVar);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @Nullable
    public static final Character p9(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @NotNull
    public static final String q7(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R extends Comparable<? super R>> R q8(CharSequence charSequence, ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        R r10 = (R) L.a(charSequence, 0, lVar);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Comparable comparable = (Comparable) L.a(charSequence, i10, lVar);
                if (r10.compareTo(comparable) < 0) {
                    r10 = (R) comparable;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @Nullable
    public static final Character q9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @NotNull
    public static final CharSequence r7(@NotNull CharSequence charSequence, @NotNull ed.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Double r8(CharSequence charSequence, ed.l<? super Character, Double> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        double dDoubleValue = ((Number) L.a(charSequence, 0, lVar)).doubleValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) L.a(charSequence, i10, lVar)).doubleValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @NotNull
    public static final CharSequence r9(@NotNull CharSequence charSequence, @NotNull Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        int iD0 = kotlin.collections.J.d0(indices, 10);
        if (iD0 == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iD0);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    @NotNull
    public static final String s7(@NotNull String str, @NotNull ed.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2.toString();
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Float s8(CharSequence charSequence, ed.l<? super Character, Float> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        float fFloatValue = ((Number) L.a(charSequence, 0, lVar)).floatValue();
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, ((Number) L.a(charSequence, i10, lVar)).floatValue());
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final CharSequence s9(@NotNull CharSequence charSequence, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? "" : M.G5(charSequence, indices);
    }

    @kotlin.C
    @NotNull
    public static final <C extends Appendable> C t7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.p<? super Integer, ? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R t8(CharSequence charSequence, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r10 = (Object) L.a(charSequence, 0, selector);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Object obj = (Object) L.a(charSequence, i10, selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @Xc.f
    public static final String t9(String str, Iterable<Integer> indices) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return r9(str, indices).toString();
    }

    @NotNull
    public static final CharSequence u7(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    @kotlin.V
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <R> R u8(CharSequence charSequence, Comparator<? super R> comparator, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r10 = (Object) L.a(charSequence, 0, selector);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                Object obj = (Object) L.a(charSequence, i10, selector);
                if (comparator.compare(r10, obj) < 0) {
                    r10 = (R) obj;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return r10;
    }

    @NotNull
    public static final String u9(@NotNull String str, @NotNull md.l indices) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(indices, "indices");
        return indices.isEmpty() ? "" : M.K5(str, indices);
    }

    @NotNull
    public static final String v7(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character v8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.G.t(cCharAt, cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final int v9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += ((Number) L.a(charSequence, i10, selector)).intValue();
        }
        return iIntValue;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Appendable> C w7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxOrThrow")
    public static final char w8(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.G.t(cCharAt, cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @InterfaceC4982o(message = "Use sumOf instead.", replaceWith = @InterfaceC4852c0(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final double w9(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += ((Number) L.a(charSequence, i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Appendable> C x7(@NotNull CharSequence charSequence, @NotNull C destination, @NotNull ed.l<? super Character, Boolean> predicate) throws IOException {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character x8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfDouble")
    @kotlin.V
    public static final double x9(CharSequence charSequence, ed.l<? super Character, Double> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += ((Number) L.a(charSequence, i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    @Xc.f
    public static final Character y7(CharSequence charSequence, ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.7")
    @dd.j(name = "maxWithOrThrow")
    public static final char y8(@NotNull CharSequence charSequence, @NotNull Comparator<? super Character> comparator) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfInt")
    public static final int y9(CharSequence charSequence, ed.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += ((Number) L.a(charSequence, i10, selector)).intValue();
        }
        return iIntValue;
    }

    @Xc.f
    public static final Character z7(CharSequence charSequence, ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(cCharAt)).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character z8(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, ? extends R> lVar) {
        if (K.a(charSequence, "<this>", lVar, "selector") == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int iC3 = M.C3(charSequence);
        if (iC3 == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = lVar.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= iC3) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                R rInvoke2 = lVar.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i10 == iC3) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfLong")
    @kotlin.V
    public static final long z9(CharSequence charSequence, ed.l<? super Character, Long> selector) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        long jLongValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            jLongValue += ((Number) L.a(charSequence, i10, selector)).longValue();
        }
        return jLongValue;
    }
}
