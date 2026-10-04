package c7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.naked.compat.android.os.ServiceManagerCompat2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class E implements u8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f131240d = "asdf-".concat(E.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2953e<IInterface> f131241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IInterface f131242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f131243c;

    @Override // u8.b
    public boolean a(String str) {
        try {
            IBinder iBinderG = g();
            if (iBinderG != null) {
                if (this.f131243c != iBinderG) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // u8.b
    public void b() throws Throwable {
        IBinder iBinderG = g();
        C2953e<IInterface> c2953eQ = q(i(iBinderG));
        this.f131241a = c2953eQ;
        if (c2953eQ != null) {
            d(c2953eQ);
        }
        C2953e<IInterface> c2953e = this.f131241a;
        this.f131242b = c2953e != null ? c2953e.n() : null;
        IBinder iBinderO = o(iBinderG, this.f131241a);
        this.f131243c = iBinderO;
        C2953e<IInterface> c2953e2 = this.f131241a;
        if (c2953e2 != null && iBinderO != null) {
            c2953e2.f(new C2958j(this.f131243c));
        }
        f(this.f131242b, this.f131243c);
    }

    @Override // u8.b
    public Object c() {
        return getClass();
    }

    public final void e(C2953e<IInterface> c2953e) {
        d(c2953e);
    }

    public boolean f(IInterface iInterface, IBinder iBinder) {
        if (iBinder == null) {
            return false;
        }
        ServiceManagerCompat2.Util.putService(l(), this.f131243c);
        return true;
    }

    @Nullable
    public IBinder g() {
        return ServiceManagerCompat2.Util.getService(l());
    }

    public IBinder h() {
        return this.f131243c;
    }

    @Nullable
    public abstract IInterface i(@Nullable IBinder iBinder);

    public final IInterface j(IBinder iBinder) {
        return i(iBinder);
    }

    public IInterface k() {
        return this.f131242b;
    }

    public abstract String l();

    public final String m() {
        return l();
    }

    public C2953e<IInterface> n() {
        return this.f131241a;
    }

    @Nullable
    public final IBinder o(@Nullable IBinder iBinder, @Nullable C2953e<IInterface> c2953e) {
        if (iBinder == null || c2953e == null) {
            return null;
        }
        return new E8.d(iBinder, c2953e.n());
    }

    public final IBinder p(IBinder iBinder, C2953e<IInterface> c2953e) {
        return o(iBinder, c2953e);
    }

    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C2953e<>(null, iInterface, null);
    }

    public final C2953e<IInterface> r(IInterface iInterface) {
        return q(iInterface);
    }

    public void s(IBinder iBinder) {
        this.f131243c = iBinder;
    }

    public void t(C2953e<IInterface> c2953e) {
        this.f131241a = c2953e;
    }

    public void d(@NonNull C2953e<IInterface> c2953e) {
    }
}
