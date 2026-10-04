package k8;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.android.app.IUsageStatsManagerCAG;

/* JADX INFO: renamed from: k8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(22)
public class C4832a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f217343e = "usagestats";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IUsageStatsManagerCAG.f165330G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f217343e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new b(iInterface);
    }
}
