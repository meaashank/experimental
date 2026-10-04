package x7;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.I;
import com.prism.gaia.naked.metadata.android.content.pm.ICrossProfileAppsCAG;
import java.util.ArrayList;

/* JADX INFO: renamed from: x7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5796a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f240529e = "crossprofileapps";

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new I("getTargetUserProfiles", new ArrayList()));
        c2953e.f(new I("startActivityAsUser", null));
        c2953e.f(new I("startActivityAsUserByIntent", null));
        Boolean bool = Boolean.FALSE;
        c2953e.f(new I("canInteractAcrossProfiles", bool));
        c2953e.f(new I("canRequestInteractAcrossProfiles", bool));
        c2953e.f(new I("canConfigureInteractAcrossProfiles", bool));
        c2953e.f(new I("canUserAttemptToConfigureInteractAcrossProfiles", bool));
        c2953e.f(new I("setInteractAcrossProfilesAppOp", null));
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ICrossProfileAppsCAG.f165637G.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f240529e;
    }
}
