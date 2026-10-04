package Ba;

import Aa.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.prism.lib.feedback.config.InteractiveConfig;

/* JADX INFO: loaded from: classes6.dex */
public class g extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17460e = "TiktokFeedbackEntry";

    public g(InteractiveConfig interactiveConfig) {
        super(interactiveConfig, f.n.f10515M2, f.n.f10643v2, f.l.f10462f);
    }

    @Override // Aa.b
    public void b(Context context) {
        String str;
        InteractiveConfig interactiveConfigF = f();
        if (interactiveConfigF == null || (str = interactiveConfigF.info) == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(4194304);
            context.startActivity(intent);
        } catch (Exception e10) {
            Log.e(f17460e, "tiktok feedback error", e10);
        }
    }

    @Override // Ba.d, Aa.b
    public String e(Context context) {
        return null;
    }
}
