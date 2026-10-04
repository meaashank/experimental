package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f93385g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f93387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f93388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Long f93390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f93391f;

    public Q() {
        this(0, 1, null);
    }

    public static void g(Q q10, TextFieldValue textFieldValue, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        q10.f(textFieldValue, j10);
    }

    public final void a() {
        this.f93391f = true;
    }

    public final int b() {
        return this.f93386a;
    }

    public final void c(@NotNull TextFieldValue textFieldValue) {
        TextFieldValue textFieldValue2;
        this.f93391f = false;
        a aVar = this.f93387b;
        if (kotlin.jvm.internal.G.g(textFieldValue, aVar != null ? aVar.f93393b : null)) {
            return;
        }
        String str = textFieldValue.f104741a.f104196a;
        a aVar2 = this.f93387b;
        if (kotlin.jvm.internal.G.g(str, (aVar2 == null || (textFieldValue2 = aVar2.f93393b) == null) ? null : textFieldValue2.f104741a.f104196a)) {
            a aVar3 = this.f93387b;
            if (aVar3 == null) {
                return;
            }
            aVar3.f93393b = textFieldValue;
            return;
        }
        this.f93387b = new a(this.f93387b, textFieldValue);
        this.f93388c = null;
        int length = textFieldValue.f104741a.f104196a.length() + this.f93389d;
        this.f93389d = length;
        if (length > this.f93386a) {
            e();
        }
    }

    @Nullable
    public final TextFieldValue d() {
        a aVar = this.f93388c;
        if (aVar == null) {
            return null;
        }
        this.f93388c = aVar.f93392a;
        TextFieldValue textFieldValue = aVar.f93393b;
        this.f93387b = new a(this.f93387b, textFieldValue);
        this.f93389d = textFieldValue.f104741a.f104196a.length() + this.f93389d;
        return aVar.f93393b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            androidx.compose.foundation.text.Q$a r0 = r3.f93387b
            r1 = 0
            if (r0 == 0) goto L8
            androidx.compose.foundation.text.Q$a r2 = r0.f93392a
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 != 0) goto Lc
            goto L1d
        Lc:
            if (r0 == 0) goto L15
            androidx.compose.foundation.text.Q$a r2 = r0.f93392a
            if (r2 == 0) goto L15
            androidx.compose.foundation.text.Q$a r2 = r2.f93392a
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.Q$a r0 = r0.f93392a
            goto Lc
        L1b:
            if (r0 != 0) goto L1e
        L1d:
            return
        L1e:
            r0.f93392a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.Q.e():void");
    }

    public final void f(@NotNull TextFieldValue textFieldValue, long j10) {
        if (!this.f93391f) {
            Long l10 = this.f93390e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + ((long) S.f93394a)) {
                return;
            }
        }
        this.f93390e = Long.valueOf(j10);
        c(textFieldValue);
    }

    @Nullable
    public final TextFieldValue h() {
        a aVar;
        a aVar2 = this.f93387b;
        if (aVar2 == null || (aVar = aVar2.f93392a) == null) {
            return null;
        }
        this.f93387b = aVar;
        this.f93389d -= aVar2.f93393b.f104741a.f104196a.length();
        this.f93388c = new a(this.f93388c, aVar2.f93393b);
        return aVar.f93393b;
    }

    public Q(int i10) {
        this.f93386a = i10;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public a f93392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public TextFieldValue f93393b;

        public a(@Nullable a aVar, @NotNull TextFieldValue textFieldValue) {
            this.f93392a = aVar;
            this.f93393b = textFieldValue;
        }

        @Nullable
        public final a a() {
            return this.f93392a;
        }

        @NotNull
        public final TextFieldValue b() {
            return this.f93393b;
        }

        public final void c(@Nullable a aVar) {
            this.f93392a = aVar;
        }

        public final void d(@NotNull TextFieldValue textFieldValue) {
            this.f93393b = textFieldValue;
        }

        public /* synthetic */ a(a aVar, TextFieldValue textFieldValue, int i10, C4969v c4969v) {
            this((i10 & 1) != 0 ? null : aVar, textFieldValue);
        }
    }

    public /* synthetic */ Q(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
