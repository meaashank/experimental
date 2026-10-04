package Y6;

import android.content.ComponentName;
import android.content.Intent;
import com.prism.gaia.remote.BadgerInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements e {

    public static class a extends C0150b {
        @Override // Y6.b.C0150b, Y6.b, Y6.e
        public String a() {
            return C0150b.f79261a;
        }
    }

    /* JADX INFO: renamed from: Y6.b$b, reason: collision with other inner class name */
    public static class C0150b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79261a = "com.htc.launcher.action.UPDATE_SHORTCUT";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79262b = "com.htc.launcher.action.SET_NOTIFICATION";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79263c = "packagename";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f79264d = "count";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f79265e = "com.htc.launcher.extra.COMPONENT";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f79266f = "com.htc.launcher.extra.COUNT";

        @Override // Y6.b, Y6.e
        public String a() {
            return f79262b;
        }

        @Override // Y6.b, Y6.e
        public BadgerInfo b(Intent intent) {
            return intent.getAction().equals(f79262b) ? e(intent, f79265e, f79266f) : e(intent, f79263c, "count");
        }

        public BadgerInfo e(Intent intent, String str, String str2) {
            String stringExtra;
            int i10 = (!intent.getAction().equals(a()) || (stringExtra = intent.getStringExtra(str2)) == null) ? -1 : Integer.parseInt(stringExtra);
            BadgerInfo badgerInfo = new BadgerInfo();
            badgerInfo.badgerCount = i10;
            badgerInfo.packageName = intent.getStringExtra(str);
            return badgerInfo;
        }
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f79267a = "android.intent.action.APPLICATION_MESSAGE_UPDATE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f79268b = "android.intent.extra.update_application_component_name";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f79269c = "android.intent.extra.update_application_message_text";

        @Override // Y6.b, Y6.e
        public String a() {
            return f79267a;
        }

        @Override // Y6.b, Y6.e
        public BadgerInfo b(Intent intent) {
            String stringExtra = intent.getStringExtra(f79269c);
            if (stringExtra == null || stringExtra.isEmpty()) {
                return null;
            }
            String stringExtra2 = intent.getStringExtra(f79268b);
            int iIndexOf = stringExtra2.indexOf(47);
            String strSubstring = stringExtra2.substring(0, iIndexOf);
            String strSubstring2 = stringExtra2.substring(iIndexOf + 1);
            BadgerInfo badgerInfo = new BadgerInfo();
            badgerInfo.badgerCount = Integer.parseInt(stringExtra);
            badgerInfo.packageName = strSubstring;
            badgerInfo.className = strSubstring2;
            return badgerInfo;
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
            if (intent.getAction().equals(a())) {
                Object obj = intent.getExtras().get("");
                if (obj instanceof String) {
                    iIntValue = Integer.parseInt((String) obj);
                } else if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                }
                new BadgerInfo().badgerCount = iIntValue;
                throw null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String c() {
        return "";
    }

    public ComponentName d(Intent intent) {
        return null;
    }
}
