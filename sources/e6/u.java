package e6;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.ActivityC1486c;
import e6.C4366b;
import s6.C5577b;
import s6.i;

/* JADX INFO: loaded from: classes5.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6.i f200278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4366b f200279b;

    public u(ActivityC1486c activityC1486c) {
        this.f200278a = new s6.i(activityC1486c);
        this.f200279b = new C4366b(activityC1486c);
    }

    public C4366b a() {
        return this.f200279b;
    }

    public s6.i b() {
        return this.f200278a;
    }

    public void c(Activity activity, C5577b[] c5577bArr, i.b bVar) {
        d(activity, c5577bArr, bVar, true, true);
    }

    public void d(Activity activity, C5577b[] c5577bArr, i.b bVar, boolean z10, boolean z11) {
        this.f200278a.m(z10);
        this.f200278a.n(z11);
        this.f200278a.k(activity, c5577bArr, bVar);
    }

    public void e(Activity activity, Intent intent, C4366b.a aVar) {
        this.f200279b.b(activity, intent, aVar);
    }
}
