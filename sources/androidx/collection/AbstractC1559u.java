package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.collection.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,958:1\n250#1,6:959\n276#1,6:965\n250#1,6:971\n72#1:977\n250#1,6:978\n250#1,6:984\n250#1,6:990\n263#1,6:996\n276#1,6:1002\n290#1,6:1008\n68#1:1014\n68#1:1015\n263#1,6:1016\n263#1,6:1022\n290#1,6:1028\n68#1:1034\n276#1,6:1035\n290#1,6:1041\n263#1,6:1047\n263#1,6:1053\n250#1,6:1059\n72#1:1065\n464#1,10:1066\n263#1,4:1076\n474#1,9:1080\n268#1:1089\n483#1,2:1090\n464#1,10:1092\n263#1,4:1102\n474#1,9:1106\n268#1:1115\n483#1,2:1116\n464#1,10:1118\n263#1,4:1128\n474#1,9:1132\n268#1:1141\n483#1,2:1142\n464#1,10:1144\n263#1,4:1154\n474#1,9:1158\n268#1:1167\n483#1,2:1168\n464#1,10:1170\n263#1,4:1180\n474#1,9:1184\n268#1:1193\n483#1,2:1194\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n93#1:959,6\n107#1:965,6\n119#1:971,6\n132#1:977\n150#1:978,6\n172#1:984,6\n189#1:990,6\n205#1:996,6\n222#1:1002,6\n238#1:1008,6\n303#1:1014\n314#1:1015\n340#1:1016,6\n354#1:1022,6\n368#1:1028,6\n394#1:1034\n404#1:1035,6\n417#1:1041,6\n442#1:1047,6\n473#1:1053,6\n491#1:1059,6\n507#1:1065\n-1#1:1066,10\n-1#1:1076,4\n-1#1:1080,9\n-1#1:1089\n-1#1:1090,2\n-1#1:1092,10\n-1#1:1102,4\n-1#1:1106,9\n-1#1:1115\n-1#1:1116,2\n-1#1:1118,10\n-1#1:1128,4\n-1#1:1132,9\n-1#1:1141\n-1#1:1142,2\n-1#1:1144,10\n-1#1:1154,4\n-1#1:1158,9\n-1#1:1167\n-1#1:1168,2\n-1#1:1170,10\n-1#1:1180,4\n-1#1:1184,9\n-1#1:1193\n-1#1:1194,2\n*E\n"})
public abstract class AbstractC1559u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public float[] f86996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public int f86997b;

    public /* synthetic */ AbstractC1559u(int i10, C4969v c4969v) {
        this(i10);
    }

    public static /* synthetic */ String P(AbstractC1559u abstractC1559u, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC1559u.M(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String Q(AbstractC1559u abstractC1559u, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence, ed.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            separator = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            prefix = "";
        }
        if ((i11 & 4) != 0) {
            postfix = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence = "...";
        }
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1557t.a(charSequence, "truncated", lVar, "transform", prefix);
        float[] fArr = abstractC1559u.f86996a;
        int i12 = abstractC1559u.f86997b;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                sbA.append(postfix);
                break;
            }
            float f10 = fArr[i13];
            if (i13 == i10) {
                sbA.append(charSequence);
                break;
            }
            if (i13 != 0) {
                sbA.append(separator);
            }
            sbA.append((CharSequence) lVar.invoke(Float.valueOf(f10)));
            i13++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void t() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void x() {
    }

    public final int A(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i10])).booleanValue());
        return i10;
    }

    public final boolean B() {
        return this.f86997b == 0;
    }

    public final boolean C() {
        return this.f86997b != 0;
    }

    @dd.k
    @NotNull
    public final String D() {
        return P(this, null, null, null, 0, null, 31, null);
    }

    @dd.k
    @NotNull
    public final String E(@NotNull ed.l<? super Float, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "");
                break;
            }
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) U6.j.f68738d);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String F(@NotNull CharSequence separator) {
        kotlin.jvm.internal.G.p(separator, "separator");
        return P(this, separator, null, null, 0, null, 30, null);
    }

    @dd.k
    @NotNull
    public final String G(@NotNull CharSequence separator, @NotNull ed.l<? super Float, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "");
                break;
            }
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String H(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return P(this, separator, prefix, null, 0, null, 28, null);
    }

    @dd.k
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull ed.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        StringBuilder sbA = C1557t.a(charSequence, "prefix", lVar, "transform", charSequence);
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sbA.append((CharSequence) "");
                break;
            }
            float f10 = fArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Float.valueOf(f10)));
            i11++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String J(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @dd.k
    @NotNull
    public final String K(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @dd.k
    @NotNull
    public final String L(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull ed.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1557t.a(charSequence, "postfix", lVar, "transform", prefix);
        float[] fArr = this.f86996a;
        int i11 = this.f86997b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(charSequence);
                break;
            }
            float f10 = fArr[i12];
            if (i12 == i10) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Float.valueOf(f10)));
            i12++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String M(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1544m.a(charSequence, "postfix", charSequence2, "truncated", prefix);
        float[] fArr = this.f86996a;
        int i11 = this.f86997b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(charSequence);
                break;
            }
            float f10 = fArr[i12];
            if (i12 == i10) {
                sbA.append(charSequence2);
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(f10);
            i12++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence charSequence, @NotNull ed.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1557t.a(charSequence, "truncated", lVar, "transform", prefix);
        float[] fArr = this.f86996a;
        int i11 = this.f86997b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(postfix);
                break;
            }
            float f10 = fArr[i12];
            if (i12 == i10) {
                sbA.append(charSequence);
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Float.valueOf(f10)));
            i12++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull ed.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1557t.a(charSequence, "postfix", lVar, "transform", prefix);
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sbA.append(charSequence);
                break;
            }
            float f10 = fArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Float.valueOf(f10)));
            i11++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final float R() {
        if (B()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f86996a[this.f86997b - 1];
    }

    public final float S(@NotNull ed.l<? super Float, Boolean> predicate) {
        float f10;
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        do {
            i10--;
            if (-1 >= i10) {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
            f10 = fArr[i10];
        } while (!predicate.invoke(Float.valueOf(f10)).booleanValue());
        return f10;
    }

    public final int T(float f10) {
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (fArr[i10] != f10);
        return i10;
    }

    public final boolean U() {
        return B();
    }

    public final boolean V(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        for (int i10 = this.f86997b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return C();
    }

    public final boolean b(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(float f10) {
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] == f10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        md.l lVarY1 = md.u.Y1(0, elements.f86997b);
        int i10 = lVarY1.f221139a;
        int i11 = lVarY1.f221140b;
        if (i10 > i11) {
            return true;
        }
        while (c(elements.s(i10))) {
            if (i10 == i11) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final int e() {
        return this.f86997b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AbstractC1559u) {
            AbstractC1559u abstractC1559u = (AbstractC1559u) obj;
            int i10 = abstractC1559u.f86997b;
            int i11 = this.f86997b;
            if (i10 == i11) {
                float[] fArr = this.f86996a;
                float[] fArr2 = abstractC1559u.f86996a;
                md.l lVarY1 = md.u.Y1(0, i11);
                int i12 = lVarY1.f221139a;
                int i13 = lVarY1.f221140b;
                if (i12 > i13) {
                    return true;
                }
                while (fArr[i12] == fArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Float.valueOf(fArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final float g(@e.D(from = 0) int i10) {
        if (i10 >= 0 && i10 < this.f86997b) {
            return this.f86996a[i10];
        }
        StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
        sbA.append(this.f86997b - 1);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public final float h(@e.D(from = 0) int i10, @NotNull ed.l<? super Integer, Float> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f86997b) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : this.f86996a[i10];
    }

    public int hashCode() {
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        int iFloatToIntBits = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i11]) * 31;
        }
        return iFloatToIntBits;
    }

    public final float i() {
        if (B()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f86996a[0];
    }

    public final float j(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final <R> R k(R r10, @NotNull ed.p<? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Float.valueOf(fArr[i11]));
        }
        return r10;
    }

    public final <R> R l(R r10, @NotNull ed.q<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Float.valueOf(fArr[i11]));
        }
        return r10;
    }

    public final <R> R m(R r10, @NotNull ed.p<? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Float.valueOf(fArr[i10]), r10);
        }
    }

    public final <R> R n(R r10, @NotNull ed.q<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), r10);
        }
    }

    public final void o(@NotNull ed.l<? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Float.valueOf(fArr[i11]));
        }
    }

    public final void p(@NotNull ed.p<? super Integer, ? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]));
        }
    }

    public final void q(@NotNull ed.l<? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i10]));
            }
        }
    }

    public final void r(@NotNull ed.p<? super Integer, ? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]));
            }
        }
    }

    public final float s(@e.D(from = 0) int i10) {
        if (i10 >= 0 && i10 < this.f86997b) {
            return this.f86996a[i10];
        }
        StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
        sbA.append(this.f86997b - 1);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @NotNull
    public String toString() {
        return P(this, null, "[", "]", 0, null, 25, null);
    }

    @NotNull
    public final md.l u() {
        return md.u.Y1(0, this.f86997b);
    }

    @e.D(from = -1)
    public final int v() {
        return this.f86997b - 1;
    }

    @e.D(from = 0)
    public final int w() {
        return this.f86997b;
    }

    public final int y(float f10) {
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (f10 == fArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int z(@NotNull ed.l<? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public AbstractC1559u(int i10) {
        this.f86996a = i10 == 0 ? B.g() : new float[i10];
    }
}
