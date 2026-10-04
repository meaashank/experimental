package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.C2403b;
import e.InterfaceC4330d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: androidx.core.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2393p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111085b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111086c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111087d = 3;

    /* JADX INFO: renamed from: androidx.core.app.p$a */
    @e.T(34)
    public static class a {
        public static int a(Context context) {
            return b(context).getApplicationGrammaticalGender();
        }

        public static GrammaticalInflectionManager b(Context context) {
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        public static void c(Context context, int i10) {
            b(context).setRequestedApplicationGrammaticalGender(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.p$b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @InterfaceC4330d
    @e.N(markerClass = {C2403b.InterfaceC0282b.class})
    public static int a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(context);
        }
        return 0;
    }

    @InterfaceC4330d
    @e.N(markerClass = {C2403b.InterfaceC0282b.class})
    public static void b(@NonNull Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.c(context, i10);
        }
    }
}
