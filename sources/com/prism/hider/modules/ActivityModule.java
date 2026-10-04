package com.prism.hider.modules;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ca.f;
import com.android.launcher3.ShortcutInfo;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.C;
import com.prism.commons.utils.l0;
import com.prism.hider.utils.c;
import com.prism.hider.utils.m;
import fa.C4414b;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityModule extends f {
    public static final String EXTRA_ACTIVITY_CLASS = "EXTRA_ACTIVITY_CLASS";
    public static final String EXTRA_KEY_ACTION = "EXTRA_KEY_ACTION";
    public static final String EXTRA_KEY_DATA = "EXTRA_KEY_ACTION";
    public static final String EXTRA_KEY_ICON_URL = "EXTRA_KEY_ICON_URL";
    public static final String EXTRA_KEY_TITLE = "EXTRA_KEY_TITLE";
    private static final String PREFIX_MODULEID = "AM_";
    private static final String TAG = l0.b("ActivityModule");
    private String activityCls;
    private C4414b iconHoler;
    private String title;
    private Bundle paramsBundle = new Bundle();
    private String action = null;
    private String dataUriStr = null;
    private String badgeName = null;

    public ActivityModule(Context context, String str, String str2, String str3, String str4) {
        setModuleId(str);
        this.iconHoler = new C4414b(str3, context.getDrawable(R.mipmap.ic_launcher_home));
        this.title = str2;
        this.activityCls = str4;
    }

    public static String activityId2ModuleId(String str) {
        return y.a(PREFIX_MODULEID, str);
    }

    private void copyToIntent(Intent intent) {
        C.a(this.paramsBundle, intent);
        intent.putExtra("EXTRA_KEY_TITLE", this.title);
        intent.putExtra("EXTRA_KEY_ICON_URL", this.iconHoler.j());
        String str = this.activityCls;
        if (str != null) {
            intent.putExtra(EXTRA_ACTIVITY_CLASS, str);
        }
        String str2 = this.action;
        if (str2 != null) {
            intent.putExtra("EXTRA_KEY_ACTION", str2);
        }
        String str3 = this.dataUriStr;
        if (str3 != null) {
            intent.putExtra("EXTRA_KEY_ACTION", str3);
        }
    }

    public static ActivityModule fromSerializableBundle(Context context, String str, Bundle bundle) {
        ActivityModule activityModule = new ActivityModule(context, str, bundle.getString("EXTRA_KEY_TITLE"), bundle.getString("EXTRA_KEY_ICON_URL"), bundle.getString(EXTRA_ACTIVITY_CLASS));
        String string = bundle.getString("EXTRA_KEY_ACTION");
        String string2 = bundle.getString("EXTRA_KEY_ACTION");
        if (string != null) {
            activityModule.setAction(string);
        }
        if (string2 != null) {
            activityModule.setDataUriStr(string2);
        }
        activityModule.copyParam(bundle);
        return activityModule;
    }

    public static ActivityModule fromShortcut(Context context, ShortcutInfo shortcutInfo) {
        return fromSerializableBundle(context, c.b(shortcutInfo.getPackageNameInComponent()), shortcutInfo.intent.getExtras());
    }

    public static boolean isActivityModuleId(String str) {
        return str.startsWith(PREFIX_MODULEID);
    }

    public void copyParam(Bundle bundle) {
        C.b(bundle, this.paramsBundle);
        this.paramsBundle.remove("EXTRA_KEY_TITLE");
        this.paramsBundle.remove("EXTRA_KEY_ICON_URL");
        this.paramsBundle.remove(EXTRA_ACTIVITY_CLASS);
        this.paramsBundle.remove("EXTRA_KEY_ACTION");
        this.paramsBundle.remove("EXTRA_KEY_ACTION");
    }

    public String getAction() {
        return this.action;
    }

    public String getBadgeName() {
        return this.badgeName;
    }

    public String getDataUriStr() {
        return this.dataUriStr;
    }

    @Override // ca.c
    public Drawable getIcon() {
        return this.iconHoler.i();
    }

    public C4414b getIconHoler() {
        return this.iconHoler;
    }

    @Override // ca.c
    public String getName() {
        return this.title;
    }

    public String getStringParam(String str) {
        return this.paramsBundle.getString(str);
    }

    public boolean isActivity(Class<? extends Activity> cls) {
        if (cls == null || this.activityCls == null) {
            return false;
        }
        return cls.getName().equals(this.activityCls);
    }

    public ShortcutInfo makeShortcut(Context context, String str) {
        ShortcutInfo shortcutInfoL = m.l(context, this, str);
        String str2 = this.badgeName;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            m.o(shortcutInfoL, m.f168400e, this.badgeName);
        }
        copyToIntent(shortcutInfoL.intent);
        return shortcutInfoL;
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        Intent intent = new Intent();
        if (this.activityCls != null) {
            intent.setComponent(new ComponentName(activity, this.activityCls));
        }
        String str = this.action;
        if (str != null) {
            intent.setAction(str);
        }
        String str2 = this.dataUriStr;
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        copyToIntent(intent);
        activity.startActivity(intent);
    }

    public void putStringParam(String str, String str2) {
        this.paramsBundle.putString(str, str2);
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setBadgeName(String str) {
        this.badgeName = str;
    }

    public void setDataUriStr(String str) {
        this.dataUriStr = str;
    }

    public void updateShortcut(Context context, ShortcutInfo shortcutInfo) {
        shortcutInfo.title = this.title;
        m.y(context, shortcutInfo, getIcon());
        copyToIntent(shortcutInfo.intent);
    }
}
