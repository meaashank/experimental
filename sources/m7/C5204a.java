package m7;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.compat.android.util.SingletonCompat2;
import com.prism.gaia.naked.metadata.android.app.ActivityTaskManagerCAG;
import com.prism.gaia.naked.metadata.android.app.IActivityTaskManagerCAG;

/* JADX INFO: renamed from: m7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(29)
public class C5204a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f221108e = "activity_task";

    @Override // c7.E, u8.b
    public boolean a(String str) {
        try {
            if (h() != null) {
                return ActivityTaskManagerCAG.f165274G.getService().call(new Object[0]) != h();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // c7.E
    public boolean f(IInterface iInterface, IBinder iBinder) {
        if (iInterface == null) {
            return false;
        }
        SingletonCompat2.Util.set(ActivityTaskManagerCAG.f165274G.IActivityTaskManagerSingleton().get(), iInterface);
        return super.f(iInterface, iBinder);
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IActivityTaskManagerCAG.f165323G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f221108e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5205b(iInterface);
    }
}
