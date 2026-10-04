package Z7;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.content.IRestrictionsManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84394e = "restrictions";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new C("getApplicationRestrictions"));
        c2953e.f(new C("notifyPermissionResponse"));
        c2953e.f(new C("requestPermission"));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IRestrictionsManagerCAG.f165599G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f84394e;
    }
}
