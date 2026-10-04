package oa;

import android.app.Activity;
import android.content.Intent;
import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.prism.hider.vault.commons.E;
import com.prism.hider.vault.commons.N;
import com.prism.hider.vault.commons.ui.SetPinActivity;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2857g
public class k implements E {
    @Singleton
    @InterfaceC2858h
    public static E b() {
        return new k();
    }

    @Override // com.prism.hider.vault.commons.E
    public boolean a(Activity activity, boolean z10) {
        Intent intentB = N.b(activity, SetPinActivity.class);
        intentB.putExtra(SetPinActivity.f173629g, z10);
        activity.startActivity(intentB);
        return true;
    }
}
