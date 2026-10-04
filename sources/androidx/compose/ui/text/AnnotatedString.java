package androidx.compose.ui.text;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.text.AbstractC2360m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1271:1\n1045#2:1272\n33#3,6:1273\n235#3,3:1280\n33#3,4:1283\n238#3,2:1287\n38#3:1289\n240#3:1290\n101#3,2:1291\n33#3,6:1293\n103#3:1299\n235#3,3:1300\n33#3,4:1303\n238#3,2:1307\n38#3:1309\n240#3:1310\n235#3,3:1311\n33#3,4:1314\n238#3,2:1318\n38#3:1320\n240#3:1321\n235#3,3:1322\n33#3,4:1325\n238#3,2:1329\n38#3:1331\n240#3:1332\n235#3,3:1333\n33#3,4:1336\n238#3,2:1340\n38#3:1342\n240#3:1343\n101#3,2:1344\n33#3,6:1346\n103#3:1352\n1#4:1279\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n88#1:1272\n88#1:1273,6\n161#1:1280,3\n161#1:1283,4\n161#1:1287,2\n161#1:1289\n161#1:1290\n169#1:1291,2\n169#1:1293,6\n169#1:1299\n184#1:1300,3\n184#1:1303,4\n184#1:1307,2\n184#1:1309\n184#1:1310\n199#1:1311,3\n199#1:1314,4\n199#1:1318,2\n199#1:1320\n199#1:1321\n216#1:1322,3\n216#1:1325,4\n216#1:1329,2\n216#1:1331\n216#1:1332\n231#1:1333,3\n231#1:1336,4\n231#1:1340,2\n231#1:1342\n231#1:1343\n239#1:1344,2\n239#1:1346,6\n239#1:1352\n*E\n"})
public final class AnnotatedString implements CharSequence {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104194f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<b<I>> f104197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<b<C2373z>> f104198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<b<? extends Object>> f104199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f104193e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.runtime.saveable.e<AnnotatedString, ?> f104195g = SaversKt.h();

    @kotlin.jvm.internal.V({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1271:1\n33#2,6:1272\n33#2,6:1278\n33#2,6:1284\n33#2,6:1290\n33#2,6:1296\n33#2,6:1302\n151#2,3:1309\n33#2,4:1312\n154#2,2:1316\n38#2:1318\n156#2:1319\n151#2,3:1320\n33#2,4:1323\n154#2,2:1327\n38#2:1329\n156#2:1330\n151#2,3:1331\n33#2,4:1334\n154#2,2:1338\n38#2:1340\n156#2:1341\n1#3:1308\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n437#1:1272,6\n440#1:1278,6\n444#1:1284,6\n464#1:1290,6\n467#1:1296,6\n471#1:1302,6\n743#1:1309,3\n743#1:1312,4\n743#1:1316,2\n743#1:1318\n743#1:1319\n746#1:1320,3\n746#1:1323,4\n746#1:1327,2\n746#1:1329\n746#1:1330\n749#1:1331,3\n749#1:1334,4\n749#1:1338,2\n749#1:1340\n749#1:1341\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class Builder implements Appendable {
        public static final int $stable = 8;

        @NotNull
        private final List<a<? extends Object>> annotations;

        @NotNull
        private final List<a<C2373z>> paragraphStyles;

        @NotNull
        private final List<a<I>> spanStyles;

        @NotNull
        private final List<a<? extends Object>> styleStack;

        @NotNull
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public final void addLink(@NotNull AbstractC2360m.b bVar, int i10, int i11) {
            this.annotations.add(new a<>(bVar, i10, i11, null, 8, null));
        }

        public final void addStringAnnotation(@NotNull String str, @NotNull String str2, int i10, int i11) {
            this.annotations.add(new a<>(str2, i10, i11, str));
        }

        public final void addStyle(@NotNull I i10, int i11, int i12) {
            this.spanStyles.add(new a<>(i10, i11, i12, null, 8, null));
        }

        @InterfaceC2331i
        public final void addTtsAnnotation(@NotNull d0 d0Var, int i10, int i11) {
            this.annotations.add(new a<>(d0Var, i10, i11, null, 8, null));
        }

        @InterfaceC2331i
        @InterfaceC4982o(message = "Use LinkAnnotation API for links instead", replaceWith = @InterfaceC4852c0(expression = "addLink(, start, end)", imports = {}))
        public final void addUrlAnnotation(@NotNull e0 e0Var, int i10, int i11) {
            this.annotations.add(new a<>(e0Var, i10, i11, null, 8, null));
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).f104202c = this.text.length();
        }

        public final int pushLink(@NotNull AbstractC2360m abstractC2360m) {
            a<? extends Object> aVar = new a<>(abstractC2360m, this.text.length(), 0, null, 12, null);
            this.styleStack.add(aVar);
            this.annotations.add(aVar);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(@NotNull String str, @NotNull String str2) {
            a<? extends Object> aVar = new a<>(str2, this.text.length(), 0, str, 4, null);
            this.styleStack.add(aVar);
            this.annotations.add(aVar);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(@NotNull I i10) {
            a<I> aVar = new a<>(i10, this.text.length(), 0, null, 12, null);
            this.styleStack.add(aVar);
            this.spanStyles.add(aVar);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull d0 d0Var) {
            a<? extends Object> aVar = new a<>(d0Var, this.text.length(), 0, null, 12, null);
            this.styleStack.add(aVar);
            this.annotations.add(aVar);
            return this.styleStack.size() - 1;
        }

        @InterfaceC2331i
        @InterfaceC4982o(message = "Use LinkAnnotation API for links instead", replaceWith = @InterfaceC4852c0(expression = "pushLink(, start, end)", imports = {}))
        public final int pushUrlAnnotation(@NotNull e0 e0Var) {
            a<? extends Object> aVar = new a<>(e0Var, this.text.length(), 0, null, 12, null);
            this.styleStack.add(aVar);
            this.annotations.add(aVar);
            return this.styleStack.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<a<I>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).l(this.text.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<a<C2373z>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).l(this.text.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<a<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(list3.get(i12).l(this.text.length()));
            }
            return new AnnotatedString(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        public Builder(int i10) {
            this.text = new StringBuilder(i10);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void addLink(@NotNull AbstractC2360m.a aVar, int i10, int i11) {
            this.annotations.add(new a<>(aVar, i10, i11, null, 8, null));
        }

        public final void addStyle(@NotNull C2373z c2373z, int i10, int i11) {
            this.paragraphStyles.add(new a<>(c2373z, i10, i11, null, 8, null));
        }

        public final void append(@NotNull String str) {
            this.text.append(str);
        }

        @kotlin.jvm.internal.V({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1271:1\n1#2:1272\n*E\n"})
        public static final class a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f104200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f104201b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f104202c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f104203d;

            public a(T t10, int i10, int i11, @NotNull String str) {
                this.f104200a = t10;
                this.f104201b = i10;
                this.f104202c = i11;
                this.f104203d = str;
            }

            public static a f(a aVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = aVar.f104200a;
                }
                if ((i12 & 2) != 0) {
                    i10 = aVar.f104201b;
                }
                if ((i12 & 4) != 0) {
                    i11 = aVar.f104202c;
                }
                if ((i12 & 8) != 0) {
                    str = aVar.f104203d;
                }
                aVar.getClass();
                return new a(obj, i10, i11, str);
            }

            public static /* synthetic */ b m(a aVar, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return aVar.l(i10);
            }

            public final T a() {
                return this.f104200a;
            }

            public final int b() {
                return this.f104201b;
            }

            public final int c() {
                return this.f104202c;
            }

            @NotNull
            public final String d() {
                return this.f104203d;
            }

            @NotNull
            public final a<T> e(T t10, int i10, int i11, @NotNull String str) {
                return new a<>(t10, i10, i11, str);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.G.g(this.f104200a, aVar.f104200a) && this.f104201b == aVar.f104201b && this.f104202c == aVar.f104202c && kotlin.jvm.internal.G.g(this.f104203d, aVar.f104203d);
            }

            public final int g() {
                return this.f104202c;
            }

            public final T h() {
                return this.f104200a;
            }

            public int hashCode() {
                T t10 = this.f104200a;
                return this.f104203d.hashCode() + ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f104201b) * 31) + this.f104202c) * 31);
            }

            public final int i() {
                return this.f104201b;
            }

            @NotNull
            public final String j() {
                return this.f104203d;
            }

            public final void k(int i10) {
                this.f104202c = i10;
            }

            @NotNull
            public final b<T> l(int i10) {
                int i11 = this.f104202c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new b<>(this.f104200a, this.f104201b, i10, this.f104203d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f104200a);
                sb2.append(", start=");
                sb2.append(this.f104201b);
                sb2.append(", end=");
                sb2.append(this.f104202c);
                sb2.append(", tag=");
                return R0.a(sb2, this.f104203d, ')');
            }

            public /* synthetic */ a(Object obj, int i10, int i11, String str, int i12, C4969v c4969v) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public final int pushStyle(@NotNull C2373z c2373z) {
            a<C2373z> aVar = new a<>(c2373z, this.text.length(), 0, null, 12, null);
            this.styleStack.add(aVar);
            this.paragraphStyles.add(aVar);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        public final void pop(int i10) {
            if (i10 < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= i10) {
                    pop();
                }
            } else {
                throw new IllegalStateException((i10 + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public /* synthetic */ Builder(int i10, int i11, C4969v c4969v) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public Builder(@NotNull String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i10, i11);
                return this;
            }
            this.text.append(charSequence, i10, i11);
            return this;
        }

        public Builder(@NotNull AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(char c10) {
            this.text.append(c10);
            return this;
        }

        public final void append(@NotNull AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.f104196a);
            List<b<I>> list = annotatedString.f104197b;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b<I> bVar = list.get(i10);
                    addStyle(bVar.f104205a, bVar.f104206b + length, bVar.f104207c + length);
                }
            }
            List<b<C2373z>> list2 = annotatedString.f104198c;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b<C2373z> bVar2 = list2.get(i11);
                    addStyle(bVar2.f104205a, bVar2.f104206b + length, bVar2.f104207c + length);
                }
            }
            List<b<? extends Object>> list3 = annotatedString.f104199d;
            if (list3 != null) {
                int size3 = list3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    b<? extends Object> bVar3 = list3.get(i12);
                    this.annotations.add(new a<>(bVar3.f104205a, bVar3.f104206b + length, bVar3.f104207c + length, bVar3.f104208d));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void append(@NotNull AnnotatedString annotatedString, int i10, int i11) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.f104196a, i10, i11);
            List listS = AnnotatedStringKt.s(annotatedString, i10, i11);
            if (listS != null) {
                int size = listS.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = (b) listS.get(i12);
                    addStyle((I) bVar.f104205a, bVar.f104206b + length, bVar.f104207c + length);
                }
            }
            List<b<C2373z>> listR = AnnotatedStringKt.r(annotatedString, i10, i11);
            if (listR != null) {
                int size2 = listR.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    b<C2373z> bVar2 = listR.get(i13);
                    addStyle(bVar2.f104205a, bVar2.f104206b + length, bVar2.f104207c + length);
                }
            }
            List<b<? extends Object>> listQ = AnnotatedStringKt.q(annotatedString, i10, i11);
            if (listQ != null) {
                int size3 = listQ.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    b<? extends Object> bVar3 = listQ.get(i14);
                    this.annotations.add(new a<>(bVar3.f104205a, bVar3.f104206b + length, bVar3.f104207c + length, bVar3.f104208d));
                }
            }
        }
    }

    public static final class a {
        public a() {
        }

        @NotNull
        public final androidx.compose.runtime.saveable.e<AnnotatedString, ?> a() {
            return AnnotatedString.f104195g;
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n88#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return Oc.g.l(Integer.valueOf(((b) t10).f104206b), Integer.valueOf(((b) t11).f104206b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(@NotNull String str, @Nullable List<b<I>> list, @Nullable List<b<C2373z>> list2, @Nullable List<? extends b<? extends Object>> list3) {
        List listZ5;
        this.f104196a = str;
        this.f104197b = list;
        this.f104198c = list2;
        this.f104199d = list3;
        if (list2 == null || (listZ5 = kotlin.collections.U.z5(list2, new c())) == null) {
            return;
        }
        int size = listZ5.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) listZ5.get(i11);
            if (bVar.f104206b < i10) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.f104207c > this.f104196a.length()) {
                StringBuilder sb2 = new StringBuilder("ParagraphStyle range [");
                sb2.append(bVar.f104206b);
                sb2.append(U6.j.f68738d);
                throw new IllegalArgumentException(android.support.v4.media.d.a(sb2, bVar.f104207c, ") is out of boundary").toString());
            }
            i10 = bVar.f104207c;
        }
    }

    public char b(int i10) {
        return this.f104196a.charAt(i10);
    }

    @Nullable
    public final List<b<? extends Object>> c() {
        return this.f104199d;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f104196a.charAt(i10);
    }

    public int d() {
        return this.f104196a.length();
    }

    @NotNull
    public final List<b<AbstractC2360m>> e(int i10, int i11) {
        List arrayList;
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.f104205a instanceof AbstractC2360m) && AnnotatedStringKt.t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = EmptyList.f217510a;
        }
        kotlin.jvm.internal.G.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return kotlin.jvm.internal.G.g(this.f104196a, annotatedString.f104196a) && kotlin.jvm.internal.G.g(this.f104197b, annotatedString.f104197b) && kotlin.jvm.internal.G.g(this.f104198c, annotatedString.f104198c) && kotlin.jvm.internal.G.g(this.f104199d, annotatedString.f104199d);
    }

    @NotNull
    public final List<b<C2373z>> f() {
        List<b<C2373z>> list = this.f104198c;
        return list == null ? EmptyList.f217510a : list;
    }

    @Nullable
    public final List<b<C2373z>> g() {
        return this.f104198c;
    }

    @NotNull
    public final List<b<I>> h() {
        List<b<I>> list = this.f104197b;
        return list == null ? EmptyList.f217510a : list;
    }

    public int hashCode() {
        int iHashCode = this.f104196a.hashCode() * 31;
        List<b<I>> list = this.f104197b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<b<C2373z>> list2 = this.f104198c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<b<? extends Object>> list3 = this.f104199d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Nullable
    public final List<b<I>> i() {
        return this.f104197b;
    }

    @NotNull
    public final List<b<String>> j(int i10, int i11) {
        List arrayList;
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.f104205a instanceof String) && AnnotatedStringKt.t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = EmptyList.f217510a;
        }
        kotlin.jvm.internal.G.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayList;
    }

    @NotNull
    public final List<b<String>> k(@NotNull String str, int i10, int i11) {
        List arrayList;
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.f104205a instanceof String) && kotlin.jvm.internal.G.g(str, bVar2.f104208d) && AnnotatedStringKt.t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = EmptyList.f217510a;
        }
        kotlin.jvm.internal.G.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return arrayList;
    }

    @NotNull
    public final String l() {
        return this.f104196a;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f104196a.length();
    }

    @NotNull
    public final List<b<d0>> m(int i10, int i11) {
        List arrayList;
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.f104205a instanceof d0) && AnnotatedStringKt.t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = EmptyList.f217510a;
        }
        kotlin.jvm.internal.G.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return arrayList;
    }

    @InterfaceC2331i
    @InterfaceC4982o(message = "Use LinkAnnotation API instead", replaceWith = @InterfaceC4852c0(expression = "getLinkAnnotations(start, end)", imports = {}))
    @NotNull
    public final List<b<e0>> n(int i10, int i11) {
        List arrayList;
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.f104205a instanceof e0) && AnnotatedStringKt.t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = EmptyList.f217510a;
        }
        kotlin.jvm.internal.G.n(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return arrayList;
    }

    public final boolean o(@NotNull AnnotatedString annotatedString) {
        return kotlin.jvm.internal.G.g(this.f104199d, annotatedString.f104199d);
    }

    public final boolean p(int i10, int i11) {
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                if ((bVar.f104205a instanceof AbstractC2360m) && AnnotatedStringKt.t(i10, i11, bVar.f104206b, bVar.f104207c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q(@NotNull String str, int i10, int i11) {
        List<b<? extends Object>> list = this.f104199d;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b<? extends Object> bVar = list.get(i12);
                if ((bVar.f104205a instanceof String) && kotlin.jvm.internal.G.g(str, bVar.f104208d) && AnnotatedStringKt.t(i10, i11, bVar.f104206b, bVar.f104207c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @T1
    @NotNull
    public final AnnotatedString r(@NotNull AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    @Override // java.lang.CharSequence
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AnnotatedString subSequence(int i10, int i11) {
        if (i10 <= i11) {
            if (i10 == 0 && i11 == this.f104196a.length()) {
                return this;
            }
            String strSubstring = this.f104196a.substring(i10, i11);
            kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(strSubstring, AnnotatedStringKt.p(this.f104197b, i10, i11), AnnotatedStringKt.p(this.f104198c, i10, i11), AnnotatedStringKt.p(this.f104199d, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    @NotNull
    public final AnnotatedString t(long j10) {
        return subSequence(Z.l(j10), Z.k(j10));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.f104196a;
    }

    @kotlin.jvm.internal.V({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1271:1\n1#2:1272\n*E\n"})
    @InterfaceC1924k0
    public static final class b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104204e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f104205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f104208d;

        public b(T t10, int i10, int i11, @NotNull String str) {
            this.f104205a = t10;
            this.f104206b = i10;
            this.f104207c = i11;
            this.f104208d = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static b f(b bVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = bVar.f104205a;
            }
            if ((i12 & 2) != 0) {
                i10 = bVar.f104206b;
            }
            if ((i12 & 4) != 0) {
                i11 = bVar.f104207c;
            }
            if ((i12 & 8) != 0) {
                str = bVar.f104208d;
            }
            bVar.getClass();
            return new b(obj, i10, i11, str);
        }

        public final T a() {
            return this.f104205a;
        }

        public final int b() {
            return this.f104206b;
        }

        public final int c() {
            return this.f104207c;
        }

        @NotNull
        public final String d() {
            return this.f104208d;
        }

        @NotNull
        public final b<T> e(T t10, int i10, int i11, @NotNull String str) {
            return new b<>(t10, i10, i11, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f104205a, bVar.f104205a) && this.f104206b == bVar.f104206b && this.f104207c == bVar.f104207c && kotlin.jvm.internal.G.g(this.f104208d, bVar.f104208d);
        }

        public final int g() {
            return this.f104207c;
        }

        public final T h() {
            return this.f104205a;
        }

        public int hashCode() {
            T t10 = this.f104205a;
            return this.f104208d.hashCode() + ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f104206b) * 31) + this.f104207c) * 31);
        }

        public final int i() {
            return this.f104206b;
        }

        @NotNull
        public final String j() {
            return this.f104208d;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f104205a);
            sb2.append(", start=");
            sb2.append(this.f104206b);
            sb2.append(", end=");
            sb2.append(this.f104207c);
            sb2.append(", tag=");
            return R0.a(sb2, this.f104208d, ')');
        }

        public b(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public AnnotatedString(String str, List list, List list2, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? EmptyList.f217510a : list, (i10 & 4) != 0 ? EmptyList.f217510a : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(@NotNull String str, @NotNull List<b<I>> list, @NotNull List<b<C2373z>> list2) {
        List<b<I>> list3 = list;
        List<b<C2373z>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
