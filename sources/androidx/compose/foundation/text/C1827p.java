package androidx.compose.foundation.text;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.text.input.C2348q;
import androidx.compose.ui.text.input.C2353w;
import androidx.compose.ui.text.input.C2354x;
import h0.C4481i;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
public final class C1827p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f94582i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final C1827p f94584k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f94586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.text.input.O f94589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Boolean f94590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C4481i f94591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f94581h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final C1827p f94583j = new C1827p(0, (Boolean) null, 0, 0, (androidx.compose.ui.text.input.O) null, (Boolean) null, (C4481i) null, 127, (C4969v) null);

    /* JADX INFO: renamed from: androidx.compose.foundation.text.p$a */
    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @NotNull
        public final C1827p a() {
            return C1827p.f94583j;
        }

        @NotNull
        public final C1827p c() {
            return C1827p.f94584k;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        C2354x.f104847b.getClass();
        f94584k = new C1827p(0, bool, C2354x.f104855j, 0, (androidx.compose.ui.text.input.O) null, (Boolean) null, (C4481i) null, 121, (C4969v) null);
    }

    public /* synthetic */ C1827p(int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool2, C4481i c4481i, C4969v c4969v) {
        this(i10, bool, i11, i12, o10, bool2, c4481i);
    }

    public static androidx.compose.ui.text.input.r F(C1827p c1827p, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            androidx.compose.ui.text.input.r.f104830h.getClass();
            z10 = androidx.compose.ui.text.input.r.f104832j.f104833a;
        }
        return c1827p.E(z10);
    }

    public static /* synthetic */ C1827p d(C1827p c1827p, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = c1827p.f94585a;
        }
        if ((i13 & 2) != 0) {
            z10 = c1827p.o();
        }
        if ((i13 & 4) != 0) {
            i11 = c1827p.f94587c;
        }
        if ((i13 & 8) != 0) {
            i12 = c1827p.f94588d;
        }
        return c1827p.c(i10, z10, i11, i12);
    }

    public static C1827p g(C1827p c1827p, int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool2, C4481i c4481i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = c1827p.f94585a;
        }
        if ((i13 & 2) != 0) {
            bool = c1827p.f94586b;
        }
        if ((i13 & 4) != 0) {
            i11 = c1827p.f94587c;
        }
        if ((i13 & 8) != 0) {
            i12 = c1827p.f94588d;
        }
        if ((i13 & 16) != 0) {
            o10 = c1827p.f94589e;
        }
        if ((i13 & 32) != 0) {
            bool2 = null;
        }
        C4481i c4481i2 = (i13 & 64) != 0 ? null : c4481i;
        c1827p.getClass();
        return new C1827p(i10, bool, i11, i12, o10, bool2, c4481i2);
    }

    public static /* synthetic */ C1827p h(C1827p c1827p, int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool, C4481i c4481i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = c1827p.f94585a;
        }
        if ((i13 & 2) != 0) {
            z10 = c1827p.o();
        }
        if ((i13 & 4) != 0) {
            i11 = c1827p.f94587c;
        }
        if ((i13 & 8) != 0) {
            i12 = c1827p.f94588d;
        }
        if ((i13 & 16) != 0) {
            o10 = c1827p.f94589e;
        }
        if ((i13 & 32) != 0) {
            bool = Boolean.valueOf(c1827p.B());
        }
        if ((i13 & 64) != 0) {
            c4481i = c1827p.f94591g;
        }
        Boolean bool2 = bool;
        C4481i c4481i2 = c4481i;
        androidx.compose.ui.text.input.O o11 = o10;
        int i14 = i11;
        return c1827p.f(i10, z10, i14, i12, o11, bool2, c4481i2);
    }

    public static /* synthetic */ C1827p j(C1827p c1827p, int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = c1827p.f94585a;
        }
        if ((i13 & 2) != 0) {
            z10 = c1827p.o();
        }
        if ((i13 & 4) != 0) {
            i11 = c1827p.f94587c;
        }
        if ((i13 & 8) != 0) {
            i12 = c1827p.f94588d;
        }
        if ((i13 & 16) != 0) {
            o10 = c1827p.f94589e;
        }
        androidx.compose.ui.text.input.O o11 = o10;
        int i14 = i11;
        return c1827p.i(i10, z10, i14, i12, o11);
    }

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void m() {
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void z() {
    }

    @Nullable
    public final Boolean A() {
        return this.f94590f;
    }

    public final boolean B() {
        Boolean bool = this.f94590f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean C() {
        int i10 = this.f94585a;
        C2353w.f104840b.getClass();
        if (i10 != C2353w.f104841c || this.f94586b != null) {
            return false;
        }
        int i11 = this.f94587c;
        C2354x.f104847b.getClass();
        if (i11 != C2354x.f104848c) {
            return false;
        }
        int i12 = this.f94588d;
        C2348q.f104819b.getClass();
        return i12 == C2348q.f104820c && this.f94589e == null && this.f94590f == null && this.f94591g == null;
    }

    @NotNull
    public final C1827p D(@Nullable C1827p c1827p) {
        return c1827p != null ? c1827p.k(this) : this;
    }

    @NotNull
    public final androidx.compose.ui.text.input.r E(boolean z10) {
        return new androidx.compose.ui.text.input.r(z10, q(), o(), w(), u(), this.f94589e, s());
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    public final /* synthetic */ C1827p c(int i10, boolean z10, int i11, int i12) {
        return new C1827p(i10, Boolean.valueOf(z10), i11, i12, this.f94589e, this.f94590f, this.f94591g);
    }

    @NotNull
    public final C1827p e(int i10, @Nullable Boolean bool, int i11, int i12, @Nullable androidx.compose.ui.text.input.O o10, @Nullable Boolean bool2, @Nullable C4481i c4481i) {
        return new C1827p(i10, bool, i11, i12, o10, bool2, c4481i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1827p)) {
            return false;
        }
        C1827p c1827p = (C1827p) obj;
        return this.f94585a == c1827p.f94585a && kotlin.jvm.internal.G.g(this.f94586b, c1827p.f94586b) && this.f94587c == c1827p.f94587c && this.f94588d == c1827p.f94588d && kotlin.jvm.internal.G.g(this.f94589e, c1827p.f94589e) && kotlin.jvm.internal.G.g(this.f94590f, c1827p.f94590f) && kotlin.jvm.internal.G.g(this.f94591g, c1827p.f94591g);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @InterfaceC4852c0(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    public final /* synthetic */ C1827p f(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool, C4481i c4481i) {
        return new C1827p(i10, Boolean.valueOf(z10), i11, i12, o10, bool, c4481i);
    }

    public int hashCode() {
        int i10 = this.f94585a * 31;
        Boolean bool = this.f94586b;
        int iHashCode = (((((i10 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f94587c) * 31) + this.f94588d) * 31;
        androidx.compose.ui.text.input.O o10 = this.f94589e;
        int iHashCode2 = (iHashCode + (o10 != null ? o10.hashCode() : 0)) * 31;
        Boolean bool2 = this.f94590f;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C4481i c4481i = this.f94591g;
        return iHashCode3 + (c4481i != null ? c4481i.f202385a.hashCode() : 0);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ C1827p i(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10) {
        return new C1827p(i10, Boolean.valueOf(z10), i11, i12, o10, this.f94590f, this.f94591g);
    }

    @T1
    @NotNull
    public final C1827p k(@Nullable C1827p c1827p) {
        if (c1827p == null || c1827p.C() || c1827p.equals(this)) {
            return this;
        }
        if (C()) {
            return c1827p;
        }
        int i10 = this.f94585a;
        C2353w c2353w = new C2353w(i10);
        C2353w.f104840b.getClass();
        if (i10 == C2353w.f104841c) {
            c2353w = null;
        }
        int i11 = c2353w != null ? c2353w.f104846a : c1827p.f94585a;
        Boolean bool = this.f94586b;
        if (bool == null) {
            bool = c1827p.f94586b;
        }
        Boolean bool2 = bool;
        int i12 = this.f94587c;
        C2354x c2354x = new C2354x(i12);
        C2354x.f104847b.getClass();
        if (i12 == C2354x.f104848c) {
            c2354x = null;
        }
        int i13 = c2354x != null ? c2354x.f104858a : c1827p.f94587c;
        int i14 = this.f94588d;
        C2348q c2348q = new C2348q(i14);
        C2348q.f104819b.getClass();
        C2348q c2348q2 = i14 != C2348q.f104820c ? c2348q : null;
        int i15 = c2348q2 != null ? c2348q2.f104829a : c1827p.f94588d;
        androidx.compose.ui.text.input.O o10 = this.f94589e;
        if (o10 == null) {
            o10 = c1827p.f94589e;
        }
        androidx.compose.ui.text.input.O o11 = o10;
        Boolean bool3 = this.f94590f;
        if (bool3 == null) {
            bool3 = c1827p.f94590f;
        }
        Boolean bool4 = bool3;
        C4481i c4481i = this.f94591g;
        if (c4481i == null) {
            c4481i = c1827p.f94591g;
        }
        return new C1827p(i11, bool2, i13, i15, o11, bool4, c4481i);
    }

    public final boolean l() {
        return o();
    }

    @Nullable
    public final Boolean n() {
        return this.f94586b;
    }

    public final boolean o() {
        Boolean bool = this.f94586b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int p() {
        return this.f94585a;
    }

    public final int q() {
        int i10 = this.f94585a;
        C2353w c2353w = new C2353w(i10);
        C2353w.a aVar = C2353w.f104840b;
        aVar.getClass();
        if (i10 == C2353w.f104841c) {
            c2353w = null;
        }
        if (c2353w != null) {
            return c2353w.f104846a;
        }
        aVar.getClass();
        return C2353w.f104842d;
    }

    @Nullable
    public final C4481i r() {
        return this.f94591g;
    }

    public final C4481i s() {
        C4481i c4481i = this.f94591g;
        if (c4481i != null) {
            return c4481i;
        }
        C4481i.f202382c.getClass();
        return C4481i.f202384e;
    }

    public final int t() {
        return this.f94588d;
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C2353w.k(this.f94585a)) + ", autoCorrectEnabled=" + this.f94586b + ", keyboardType=" + ((Object) C2354x.p(this.f94587c)) + ", imeAction=" + ((Object) C2348q.o(this.f94588d)) + ", platformImeOptions=" + this.f94589e + "showKeyboardOnFocus=" + this.f94590f + ", hintLocales=" + this.f94591g + ')';
    }

    public final int u() {
        int i10 = this.f94588d;
        C2348q c2348q = new C2348q(i10);
        C2348q.a aVar = C2348q.f104819b;
        aVar.getClass();
        if (i10 == C2348q.f104820c) {
            c2348q = null;
        }
        if (c2348q != null) {
            return c2348q.f104829a;
        }
        aVar.getClass();
        return C2348q.f104821d;
    }

    public final int v() {
        return this.f94587c;
    }

    public final int w() {
        int i10 = this.f94587c;
        C2354x c2354x = new C2354x(i10);
        C2354x.a aVar = C2354x.f104847b;
        aVar.getClass();
        if (i10 == C2354x.f104848c) {
            c2354x = null;
        }
        if (c2354x != null) {
            return c2354x.f104858a;
        }
        aVar.getClass();
        return C2354x.f104849d;
    }

    @Nullable
    public final androidx.compose.ui.text.input.O x() {
        return this.f94589e;
    }

    public final /* synthetic */ boolean y() {
        Boolean bool = this.f94590f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @InterfaceC4852c0(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ C1827p(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool, C4481i c4481i, C4969v c4969v) {
        this(i10, z10, i11, i12, o10, bool, c4481i);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ C1827p(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, C4969v c4969v) {
        this(i10, z10, i11, i12, o10);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ C1827p(int i10, boolean z10, int i11, int i12, C4969v c4969v) {
        this(i10, z10, i11, i12);
    }

    public C1827p(int i10, Boolean bool, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool2, C4481i c4481i) {
        this.f94585a = i10;
        this.f94586b = bool;
        this.f94587c = i11;
        this.f94588d = i12;
        this.f94589e = o10;
        this.f94590f = bool2;
        this.f94591g = c4481i;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1827p(int r2, java.lang.Boolean r3, int r4, int r5, androidx.compose.ui.text.input.O r6, java.lang.Boolean r7, h0.C4481i r8, int r9, kotlin.jvm.internal.C4969v r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto Lb
            androidx.compose.ui.text.input.w$a r2 = androidx.compose.ui.text.input.C2353w.f104840b
            r2.getClass()
            int r2 = androidx.compose.ui.text.input.C2353w.f104841c
        Lb:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L11
            r3 = r0
        L11:
            r10 = r9 & 4
            if (r10 == 0) goto L1c
            androidx.compose.ui.text.input.x$a r4 = androidx.compose.ui.text.input.C2354x.f104847b
            r4.getClass()
            int r4 = androidx.compose.ui.text.input.C2354x.f104848c
        L1c:
            r10 = r9 & 8
            if (r10 == 0) goto L27
            androidx.compose.ui.text.input.q$a r5 = androidx.compose.ui.text.input.C2348q.f104819b
            r5.getClass()
            int r5 = androidx.compose.ui.text.input.C2348q.f104820c
        L27:
            r10 = r9 & 16
            if (r10 == 0) goto L2c
            r6 = r0
        L2c:
            r10 = r9 & 32
            if (r10 == 0) goto L31
            r7 = r0
        L31:
            r9 = r9 & 64
            if (r9 == 0) goto L3e
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L46
        L3e:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L46:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C1827p.<init>(int, java.lang.Boolean, int, int, androidx.compose.ui.text.input.O, java.lang.Boolean, h0.i, int, kotlin.jvm.internal.v):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1827p(int r2, boolean r3, int r4, int r5, androidx.compose.ui.text.input.O r6, java.lang.Boolean r7, h0.C4481i r8, int r9, kotlin.jvm.internal.C4969v r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto Lb
            androidx.compose.ui.text.input.w$a r2 = androidx.compose.ui.text.input.C2353w.f104840b
            r2.getClass()
            int r2 = androidx.compose.ui.text.input.C2353w.f104841c
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L16
            androidx.compose.ui.text.input.x$a r4 = androidx.compose.ui.text.input.C2354x.f104847b
            r4.getClass()
            int r4 = androidx.compose.ui.text.input.C2354x.f104848c
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L21
            androidx.compose.ui.text.input.q$a r5 = androidx.compose.ui.text.input.C2348q.f104819b
            r5.getClass()
            int r5 = androidx.compose.ui.text.input.C2348q.f104820c
        L21:
            r10 = r9 & 16
            r0 = 0
            if (r10 == 0) goto L27
            r6 = r0
        L27:
            r10 = r9 & 32
            if (r10 == 0) goto L2c
            r7 = r0
        L2c:
            r9 = r9 & 64
            if (r9 == 0) goto L39
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L41
        L39:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L41:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C1827p.<init>(int, boolean, int, int, androidx.compose.ui.text.input.O, java.lang.Boolean, h0.i, int, kotlin.jvm.internal.v):void");
    }

    public C1827p(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, Boolean bool, C4481i c4481i) {
        this(i10, Boolean.valueOf(z10), i11, i12, o10, bool, c4481i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1827p(int i10, boolean z10, int i11, int i12, int i13, C4969v c4969v) {
        if ((i13 & 1) != 0) {
            C2353w.f104840b.getClass();
            i10 = C2353w.f104841c;
        }
        z10 = (i13 & 2) != 0 ? f94583j.o() : z10;
        if ((i13 & 4) != 0) {
            C2354x.f104847b.getClass();
            i11 = C2354x.f104848c;
        }
        if ((i13 & 8) != 0) {
            C2348q.f104819b.getClass();
            i12 = C2348q.f104821d;
        }
        this(i10, z10, i11, i12);
    }

    public C1827p(int i10, boolean z10, int i11, int i12) {
        this(i10, Boolean.valueOf(z10), i11, i12, (androidx.compose.ui.text.input.O) null, (Boolean) null, (C4481i) null, 96, (C4969v) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1827p(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10, int i13, C4969v c4969v) {
        if ((i13 & 1) != 0) {
            C2353w.f104840b.getClass();
            i10 = C2353w.f104842d;
        }
        z10 = (i13 & 2) != 0 ? f94583j.o() : z10;
        if ((i13 & 4) != 0) {
            C2354x.f104847b.getClass();
            i11 = C2354x.f104849d;
        }
        if ((i13 & 8) != 0) {
            C2348q.f104819b.getClass();
            i12 = C2348q.f104821d;
        }
        androidx.compose.ui.text.input.O o11 = (i13 & 16) != 0 ? null : o10;
        this(i10, z10, i11, i12, o11);
    }

    public C1827p(int i10, boolean z10, int i11, int i12, androidx.compose.ui.text.input.O o10) {
        this(i10, Boolean.valueOf(z10), i11, i12, o10, Boolean.valueOf(f94583j.B()), (C4481i) null, 64, (C4969v) null);
    }
}
