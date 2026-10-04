package C0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17502a = "ShortcutXmlParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f17503b = "android.app.shortcuts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17504c = "shortcut";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17505d = "shortcutId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ArrayList<String> f17506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f17507f = new Object();

    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @NonNull
    @e.g0
    public static List<String> b(@NonNull Context context) {
        if (f17506e == null) {
            synchronized (f17507f) {
                try {
                    if (f17506e == null) {
                        f17506e = new ArrayList<>();
                        f17506e.addAll(e(context));
                    }
                } finally {
                }
            }
        }
        return f17506e;
    }

    @NonNull
    public static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f17503b);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @NonNull
    @e.f0
    public static List<String> d(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && "shortcut".equals(name) && (strA = a(xmlPullParser, f17505d)) != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @NonNull
    public static Set<String> e(@NonNull Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f17503b)) {
                        XmlResourceParser xmlResourceParserC = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(xmlResourceParserC));
                            xmlResourceParserC.close();
                        } finally {
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e(f17502a, "Failed to parse the Xml resource: ", e10);
            }
        }
        return hashSet;
    }
}
