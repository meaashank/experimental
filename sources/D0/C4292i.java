package d0;

import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import b0.C2730H;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class C4292i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f194554e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f194555f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f194556g = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f194557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BreakIterator f194560d;

    /* JADX INFO: renamed from: d0.i$a */
    public static final class a {
        public a() {
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public a(C4969v c4969v) {
        }
    }

    public C4292i(@NotNull CharSequence charSequence, int i10, int i11, @Nullable Locale locale) {
        this.f194557a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f194560d = wordInstance;
        this.f194558b = Math.max(0, i10 - 50);
        this.f194559c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new C2730H(charSequence, i10, i11));
    }

    public final void a(int i10) {
        int i11 = this.f194558b;
        if (i10 > this.f194559c || i11 > i10) {
            StringBuilder sbA = android.support.v4.media.a.a("Invalid offset: ", i10, ". Valid range is [");
            sbA.append(this.f194558b);
            sbA.append(" , ");
            throw new IllegalArgumentException(C1477d.a(sbA, this.f194559c, ']').toString());
        }
    }

    public final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            return (!this.f194560d.isBoundary(i10) || (h(i10) && z10)) ? this.f194560d.preceding(i10) : i10;
        }
        if (h(i10)) {
            return this.f194560d.preceding(i10);
        }
        return -1;
    }

    public final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            return (!this.f194560d.isBoundary(i10) || (j(i10) && z10)) ? this.f194560d.following(i10) : i10;
        }
        if (j(i10)) {
            return this.f194560d.following(i10);
        }
        return -1;
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean h(int i10) {
        return i10 <= this.f194559c && this.f194558b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f194557a, i10));
    }

    public final boolean i(int i10) {
        int i11 = this.f194558b + 1;
        if (i10 > this.f194559c || i11 > i10) {
            return false;
        }
        return f194554e.a(Character.codePointBefore(this.f194557a, i10));
    }

    public final boolean j(int i10) {
        return i10 < this.f194559c && this.f194558b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f194557a, i10));
    }

    public final boolean k(int i10) {
        int i11 = this.f194558b;
        if (i10 >= this.f194559c || i11 > i10) {
            return false;
        }
        return f194554e.a(Character.codePointAt(this.f194557a, i10));
    }

    public final boolean l(int i10) {
        return !k(i10) && i(i10);
    }

    public final boolean m(int i10) {
        return k(i10) && !i(i10);
    }

    public final int n(int i10) {
        a(i10);
        return this.f194560d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f194560d.preceding(i10);
    }
}
