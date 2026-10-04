package androidx.compose.ui.text.input;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InterfaceC2365q;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Z;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class TextFieldValue {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104739e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnnotatedString f104741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.Z f104743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f104738d = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.runtime.saveable.e<TextFieldValue, Object> f104740f = SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // ed.p
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull TextFieldValue textFieldValue) {
            Object objC = SaversKt.C(textFieldValue.f104741a, SaversKt.h(), fVar);
            androidx.compose.ui.text.Z zB = androidx.compose.ui.text.Z.b(textFieldValue.f104742b);
            Z.a aVar = androidx.compose.ui.text.Z.f104406b;
            return kotlin.collections.I.t(objC, SaversKt.C(zB, SaversKt.f104329p, fVar));
        }
    }, new ed.l<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // ed.l
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(@NotNull Object obj) {
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.runtime.saveable.e<AnnotatedString, Object> eVarH = SaversKt.h();
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.text.Z zB = null;
            AnnotatedString annotatedStringB = ((!kotlin.jvm.internal.G.g(obj2, bool) || (eVarH instanceof InterfaceC2365q)) && obj2 != null) ? eVarH.b(obj2) : null;
            kotlin.jvm.internal.G.m(annotatedStringB);
            Object obj3 = list.get(1);
            Z.a aVar = androidx.compose.ui.text.Z.f104406b;
            androidx.compose.runtime.saveable.e<androidx.compose.ui.text.Z, Object> eVar = SaversKt.f104329p;
            if ((!kotlin.jvm.internal.G.g(obj3, bool) || (eVar instanceof InterfaceC2365q)) && obj3 != null) {
                zB = eVar.b(obj3);
            }
            kotlin.jvm.internal.G.m(zB);
            return new TextFieldValue(annotatedStringB, zB.f104408a, (androidx.compose.ui.text.Z) null, 4, (C4969v) null);
        }
    });

    public static final class a {
        public a() {
        }

        @NotNull
        public final androidx.compose.runtime.saveable.e<TextFieldValue, Object> a() {
            return TextFieldValue.f104740f;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.Z z10, C4969v c4969v) {
        this(annotatedString, j10, z10);
    }

    public static TextFieldValue d(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, androidx.compose.ui.text.Z z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.f104741a;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.f104742b;
        }
        if ((i10 & 4) != 0) {
            z10 = textFieldValue.f104743c;
        }
        textFieldValue.getClass();
        return new TextFieldValue(annotatedString, j10, z10);
    }

    public static /* synthetic */ TextFieldValue e(TextFieldValue textFieldValue, String str, long j10, androidx.compose.ui.text.Z z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.f104742b;
        }
        if ((i10 & 4) != 0) {
            z10 = textFieldValue.f104743c;
        }
        return textFieldValue.c(str, j10, z10);
    }

    @NotNull
    public final TextFieldValue b(@NotNull AnnotatedString annotatedString, long j10, @Nullable androidx.compose.ui.text.Z z10) {
        return new TextFieldValue(annotatedString, j10, z10);
    }

    @NotNull
    public final TextFieldValue c(@NotNull String str, long j10, @Nullable androidx.compose.ui.text.Z z10) {
        return new TextFieldValue(new AnnotatedString(str, null, null, 6, null), j10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return androidx.compose.ui.text.Z.g(this.f104742b, textFieldValue.f104742b) && kotlin.jvm.internal.G.g(this.f104743c, textFieldValue.f104743c) && kotlin.jvm.internal.G.g(this.f104741a, textFieldValue.f104741a);
    }

    @NotNull
    public final AnnotatedString f() {
        return this.f104741a;
    }

    @Nullable
    public final androidx.compose.ui.text.Z g() {
        return this.f104743c;
    }

    public final long h() {
        return this.f104742b;
    }

    public int hashCode() {
        int iO = (androidx.compose.ui.text.Z.o(this.f104742b) + (this.f104741a.hashCode() * 31)) * 31;
        androidx.compose.ui.text.Z z10 = this.f104743c;
        return iO + (z10 != null ? C1550p.a(z10.f104408a) : 0);
    }

    @NotNull
    public final String i() {
        return this.f104741a.f104196a;
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f104741a) + "', selection=" + ((Object) androidx.compose.ui.text.Z.q(this.f104742b)) + ", composition=" + this.f104743c + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j10, androidx.compose.ui.text.Z z10, C4969v c4969v) {
        this(str, j10, z10);
    }

    public TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.Z z10) {
        this.f104741a = annotatedString;
        this.f104742b = androidx.compose.ui.text.a0.c(j10, 0, annotatedString.f104196a.length());
        this.f104743c = z10 != null ? new androidx.compose.ui.text.Z(androidx.compose.ui.text.a0.c(z10.f104408a, 0, annotatedString.f104196a.length())) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.Z z10, int i10, C4969v c4969v) {
        if ((i10 & 2) != 0) {
            androidx.compose.ui.text.Z.f104406b.getClass();
            j10 = androidx.compose.ui.text.Z.f104407c;
        }
        this(annotatedString, j10, (i10 & 4) != 0 ? null : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldValue(String str, long j10, androidx.compose.ui.text.Z z10, int i10, C4969v c4969v) {
        str = (i10 & 1) != 0 ? "" : str;
        if ((i10 & 2) != 0) {
            androidx.compose.ui.text.Z.f104406b.getClass();
            j10 = androidx.compose.ui.text.Z.f104407c;
        }
        this(str, j10, (i10 & 4) != 0 ? null : z10);
    }

    public TextFieldValue(String str, long j10, androidx.compose.ui.text.Z z10) {
        this(new AnnotatedString(str, null, null, 6, null), j10, z10);
    }
}
