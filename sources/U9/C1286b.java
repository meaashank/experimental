package U9;

import P9.a;
import android.content.Context;
import android.util.Log;
import com.android.launcher3.extension.AllAppControllerExtension;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;

/* JADX INFO: renamed from: U9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1286b implements AllAppControllerExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f74016a = "AllAppControllerExtension";

    public final void a(Context context) {
        new LjAdLoader.Builder().withCache(true).withReportPrefix(a.b.f65587c).build().u(context, new LjAdRequest.Builder(context).setAdPlaceName(a.C0095a.f65580c).build());
        Log.d(f74016a, "pre load impress ad");
    }

    @Override // com.android.launcher3.extension.AllAppControllerExtension
    public void onFinishInflate(Context context) {
        a(context);
    }
}
