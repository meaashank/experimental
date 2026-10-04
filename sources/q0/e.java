package Q0;

import Q0.f;
import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e {
    public static f.a a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new f.b(context, uri) : new f.c(context, uri);
    }
}
