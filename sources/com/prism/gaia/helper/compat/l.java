package com.prism.gaia.helper.compat;

import U6.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import c6.C2947b;
import com.prism.commons.ui.CheckBox;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.I;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.PermissionActivity;
import com.prism.gaia.client.stub.PermissionListActivity;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.PermissionGroup;
import e.T;
import e6.C4366b;
import e6.C4367c;
import e6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import v8.C5703m;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165022a = "asdf-".concat(l.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f165023b = "rlt_permissions_denied";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f165024a;

        public a(@Nullable Intent intent) {
            this.f165024a = intent;
        }
    }

    public interface b {
        void a(int i10, String[] strArr);
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet<String> f165026b = new HashSet<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f165027c = v.f200280a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Activity f165028d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f165029e = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedList<a> f165025a = new LinkedList<>();

        public c a(@Nullable a aVar) {
            if (aVar != null) {
                this.f165025a.add(aVar);
            }
            return this;
        }

        public c b(Collection<a> collection) {
            this.f165025a.addAll(collection);
            return this;
        }

        public void c(Activity activity) {
            if (activity == null) {
                return;
            }
            this.f165028d = activity;
            this.f165027c = v.f200280a;
            this.f165029e = null;
            if (this.f165025a.isEmpty()) {
                return;
            }
            a aVarRemoveLast = this.f165025a.removeLast();
            Intent intent = aVarRemoveLast.f165024a;
            if (intent == null) {
                c(this.f165028d);
            } else {
                intent.addFlags(268435456);
                this.f165028d.startActivity(aVarRemoveLast.f165024a);
            }
        }

        public void d(Activity activity, int i10, b bVar) {
            if (activity == null) {
                return;
            }
            this.f165028d = activity;
            this.f165027c = i10;
            this.f165029e = bVar;
            if (this.f165025a.isEmpty()) {
                String unused = l.f165022a;
                if (bVar != null) {
                    bVar.a(i10, (String[]) this.f165026b.toArray(new String[0]));
                    return;
                }
                return;
            }
            a aVarRemoveLast = this.f165025a.removeLast();
            if (aVarRemoveLast.f165024a == null) {
                d(this.f165028d, i10, bVar);
            } else {
                String unused2 = l.f165022a;
                this.f165028d.startActivityForResult(aVarRemoveLast.f165024a, i10);
            }
        }

        public void e(Activity activity, b bVar) {
            d(activity, v.f200280a, bVar);
        }

        public void f(int i10, int i11, @Nullable Intent intent) {
            String[] stringArrayExtra;
            if (i10 != this.f165027c || this.f165028d == null) {
                return;
            }
            if (intent != null && (stringArrayExtra = intent.getStringArrayExtra(l.f165023b)) != null) {
                this.f165026b.addAll(Arrays.asList(stringArrayExtra));
            }
            b bVar = this.f165029e;
            if (bVar != null) {
                d(this.f165028d, i10, bVar);
            } else {
                c(this.f165028d);
            }
        }
    }

    public static /* synthetic */ void a(PowerManager powerManager, String str, ActivityC1486c activityC1486c, int i10, Intent intent) {
        if (powerManager.isIgnoringBatteryOptimizations(str)) {
            Toast.makeText(activityC1486c, C2947b.m.f129508B2, 0).show();
        } else {
            Toast.makeText(activityC1486c, C2947b.m.f129512C2, 0).show();
        }
    }

    public static void b(final PowerManager powerManager, final String str, final ActivityC1486c activityC1486c, final CheckBox checkBox, boolean z10, CompoundButton compoundButton, boolean z11) {
        if (powerManager.isIgnoringBatteryOptimizations(str)) {
            Toast.makeText(activityC1486c, C2947b.m.f129508B2, 0).show();
            checkBox.b(true);
        } else {
            Intent intentK = k(str, z10);
            C4367c.o().E(true);
            C4367c.f200255q.x(activityC1486c, intentK, new C4366b.a() { // from class: com.prism.gaia.helper.compat.k
                @Override // e6.C4366b.a
                public final void a(int i10, Intent intent) {
                    l.c(powerManager, str, activityC1486c, checkBox, i10, intent);
                }
            });
        }
    }

    public static /* synthetic */ void c(PowerManager powerManager, String str, ActivityC1486c activityC1486c, CheckBox checkBox, int i10, Intent intent) {
        if (powerManager.isIgnoringBatteryOptimizations(str)) {
            Toast.makeText(activityC1486c, C2947b.m.f129508B2, 0).show();
            checkBox.b(true);
        } else {
            Toast.makeText(activityC1486c, C2947b.m.f129512C2, 0).show();
            checkBox.b(false);
        }
    }

    public static List<PermissionGroup> g(List<PermissionGroup> list) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (PermissionGroup permissionGroup : list) {
            int iM = C3838b.m(permissionGroup.permissions, "android.permission.ACCESS_BACKGROUND_LOCATION");
            if (iM < 0) {
                linkedList.add(permissionGroup);
            } else {
                String[] strArr = new String[r5.length - 1];
                int i10 = 0;
                for (String str : permissionGroup.permissions) {
                    if (i10 == iM) {
                        iM = -1;
                    } else {
                        strArr[i10] = str;
                        i10++;
                    }
                }
                linkedList.add(new PermissionGroup(permissionGroup.pkgName, strArr));
                linkedList2.add(new PermissionGroup(permissionGroup.pkgName, "android.permission.ACCESS_BACKGROUND_LOCATION"));
            }
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    @Nullable
    public static PermissionGroup h(PermissionGroup permissionGroup) {
        String[] strArrJ = j(permissionGroup.pkgName, permissionGroup.permissions);
        if (strArrJ.length == 0) {
            return null;
        }
        return new PermissionGroup(permissionGroup.pkgName, strArrJ);
    }

    @NonNull
    public static List<PermissionGroup> i(List<PermissionGroup> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<PermissionGroup> it = list.iterator();
        while (it.hasNext()) {
            PermissionGroup permissionGroupH = h(it.next());
            if (permissionGroupH != null) {
                linkedList.add(permissionGroupH);
            }
        }
        return linkedList;
    }

    @NonNull
    public static String[] j(@Nullable String str, String... strArr) {
        LinkedList linkedList = new LinkedList();
        if (strArr == null || strArr.length == 0) {
            return (String[]) linkedList.toArray(new String[0]);
        }
        if (str == null) {
            str = GaiaContext.j().v();
        }
        PackageManager packageManagerT = GaiaContext.j().T();
        for (String str2 : strArr) {
            if (packageManagerT.checkPermission(str2, str) != 0) {
                linkedList.add(str2);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    @T(23)
    public static Intent k(String str, boolean z10) {
        if (!z10) {
            return new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + str));
        return intent;
    }

    @NonNull
    public static c l(String str, @Nullable PermissionGroup... permissionGroupArr) {
        List<PermissionGroup> listZ = Z6.g.B().z(str);
        if (listZ == null) {
            return new c();
        }
        GuestAppInfo guestAppInfoU = C5714x.j().u(str);
        if (guestAppInfoU == null) {
            return new c();
        }
        if (permissionGroupArr != null) {
            listZ.addAll(Arrays.asList(permissionGroupArr));
        }
        List<PermissionGroup> listI = i(listZ);
        if (((LinkedList) listI).size() == 0) {
            return new c();
        }
        List<PermissionGroup> listG = g(listI);
        ApkInfo apkInfo = guestAppInfoU.getApkInfo();
        Intent intentB1 = PermissionListActivity.b1(apkInfo.pkgName, apkInfo.getName(), apkInfo.getIcon(), (PermissionGroup[]) ((LinkedList) listG).toArray(new PermissionGroup[0]));
        c cVar = new c();
        cVar.a(new a(intentB1));
        return cVar;
    }

    @NonNull
    public static c m(boolean z10, @Nullable String... strArr) {
        String[] strArrJ = j("com.app.hider.master.promax", strArr);
        if (strArrJ.length == 0) {
            return new c();
        }
        Intent intentB = z10 ? PermissionActivity.b(new PermissionGroup("com.app.hider.master.promax", strArrJ)) : PermissionListActivity.b1("com.app.hider.master.promax", null, null, new PermissionGroup("com.app.hider.master.promax", strArrJ));
        c cVar = new c();
        cVar.a(new a(intentB));
        return cVar;
    }

    public static void n(final ActivityC1486c activityC1486c, final boolean z10) {
        List<String> listX = C5703m.o().x();
        if (listX.size() == 0) {
            return;
        }
        final PowerManager powerManager = (PowerManager) GaiaContext.j().n().getSystemService(Y7.a.f79330e);
        if (listX.size() == 1) {
            final String str = listX.get(0);
            if (powerManager.isIgnoringBatteryOptimizations(str)) {
                new AlertDialog.Builder(activityC1486c).setTitle(C2947b.m.f129662t2).setMessage(C2947b.m.f129508B2).setNegativeButton(C2947b.m.f129670v2, new g()).create().show();
                return;
            }
            Intent intentK = k(str, z10);
            C4367c.o().E(true);
            C4367c.f200255q.x(activityC1486c, intentK, new C4366b.a() { // from class: com.prism.gaia.helper.compat.h
                @Override // e6.C4366b.a
                public final void a(int i10, Intent intent) {
                    l.a(powerManager, str, activityC1486c, i10, intent);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(U6.c.b(it.next()));
        }
        LinearLayout linearLayout = new LinearLayout(activityC1486c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(48, 24, 24, 24);
        for (int i10 = 0; i10 < listX.size(); i10++) {
            final String str2 = listX.get(i10);
            c.a aVar = (c.a) arrayList.get(i10);
            boolean zIsIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(str2);
            I.b(f165022a, "pkg(%s) ignore(%b) battery optimization", str2, Boolean.valueOf(zIsIgnoringBatteryOptimizations));
            final CheckBox checkBox = new CheckBox(activityC1486c, null);
            checkBox.setText(aVar.a(activityC1486c));
            checkBox.setChecked(zIsIgnoringBatteryOptimizations);
            checkBox.setTextSize(16.0f);
            checkBox.setPadding(0, 16, 0, 16);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.prism.gaia.helper.compat.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    l.b(powerManager, str2, activityC1486c, checkBox, z10, compoundButton, z11);
                }
            });
            linearLayout.addView(checkBox, layoutParams);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activityC1486c);
        builder.setTitle(C2947b.m.f129662t2);
        builder.setNegativeButton(C2947b.m.f129670v2, new j());
        builder.setView(linearLayout);
        builder.show();
    }
}
