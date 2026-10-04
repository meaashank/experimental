package N2;

import T2.r;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.i;
import androidx.work.impl.e;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59058b = i.f("SystemAlarmScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59059a;

    public b(@NonNull Context context) {
        this.f59059a = context.getApplicationContext();
    }

    public final void a(@NonNull r workSpec) {
        i.c().a(f59058b, String.format("Scheduling work with workSpecId %s", workSpec.f68219a), new Throwable[0]);
        this.f59059a.startService(androidx.work.impl.background.systemalarm.a.f(this.f59059a, workSpec.f68219a));
    }

    @Override // androidx.work.impl.e
    public boolean b() {
        return true;
    }

    @Override // androidx.work.impl.e
    public void d(@NonNull String workSpecId) {
        this.f59059a.startService(androidx.work.impl.background.systemalarm.a.g(this.f59059a, workSpecId));
    }

    @Override // androidx.work.impl.e
    public void e(@NonNull r... workSpecs) {
        for (r rVar : workSpecs) {
            a(rVar);
        }
    }
}
