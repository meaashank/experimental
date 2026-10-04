package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.node.C2205i;
import androidx.compose.ui.node.InterfaceC2203g;
import androidx.core.view.C2506z;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final boolean a(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            Uri uri = clipData.getItemAt(i10).getUri();
            if (uri != null && G.g(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@NotNull InterfaceC2203g interfaceC2203g, @NotNull androidx.compose.ui.draganddrop.b bVar) {
        Activity activityC;
        if (Build.VERSION.SDK_INT >= 24 && a(bVar.f100461a.getClipData()) && interfaceC2203g.g0().f103127m && (activityC = c(C2205i.a(interfaceC2203g))) != null) {
            C2506z.b(activityC, bVar.f100461a);
        }
    }

    public static final Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
