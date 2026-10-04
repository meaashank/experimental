package B7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.I;
import com.prism.gaia.naked.metadata.com.android.internal.os.IDropBoxManagerServiceCAG;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17391e = "dropbox";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new I("getNextEntry", null));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return IDropBoxManagerServiceCAG.f165985G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f17391e;
    }
}
