package androidx.window.core;

import dd.o;
import ed.InterfaceC4376a;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.G;
import kotlin.I;
import kotlin.jvm.internal.C4969v;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f120053f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Version f120054g = new Version(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Version f120055h = new Version(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Version f120056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Version f120057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f120058k = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f120062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final G f120063e;

    public static final class a {
        public a() {
        }

        @NotNull
        public final Version a() {
            return Version.f120057j;
        }

        @NotNull
        public final Version b() {
            return Version.f120054g;
        }

        @NotNull
        public final Version c() {
            return Version.f120055h;
        }

        @NotNull
        public final Version d() {
            return Version.f120056i;
        }

        @o
        @Nullable
        public final Version e(@Nullable String str) {
            if (str == null || M.Q3(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.f120058k).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            kotlin.jvm.internal.G.o(description, "description");
            return new Version(iIntValue, iIntValue2, iIntValue3, description);
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        f120056i = version;
        f120057j = version;
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, C4969v c4969v) {
        this(i10, i11, i12, str);
    }

    @o
    @Nullable
    public static final Version k(@Nullable String str) {
        return f120053f.e(str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull Version other) {
        kotlin.jvm.internal.G.p(other, "other");
        return f().compareTo(other.f());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.f120059a == version.f120059a && this.f120060b == version.f120060b && this.f120061c == version.f120061c;
    }

    public final BigInteger f() {
        Object value = this.f120063e.getValue();
        kotlin.jvm.internal.G.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @NotNull
    public final String g() {
        return this.f120062d;
    }

    public final int h() {
        return this.f120059a;
    }

    public int hashCode() {
        return ((((527 + this.f120059a) * 31) + this.f120060b) * 31) + this.f120061c;
    }

    public final int i() {
        return this.f120060b;
    }

    public final int j() {
        return this.f120061c;
    }

    @NotNull
    public String toString() {
        String strC = !M.Q3(this.f120062d) ? kotlin.jvm.internal.G.C(com.prism.gaia.download.a.f164606q, this.f120062d) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f120059a);
        sb2.append('.');
        sb2.append(this.f120060b);
        sb2.append('.');
        return android.support.v4.media.d.a(sb2, this.f120061c, strC);
    }

    public Version(int i10, int i11, int i12, String str) {
        this.f120059a = i10;
        this.f120060b = i11;
        this.f120061c = i12;
        this.f120062d = str;
        this.f120063e = I.a(new InterfaceC4376a<BigInteger>() { // from class: androidx.window.core.Version$bigInteger$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final BigInteger invoke() {
                return BigInteger.valueOf(this.f120064d.f120059a).shiftLeft(32).or(BigInteger.valueOf(this.f120064d.f120060b)).shiftLeft(32).or(BigInteger.valueOf(this.f120064d.f120061c));
            }
        });
    }
}
