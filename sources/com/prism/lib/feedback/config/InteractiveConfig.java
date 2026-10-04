package com.prism.lib.feedback.config;

import Aa.d;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.i;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.prism.commons.utils.C3857v;
import com.prism.commons.utils.l0;
import java.util.ArrayList;
import pb.C5404d;

/* JADX INFO: loaded from: classes6.dex */
public class InteractiveConfig {
    public static final String CONFIG_NAME = "interactive_method";
    private static final String TAG = l0.b("InteractiveConfig");
    public static final String VIP_CONTACT_US_CONFIG_NAME = "vip_contact_us";
    public String info;
    public String language;
    public String method;

    public static ArrayList<InteractiveConfig> getConfigsByLanguage(final ArrayList<InteractiveConfig> arrayList, String str) {
        String str2 = TAG;
        StringBuilder sbA = i.a("InteractiveConfig.getConfigsByLanguage, language=", str, "; all=");
        sbA.append(arrayList == null ? "null" : (String) C3857v.a(new C3857v.b() { // from class: com.prism.lib.feedback.config.a
            @Override // com.prism.commons.utils.C3857v.b
            public final Object a() {
                return new Gson().toJson(arrayList);
            }
        }));
        Log.d(str2, sbA.toString());
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList<InteractiveConfig> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            InteractiveConfig interactiveConfig = arrayList.get(i10);
            i10++;
            InteractiveConfig interactiveConfig2 = interactiveConfig;
            if (interactiveConfig2.language.equalsIgnoreCase(str)) {
                arrayList2.add(interactiveConfig2);
            } else if (interactiveConfig2.language.equalsIgnoreCase("default")) {
                arrayList2.add(interactiveConfig2);
            }
        }
        return arrayList2;
    }

    public static InteractiveConfig getQQConfig(ArrayList<InteractiveConfig> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InteractiveConfig interactiveConfig = arrayList.get(i10);
                i10++;
                InteractiveConfig interactiveConfig2 = interactiveConfig;
                if (interactiveConfig2.isQQ()) {
                    return interactiveConfig2;
                }
            }
        }
        return null;
    }

    public static InteractiveConfig getTelegramonfig(ArrayList<InteractiveConfig> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InteractiveConfig interactiveConfig = arrayList.get(i10);
                i10++;
                InteractiveConfig interactiveConfig2 = interactiveConfig;
                if (interactiveConfig2.isTikTok()) {
                    return interactiveConfig2;
                }
            }
        }
        return null;
    }

    public static InteractiveConfig getTiktokConfig(ArrayList<InteractiveConfig> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InteractiveConfig interactiveConfig = arrayList.get(i10);
                i10++;
                InteractiveConfig interactiveConfig2 = interactiveConfig;
                if (interactiveConfig2.isTikTok()) {
                    return interactiveConfig2;
                }
            }
        }
        return null;
    }

    public static InteractiveConfig getWhatsappConfig(ArrayList<InteractiveConfig> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InteractiveConfig interactiveConfig = arrayList.get(i10);
                i10++;
                InteractiveConfig interactiveConfig2 = interactiveConfig;
                if (interactiveConfig2.isWhatsApp()) {
                    return interactiveConfig2;
                }
            }
        }
        return null;
    }

    public static ArrayList<InteractiveConfig> load(String str) {
        String string = C5404d.f().c().getString(str, null);
        if (string == null || TextUtils.isEmpty(string)) {
            Log.d(TAG, "remote interactive config is null");
            return null;
        }
        Log.d(TAG, "remote config:".concat(string));
        return (ArrayList) new Gson().fromJson(string, new TypeToken<ArrayList<InteractiveConfig>>() { // from class: com.prism.lib.feedback.config.InteractiveConfig.1
        }.getType());
    }

    public boolean isQQ() {
        String str = this.method;
        return str != null && str.equalsIgnoreCase(d.f7286a);
    }

    public boolean isTelegram() {
        String str = this.method;
        return str != null && str.equalsIgnoreCase(d.f7291f);
    }

    public boolean isTikTok() {
        String str = this.method;
        return str != null && str.equalsIgnoreCase(d.f7287b);
    }

    public boolean isWhatsApp() {
        String str = this.method;
        return str != null && str.equalsIgnoreCase(d.f7288c);
    }
}
