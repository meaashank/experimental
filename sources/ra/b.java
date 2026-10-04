package Ra;

import java.io.File;
import l6.C5150b;

/* JADX INFO: loaded from: classes7.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f67799c = '_';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5150b f67800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67801b = -1;

    public b(String str) {
        this.f67800a = C5150b.e(str);
    }

    @Override // Ra.a
    public String a() {
        for (int i10 = 0; i10 < 100000; i10++) {
            String strB = b();
            if (!new File(strB).exists()) {
                return strB;
            }
        }
        return null;
    }

    public final String b() {
        int i10 = this.f67801b + 1;
        this.f67801b = i10;
        if (i10 == 0) {
            return this.f67800a.a() + this.f67800a.c();
        }
        return this.f67800a.a() + f67799c + this.f67801b + this.f67800a.c();
    }
}
