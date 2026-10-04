package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,958:1\n250#1,6:959\n276#1,6:965\n250#1,6:971\n72#1:977\n250#1,6:978\n250#1,6:984\n250#1,6:990\n263#1,6:996\n276#1,6:1002\n290#1,6:1008\n68#1:1014\n68#1:1015\n263#1,6:1016\n263#1,6:1022\n290#1,6:1028\n68#1:1034\n276#1,6:1035\n290#1,6:1041\n263#1,6:1047\n263#1,6:1053\n250#1,6:1059\n72#1:1065\n464#1,10:1066\n263#1,4:1076\n474#1,9:1080\n268#1:1089\n483#1,2:1090\n464#1,10:1092\n263#1,4:1102\n474#1,9:1106\n268#1:1115\n483#1,2:1116\n464#1,10:1118\n263#1,4:1128\n474#1,9:1132\n268#1:1141\n483#1,2:1142\n464#1,10:1144\n263#1,4:1154\n474#1,9:1158\n268#1:1167\n483#1,2:1168\n464#1,10:1170\n263#1,4:1180\n474#1,9:1184\n268#1:1193\n483#1,2:1194\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n93#1:959,6\n107#1:965,6\n119#1:971,6\n132#1:977\n150#1:978,6\n172#1:984,6\n189#1:990,6\n205#1:996,6\n222#1:1002,6\n238#1:1008,6\n303#1:1014\n314#1:1015\n340#1:1016,6\n354#1:1022,6\n368#1:1028,6\n394#1:1034\n404#1:1035,6\n417#1:1041,6\n442#1:1047,6\n473#1:1053,6\n491#1:1059,6\n507#1:1065\n-1#1:1066,10\n-1#1:1076,4\n-1#1:1080,9\n-1#1:1089\n-1#1:1090,2\n-1#1:1092,10\n-1#1:1102,4\n-1#1:1106,9\n-1#1:1115\n-1#1:1116,2\n-1#1:1118,10\n-1#1:1128,4\n-1#1:1132,9\n-1#1:1141\n-1#1:1142,2\n-1#1:1144,10\n-1#1:1154,4\n-1#1:1158,9\n-1#1:1167\n-1#1:1168,2\n-1#1:1170,10\n-1#1:1180,4\n-1#1:1184,9\n-1#1:1193\n-1#1:1194,2\n*E\n"})
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public int[] f86708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public int f86709b;

    public /* synthetic */ I(int i10, C4969v c4969v) {
        this(i10);
    }

    public static /* synthetic */ String P(I i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return i10.M(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public static /* synthetic */ String Q(I i10, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence charSequence, ed.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            separator = U6.j.f68738d;
        }
        if ((i12 & 2) != 0) {
            prefix = "";
        }
        if ((i12 & 4) != 0) {
            postfix = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence = "...";
        }
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1557t.a(charSequence, "truncated", lVar, "transform", prefix);
        int[] iArr = i10.f86708a;
        int i13 = i10.f86709b;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                sbA.append(postfix);
                break;
            }
            int i15 = iArr[i14];
            if (i14 == i11) {
                sbA.append(charSequence);
                break;
            }
            if (i14 != 0) {
                sbA.append(separator);
            }
            sbA.append((CharSequence) lVar.invoke(Integer.valueOf(i15)));
            i14++;
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

    public final int A(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue());
        return i10;
    }

    public final boolean B() {
        return this.f86709b == 0;
    }

    public final boolean C() {
        return this.f86709b != 0;
    }

    @dd.k
    @NotNull
    public final String D() {
        return P(this, null, null, null, 0, null, 31, null);
    }

    @dd.k
    @NotNull
    public final String E(@NotNull ed.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) U6.j.f68738d);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
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
    public final String G(@NotNull CharSequence separator, @NotNull ed.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
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
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull ed.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        StringBuilder sbA = C1557t.a(charSequence, "prefix", lVar, "transform", charSequence);
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sbA.append((CharSequence) "");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Integer.valueOf(i12)));
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
    public final String L(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull ed.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1557t.a(charSequence, "postfix", lVar, "transform", prefix);
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(charSequence);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Integer.valueOf(i13)));
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
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(charSequence);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sbA.append(charSequence2);
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(i13);
            i12++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence charSequence, @NotNull ed.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1557t.a(charSequence, "truncated", lVar, "transform", prefix);
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sbA.append(postfix);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sbA.append(charSequence);
                break;
            }
            if (i12 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Integer.valueOf(i13)));
            i12++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull ed.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1557t.a(charSequence, "postfix", lVar, "transform", prefix);
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sbA.append(charSequence);
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sbA.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sbA.append(separator);
            }
            sbA.append(lVar.invoke(Integer.valueOf(i12)));
            i11++;
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final int R() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f86708a[this.f86709b - 1];
    }

    public final int S(@NotNull ed.l<? super Integer, Boolean> predicate) {
        int i10;
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        do {
            i11--;
            if (-1 >= i11) {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
            i10 = iArr[i11];
        } while (!predicate.invoke(Integer.valueOf(i10)).booleanValue());
        return i10;
    }

    public final int T(int i10) {
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (iArr[i11] != i10);
        return i11;
    }

    public final boolean U() {
        return B();
    }

    public final boolean V(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        for (int i10 = this.f86709b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return C();
    }

    public final boolean b(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int i10) {
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        md.l lVarY1 = md.u.Y1(0, elements.f86709b);
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
        return this.f86709b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof I) {
            I i10 = (I) obj;
            int i11 = i10.f86709b;
            int i12 = this.f86709b;
            if (i11 == i12) {
                int[] iArr = this.f86708a;
                int[] iArr2 = i10.f86708a;
                md.l lVarY1 = md.u.Y1(0, i12);
                int i13 = lVarY1.f221139a;
                int i14 = lVarY1.f221140b;
                if (i13 > i14) {
                    return true;
                }
                while (iArr[i13] == iArr2[i13]) {
                    if (i13 == i14) {
                        return true;
                    }
                    i13++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final int g(@e.D(from = 0) int i10) {
        if (i10 >= 0 && i10 < this.f86709b) {
            return this.f86708a[i10];
        }
        StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
        sbA.append(this.f86709b - 1);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    public final int h(@e.D(from = 0) int i10, @NotNull ed.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f86709b) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : this.f86708a[i10];
    }

    public int hashCode() {
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final int i() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f86708a[0];
    }

    public final int j(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return i12;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R k(R r10, @NotNull ed.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R l(R r10, @NotNull ed.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R m(R r10, @NotNull ed.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final <R> R n(R r10, @NotNull ed.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.G.p(operation, "operation");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final void o(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(iArr[i11]));
        }
    }

    public final void p(@NotNull ed.p<? super Integer, ? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
        }
    }

    public final void q(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final void r(@NotNull ed.p<? super Integer, ? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final int s(@e.D(from = 0) int i10) {
        if (i10 >= 0 && i10 < this.f86709b) {
            return this.f86708a[i10];
        }
        StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
        sbA.append(this.f86709b - 1);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @NotNull
    public String toString() {
        return P(this, null, "[", "]", 0, null, 25, null);
    }

    @NotNull
    public final md.l u() {
        return md.u.Y1(0, this.f86709b);
    }

    @e.D(from = -1)
    public final int v() {
        return this.f86709b - 1;
    }

    @e.D(from = 0)
    public final int w() {
        return this.f86709b;
    }

    public final int y(int i10) {
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int z(@NotNull ed.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int[] iArr = this.f86708a;
        int i10 = this.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public I(int i10) {
        this.f86708a = i10 == 0 ? P.b() : new int[i10];
    }
}
