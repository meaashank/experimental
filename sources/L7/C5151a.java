package l7;

import android.annotation.TargetApi;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import com.prism.gaia.naked.metadata.com.android.internal.appwidget.IAppWidgetServiceCAG;

/* JADX INFO: renamed from: l7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class C5151a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f220955e = "appwidget";

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IAppWidgetServiceCAG.f165981G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f220955e;
    }

    @Override // c7.E
    @Nullable
    public C2953e<IInterface> q(@Nullable IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        return new C5152b(iInterface);
    }
}
