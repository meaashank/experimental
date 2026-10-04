package B0;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocusId f12249b;

    @T(29)
    public static class a {
        @NonNull
        public static LocusId a(@NonNull String str) {
            return new LocusId(str);
        }

        @NonNull
        public static String b(@NonNull LocusId locusId) {
            return locusId.getId();
        }
    }

    public A(@NonNull String str) {
        androidx.core.util.t.q(str, "id cannot be empty");
        this.f12248a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12249b = a.a(str);
        } else {
            this.f12249b = null;
        }
    }

    @NonNull
    @T(29)
    public static A d(@NonNull LocusId locusId) {
        androidx.core.util.t.m(locusId, "locusId cannot be null");
        String strB = a.b(locusId);
        androidx.core.util.t.q(strB, "id cannot be empty");
        return new A(strB);
    }

    @NonNull
    public String a() {
        return this.f12248a;
    }

    @NonNull
    public final String b() {
        return z.a(this.f12248a.length(), "_chars");
    }

    @NonNull
    @T(29)
    public LocusId c() {
        return this.f12249b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        String str = this.f12248a;
        return str == null ? a10.f12248a == null : str.equals(a10.f12248a);
    }

    public int hashCode() {
        String str = this.f12248a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
