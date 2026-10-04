package G;

import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.runtime.internal.r;
import androidx.compose.runtime.saveable.e;
import androidx.compose.runtime.saveable.f;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f40012j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f40015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f40016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final TextEditType f40021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f40011i = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final e<a, Object> f40013k = new C0033a();

    /* JADX INFO: renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0033a implements e<a, Object> {
        @Override // androidx.compose.runtime.saveable.e
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(@NotNull Object obj) {
            G.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            G.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            G.n(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            G.n(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(3);
            G.n(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            G.n(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jB = a0.b(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            G.n(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            G.n(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jB2 = a0.b(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            G.n(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new a(iIntValue, (String) obj3, (String) obj4, jB, jB2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.e
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(@NotNull f fVar, @NotNull a aVar) {
            return I.Q(Integer.valueOf(aVar.f40014a), aVar.f40015b, aVar.f40016c, Integer.valueOf(Z.n(aVar.f40017d)), Integer.valueOf((int) (aVar.f40017d & ZipKt.f225990j)), Integer.valueOf((int) (aVar.f40018e >> 32)), Integer.valueOf((int) (ZipKt.f225990j & aVar.f40018e)), Long.valueOf(aVar.f40019f));
        }
    }

    public static final class b {
        public b() {
        }

        @NotNull
        public final e<a, Object> a() {
            return a.f40013k;
        }

        public b(C4969v c4969v) {
        }
    }

    public /* synthetic */ a(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, C4969v c4969v) {
        this(i10, str, str2, j10, j11, j12, z10);
    }

    public final boolean b() {
        return this.f40020g;
    }

    @NotNull
    public final TextDeleteType c() {
        if (this.f40021h != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        if (!Z.h(this.f40018e)) {
            return TextDeleteType.NotByUser;
        }
        if (Z.h(this.f40017d)) {
            return ((int) (this.f40017d >> 32)) > ((int) (this.f40018e >> 32)) ? TextDeleteType.Start : TextDeleteType.End;
        }
        long j10 = this.f40017d;
        return (((int) (j10 >> 32)) == ((int) (this.f40018e >> 32)) && ((int) (j10 >> 32)) == this.f40014a) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }

    public final int d() {
        return this.f40014a;
    }

    public final long e() {
        return this.f40018e;
    }

    @NotNull
    public final String f() {
        return this.f40016c;
    }

    public final long g() {
        return this.f40017d;
    }

    @NotNull
    public final String h() {
        return this.f40015b;
    }

    @NotNull
    public final TextEditType i() {
        return this.f40021h;
    }

    public final long j() {
        return this.f40019f;
    }

    public a(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, int i11, C4969v c4969v) {
        this(i10, str, str2, j10, j11, (i11 & 32) != 0 ? System.currentTimeMillis() : j12, (i11 & 64) != 0 ? true : z10);
    }

    public a(int i10, String str, String str2, long j10, long j11, long j12, boolean z10) {
        TextEditType textEditType;
        this.f40014a = i10;
        this.f40015b = str;
        this.f40016c = str2;
        this.f40017d = j10;
        this.f40018e = j11;
        this.f40019f = j12;
        this.f40020g = z10;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str.length() != 0 || str2.length() <= 0) {
            textEditType = (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete;
        } else {
            textEditType = TextEditType.Insert;
        }
        this.f40021h = textEditType;
    }
}
