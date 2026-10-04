package androidx.compose.ui.text;

import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104228d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f104227c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final D f104229e = new D();

    public static final class a {
        public a() {
        }

        @NotNull
        public final D a() {
            return D.f104229e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ D(int i10, C4969v c4969v) {
        this(i10);
    }

    public static /* synthetic */ void d() {
    }

    public final int b() {
        return this.f104231b;
    }

    public final boolean c() {
        return this.f104230a;
    }

    @NotNull
    public final D e(@Nullable D d10) {
        return d10 == null ? this : d10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f104230a == d10.f104230a && this.f104231b == d10.f104231b;
    }

    public int hashCode() {
        return (C1635o.a(this.f104230a) * 31) + this.f104231b;
    }

    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f104230a + ", emojiSupportMatch=" + ((Object) C2330h.i(this.f104231b)) + ')';
    }

    public /* synthetic */ D(int i10, boolean z10, C4969v c4969v) {
        this(i10, z10);
    }

    public D(boolean z10) {
        this.f104230a = z10;
        C2330h.f104672b.getClass();
        this.f104231b = C2330h.f104673c;
    }

    public /* synthetic */ D(boolean z10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(int i10, boolean z10, int i11, C4969v c4969v) {
        if ((i11 & 1) != 0) {
            C2330h.f104672b.getClass();
            i10 = C2330h.f104673c;
        }
        this(i10, (i11 & 2) != 0 ? false : z10);
    }

    public D(int i10, boolean z10) {
        this.f104230a = z10;
        this.f104231b = i10;
    }

    public D(int i10) {
        this.f104230a = false;
        this.f104231b = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(int i10, int i11, C4969v c4969v) {
        if ((i11 & 1) != 0) {
            C2330h.f104672b.getClass();
            i10 = C2330h.f104673c;
        }
        this(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D() {
        this(C2330h.f104673c, false);
        C2330h.f104672b.getClass();
    }
}
