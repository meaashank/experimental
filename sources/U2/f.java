package U2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68415b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f68416c = "androidx.work.util.id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f68417d = "next_job_scheduler_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f68418e = "next_alarm_manager_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f68419a;

    public f(@NonNull WorkDatabase workDatabase) {
        this.f68419a = workDatabase;
    }

    public static void a(@NonNull Context context, @NonNull v2.d sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f68416c, 0);
        if (sharedPreferences.contains(f68417d) || sharedPreferences.contains(f68417d)) {
            int i10 = sharedPreferences.getInt(f68417d, 0);
            int i11 = sharedPreferences.getInt(f68418e, 0);
            sqLiteDatabase.s0();
            try {
                sqLiteDatabase.E2(androidx.work.impl.h.f120474v, new Object[]{f68417d, Integer.valueOf(i10)});
                sqLiteDatabase.E2(androidx.work.impl.h.f120474v, new Object[]{f68418e, Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.D2();
            } finally {
                sqLiteDatabase.N2();
            }
        }
    }

    public int b() {
        int iC;
        synchronized (f.class) {
            iC = c(f68418e);
        }
        return iC;
    }

    public final int c(String key) {
        this.f68419a.e();
        try {
            Long lC = this.f68419a.X().c(key);
            int i10 = 0;
            int iIntValue = lC != null ? lC.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i10 = iIntValue + 1;
            }
            e(key, i10);
            this.f68419a.Q();
            this.f68419a.k();
            return iIntValue;
        } catch (Throwable th) {
            this.f68419a.k();
            throw th;
        }
    }

    public int d(int minInclusive, int maxInclusive) {
        synchronized (f.class) {
            int iC = c(f68417d);
            if (iC < minInclusive || iC > maxInclusive) {
                e(f68417d, minInclusive + 1);
            } else {
                minInclusive = iC;
            }
        }
        return minInclusive;
    }

    public final void e(String key, int value) {
        this.f68419a.X().b(new T2.d(key, value));
    }
}
