package I2;

import I2.I0;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: I2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1164a implements InterfaceC1175f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<AbstractC1164a> f51006c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51008b;

    /* JADX INFO: renamed from: I2.a$a, reason: collision with other inner class name */
    public static class C0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set<String> f51009a = new HashSet(Arrays.asList(I0.b.f50988a.a()));
    }

    /* JADX INFO: renamed from: I2.a$b */
    public static class b extends AbstractC1164a {
        public b(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: I2.a$c */
    public static class c extends AbstractC1164a {
        public c(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* JADX INFO: renamed from: I2.a$d */
    public static class d extends AbstractC1164a {
        public d(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: I2.a$e */
    public static class e extends AbstractC1164a {
        public e(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: I2.a$f */
    public static class f extends AbstractC1164a {
        public f(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: I2.a$g */
    public static class g extends AbstractC1164a {
        public g(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: I2.a$h */
    public static class h extends AbstractC1164a {
        public h(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: I2.a$i */
    public static class i extends AbstractC1164a {
        public i(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // I2.AbstractC1164a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public AbstractC1164a(@NonNull String str, @NonNull String str2) {
        this.f51007a = str;
        this.f51008b = str2;
        f51006c.add(this);
    }

    @NonNull
    @e.f0
    public static Set<String> b() {
        return C0051a.f51009a;
    }

    @NonNull
    public static Set<AbstractC1164a> e() {
        return Collections.unmodifiableSet(f51006c);
    }

    @Override // I2.InterfaceC1175f0
    @NonNull
    public String a() {
        return this.f51007a;
    }

    public abstract boolean c();

    public boolean d() {
        return BoundaryInterfaceReflectionUtil.containsFeature(C0051a.f51009a, this.f51008b);
    }

    @Override // I2.InterfaceC1175f0
    public boolean isSupported() {
        return c() || d();
    }
}
