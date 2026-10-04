package androidx.work.impl.background.systemalarm;

import T2.r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import e.g0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements androidx.work.impl.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f120325d = i.f("CommandHandler");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f120326e = "ACTION_SCHEDULE_WORK";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f120327f = "ACTION_DELAY_MET";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f120328g = "ACTION_STOP_WORK";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f120329h = "ACTION_CONSTRAINTS_CHANGED";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f120330i = "ACTION_RESCHEDULE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f120331j = "ACTION_EXECUTION_COMPLETED";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f120332k = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f120333l = "KEY_NEEDS_RESCHEDULE";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f120334m = 600000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f120335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, androidx.work.impl.b> f120336b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f120337c = new Object();

    public a(@NonNull Context context) {
        this.f120335a = context;
    }

    public static Intent a(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120329h);
        return intent;
    }

    public static Intent b(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120327f);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent d(@NonNull Context context, @NonNull String workSpecId, boolean needsReschedule) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120331j);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra(f120333l, needsReschedule);
        return intent;
    }

    public static Intent e(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120330i);
        return intent;
    }

    public static Intent f(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120326e);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static Intent g(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f120328g);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    public static boolean n(@Nullable Bundle bundle, @NonNull String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.work.impl.b
    public void c(@NonNull String workSpecId, boolean needsReschedule) {
        synchronized (this.f120337c) {
            try {
                androidx.work.impl.b bVarRemove = this.f120336b.remove(workSpecId);
                if (bVarRemove != null) {
                    bVarRemove.c(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(@NonNull Intent intent, int startId, @NonNull d dispatcher) {
        i.c().a(f120325d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.f120335a, startId, dispatcher).a();
    }

    public final void i(@NonNull Intent intent, int startId, @NonNull d dispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.f120337c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                i iVarC = i.c();
                String str = f120325d;
                iVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f120336b.containsKey(string)) {
                    i.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    c cVar = new c(this.f120335a, startId, string, dispatcher);
                    this.f120336b.put(string, cVar);
                    cVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(@NonNull Intent intent, int startId) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean(f120333l);
        i.c().a(f120325d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        c(string, z10);
    }

    public final void k(@NonNull Intent intent, int startId, @NonNull d dispatcher) {
        i.c().a(f120325d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        dispatcher.g().R();
    }

    public final void l(@NonNull Intent intent, int startId, @NonNull d dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i iVarC = i.c();
        String str = f120325d;
        iVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseM = dispatcher.g().M();
        workDatabaseM.e();
        try {
            r rVarX = workDatabaseM.c0().x(string);
            if (rVarX == null) {
                i.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (rVarX.f68220b.isFinished()) {
                i.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = rVarX.a();
            if (rVarX.b()) {
                i.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                N2.a.c(this.f120335a, dispatcher.g(), string, jA);
                dispatcher.k(new d.b(dispatcher, a(this.f120335a), startId));
            } else {
                i.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                N2.a.c(this.f120335a, dispatcher.g(), string, jA);
            }
            workDatabaseM.Q();
        } finally {
            workDatabaseM.k();
        }
    }

    public final void m(@NonNull Intent intent, @NonNull d dispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.c().a(f120325d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dispatcher.g().X(string);
        N2.a.a(this.f120335a, dispatcher.g(), string);
        dispatcher.c(string, false);
    }

    public boolean o() {
        boolean z10;
        synchronized (this.f120337c) {
            z10 = !this.f120336b.isEmpty();
        }
        return z10;
    }

    @g0
    public void p(@NonNull Intent intent, int startId, @NonNull d dispatcher) {
        String action = intent.getAction();
        if (f120329h.equals(action)) {
            h(intent, startId, dispatcher);
            return;
        }
        if (f120330i.equals(action)) {
            k(intent, startId, dispatcher);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.c().b(f120325d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if (f120326e.equals(action)) {
            l(intent, startId, dispatcher);
            return;
        }
        if (f120327f.equals(action)) {
            i(intent, startId, dispatcher);
            return;
        }
        if (f120328g.equals(action)) {
            m(intent, dispatcher);
        } else if (f120331j.equals(action)) {
            j(intent, startId);
        } else {
            i.c().h(f120325d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
