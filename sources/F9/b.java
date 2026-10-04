package F9;

import U6.b;
import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f39861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ComponentName f39862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39864e;

    public b(String str, Intent intent, ComponentName componentName, int i10) {
        this.f39860a = str;
        this.f39861b = intent;
        this.f39862c = componentName;
        this.f39863d = i10;
    }

    public void a(Intent intent) {
        intent.putExtra(b.c.f68623l, this.f39860a);
        intent.putExtra(b.c.f68628q, this.f39861b);
        intent.putExtra(b.c.f68635x, this.f39862c);
        intent.putExtra(b.c.f68618g, this.f39863d);
        intent.putExtra(b.c.f68619h, this.f39864e);
    }

    public b(Intent intent) {
        this.f39860a = intent.getStringExtra(b.c.f68623l);
        this.f39861b = (Intent) intent.getParcelableExtra(b.c.f68628q);
        this.f39862c = (ComponentName) intent.getParcelableExtra(b.c.f68635x);
        this.f39863d = intent.getIntExtra(b.c.f68618g, 0);
        this.f39864e = intent.getBooleanExtra(b.c.f68619h, false);
    }
}
