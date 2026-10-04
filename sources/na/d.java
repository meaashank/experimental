package na;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.prism.commons.utils.C3860y;
import com.prism.hider.vault.commons.B;
import com.prism.hider.vault.commons.D;
import r6.j;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f221268c = "d";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f221269d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f221270e = "user_pin_code";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f221271f = {4, 6};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f221272a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j<String> f221273b = new j<>(D.f168597c.a(null), f221270e, "", (Class<String>) String.class);

    public d(Context context) {
        e(context);
    }

    public static d b(Context context) {
        if (f221269d == null) {
            synchronized (d.class) {
                try {
                    if (f221269d == null) {
                        f221269d = new d(context);
                    }
                } finally {
                }
            }
        }
        return f221269d;
    }

    public static boolean d(int i10) {
        for (int i11 : f221271f) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean a(String str) {
        String strM = C3860y.m(str);
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("code=", str, ", encode=", strM, ", encodedPinCode=");
        sbA.append(this.f221272a);
        Log.i("vault_notepad", sbA.toString());
        String str2 = this.f221272a;
        boolean z10 = str2 != null && str2.equals(strM);
        if (z10) {
            B.h().a();
        }
        return z10;
    }

    public boolean c() {
        return !TextUtils.isEmpty(this.f221272a);
    }

    public final void e(Context context) {
        synchronized (d.class) {
            this.f221272a = this.f221273b.h(context);
        }
    }

    public void f(Context context, String str) {
        synchronized (d.class) {
            String strM = C3860y.m(str);
            if (!TextUtils.isEmpty(strM)) {
                str = strM;
            }
            this.f221273b.n(context, str);
            this.f221272a = str;
            B.h().b(context, true);
        }
    }
}
