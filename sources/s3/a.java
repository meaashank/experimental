package S3;

import android.view.View;
import android.webkit.WebChromeClient;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ void a(b bVar, LightningDialogBuilder.NewTab newTab, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleNewTab");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        bVar.b0(newTab, str, z10);
    }

    public static /* synthetic */ void b(b bVar, View view, WebChromeClient.CustomViewCallback customViewCallback, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onShowCustomView");
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        bVar.h0(view, customViewCallback, i10);
    }
}
