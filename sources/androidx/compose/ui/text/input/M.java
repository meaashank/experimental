package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.ui.text.InterfaceC2358k;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@androidx.compose.runtime.internal.r(parameters = 0)
@InterfaceC2358k
public final class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f104713e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104714f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104715g = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104716h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104717i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f104718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2345n f104719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104720c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104721d = -1;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public M(@NotNull String str) {
        this.f104718a = str;
    }

    public final char a(int i10) {
        C2345n c2345n = this.f104719b;
        if (c2345n == null) {
            return this.f104718a.charAt(i10);
        }
        if (i10 < this.f104720c) {
            return this.f104718a.charAt(i10);
        }
        int iE = c2345n.e();
        int i11 = this.f104720c;
        return i10 < iE + i11 ? c2345n.d(i10 - i11) : this.f104718a.charAt(i10 - ((iE - this.f104721d) + i11));
    }

    public final int b() {
        C2345n c2345n = this.f104719b;
        if (c2345n == null) {
            return this.f104718a.length();
        }
        return c2345n.e() + (this.f104718a.length() - (this.f104721d - this.f104720c));
    }

    @NotNull
    public final String c() {
        return this.f104718a;
    }

    public final void d(int i10, int i11, @NotNull String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("start index must be less than or equal to end index: ", i10, " > ", i11).toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("start must be non-negative, but was ", i10).toString());
        }
        C2345n c2345n = this.f104719b;
        if (c2345n != null) {
            int i12 = this.f104720c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= c2345n.e()) {
                c2345n.g(i13, i14, str);
                return;
            }
            this.f104718a = toString();
            this.f104719b = null;
            this.f104720c = -1;
            this.f104721d = -1;
            d(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f104718a.length() - i11, 64);
        int i15 = i10 - iMin;
        C2347p.a(this.f104718a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        C2347p.a(this.f104718a, cArr, i16, i11, i17);
        C2346o.b(str, cArr, iMin);
        this.f104719b = new C2345n(cArr, str.length() + iMin, i16);
        this.f104720c = i15;
        this.f104721d = i17;
    }

    public final void e(@NotNull String str) {
        this.f104718a = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public String toString() {
        C2345n c2345n = this.f104719b;
        if (c2345n == null) {
            return this.f104718a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f104718a, 0, this.f104720c);
        c2345n.a(sb2);
        String str = this.f104718a;
        sb2.append((CharSequence) str, this.f104721d, str.length());
        return sb2.toString();
    }
}
