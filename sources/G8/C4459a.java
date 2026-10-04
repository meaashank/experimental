package g8;

import E8.d;
import android.os.IBinder;
import android.os.IInterface;
import c7.C2953e;

/* JADX INFO: renamed from: g8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4459a extends C2953e<IInterface> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f202292h;

    public C4459a(IBinder iBinder, IInterface iInterface) {
        super(null, iInterface, null);
        this.f202292h = new d(iBinder, n());
    }

    public IBinder q() {
        return this.f202292h;
    }
}
