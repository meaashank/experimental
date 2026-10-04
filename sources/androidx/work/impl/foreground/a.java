package androidx.work.impl.foreground;

import P2.c;
import T2.r;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.d;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.k;
import e.I;
import e.f0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements c, androidx.work.impl.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f120416k = i.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f120417l = "KEY_NOTIFICATION";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f120418m = "KEY_NOTIFICATION_ID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f120419n = "KEY_FOREGROUND_SERVICE_TYPE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f120420o = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f120421p = "ACTION_START_FOREGROUND";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f120422q = "ACTION_NOTIFY";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f120423r = "ACTION_CANCEL_WORK";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f120424s = "ACTION_STOP_FOREGROUND";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f120425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f120426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V2.a f120427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f120428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f120429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, d> f120430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, r> f120431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<r> f120432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P2.d f120433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public b f120434j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0345a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f120435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f120436b;

        public RunnableC0345a(final WorkDatabase val$database, final String val$workSpecId) {
            this.f120435a = val$database;
            this.f120436b = val$workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVarX = this.f120435a.c0().x(this.f120436b);
            if (rVarX == null || !rVarX.b()) {
                return;
            }
            synchronized (a.this.f120428d) {
                a.this.f120431g.put(this.f120436b, rVarX);
                a.this.f120432h.add(rVarX);
                a aVar = a.this;
                aVar.f120433i.d(aVar.f120432h);
            }
        }
    }

    public interface b {
        void a(int notificationId);

        void b(int notificationId, @NonNull Notification notification);

        void d(int notificationId, int notificationType, @NonNull Notification notification);

        void stop();
    }

    public a(@NonNull Context context) {
        this.f120425a = context;
        this.f120428d = new Object();
        k kVarH = k.H(context);
        this.f120426b = kVarH;
        V2.a aVarO = kVarH.O();
        this.f120427c = aVarO;
        this.f120429e = null;
        this.f120430f = new LinkedHashMap();
        this.f120432h = new HashSet();
        this.f120431g = new HashMap();
        this.f120433i = new P2.d(this.f120425a, aVarO, this);
        this.f120426b.J().d(this);
    }

    @NonNull
    public static Intent b(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f120423r);
        intent.setData(Uri.parse(String.format("workspec://%s", workSpecId)));
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @NonNull
    public static Intent d(@NonNull Context context, @NonNull String workSpecId, @NonNull d info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f120422q);
        intent.putExtra(f120418m, info.f120261a);
        intent.putExtra(f120419n, info.f120262b);
        intent.putExtra(f120417l, info.f120263c);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @NonNull
    public static Intent e(@NonNull Context context, @NonNull String workSpecId, @NonNull d info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f120421p);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra(f120418m, info.f120261a);
        intent.putExtra(f120419n, info.f120262b);
        intent.putExtra(f120417l, info.f120263c);
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @NonNull
    public static Intent g(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(f120424s);
        return intent;
    }

    @Override // P2.c
    public void a(@NonNull List<String> workSpecIds) {
        if (workSpecIds.isEmpty()) {
            return;
        }
        for (String str : workSpecIds) {
            i.c().a(f120416k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f120426b.W(str);
        }
    }

    @Override // androidx.work.impl.b
    @I
    public void c(@NonNull String workSpecId, boolean needsReschedule) {
        Map.Entry<String, d> entry;
        synchronized (this.f120428d) {
            try {
                r rVarRemove = this.f120431g.remove(workSpecId);
                if (rVarRemove != null ? this.f120432h.remove(rVarRemove) : false) {
                    this.f120433i.d(this.f120432h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVarRemove = this.f120430f.remove(workSpecId);
        if (workSpecId.equals(this.f120429e) && this.f120430f.size() > 0) {
            Iterator<Map.Entry<String, d>> it = this.f120430f.entrySet().iterator();
            Map.Entry<String, d> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f120429e = entry.getKey();
            if (this.f120434j != null) {
                d value = entry.getValue();
                this.f120434j.d(value.f120261a, value.f120262b, value.f120263c);
                this.f120434j.a(value.f120261a);
            }
        }
        b bVar = this.f120434j;
        if (dVarRemove == null || bVar == null) {
            return;
        }
        i.c().a(f120416k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(dVarRemove.f120261a), workSpecId, Integer.valueOf(dVarRemove.f120262b)), new Throwable[0]);
        bVar.a(dVarRemove.f120261a);
    }

    @Override // P2.c
    public void f(@NonNull List<String> workSpecIds) {
    }

    public k h() {
        return this.f120426b;
    }

    @I
    public final void i(@NonNull Intent intent) {
        i.c().d(f120416k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f120426b.h(UUID.fromString(stringExtra));
    }

    @I
    public final void j(@NonNull Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra(f120418m, 0);
        int intExtra2 = intent.getIntExtra(f120419n, 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra(f120417l);
        i.c().a(f120416k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f120434j == null) {
            return;
        }
        this.f120430f.put(stringExtra, new d(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f120429e)) {
            this.f120429e = stringExtra;
            this.f120434j.d(intExtra, intExtra2, notification);
            return;
        }
        this.f120434j.b(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, d>> it = this.f120430f.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().f120262b;
        }
        d dVar = this.f120430f.get(this.f120429e);
        if (dVar != null) {
            this.f120434j.d(dVar.f120261a, i10, dVar.f120263c);
        }
    }

    @I
    public final void k(@NonNull Intent intent) {
        i.c().d(f120416k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f120427c.d(new RunnableC0345a(this.f120426b.M(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @I
    public void l(@NonNull Intent intent) {
        i.c().d(f120416k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f120434j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @I
    public void m() {
        this.f120434j = null;
        synchronized (this.f120428d) {
            this.f120433i.e();
        }
        this.f120426b.J().j(this);
    }

    public void n(@NonNull Intent intent) {
        String action = intent.getAction();
        if (f120421p.equals(action)) {
            k(intent);
            j(intent);
        } else if (f120422q.equals(action)) {
            j(intent);
        } else if (f120423r.equals(action)) {
            i(intent);
        } else if (f120424s.equals(action)) {
            l(intent);
        }
    }

    @I
    public void o(@NonNull b callback) {
        if (this.f120434j != null) {
            i.c().b(f120416k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f120434j = callback;
        }
    }

    @f0
    public a(@NonNull Context context, @NonNull k workManagerImpl, @NonNull P2.d tracker) {
        this.f120425a = context;
        this.f120428d = new Object();
        this.f120426b = workManagerImpl;
        this.f120427c = workManagerImpl.O();
        this.f120429e = null;
        this.f120430f = new LinkedHashMap();
        this.f120432h = new HashSet();
        this.f120431g = new HashMap();
        this.f120433i = tracker;
        this.f120426b.J().d(this);
    }
}
