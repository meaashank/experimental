package F9;

import U6.b;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39865f = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f39867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39870e;

    public c(String str, Intent intent, boolean z10, int i10) {
        this.f39866a = str;
        this.f39867b = intent;
        this.f39868c = z10;
        this.f39869d = i10;
    }

    public void a(Intent intent) {
        intent.putExtra(b.c.f68624m, this.f39866a);
        intent.putExtra(b.c.f68628q, this.f39867b);
        intent.putExtra(b.c.f68602D, this.f39868c);
        intent.putExtra(b.c.f68618g, this.f39869d);
        intent.putExtra(b.c.f68605G, this.f39870e);
    }

    public c(Intent intent) {
        this.f39866a = intent.getStringExtra(b.c.f68624m);
        this.f39867b = (Intent) intent.getParcelableExtra(b.c.f68628q);
        this.f39868c = intent.getBooleanExtra(b.c.f68602D, false);
        this.f39869d = intent.getIntExtra(b.c.f68618g, 0);
        this.f39870e = intent.getIntExtra(b.c.f68605G, 0);
    }
}
