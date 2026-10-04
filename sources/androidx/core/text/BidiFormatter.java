package androidx.core.text;

import U0.D;
import U0.E;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.text.X;

/* JADX INFO: loaded from: classes2.dex */
public final class BidiFormatter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f111313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f111314e = 8234;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f111315f = 8235;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f111316g = 8236;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f111317h = 8206;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f111318i = 8207;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f111319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f111320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f111321l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111322m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111323n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final BidiFormatter f111324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BidiFormatter f111325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f111326q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f111327r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111328s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f111331c;

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f111332f = 1792;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte[] f111333g = new byte[f111332f];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f111334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f111335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f111336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f111337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f111338e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f111333g[i10] = Character.getDirectionality(i10);
            }
        }

        public a(CharSequence charSequence, boolean z10) {
            this.f111334a = charSequence;
            this.f111335b = z10;
            this.f111336c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f111333g[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char cCharAt = this.f111334a.charAt(this.f111337d - 1);
            this.f111338e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f111334a, this.f111337d);
                this.f111337d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f111337d--;
            byte bC = c(this.f111338e);
            if (!this.f111335b) {
                return bC;
            }
            char c10 = this.f111338e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f111334a.charAt(this.f111337d);
            this.f111338e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f111334a, this.f111337d);
                this.f111337d = Character.charCount(iCodePointAt) + this.f111337d;
                return Character.getDirectionality(iCodePointAt);
            }
            this.f111337d++;
            byte bC = c(this.f111338e);
            if (!this.f111335b) {
                return bC;
            }
            char c10 = this.f111338e;
            if (c10 == '<') {
                return i();
            }
            if (c10 != '&') {
                return bC;
            }
            g();
            return (byte) 12;
        }

        public int d() {
            this.f111337d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f111337d < this.f111336c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f111337d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f111337d = this.f111336c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f111337d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char cCharAt;
            int i10 = this.f111337d;
            do {
                int i11 = this.f111337d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f111334a;
                int i12 = i11 - 1;
                this.f111337d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f111338e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f111337d = i10;
            this.f111338e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i10 = this.f111337d;
                if (i10 >= this.f111336c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f111334a;
                this.f111337d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f111338e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i10 = this.f111337d;
            while (true) {
                int i11 = this.f111337d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f111334a;
                int i12 = i11 - 1;
                this.f111337d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f111338e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f111337d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f111334a;
                            int i14 = i13 - 1;
                            this.f111337d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f111338e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f111337d = i10;
            this.f111338e = X.f218304f;
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i10 = this.f111337d;
            while (true) {
                int i11 = this.f111337d;
                if (i11 >= this.f111336c) {
                    this.f111337d = i10;
                    this.f111338e = X.f218303e;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f111334a;
                this.f111337d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f111338e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f111337d;
                        if (i12 < this.f111336c) {
                            CharSequence charSequence2 = this.f111334a;
                            this.f111337d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f111338e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        D d10 = E.f68376c;
        f111313d = d10;
        f111319j = Character.toString(f111317h);
        f111320k = Character.toString(f111318i);
        f111324o = new BidiFormatter(false, 2, d10);
        f111325p = new BidiFormatter(true, 2, d10);
    }

    public BidiFormatter(boolean z10, int i10, D d10) {
        this.f111329a = z10;
        this.f111330b = i10;
        this.f111331c = d10;
    }

    public static int a(CharSequence charSequence) {
        return new a(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new a(charSequence, false).e();
    }

    public static BidiFormatter c() {
        return new Builder().build();
    }

    public static BidiFormatter d(Locale locale) {
        return new Builder(locale).build();
    }

    public static BidiFormatter e(boolean z10) {
        return new Builder(z10).build();
    }

    public static boolean j(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1;
    }

    public boolean f() {
        return (this.f111330b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f111331c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f111329a;
    }

    public final String k(CharSequence charSequence, D d10) {
        boolean zIsRtl = d10.isRtl(charSequence, 0, charSequence.length());
        return (this.f111329a || !(zIsRtl || b(charSequence) == 1)) ? this.f111329a ? (!zIsRtl || b(charSequence) == -1) ? f111320k : "" : "" : f111319j;
    }

    public final String l(CharSequence charSequence, D d10) {
        boolean zIsRtl = d10.isRtl(charSequence, 0, charSequence.length());
        return (this.f111329a || !(zIsRtl || a(charSequence) == 1)) ? this.f111329a ? (!zIsRtl || a(charSequence) == -1) ? f111320k : "" : "" : f111319j;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f111331c, true);
    }

    public CharSequence n(CharSequence charSequence, D d10) {
        return o(charSequence, d10, true);
    }

    public CharSequence o(CharSequence charSequence, D d10, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = d10.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z10) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zIsRtl ? E.f68375b : E.f68374a));
        }
        if (zIsRtl != this.f111329a) {
            spannableStringBuilder.append(zIsRtl ? f111315f : f111314e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f111316g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zIsRtl ? E.f68375b : E.f68374a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z10) {
        return o(charSequence, this.f111331c, z10);
    }

    public String q(String str) {
        return s(str, this.f111331c, true);
    }

    public String r(String str, D d10) {
        return s(str, d10, true);
    }

    public String s(String str, D d10, boolean z10) {
        if (str == null) {
            return null;
        }
        return ((SpannableStringBuilder) o(str, d10, z10)).toString();
    }

    public String t(String str, boolean z10) {
        return s(str, this.f111331c, z10);
    }

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private D mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.j(Locale.getDefault()));
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z10) {
            return z10 ? BidiFormatter.f111325p : BidiFormatter.f111324o;
        }

        private void initialize(boolean z10) {
            this.mIsRtlContext = z10;
            this.mTextDirectionHeuristicCompat = BidiFormatter.f111313d;
            this.mFlags = 2;
        }

        public BidiFormatter build() {
            return (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.f111313d) ? getDefaultInstanceFromContext(this.mIsRtlContext) : new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }

        public Builder setTextDirectionHeuristic(D d10) {
            this.mTextDirectionHeuristicCompat = d10;
            return this;
        }

        public Builder stereoReset(boolean z10) {
            if (z10) {
                this.mFlags |= 2;
                return this;
            }
            this.mFlags &= -3;
            return this;
        }

        public Builder(boolean z10) {
            initialize(z10);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.j(locale));
        }
    }
}
