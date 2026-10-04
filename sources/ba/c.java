package Ba;

import Aa.f;
import android.content.Context;
import com.prism.lib.feedback.config.InteractiveConfig;

/* JADX INFO: loaded from: classes6.dex */
public class c extends d {
    public c(InteractiveConfig interactiveConfig) {
        super(interactiveConfig, f.n.f10511L2, f.n.f10639u2, f.l.f10459c);
    }

    @Override // Aa.b
    public void b(Context context) {
        String str;
        InteractiveConfig interactiveConfigF = f();
        if (interactiveConfigF == null || (str = interactiveConfigF.info) == null) {
            return;
        }
        Ca.a.a(context, str);
    }

    @Override // Ba.d, Aa.b
    public String e(Context context) {
        return null;
    }
}
