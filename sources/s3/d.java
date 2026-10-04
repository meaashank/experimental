package s3;

import android.content.Context;
import androidx.annotation.NonNull;
import s3.InterfaceC5571b;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements InterfaceC5571b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f238484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5571b.a f238485b;

    public d(@NonNull Context context, @NonNull InterfaceC5571b.a aVar) {
        this.f238484a = context.getApplicationContext();
        this.f238485b = aVar;
    }

    public final void a() {
        s.a(this.f238484a).d(this.f238485b);
    }

    public final void b() {
        s.a(this.f238484a).f(this.f238485b);
    }

    @Override // s3.l
    public void onStart() {
        a();
    }

    @Override // s3.l
    public void onStop() {
        b();
    }

    @Override // s3.l
    public void onDestroy() {
    }
}
