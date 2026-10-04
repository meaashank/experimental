package b5;

import android.util.Log;
import com.gaia.ngallery.ui.CloudSettingActivity;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: renamed from: b5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2829x implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(CloudSettingActivity.f150343j, "save sync account failed:", exc);
    }
}
