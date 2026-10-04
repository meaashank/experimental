package Ba;

import Aa.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.prism.commons.utils.Q;
import com.prism.lib.feedback.config.InteractiveConfig;

/* JADX INFO: loaded from: classes6.dex */
public class b extends d {
    public b(InteractiveConfig interactiveConfig) {
        super(interactiveConfig, f.n.f10503J2, f.n.f10631s2, f.l.f10458b);
    }

    @Override // Aa.b
    public void b(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        String strReplace = f().info;
        if (!Q.a(context, "com.facebook.katana")) {
            strReplace = strReplace.replace("fb://group", "https://www.facebook.com/groups");
        }
        intent.setData(Uri.parse(strReplace));
        context.startActivity(intent);
    }

    @Override // Ba.d, Aa.b
    public String e(Context context) {
        return null;
    }
}
