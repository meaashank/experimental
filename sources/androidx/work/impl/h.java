package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import q2.AbstractC5421c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f120453a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120454b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f120455c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f120456d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f120457e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f120458f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f120459g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f120460h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f120461i = 9;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f120462j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f120463k = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f120464l = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f120465m = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f120466n = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f120467o = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f120468p = "DROP TABLE IF EXISTS alarmInfo";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f120469q = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f120470r = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f120471s = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f120472t = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f120473u = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f120474v = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f120475w = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f120476x = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120477y = new a(1, 2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120478z = new b(3, 4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120448A = new c(4, 5);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120449B = new d(6, 7);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120450C = new e(7, 8);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120451D = new f(8, 9);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NonNull
    public static AbstractC5421c f120452E = new g(11, 12);

    public class a extends AbstractC5421c {
        public a(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120465m);
            database.o2(h.f120466n);
            database.o2(h.f120468p);
            database.o2("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends AbstractC5421c {
        public b(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120467o);
        }
    }

    public class c extends AbstractC5421c {
        public c(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120469q);
            database.o2(h.f120470r);
        }
    }

    public class d extends AbstractC5421c {
        public d(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120471s);
        }
    }

    public class e extends AbstractC5421c {
        public e(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120472t);
        }
    }

    public class f extends AbstractC5421c {
        public f(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120473u);
        }
    }

    public class g extends AbstractC5421c {
        public g(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120476x);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.h$h, reason: collision with other inner class name */
    public static class C0346h extends AbstractC5421c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f120479c;

        public C0346h(@NonNull Context context, int startVersion, int endVersion) {
            super(startVersion, endVersion);
            this.f120479c = context;
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            if (this.f226741b >= 10) {
                database.E2(h.f120474v, new Object[]{U2.i.f68430d, 1});
            } else {
                this.f120479c.getSharedPreferences(U2.i.f68428b, 0).edit().putBoolean(U2.i.f68430d, true).apply();
            }
        }
    }

    public static class i extends AbstractC5421c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f120480c;

        public i(@NonNull Context context) {
            super(9, 10);
            this.f120480c = context;
        }

        @Override // q2.AbstractC5421c
        public void a(@NonNull v2.d database) {
            database.o2(h.f120475w);
            U2.i.d(this.f120480c, database);
            U2.f.a(this.f120480c, database);
        }
    }
}
