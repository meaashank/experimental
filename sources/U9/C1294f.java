package U9;

import android.content.pm.LauncherActivityInfo;
import android.util.Log;
import com.android.launcher3.AppInfo;
import com.android.launcher3.extension.AllAppsListExtension;
import com.prism.gaia.naked.core.InitOnce;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: U9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1294f implements AllAppsListExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f74051b = com.prism.commons.utils.l0.b(C1294f.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InitOnce<C1294f> f74052c = new InitOnce<>(new C1290d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Boolean> f74053a = new ConcurrentHashMap();

    public static /* synthetic */ ArrayList a(ArrayList arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList b(ArrayList arrayList) {
        return arrayList;
    }

    public static /* synthetic */ C1294f c() {
        return new C1294f();
    }

    public static C1294f e() {
        return f74052c.get();
    }

    public boolean d(String str) {
        boolean z10 = this.f74053a.get(str) != null;
        Log.d(f74051b, "contains pkg:" + str + C4.q.f17581a + z10);
        return z10;
    }

    @Override // com.android.launcher3.extension.AllAppsListExtension
    public void onAdd(AppInfo appInfo, LauncherActivityInfo launcherActivityInfo) {
        Log.d(f74051b, "onAdd: " + appInfo.getPackageNameInComponent());
        this.f74053a.put(appInfo.packageName, Boolean.TRUE);
        d1.D(D.g().d(), appInfo.packageName, new C1288c());
    }

    @Override // com.android.launcher3.extension.AllAppsListExtension
    public void onClear() {
        Log.d(f74051b, "onClear");
        this.f74053a.clear();
    }

    @Override // com.android.launcher3.extension.AllAppsListExtension
    public void onRemovePackage(String str) {
        android.support.v4.media.b.a("onRemovePackage: ", str, f74051b);
        this.f74053a.remove(str);
        d1.D(D.g().d(), str, new C1292e());
    }
}
