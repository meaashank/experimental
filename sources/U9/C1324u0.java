package U9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.android.launcher3.AppFilter;
import com.prism.gaia.helper.utils.PkgUtils;

/* JADX INFO: renamed from: U9.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1324u0 extends AppFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f74160b = com.prism.commons.utils.l0.b(C1324u0.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f74161a;

    public C1324u0(Context context) {
        this.f74161a = context;
    }

    @Override // com.android.launcher3.AppFilter
    public boolean shouldShowApp(ComponentName componentName, ApplicationInfo applicationInfo) {
        return PkgUtils.t(applicationInfo);
    }

    @Override // com.android.launcher3.AppFilter
    public boolean shouldShowWidget(ComponentName componentName) {
        return true;
    }
}
