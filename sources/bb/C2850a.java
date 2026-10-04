package bb;

import androidx.annotation.NonNull;
import com.prism.commons.utils.V;
import r6.i;

/* JADX INFO: renamed from: bb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C2850a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f126016a = "prism.pfs";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static V f126017b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f126018c = "pfs.import.residePath";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i<String> f126019d = new i<>(a(), f126018c, Oa.a.f65232a, String.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f126020e = "pfs.export.residePath";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static i<String> f126021f = new i<>(a(), f126020e, Oa.a.f65233b, String.class);

    public static V a() {
        V v10 = f126017b;
        if (v10 != null) {
            return v10;
        }
        synchronized (C2850a.class) {
            try {
                V v11 = f126017b;
                if (v11 != null) {
                    return v11;
                }
                V v12 = new V(f126016a);
                f126017b = v12;
                return v12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static i<String> b(String str, @NonNull String str2) {
        if (str == null) {
            return null;
        }
        return str.equals(f126018c) ? f126019d : str.equals(f126020e) ? f126021f : new i<>(a(), "pfs.import.residePath.".concat(str), str2, String.class);
    }
}
