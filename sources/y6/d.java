package Y6;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import com.prism.gaia.client.hook.providers.ProviderProxyHandler;
import com.prism.gaia.remote.BadgerInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements Y6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79297a = "asdf-".concat(d.class.getSimpleName());

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79298a;

        static {
            int[] iArr = new int[ProviderProxyHandler.MethodType.values().length];
            f79298a = iArr;
            try {
                iArr[ProviderProxyHandler.MethodType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79299b = "content://me.everything.badger/apps";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79300c = "package_name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79301d = "activity_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79302e = "count";

        @Override // Y6.d
        public String b() {
            return "count";
        }

        @Override // Y6.d
        public String c() {
            return "activity_name";
        }

        @Override // Y6.d
        public String d() {
            return "package_name";
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79299b).toString();
        }
    }

    public static class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79303b = "content://com.huawei.android.launcher.settings/badge/";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79304c = "package";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79305d = "class";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79306e = "badgenumber";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f79307f = "change_badge";

        @Override // Y6.d
        public String b() {
            return f79306e;
        }

        @Override // Y6.d
        public String c() {
            return "class";
        }

        @Override // Y6.d
        public String d() {
            return "package";
        }

        @Override // Y6.d
        public boolean e(String str) {
            return str.equals(f79307f);
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79303b).toString();
        }
    }

    /* JADX INFO: renamed from: Y6.d$d, reason: collision with other inner class name */
    public static class C0152d extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79308b = "content://com.teslacoilsw.notifier/unread_count";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79309c = "count";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79310d = "tag";

        @Override // Y6.d
        public String b() {
            return "count";
        }

        @Override // Y6.d
        public String c() {
            return f79310d;
        }

        @Override // Y6.d
        public String d() {
            return f79310d;
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79308b).toString();
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79311b = "content://com.android.badge/badge";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79312c = "app_badge_count";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79313d = "setAppBadgeCount";

        @Override // Y6.d
        public String b() {
            return "app_badge_count";
        }

        @Override // Y6.d
        public String d() {
            return "";
        }

        @Override // Y6.d
        public boolean e(String str) {
            if (str == null) {
                return false;
            }
            return str.equals("setAppBadgeCount");
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse("content://com.android.badge/badge").toString();
        }
    }

    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79314b = "content://com.sec.badge/apps";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79315c = "badgecount";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79316d = "package";

        @Override // Y6.d
        public String b() {
            return f79315c;
        }

        @Override // Y6.d
        public String d() {
            return "package";
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79314b).toString();
        }
    }

    public static class g extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79317b = "content://com.sonymobile.home.resourceprovider/badge";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79318c = "badge_count";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79319d = "package_name";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79320e = "activity_name";

        @Override // Y6.d
        public String b() {
            return "badge_count";
        }

        @Override // Y6.d
        public String c() {
            return "activity_name";
        }

        @Override // Y6.d
        public String d() {
            return "package_name";
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79317b).toString();
        }
    }

    public static class h extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f79321f = "content://com.zte.mifavor.launcher.unreadbadge";

        @Override // Y6.d.i, Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79321f).toString();
        }
    }

    public static class i extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79322b = "content://com.android.launcher3.cornermark.unreadbadge";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79323c = "setAppUnreadCount";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79324d = "app_badge_count";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79325e = "app_badge_component_name";

        @Override // Y6.d
        public String b() {
            return "app_badge_count";
        }

        @Override // Y6.d
        public String c() {
            return f79325e;
        }

        @Override // Y6.d
        public String d() {
            return f79325e;
        }

        @Override // Y6.d
        public boolean e(String str) {
            return str.equals(f79323c);
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse(f79322b).toString();
        }
    }

    public static class j extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79326b = "content://com.android.badge/badge";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79327c = "app_badge_count";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79328d = "setAppBadgeCount";

        @Override // Y6.d
        public String b() {
            return "app_badge_count";
        }

        @Override // Y6.d
        public String d() {
            return "";
        }

        @Override // Y6.d
        public boolean e(String str) {
            return str.equals("setAppBadgeCount");
        }

        @Override // Y6.d, Y6.f
        public String getUri() {
            return Uri.parse("content://com.android.badge/badge").toString();
        }
    }

    @Override // Y6.f
    public BadgerInfo a(ProviderProxyHandler.MethodType methodType, Object... objArr) {
        try {
            return a.f79298a[methodType.ordinal()] != 1 ? g(methodType, objArr) : f(methodType, objArr);
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public abstract String b();

    public String c() {
        return "";
    }

    public abstract String d();

    public boolean e(String str) {
        return true;
    }

    public BadgerInfo f(ProviderProxyHandler.MethodType methodType, Object... objArr) {
        int iH = ProviderProxyHandler.h(methodType);
        String str = (String) objArr[iH];
        Bundle bundle = (Bundle) objArr[iH + 2];
        if (!e(str)) {
            return null;
        }
        BadgerInfo badgerInfo = new BadgerInfo();
        badgerInfo.badgerCount = bundle.getInt(b());
        badgerInfo.packageName = bundle.getString(d());
        badgerInfo.className = bundle.getString(c());
        return badgerInfo;
    }

    public BadgerInfo g(ProviderProxyHandler.MethodType methodType, Object... objArr) {
        ContentValues contentValues = (ContentValues) objArr[ProviderProxyHandler.h(methodType) + 1];
        int iIntValue = contentValues.getAsInteger(b()).intValue();
        String asString = contentValues.getAsString(d());
        BadgerInfo badgerInfo = new BadgerInfo();
        badgerInfo.packageName = asString;
        badgerInfo.badgerCount = iIntValue;
        return badgerInfo;
    }

    @Override // Y6.f
    public abstract String getUri();
}
