package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.RestrictTo;
import e.InterfaceC4336j;
import e.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.os.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2403b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2403b f111283a = new C2403b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @InterfaceC4336j(extension = 30)
    public static final int f111284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @InterfaceC4336j(extension = 31)
    public static final int f111285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @InterfaceC4336j(extension = 33)
    public static final int f111286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @InterfaceC4336j(extension = 1000000)
    public static final int f111287e;

    /* JADX INFO: renamed from: androidx.core.os.b$a */
    @e.T(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f111288a = new a();

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.b$b, reason: collision with other inner class name */
    @Lc.c(AnnotationRetention.BINARY)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC0282b {
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f111284b = i10 >= 30 ? a.f111288a.a(30) : 0;
        f111285c = i10 >= 30 ? a.f111288a.a(31) : 0;
        f111286d = i10 >= 30 ? a.f111288a.a(33) : 0;
        f111287e = i10 >= 30 ? a.f111288a.a(1000000) : 0;
    }

    @dd.o
    @InterfaceC4982o(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @InterfaceC4336j(api = 24)
    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @dd.o
    @InterfaceC4982o(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @InterfaceC4336j(api = 25)
    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @dd.o
    @InterfaceC4982o(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @InterfaceC4336j(api = 26)
    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @dd.o
    @InterfaceC4982o(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @InterfaceC4336j(api = 27)
    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @dd.o
    @InterfaceC4982o(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @InterfaceC4336j(api = 28)
    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @dd.o
    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean f(@NotNull String codename, @NotNull String buildCodename) {
        kotlin.jvm.internal.G.p(codename, "codename");
        kotlin.jvm.internal.G.p(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @dd.o
    @InterfaceC4982o(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @InterfaceC4336j(api = 29)
    public static final boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @dd.o
    @InterfaceC4982o(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @InterfaceC4336j(api = 30)
    public static final boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @dd.o
    @InterfaceC4982o(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @InterfaceC4336j(api = 31, codename = t1.b.f238816R4)
    public static final boolean i() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.G.o(CODENAME, "CODENAME");
        return f(t1.b.f238816R4, CODENAME);
    }

    @dd.o
    @InterfaceC4982o(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @InterfaceC4336j(api = 32, codename = "Sv2")
    public static final boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return true;
        }
        if (i10 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.G.o(CODENAME, "CODENAME");
        return f("Sv2", CODENAME);
    }

    @dd.o
    @InterfaceC4982o(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @InterfaceC4336j(api = 33, codename = "Tiramisu")
    public static final boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.G.o(CODENAME, "CODENAME");
        return f("Tiramisu", CODENAME);
    }

    @dd.o
    @InterfaceC4982o(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @InterfaceC4852c0(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @InterfaceC4336j(api = 34, codename = "UpsideDownCake")
    public static final boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.G.o(CODENAME, "CODENAME");
        return f("UpsideDownCake", CODENAME);
    }

    @dd.o
    @InterfaceC4336j(api = 35, codename = "VanillaIceCream")
    public static final boolean m() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        kotlin.jvm.internal.G.o(CODENAME, "CODENAME");
        return f("VanillaIceCream", CODENAME);
    }
}
