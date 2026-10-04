package v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.server.g0;
import p6.C5395b;
import p6.c;

/* JADX INFO: renamed from: v8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5716z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239915b = "asdf-".concat(C5716z.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5716z f239916c = new C5716z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5395b<g0> f239917a = GProcessClient.f164187n.d6("vpn_router", g0.class, new a());

    /* JADX INFO: renamed from: v8.z$a */
    public class a implements c.a<g0> {
        public a() {
        }

        @Override // p6.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(IBinder iBinder) {
            return g0.b.U0(iBinder);
        }
    }

    public static C5716z a() {
        return f239916c;
    }

    public Bundle b() {
        try {
            return c().s0();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final g0 c() {
        return (g0) this.f239917a.b();
    }

    public boolean d() {
        try {
            return c().N3();
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean e(int i10, String str, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle) {
        try {
            return c().k0(i10, str, parcelFileDescriptor, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public void f(int i10, String str) {
        try {
            c().P5(i10, str);
        } catch (RemoteException unused) {
        }
    }

    public ParcelFileDescriptor g(int i10, int i11) {
        try {
            return c().O0(i10, i11);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public ParcelFileDescriptor h(int i10, int i11) {
        try {
            return c().H0(i10, i11);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
