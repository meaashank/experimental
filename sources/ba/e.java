package Ba;

import Aa.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.prism.lib.feedback.config.InteractiveConfig;

/* JADX INFO: loaded from: classes6.dex */
public class e extends d {
    public e(InteractiveConfig interactiveConfig) {
        super(interactiveConfig, f.n.f10511L2, f.n.f10639u2, f.l.f10457a);
    }

    @Override // Aa.b
    public void b(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(f().info));
        context.startActivity(intent);
    }

    @Override // Ba.d, Aa.b
    public String e(Context context) {
        return null;
    }
}
