package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3061:1\n14739#2,14:3062\n14769#2,14:3076\n14799#2,14:3090\n14829#2,14:3104\n14859#2,14:3118\n14889#2,14:3132\n14919#2,14:3146\n14949#2,14:3160\n14979#2,14:3174\n17711#2,14:3188\n17741#2,14:3202\n17771#2,14:3216\n17801#2,14:3230\n17831#2,14:3244\n17861#2,14:3258\n17891#2,14:3272\n17921#2,14:3286\n17951#2,14:3300\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2453#1:3062,14\n2460#1:3076,14\n2467#1:3090,14\n2474#1:3104,14\n2481#1:3118,14\n2488#1:3132,14\n2495#1:3146,14\n2502#1:3160,14\n2509#1:3174,14\n2651#1:3188,14\n2658#1:3202,14\n2665#1:3216,14\n2672#1:3230,14\n2679#1:3244,14\n2686#1:3258,14\n2693#1:3272,14\n2700#1:3286,14\n2707#1:3300,14\n*E\n"})
public class C4875q extends C4874p {

    /* JADX INFO: renamed from: kotlin.collections.q$a */
    public static final class a extends AbstractC4859d<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f217634c;

        public a(byte[] bArr) {
            this.f217634c = bArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return B.v8(this.f217634c, ((Number) obj).byteValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217634c.length;
        }

        public boolean h(byte b10) {
            return B.v8(this.f217634c, b10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f217634c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return B.Vf(this.f217634c, ((Number) obj).byteValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217634c.length == 0;
        }

        public int j(byte b10) {
            return B.Vf(this.f217634c, b10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return B.Zh(this.f217634c, ((Number) obj).byteValue());
        }

        public int o(byte b10) {
            return B.Zh(this.f217634c, b10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$b */
    public static final class b extends AbstractC4859d<Short> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ short[] f217635c;

        public b(short[] sArr) {
            this.f217635c = sArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return B.C8(this.f217635c, ((Number) obj).shortValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217635c.length;
        }

        public boolean h(short s10) {
            return B.C8(this.f217635c, s10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Short get(int i10) {
            return Short.valueOf(this.f217635c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return B.cg(this.f217635c, ((Number) obj).shortValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217635c.length == 0;
        }

        public int j(short s10) {
            return B.cg(this.f217635c, s10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return B.gi(this.f217635c, ((Number) obj).shortValue());
        }

        public int o(short s10) {
            return B.gi(this.f217635c, s10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$c */
    public static final class c extends AbstractC4859d<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int[] f217636c;

        public c(int[] iArr) {
            this.f217636c = iArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return B.z8(this.f217636c, ((Number) obj).intValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217636c.length;
        }

        public boolean h(int i10) {
            return B.z8(this.f217636c, i10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f217636c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return B.Zf(this.f217636c, ((Number) obj).intValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217636c.length == 0;
        }

        public int j(int i10) {
            return B.Zf(this.f217636c, i10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return B.di(this.f217636c, ((Number) obj).intValue());
        }

        public int o(int i10) {
            return B.di(this.f217636c, i10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$d */
    public static final class d extends AbstractC4859d<Long> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long[] f217637c;

        public d(long[] jArr) {
            this.f217637c = jArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return B.A8(this.f217637c, ((Number) obj).longValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217637c.length;
        }

        public boolean h(long j10) {
            return B.A8(this.f217637c, j10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Long get(int i10) {
            return Long.valueOf(this.f217637c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return B.ag(this.f217637c, ((Number) obj).longValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217637c.length == 0;
        }

        public int j(long j10) {
            return B.ag(this.f217637c, j10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return B.ei(this.f217637c, ((Number) obj).longValue());
        }

        public int o(long j10) {
            return B.ei(this.f217637c, j10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$e */
    @kotlin.jvm.internal.V({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3061:1\n13275#2,2:3062\n1851#2,6:3064\n1959#2,6:3070\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n200#1:3062,2\n202#1:3064,6\n203#1:3070,6\n*E\n"})
    public static final class e extends AbstractC4859d<Float> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float[] f217638c;

        public e(float[] fArr) {
            this.f217638c = fArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return h(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217638c.length;
        }

        public boolean h(float f10) {
            for (float f11 : this.f217638c) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Float get(int i10) {
            return Float.valueOf(this.f217638c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return j(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217638c.length == 0;
        }

        public int j(float f10) {
            float[] fArr = this.f217638c;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return o(((Number) obj).floatValue());
            }
            return -1;
        }

        public int o(float f10) {
            float[] fArr = this.f217638c;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
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
    }

    /* JADX INFO: renamed from: kotlin.collections.q$f */
    @kotlin.jvm.internal.V({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3061:1\n13285#2,2:3062\n1863#2,6:3064\n1971#2,6:3070\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n214#1:3062,2\n216#1:3064,6\n217#1:3070,6\n*E\n"})
    public static final class f extends AbstractC4859d<Double> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double[] f217639c;

        public f(double[] dArr) {
            this.f217639c = dArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return h(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217639c.length;
        }

        public boolean h(double d10) {
            for (double d11 : this.f217639c) {
                if (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Double get(int i10) {
            return Double.valueOf(this.f217639c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return j(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217639c.length == 0;
        }

        public int j(double d10) {
            double[] dArr = this.f217639c;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return o(((Number) obj).doubleValue());
            }
            return -1;
        }

        public int o(double d10) {
            double[] dArr = this.f217639c;
            int length = dArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
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
    }

    /* JADX INFO: renamed from: kotlin.collections.q$g */
    public static final class g extends AbstractC4859d<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean[] f217640c;

        public g(boolean[] zArr) {
            this.f217640c = zArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return B.D8(this.f217640c, ((Boolean) obj).booleanValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217640c.length;
        }

        public boolean h(boolean z10) {
            return B.D8(this.f217640c, z10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean get(int i10) {
            return Boolean.valueOf(this.f217640c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return B.dg(this.f217640c, ((Boolean) obj).booleanValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217640c.length == 0;
        }

        public int j(boolean z10) {
            return B.dg(this.f217640c, z10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return B.hi(this.f217640c, ((Boolean) obj).booleanValue());
        }

        public int o(boolean z10) {
            return B.hi(this.f217640c, z10);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.q$h */
    public static final class h extends AbstractC4859d<Character> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ char[] f217641c;

        public h(char[] cArr) {
            this.f217641c = cArr;
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return B.w8(this.f217641c, ((Character) obj).charValue());
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217641c.length;
        }

        public boolean h(char c10) {
            return B.w8(this.f217641c, c10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            return Character.valueOf(this.f217641c[i10]);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return B.Wf(this.f217641c, ((Character) obj).charValue());
        }

        @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f217641c.length == 0;
        }

        public int j(char c10) {
            return B.Wf(this.f217641c, c10);
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return B.ai(this.f217641c, ((Character) obj).charValue());
        }

        public int o(char c10) {
            return B.ai(this.f217641c, c10);
        }
    }

    public static final int A(@NotNull int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static long[] A0(@NotNull long[] jArr, @NotNull long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final float A1(float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return fArr[i10];
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A2(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Bl(objArr, comparator);
    }

    @NotNull
    public static short[] A3(@NotNull short[] sArr, short s10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s10;
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger A4(short[] sArr, ed.l<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int B(@NotNull long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static <T> T[] B0(@NotNull T[] tArr, @NotNull T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final int B1(int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return iArr[i10];
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short B2(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Cl(sArr, comparator);
    }

    @NotNull
    public static short[] B3(@NotNull short[] sArr, @NotNull short[] elements) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger B4(boolean[] zArr, ed.l<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final <T> int C(@NotNull T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static short[] C0(@NotNull short[] sArr, @NotNull short[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final long C1(long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return jArr[i10];
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte C2(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return B.yn(bArr);
    }

    @NotNull
    public static final boolean[] C3(@NotNull boolean[] zArr, @NotNull Collection<Boolean> elements) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.G.m(zArrCopyOf);
        return zArrCopyOf;
    }

    @NotNull
    public static final SortedSet<Byte> C4(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Cy(bArr, treeSet);
        return treeSet;
    }

    public static final <T> int D(@NotNull T[] tArr, T t10, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static final boolean[] D0(@NotNull boolean[] zArr, @NotNull boolean[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final <T> T D1(T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return tArr[i10];
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character D2(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return B.zn(cArr);
    }

    @NotNull
    public static final boolean[] D3(@NotNull boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z10;
        return zArrCopyOf;
    }

    @NotNull
    public static final SortedSet<Character> D4(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Dy(cArr, treeSet);
        return treeSet;
    }

    public static final int E(@NotNull short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    public static /* synthetic */ byte[] E0(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        v0(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    @Xc.f
    public static final short E1(short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return sArr[i10];
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable E2(Comparable[] comparableArr) {
        kotlin.jvm.internal.G.p(comparableArr, "<this>");
        return B.An(comparableArr);
    }

    @NotNull
    public static boolean[] E3(@NotNull boolean[] zArr, @NotNull boolean[] elements) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(zArrCopyOf);
        return zArrCopyOf;
    }

    @NotNull
    public static final SortedSet<Double> E4(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Ey(dArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int F(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return w(bArr, b10, i10, i11);
    }

    public static /* synthetic */ char[] F0(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        w0(cArr, cArr2, i10, i11, i12);
        return cArr2;
    }

    @Xc.f
    public static final boolean F1(boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return zArr[i10];
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double F2(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return B.Bn(dArr);
    }

    @Xc.f
    public static final <T> T[] F3(T[] tArr, T t10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return (T[]) w3(tArr, t10);
    }

    @NotNull
    public static final SortedSet<Float> F4(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Fy(fArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int G(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return x(cArr, c10, i10, i11);
    }

    public static /* synthetic */ double[] G0(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        x0(dArr, dArr2, i10, i11, i12);
        return dArr2;
    }

    public static void G1(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    @InterfaceC4887e0(version = "1.1")
    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double G2(Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return B.Cn(dArr);
    }

    public static final void G3(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @NotNull
    public static final SortedSet<Integer> G4(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Gy(iArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int H(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return y(dArr, d10, i10, i11);
    }

    public static /* synthetic */ float[] H0(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        y0(fArr, fArr2, i10, i11, i12);
        return fArr2;
    }

    public static void H1(@NotNull char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float H2(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return B.Dn(fArr);
    }

    public static final void H3(@NotNull byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Long> H4(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Hy(jArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int I(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return z(fArr, f10, i10, i11);
    }

    public static /* synthetic */ int[] I0(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        z0(iArr, iArr2, i10, i11, i12);
        return iArr2;
    }

    public static final void I1(@NotNull double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    @InterfaceC4887e0(version = "1.1")
    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float I2(Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return B.En(fArr);
    }

    public static final void I3(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> I4(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Iy(tArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int J(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return A(iArr, i10, i11, i12);
    }

    public static /* synthetic */ long[] J0(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        A0(jArr, jArr2, i10, i11, i12);
        return jArr2;
    }

    public static final void J1(@NotNull float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer J2(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return B.Fn(iArr);
    }

    public static final void J3(@NotNull char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @NotNull
    public static final <T> SortedSet<T> J4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        TreeSet treeSet = new TreeSet(comparator);
        B.Iy(tArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int K(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return B(jArr, j10, i10, i11);
    }

    public static /* synthetic */ Object[] K0(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        B0(objArr, objArr2, i10, i11, i12);
        return objArr2;
    }

    public static void K1(@NotNull int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long K2(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return B.Gn(jArr);
    }

    public static final void K3(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @NotNull
    public static final SortedSet<Short> K4(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Jy(sArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return C(objArr, obj, i10, i11);
    }

    public static /* synthetic */ short[] L0(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        C0(sArr, sArr2, i10, i11, i12);
        return sArr2;
    }

    public static void L1(@NotNull long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    @InterfaceC4982o(message = "Use minOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short L2(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return B.Hn(sArr);
    }

    public static final void L3(@NotNull double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    @NotNull
    public static final SortedSet<Boolean> L4(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        TreeSet treeSet = new TreeSet();
        B.Ky(zArr, treeSet);
        return treeSet;
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return D(objArr, obj, comparator, i10, i11);
    }

    public static /* synthetic */ boolean[] M0(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        D0(zArr, zArr2, i10, i11, i12);
        return zArr2;
    }

    public static <T> void M1(@NotNull T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Boolean M2(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    public static final void M3(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @NotNull
    public static final Boolean[] M4(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static /* synthetic */ int N(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return E(sArr, s10, i10, i11);
    }

    @Xc.f
    public static final byte[] N0(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static void N1(@NotNull short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Byte N2(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    public static void N3(@NotNull float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @NotNull
    public static final Byte[] N4(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    @dd.j(name = "contentDeepEqualsInline")
    @Xc.i
    public static final <T> boolean O(T[] tArr, T[] other) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return C4874p.g(tArr, other);
    }

    @Xc.f
    public static final byte[] O0(byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        kotlin.jvm.internal.G.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final void O1(@NotNull boolean[] zArr, boolean z10, int i10, int i11) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Character O2(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    public static final void O3(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @NotNull
    public static final Character[] O4(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "contentDeepEqualsNullable")
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return C4874p.g(tArr, tArr2);
    }

    @Xc.f
    public static final char[] P0(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void P1(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        G1(bArr, b10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Double P2(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    public static void P3(@NotNull int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @NotNull
    public static final Double[] P4(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    @dd.j(name = "contentDeepHashCodeInline")
    @Xc.i
    public static final <T> int Q(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return Arrays.deepHashCode(tArr);
    }

    @Xc.f
    public static final char[] Q0(char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        kotlin.jvm.internal.G.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    public static /* synthetic */ void Q1(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        H1(cArr, c10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Float Q2(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    public static final void Q3(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @NotNull
    public static final Float[] Q4(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "contentDeepHashCodeNullable")
    public static final <T> int R(T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @Xc.f
    public static final double[] R0(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void R1(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        I1(dArr, d10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Integer R2(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static void R3(@NotNull long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @NotNull
    public static final Integer[] R4(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    @dd.j(name = "contentDeepToStringInline")
    @Xc.i
    public static final <T> String S(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return C4874p.h(tArr);
    }

    @Xc.f
    public static final double[] S0(double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
        kotlin.jvm.internal.G.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    public static /* synthetic */ void S1(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        J1(fArr, f10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Long S2(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @Xc.f
    public static final <T extends Comparable<? super T>> void S3(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        U3(tArr);
    }

    @NotNull
    public static final Long[] S4(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "contentDeepToStringNullable")
    public static final <T> String T(T[] tArr) {
        return C4874p.h(tArr);
    }

    @Xc.f
    public static final float[] T0(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void T1(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        K1(iArr, i10, i11, i12);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <T, R extends Comparable<? super R>> T T2(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.4")
    public static final <T extends Comparable<? super T>> void T3(@NotNull T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @NotNull
    public static final Short[] T4(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean U(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @Xc.f
    public static final float[] U0(float[] fArr, int i10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
        kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public static /* synthetic */ void U1(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        L1(jArr, j10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Short U2(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    public static <T> void U3(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean V(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @Xc.f
    public static final int[] V0(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void V1(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        M1(objArr, obj, i10, i11);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean V2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Sn(zArr, comparator);
    }

    public static final <T> void V3(@NotNull T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean W(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @Xc.f
    public static final int[] W0(int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    public static /* synthetic */ void W1(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        N1(sArr, s10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte W2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Tn(bArr, comparator);
    }

    public static final void W3(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean X(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @Xc.f
    public static final long[] X0(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    public static /* synthetic */ void X1(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        O1(zArr, z10, i10, i11);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Un(cArr, comparator);
    }

    public static final void X3(@NotNull short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean Y(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @Xc.f
    public static final long[] Y0(long[] jArr, int i10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @NotNull
    public static final <R> List<R> Y1(@NotNull Object[] objArr, @NotNull Class<R> klass) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        kotlin.jvm.internal.G.p(klass, "klass");
        ArrayList arrayList = new ArrayList();
        Z1(objArr, arrayList, klass);
        return arrayList;
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double Y2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Vn(dArr, comparator);
    }

    public static /* synthetic */ void Y3(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        H3(bArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean Z(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @Xc.f
    public static final <T> T[] Z0(T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.G.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @kotlin.C
    @NotNull
    public static final <C extends Collection<? super R>, R> C Z1(@NotNull Object[] objArr, @NotNull C destination, @NotNull Class<R> klass) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        kotlin.jvm.internal.G.p(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float Z2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Wn(fArr, comparator);
    }

    public static /* synthetic */ void Z3(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        J3(cArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> boolean a0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @Xc.f
    public static final <T> T[] a1(T[] tArr, int i10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        kotlin.jvm.internal.G.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte a2(byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return B.al(bArr);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer a3(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Xn(iArr, comparator);
    }

    public static /* synthetic */ void a4(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        L3(dArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean b0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @Xc.f
    public static final short[] b1(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character b2(char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return B.bl(cArr);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long b3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Yn(jArr, comparator);
    }

    public static /* synthetic */ void b4(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        N3(fArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean c0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @Xc.f
    public static final short[] c1(short[] sArr, int i10) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
        kotlin.jvm.internal.G.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable c2(Comparable[] comparableArr) {
        kotlin.jvm.internal.G.p(comparableArr, "<this>");
        return B.cl(comparableArr);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object c3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(objArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Zn(objArr, comparator);
    }

    public static /* synthetic */ void c4(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        P3(iArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int d0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @Xc.f
    public static final boolean[] d1(boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.G.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double d2(double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return B.dl(dArr);
    }

    @InterfaceC4982o(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short d3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.ao(sArr, comparator);
    }

    public static /* synthetic */ void d4(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        R3(jArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int e0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @Xc.f
    public static final boolean[] e1(boolean[] zArr, int i10) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
        kotlin.jvm.internal.G.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.1")
    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double e2(Double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return B.el(dArr);
    }

    @NotNull
    public static byte[] e3(@NotNull byte[] bArr, byte b10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b10;
        return bArrCopyOf;
    }

    public static /* synthetic */ void e4(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        T3(comparableArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int f0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static byte[] f1(@NotNull byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        C4873o.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.G.o(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float f2(float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return B.fl(fArr);
    }

    @NotNull
    public static final byte[] f3(@NotNull byte[] bArr, @NotNull Collection<Byte> elements) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.G.m(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void f4(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        V3(objArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int g0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static final char[] g1(@NotNull char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        C4873o.c(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        kotlin.jvm.internal.G.o(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    @InterfaceC4887e0(version = "1.1")
    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float g2(Float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return B.gl(fArr);
    }

    @NotNull
    public static byte[] g3(@NotNull byte[] bArr, @NotNull byte[] elements) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(bArrCopyOf);
        return bArrCopyOf;
    }

    public static /* synthetic */ void g4(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        X3(sArr, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int h0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static final double[] h1(@NotNull double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        C4873o.c(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        kotlin.jvm.internal.G.o(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer h2(int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return B.hl(iArr);
    }

    @NotNull
    public static final char[] h3(@NotNull char[] cArr, char c10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c10;
        return cArrCopyOf;
    }

    public static final <T> void h4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int i0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static final float[] i1(@NotNull float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        C4873o.c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        kotlin.jvm.internal.G.o(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long i2(long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return B.il(jArr);
    }

    @NotNull
    public static final char[] i3(@NotNull char[] cArr, @NotNull Collection<Character> elements) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.G.m(cArrCopyOf);
        return cArrCopyOf;
    }

    public static <T> void i4(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> int j0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static int[] j1(@NotNull int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        C4873o.c(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        kotlin.jvm.internal.G.o(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short j2(short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return B.jl(sArr);
    }

    @NotNull
    public static final char[] j3(@NotNull char[] cArr, @NotNull char[] elements) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(cArrCopyOf);
        return cArrCopyOf;
    }

    public static /* synthetic */ void j4(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        i4(objArr, comparator, i10, i11);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int k0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static long[] k1(@NotNull long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        C4873o.c(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        kotlin.jvm.internal.G.o(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Boolean k2(boolean[] zArr, ed.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int i10 = 1;
        int length = zArr.length - 1;
        if (length == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        if (1 <= length) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @NotNull
    public static final double[] k3(@NotNull double[] dArr, double d10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d10;
        return dArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal k4(byte[] bArr, ed.l<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final int l0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static <T> T[] l1(@NotNull T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        C4873o.c(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.G.o(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Byte l2(byte[] bArr, ed.l<? super Byte, ? extends R> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int i10 = 1;
        int length = bArr.length - 1;
        if (length == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        if (1 <= length) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @NotNull
    public static final double[] l3(@NotNull double[] dArr, @NotNull Collection<Double> elements) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.G.m(dArrCopyOf);
        return dArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal l4(char[] cArr, ed.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String m0(byte[] bArr) {
        String string = Arrays.toString(bArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static short[] m1(@NotNull short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        C4873o.c(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        kotlin.jvm.internal.G.o(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Character m2(char[] cArr, ed.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int i10 = 1;
        int length = cArr.length - 1;
        if (length == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        if (1 <= length) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final double[] m3(@NotNull double[] dArr, @NotNull double[] elements) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(dArrCopyOf);
        return dArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal m4(double[] dArr, ed.l<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static final List<Byte> n(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return new a(bArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String n0(char[] cArr) {
        String string = Arrays.toString(cArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @InterfaceC4887e0(version = "1.3")
    @dd.j(name = "copyOfRange")
    @NotNull
    @InterfaceC4850b0
    public static final boolean[] n1(@NotNull boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        C4873o.c(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        kotlin.jvm.internal.G.o(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Double n2(double[] dArr, ed.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int i10 = 1;
        int length = dArr.length - 1;
        if (length == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        if (1 <= length) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @NotNull
    public static final float[] n3(@NotNull float[] fArr, float f10) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f10;
        return fArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal n4(float[] fArr, ed.l<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static final List<Character> o(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return new h(cArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String o0(double[] dArr) {
        String string = Arrays.toString(dArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final byte[] o1(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return f1(bArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Float o2(float[] fArr, ed.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int i10 = 1;
        int length = fArr.length - 1;
        if (length == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        if (1 <= length) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @NotNull
    public static final float[] o3(@NotNull float[] fArr, @NotNull Collection<Float> elements) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.G.m(fArrCopyOf);
        return fArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal o4(int[] iArr, ed.l<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static List<Double> p(@NotNull double[] dArr) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return new f(dArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String p0(float[] fArr) {
        String string = Arrays.toString(fArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final char[] p1(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return g1(cArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Integer p2(int[] iArr, ed.l<? super Integer, ? extends R> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (length == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @NotNull
    public static float[] p3(@NotNull float[] fArr, @NotNull float[] elements) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(fArrCopyOf);
        return fArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal p4(long[] jArr, ed.l<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static final List<Float> q(@NotNull float[] fArr) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return new e(fArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String q0(int[] iArr) {
        String string = Arrays.toString(iArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final double[] q1(double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return h1(dArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Long q2(long[] jArr, ed.l<? super Long, ? extends R> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int i10 = 1;
        int length = jArr.length - 1;
        if (length == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        if (1 <= length) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @NotNull
    public static int[] q3(@NotNull int[] iArr, int i10) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final <T> BigDecimal q4(T[] tArr, ed.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static List<Integer> r(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return new c(iArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String r0(long[] jArr) {
        String string = Arrays.toString(jArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final float[] r1(float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return i1(fArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <T, R extends Comparable<? super R>> T r2(T[] tArr, ed.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int i10 = 1;
        int length = tArr.length - 1;
        if (length != 0) {
            R rInvoke = selector.invoke(t10);
            if (1 <= length) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @NotNull
    public static final int[] r3(@NotNull int[] iArr, @NotNull Collection<Integer> elements) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.G.m(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal r4(short[] sArr, ed.l<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (short s10 : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Short.valueOf(s10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static List<Long> s(@NotNull long[] jArr) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return new d(jArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T> String s0(T[] tArr) {
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final int[] s1(int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        return j1(iArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final <R extends Comparable<? super R>> Short s2(short[] sArr, ed.l<? super Short, ? extends R> selector) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int i10 = 1;
        int length = sArr.length - 1;
        if (length == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        if (1 <= length) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @NotNull
    public static int[] s3(@NotNull int[] iArr, @NotNull int[] elements) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(iArrCopyOf);
        return iArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigDecimal")
    @kotlin.V
    public static final BigDecimal s4(boolean[] zArr, ed.l<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        for (boolean z10 : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(Boolean.valueOf(z10)));
            kotlin.jvm.internal.G.o(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @NotNull
    public static <T> List<T> t(@NotNull T[] tArr) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        List<T> listAsList = Arrays.asList(tArr);
        kotlin.jvm.internal.G.o(listAsList, "asList(...)");
        return listAsList;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String t0(short[] sArr) {
        String string = Arrays.toString(sArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final long[] t1(long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        return k1(jArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean t2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.ul(zArr, comparator);
    }

    @NotNull
    public static long[] t3(@NotNull long[] jArr, long j10) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j10;
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger t4(byte[] bArr, ed.l<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (byte b10 : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Byte.valueOf(b10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final List<Short> u(@NotNull short[] sArr) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return new b(sArr);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String u0(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final <T> T[] u1(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        return (T[]) l1(tArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte u2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.vl(bArr, comparator);
    }

    @NotNull
    public static final long[] u3(@NotNull long[] jArr, @NotNull Collection<Long> elements) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.G.m(jArrCopyOf);
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger u4(char[] cArr, ed.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (char c10 : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Character.valueOf(c10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @NotNull
    public static final List<Boolean> v(@NotNull boolean[] zArr) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return new g(zArr);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static byte[] v0(@NotNull byte[] bArr, @NotNull byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final short[] v1(short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        return m1(sArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character v2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.wl(cArr, comparator);
    }

    @NotNull
    public static long[] v3(@NotNull long[] jArr, @NotNull long[] elements) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        kotlin.jvm.internal.G.m(jArrCopyOf);
        return jArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger v4(double[] dArr, ed.l<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (double d10 : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Double.valueOf(d10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int w(@NotNull byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static char[] w0(@NotNull char[] cArr, @NotNull char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    @dd.j(name = "copyOfRangeInline")
    public static final boolean[] w1(boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(zArr, "<this>");
        return n1(zArr, i10, i11);
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double w2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.xl(dArr, comparator);
    }

    @NotNull
    public static <T> T[] w3(@NotNull T[] tArr, T t10) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        return tArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger w4(float[] fArr, ed.l<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (float f10 : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Float.valueOf(f10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int x(@NotNull char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static final double[] x0(@NotNull double[] dArr, @NotNull double[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final byte x1(byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return bArr[i10];
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float x2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.yl(fArr, comparator);
    }

    @NotNull
    public static final <T> T[] x3(@NotNull T[] tArr, @NotNull Collection<? extends T> elements) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.G.m(tArr2);
        return tArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger x4(int[] iArr, ed.l<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (int i10 : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Integer.valueOf(i10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int y(@NotNull double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static float[] y0(@NotNull float[] fArr, @NotNull float[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final char y1(char[] cArr, int i10) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return cArr[i10];
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer y2(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.zl(iArr, comparator);
    }

    @NotNull
    public static <T> T[] y3(@NotNull T[] tArr, @NotNull T[] elements) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        kotlin.jvm.internal.G.m(tArr2);
        return tArr2;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final BigInteger y4(long[] jArr, ed.l<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (long j10 : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(Long.valueOf(j10)));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    public static final int z(@NotNull float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.G.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static int[] z0(@NotNull int[] iArr, @NotNull int[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(iArr, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    @Xc.f
    public static final double z1(double[] dArr, int i10) {
        kotlin.jvm.internal.G.p(dArr, "<this>");
        return dArr[i10];
    }

    @InterfaceC4982o(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC4852c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC4984p(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long z2(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.G.p(jArr, "<this>");
        kotlin.jvm.internal.G.p(comparator, "comparator");
        return B.Al(jArr, comparator);
    }

    @NotNull
    public static final short[] z3(@NotNull short[] sArr, @NotNull Collection<Short> elements) {
        kotlin.jvm.internal.G.p(sArr, "<this>");
        kotlin.jvm.internal.G.p(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.G.m(sArrCopyOf);
        return sArrCopyOf;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    @dd.j(name = "sumOfBigInteger")
    @kotlin.V
    public static final <T> BigInteger z4(T[] tArr, ed.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.G.p(tArr, "<this>");
        kotlin.jvm.internal.G.p(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        for (T t10 : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(t10));
            kotlin.jvm.internal.G.o(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
