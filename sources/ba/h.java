package Ba;

import Aa.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.prism.lib.feedback.config.InteractiveConfig;

/* JADX INFO: loaded from: classes6.dex */
public class h extends d {
    public h(InteractiveConfig interactiveConfig) {
        super(interactiveConfig, f.n.f10519N2, f.n.f10647w2, f.l.f10461e);
    }

    @Override // Aa.b
    public void b(Context context) {
        InteractiveConfig interactiveConfigF = f();
        if (interactiveConfigF == null || interactiveConfigF.info == null) {
            return;
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(interactiveConfigF.info)));
    }

    @Override // Ba.d, Aa.b
    public String e(Context context) {
        return null;
    }
}
