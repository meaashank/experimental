package U2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.K;
import androidx.lifecycle.Transformations;
import androidx.work.impl.WorkDatabase;
import p.InterfaceC5376a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f68428b = "androidx.work.util.preferences";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f68429c = "last_cancel_all_time_ms";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f68430d = "reschedule_needed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f68431a;

    public class a implements InterfaceC5376a<Long, Long> {
        public a() {
        }

        @Override // p.InterfaceC5376a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(Long value) {
            return Long.valueOf(value != null ? value.longValue() : 0L);
        }
    }

    public i(@NonNull WorkDatabase workDatabase) {
        this.f68431a = workDatabase;
    }

    public static void d(@NonNull Context context, @NonNull v2.d sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f68428b, 0);
        if (sharedPreferences.contains(f68430d) || sharedPreferences.contains(f68429c)) {
            long j10 = sharedPreferences.getLong(f68429c, 0L);
            long j11 = sharedPreferences.getBoolean(f68430d, false) ? 1L : 0L;
            sqLiteDatabase.s0();
            try {
                sqLiteDatabase.E2(androidx.work.impl.h.f120474v, new Object[]{f68429c, Long.valueOf(j10)});
                sqLiteDatabase.E2(androidx.work.impl.h.f120474v, new Object[]{f68430d, Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.D2();
            } finally {
                sqLiteDatabase.N2();
            }
        }
    }

    public long a() {
        Long lC = this.f68431a.X().c(f68429c);
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    @NonNull
    public K<Long> b() {
        return Transformations.c(this.f68431a.X().a(f68429c), new a());
    }

    public boolean c() {
        Long lC = this.f68431a.X().c(f68430d);
        return lC != null && lC.longValue() == 1;
    }

    public void e(final long timeMillis) {
        this.f68431a.X().b(new T2.d(f68429c, timeMillis));
    }

    public void f(boolean needsReschedule) {
        this.f68431a.X().b(new T2.d(f68430d, needsReschedule));
    }
}
