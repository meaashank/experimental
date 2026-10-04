package n7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.metadata.android.media.AudioManagerCAG;
import com.prism.gaia.naked.metadata.android.media.IAudioServiceCAG;

/* JADX INFO: renamed from: n7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5257a extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f221246f = l0.b(C5257a.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f221247g = "audio";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f221248e;

    @Override // c7.E, u8.b
    public boolean a(String str) {
        try {
            IInterface iInterfaceU = u();
            if (this.f221248e != null && iInterfaceU != null) {
                if (iInterfaceU.asBinder() != this.f221248e.n().asBinder()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return super.a(str);
    }

    @Override // c7.E
    public boolean f(IInterface iInterface, IBinder iBinder) {
        if (this.f221248e == null) {
            return false;
        }
        try {
            AudioManagerCAG.f165826G.sService().set(this.f221248e.n());
        } catch (Throwable unused) {
        }
        return super.f(iInterface, iBinder);
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IAudioServiceCAG.f165827G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return "audio";
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        b bVar = this.f221248e;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            try {
                b bVar2 = this.f221248e;
                if (bVar2 != null) {
                    return bVar2;
                }
                if (iInterface != null) {
                    this.f221248e = new b(iInterface);
                }
                return this.f221248e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IInterface u() {
        return AudioManagerCAG.f165826G.sService().get();
    }
}
