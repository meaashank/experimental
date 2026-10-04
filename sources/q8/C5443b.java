package q8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.view.IWindowManagerCAG;
import com.prism.gaia.naked.metadata.android.view.WindowManagerGlobalCAG;
import com.prism.gaia.naked.metadata.com.android.internal.policy.PhoneWindowCAG;

/* JADX INFO: renamed from: q8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5443b extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f226850e = "window";

    @Override // c7.E
    public boolean f(IInterface iInterface, IBinder iBinder) {
        if (iInterface == null) {
            return false;
        }
        if (WindowManagerGlobalCAG.f165968G.sWindowManagerService() != null) {
            WindowManagerGlobalCAG.f165968G.sWindowManagerService().set(iInterface);
        }
        if (PhoneWindowCAG.f165987C.ORG_CLASS() != null) {
            PhoneWindowCAG.f165987C.sWindowManager().set(iInterface);
        } else if (PhoneWindowCAG.f165988C2.ORG_CLASS() != null) {
            PhoneWindowCAG.f165988C2.sWindowManager().set(iInterface);
        }
        return super.f(iInterface, iBinder);
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IWindowManagerCAG.f165964G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f226850e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new c(iInterface);
    }
}
