package Y6;

import android.content.Intent;
import com.prism.gaia.remote.BadgerInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements Y6.e {

    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79270a = "org.adw.launcher.counter.SEND";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79271b = "PNAME";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79272c = "CNAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79273d = "COUNT";

        @Override // Y6.c, Y6.e
        public String a() {
            return f79270a;
        }

        @Override // Y6.c
        public String c() {
            return f79273d;
        }

        @Override // Y6.c
        public String d() {
            return f79272c;
        }

        @Override // Y6.c
        public String e() {
            return f79271b;
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79274a = "com.anddoes.launcher.COUNTER_CHANGED";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79275b = "package";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79276c = "count";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79277d = "class";

        @Override // Y6.c, Y6.e
        public String a() {
            return f79274a;
        }

        @Override // Y6.c
        public String c() {
            return "count";
        }

        @Override // Y6.c
        public String d() {
            return "class";
        }

        @Override // Y6.c
        public String e() {
            return "package";
        }
    }

    /* JADX INFO: renamed from: Y6.c$c, reason: collision with other inner class name */
    public static class C0151c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79278a = "android.intent.action.BADGE_COUNT_UPDATE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79279b = "badge_count";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79280c = "badge_count_package_name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79281d = "badge_count_class_name";

        @Override // Y6.c, Y6.e
        public String a() {
            return "android.intent.action.BADGE_COUNT_UPDATE";
        }

        @Override // Y6.c
        public String c() {
            return "badge_count";
        }

        @Override // Y6.c
        public String d() {
            return "badge_count_class_name";
        }

        @Override // Y6.c
        public String e() {
            return "badge_count_package_name";
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79282a = "android.intent.action.BADGE_COUNT_UPDATE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79283b = "badge_count";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79284c = "badge_count_package_name";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79285d = "badge_count_class_name";

        @Override // Y6.c, Y6.e
        public String a() {
            return "android.intent.action.BADGE_COUNT_UPDATE";
        }

        @Override // Y6.c
        public String c() {
            return "badge_count";
        }

        @Override // Y6.c
        public String d() {
            return "badge_count_class_name";
        }

        @Override // Y6.c
        public String e() {
            return "badge_count_package_name";
        }
    }

    public static class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79286a = "com.oppo.unsettledevent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79287b = "pakeageName";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79288c = "number";

        @Override // Y6.c, Y6.e
        public String a() {
            return f79286a;
        }

        @Override // Y6.c
        public String c() {
            return f79288c;
        }

        @Override // Y6.c
        public String d() {
            return "";
        }

        @Override // Y6.c
        public String e() {
            return f79287b;
        }
    }

    public static class f extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79289a = "com.sonyericsson.home.action.UPDATE_BADGE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79290b = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79291c = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79292d = "com.sonyericsson.home.intent.extra.badge.MESSAGE";

        @Override // Y6.c, Y6.e
        public String a() {
            return f79289a;
        }

        @Override // Y6.c
        public String c() {
            return f79292d;
        }

        @Override // Y6.c
        public String d() {
            return f79291c;
        }

        @Override // Y6.c
        public String e() {
            return f79290b;
        }
    }

    public static class g extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79293a = "launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79294b = "notificationNum";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79295c = "packageName";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79296d = "className";

        @Override // Y6.c, Y6.e
        public String a() {
            return f79293a;
        }

        @Override // Y6.c
        public String c() {
            return f79294b;
        }

        @Override // Y6.c
        public String d() {
            return f79296d;
        }

        @Override // Y6.c
        public String e() {
            return "packageName";
        }
    }

    @Override // Y6.e
    public String a() {
        return "";
    }

    @Override // Y6.e
    public BadgerInfo b(Intent intent) {
        int iIntValue;
        try {
            if (!intent.getAction().equals(a())) {
                return null;
            }
            Object obj = intent.getExtras().get(c());
            if (obj instanceof String) {
                iIntValue = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof Integer)) {
                    return null;
                }
                iIntValue = ((Integer) obj).intValue();
            }
            BadgerInfo badgerInfo = new BadgerInfo();
            badgerInfo.badgerCount = iIntValue;
            badgerInfo.className = intent.getStringExtra(d());
            badgerInfo.packageName = intent.getStringExtra(e());
            return badgerInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public String c() {
        return "";
    }

    public String d() {
        return "";
    }

    public String e() {
        return "";
    }
}
