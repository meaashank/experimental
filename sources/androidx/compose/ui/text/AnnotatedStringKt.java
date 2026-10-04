package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import h0.C4481i;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1271:1\n33#2,6:1272\n235#2,3:1278\n33#2,4:1281\n238#2,2:1285\n38#2:1287\n240#2:1288\n151#2,3:1289\n33#2,4:1292\n154#2,2:1296\n38#2:1298\n156#2:1299\n235#2,3:1300\n33#2,4:1303\n238#2,2:1307\n38#2:1309\n240#2:1310\n151#2,3:1311\n33#2,4:1314\n154#2,2:1318\n38#2:1320\n156#2:1321\n235#2,3:1322\n33#2,4:1325\n238#2,2:1329\n38#2:1331\n240#2:1332\n151#2,3:1333\n33#2,4:1336\n154#2,2:1340\n38#2:1342\n156#2:1343\n151#2,3:1344\n33#2,4:1347\n154#2,2:1351\n38#2:1353\n156#2:1354\n235#2,3:1356\n33#2,4:1359\n238#2,2:1363\n38#2:1365\n240#2:1366\n151#2,3:1367\n33#2,4:1370\n154#2,2:1374\n38#2:1376\n156#2:1377\n1#3:1355\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n790#1:1272,6\n826#1:1278,3\n826#1:1281,4\n826#1:1285,2\n826#1:1287\n826#1:1288\n827#1:1289,3\n827#1:1292,4\n827#1:1296,2\n827#1:1298\n827#1:1299\n853#1:1300,3\n853#1:1303,4\n853#1:1307,2\n853#1:1309\n853#1:1310\n854#1:1311,3\n854#1:1314,4\n854#1:1318,2\n854#1:1320\n854#1:1321\n880#1:1322,3\n880#1:1325,4\n880#1:1329,2\n880#1:1331\n880#1:1332\n881#1:1333,3\n881#1:1336,4\n881#1:1340,2\n881#1:1342\n881#1:1343\n917#1:1344,3\n917#1:1347,4\n917#1:1351,2\n917#1:1353\n917#1:1354\n1193#1:1356,3\n1193#1:1359,4\n1193#1:1363,2\n1193#1:1365\n1193#1:1366\n1193#1:1367,3\n1193#1:1370,4\n1193#1:1374,2\n1193#1:1376\n1193#1:1377\n*E\n"})
public final class AnnotatedStringKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AnnotatedString f104209a = new AnnotatedString("", null, null, 6, null);

    public static /* synthetic */ AnnotatedString A(AnnotatedString annotatedString, C4481i c4481i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4481i = C4481i.f202382c.a();
        }
        return z(annotatedString, c4481i);
    }

    @InterfaceC2331i
    @NotNull
    public static final <R> R B(@NotNull AnnotatedString.Builder builder, @NotNull d0 d0Var, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(d0Var);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    @InterfaceC2331i
    @InterfaceC4982o(message = "Use LinkAnnotation API for links instead", replaceWith = @InterfaceC4852c0(expression = "withLink(, block)", imports = {}))
    @NotNull
    public static final <R> R C(@NotNull AnnotatedString.Builder builder, @NotNull e0 e0Var, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(e0Var);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }

    @InterfaceC2331i
    @NotNull
    public static final <R> R D(@NotNull AnnotatedString.Builder builder, @NotNull String str, @NotNull String str2, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    @NotNull
    public static final <R> R E(@NotNull AnnotatedString.Builder builder, @NotNull AbstractC2360m abstractC2360m, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushLink = builder.pushLink(abstractC2360m);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushLink);
        }
    }

    @NotNull
    public static final <R> R F(@NotNull AnnotatedString.Builder builder, @NotNull C2373z c2373z, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStyle = builder.pushStyle(c2373z);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @NotNull
    public static final <R> R G(@NotNull AnnotatedString.Builder builder, @NotNull I i10, @NotNull ed.l<? super AnnotatedString.Builder, ? extends R> lVar) {
        int iPushStyle = builder.pushStyle(i10);
        try {
            return lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @NotNull
    public static final AnnotatedString a(@NotNull String str, @NotNull C2373z c2373z) {
        return new AnnotatedString(str, EmptyList.f217510a, kotlin.collections.H.l(new AnnotatedString.b(c2373z, 0, str.length())));
    }

    @NotNull
    public static final AnnotatedString b(@NotNull String str, @NotNull I i10, @Nullable C2373z c2373z) {
        return new AnnotatedString(str, kotlin.collections.H.l(new AnnotatedString.b(i10, 0, str.length())), c2373z == null ? EmptyList.f217510a : kotlin.collections.H.l(new AnnotatedString.b(c2373z, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString c(String str, I i10, C2373z c2373z, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            c2373z = null;
        }
        return b(str, i10, c2373z);
    }

    @NotNull
    public static final AnnotatedString i(@NotNull ed.l<? super AnnotatedString.Builder, L0> lVar) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString j(@NotNull AnnotatedString annotatedString, @NotNull final C4481i c4481i) {
        return JvmAnnotatedString_jvmKt.b(annotatedString, new ed.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1
            {
                super(3);
            }

            @NotNull
            public final String e(@NotNull String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return J.b(strSubstring, c4481i);
                }
                String strSubstring2 = str.substring(i10, i11);
                kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return e(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString k(AnnotatedString annotatedString, C4481i c4481i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4481i = C4481i.f202382c.a();
        }
        return j(annotatedString, c4481i);
    }

    public static final boolean l(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 == i13) {
                if ((i12 == i13) == (i10 == i11)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final AnnotatedString m(@NotNull AnnotatedString annotatedString, @NotNull final C4481i c4481i) {
        return JvmAnnotatedString_jvmKt.b(annotatedString, new ed.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$decapitalize$1
            {
                super(3);
            }

            @NotNull
            public final String e(@NotNull String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return J.d(strSubstring, c4481i);
                }
                String strSubstring2 = str.substring(i10, i11);
                kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return e(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString n(AnnotatedString annotatedString, C4481i c4481i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4481i = C4481i.f202382c.a();
        }
        return m(annotatedString, c4481i);
    }

    @NotNull
    public static final AnnotatedString o() {
        return f104209a;
    }

    public static final <T> List<AnnotatedString.b<T>> p(List<? extends AnnotatedString.b<? extends T>> list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.b<? extends T> bVar = list.get(i12);
            AnnotatedString.b<? extends T> bVar2 = bVar;
            if (t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.b bVar3 = (AnnotatedString.b) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.b(bVar3.f104205a, Math.max(i10, bVar3.f104206b) - i10, Math.min(i11, bVar3.f104207c) - i10, bVar3.f104208d));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.b<? extends Object>> q(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.b<? extends Object>> list;
        if (i10 == i11 || (list = annotatedString.f104199d) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.f104196a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.b<? extends Object> bVar = list.get(i12);
            AnnotatedString.b<? extends Object> bVar2 = bVar;
            if (t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.b bVar3 = (AnnotatedString.b) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.b(bVar3.f104205a, md.u.K(bVar3.f104206b, i10, i11) - i10, md.u.K(bVar3.f104207c, i10, i11) - i10, bVar3.f104208d));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.b<C2373z>> r(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.b<C2373z>> list;
        if (i10 == i11 || (list = annotatedString.f104198c) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.f104196a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.b<C2373z> bVar = list.get(i12);
            AnnotatedString.b<C2373z> bVar2 = bVar;
            if (t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.b bVar3 = (AnnotatedString.b) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.b(bVar3.f104205a, md.u.K(bVar3.f104206b, i10, i11) - i10, md.u.K(bVar3.f104207c, i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.b<I>> s(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.b<I>> list;
        if (i10 == i11 || (list = annotatedString.f104197b) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.f104196a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.b<I> bVar = list.get(i12);
            AnnotatedString.b<I> bVar2 = bVar;
            if (t(i10, i11, bVar2.f104206b, bVar2.f104207c)) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.b bVar3 = (AnnotatedString.b) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.b(bVar3.f104205a, md.u.K(bVar3.f104206b, i10, i11) - i10, md.u.K(bVar3.f104207c, i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean t(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || l(i10, i11, i12, i13) || l(i12, i13, i10, i11);
    }

    @NotNull
    public static final <T> List<T> u(@NotNull AnnotatedString annotatedString, @NotNull C2373z c2373z, @NotNull ed.p<? super AnnotatedString, ? super AnnotatedString.b<C2373z>, ? extends T> pVar) {
        ArrayList arrayList = (ArrayList) v(annotatedString, c2373z);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.b bVar = (AnnotatedString.b) arrayList.get(i10);
            arrayList2.add(pVar.invoke(w(annotatedString, bVar.f104206b, bVar.f104207c), bVar));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<AnnotatedString.b<C2373z>> v(@NotNull AnnotatedString annotatedString, @NotNull C2373z c2373z) {
        int length = annotatedString.f104196a.length();
        List list = annotatedString.f104198c;
        if (list == null) {
            list = EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AnnotatedString.b bVar = (AnnotatedString.b) list.get(i10);
            C2373z c2373z2 = (C2373z) bVar.f104205a;
            int i12 = bVar.f104206b;
            int i13 = bVar.f104207c;
            if (i12 != i11) {
                arrayList.add(new AnnotatedString.b(c2373z, i11, i12));
            }
            arrayList.add(new AnnotatedString.b(c2373z.B(c2373z2), i12, i13));
            i10++;
            i11 = i13;
        }
        if (i11 != length) {
            arrayList.add(new AnnotatedString.b(c2373z, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.b(c2373z, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString w(AnnotatedString annotatedString, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = annotatedString.f104196a.substring(i10, i11);
            kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, s(annotatedString, i10, i11), null, null, 12, null);
    }

    @NotNull
    public static final AnnotatedString x(@NotNull AnnotatedString annotatedString, @NotNull final C4481i c4481i) {
        return JvmAnnotatedString_jvmKt.b(annotatedString, new ed.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toLowerCase$1
            {
                super(3);
            }

            @NotNull
            public final String e(@NotNull String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return J.f(strSubstring, c4481i);
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return e(str, num.intValue(), num2.intValue());
            }
        });
    }

    public static /* synthetic */ AnnotatedString y(AnnotatedString annotatedString, C4481i c4481i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4481i = C4481i.f202382c.a();
        }
        return x(annotatedString, c4481i);
    }

    @NotNull
    public static final AnnotatedString z(@NotNull AnnotatedString annotatedString, @NotNull final C4481i c4481i) {
        return JvmAnnotatedString_jvmKt.b(annotatedString, new ed.q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1
            {
                super(3);
            }

            @NotNull
            public final String e(@NotNull String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return J.h(strSubstring, c4481i);
            }

            @Override // ed.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return e(str, num.intValue(), num2.intValue());
            }
        });
    }
}
