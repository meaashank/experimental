package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.mZ.uR;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.prism.hider.ui.PermissionNeedDialog;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Vor {
    public static final Set<String> NOt = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.Vor.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static sAl ZRu = null;
    private static boolean qF = false;
    private boolean FA;

    @NonNull
    private String Ht;
    private int Mm;
    private boolean OCA;
    private String TFq;

    @Nullable
    private String Vor;
    private Integer WMI;
    private int ZH;
    private volatile ConcurrentHashMap<String, uR.ZRu> Zf;

    @Nullable
    private String aT;
    private Bitmap edo;
    private boolean lp;
    private boolean mZ;
    private Integer oK;
    private int om;
    private boolean sAl;
    private String to;

    @NonNull
    private String uR;
    private com.bytedance.sdk.openadsdk.core.sAl.mZ.mZ xY;
    private Integer yBV;

    public static class ZRu {
        private static final Vor ZRu = new Vor();
    }

    public static void Zf() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            qF = true;
        }
    }

    public static boolean xY() {
        return qF;
    }

    public int FA() {
        Integer num = this.oK;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "sdk_coppa", -1);
    }

    @NonNull
    public String Ht() {
        if (TextUtils.isEmpty(this.Ht)) {
            this.Ht = ZRu(WMI.ZRu());
        }
        return this.Ht;
    }

    public int Mm() {
        return com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_icon_id", PermissionNeedDialog.f168058d, 0) : this.Mm;
    }

    public int OCA() {
        Integer num = this.WMI;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_ccpa", -1);
    }

    public String TFq() {
        String str = this.TFq;
        if (str != null) {
            return str;
        }
        String strZRu = ZRu("mediation_info", Long.MAX_VALUE);
        this.TFq = strZRu;
        if (strZRu == null) {
            this.TFq = "";
        }
        return this.TFq;
    }

    public int Vor() {
        Integer num = this.yBV;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "tt_gdpr", -1);
    }

    public boolean WMI() {
        return NOt.contains(this.uR);
    }

    public boolean ZH() {
        return com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "is_paid", false) : this.FA;
    }

    public int aT() {
        int iZRu = com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_coppa", -99);
        this.om = iZRu;
        if (iZRu == -99) {
            this.om = FA();
        }
        return this.om;
    }

    public com.bytedance.sdk.openadsdk.core.sAl.mZ.mZ edo() {
        if (this.xY == null) {
            this.xY = new com.bytedance.sdk.openadsdk.core.sAl.mZ.mZ(10, 8);
        }
        return this.xY;
    }

    @Nullable
    public String lp() {
        return com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("sp_global_file", "keywords", null) : this.Vor;
    }

    public boolean oK() {
        return true;
    }

    public String om() {
        if (!TextUtils.isEmpty(this.to)) {
            return this.to;
        }
        String strZRu = com.bytedance.sdk.openadsdk.utils.Vor.ZRu();
        this.to = strZRu;
        if (!TextUtils.isEmpty(strZRu)) {
            return this.to;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.Vor.ZRu(strValueOf);
        this.to = strValueOf;
        return strValueOf;
    }

    public boolean qF() {
        return "com.union_test.internationad".equals(Yx.TFq());
    }

    @Nullable
    public String sAl() {
        return com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("sp_global_file", "extra_data", null) : this.aT;
    }

    public void to() {
        try {
            if (this.Zf == null || this.Zf.size() != 0) {
                return;
            }
            this.Zf = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Nullable
    public String uR() {
        if (TextUtils.isEmpty(this.uR)) {
            String strZRu = ZRu("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strZRu)) {
                this.uR = strZRu;
            }
        }
        return this.uR;
    }

    public Bitmap yBV() {
        return com.bytedance.sdk.openadsdk.multipro.NOt.mZ() ? com.bytedance.sdk.component.utils.uR.ZRu(com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("sp_global_file", "pause_icon", null)) : this.edo;
    }

    private Vor() {
        this.mZ = false;
        this.ZH = 0;
        this.lp = true;
        this.sAl = false;
        this.edo = null;
        this.oK = null;
        this.yBV = null;
        this.WMI = null;
        this.om = 0;
        this.Zf = null;
        try {
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.ZRu.ZRu(WMI.ZRu());
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public static Vor NOt() {
        return ZRu.ZRu;
    }

    public static void ZRu(sAl sal) {
        ZRu = sal;
    }

    public boolean mZ() {
        return com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "sdk_activate_init", true);
    }

    public void NOt(boolean z10) {
        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "sdk_activate_init", Boolean.valueOf(z10));
    }

    public boolean ZRu() {
        return this.OCA;
    }

    public void mZ(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.yBV;
            if (num == null || num.intValue() != i10) {
                this.yBV = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.WD.TFq()) {
                    NOt(num, i10);
                } else {
                    edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Vor.3
                        @Override // java.lang.Runnable
                        public void run() {
                            Vor.this.NOt(num, i10);
                        }
                    });
                }
            }
        }
    }

    private static void FA(String str) {
        sAl sal;
        if (TextUtils.isEmpty(str) && (sal = ZRu) != null) {
            sal.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public static boolean Mm(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.Zf.ZRu || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    private static void Vor(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        sAl sal = ZRu;
        if (sal != null) {
            sal.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    private static JSONObject aT(String str) {
        String strNOt = com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("sp_global_file", str, null);
        if (TextUtils.isEmpty(strNOt)) {
            return null;
        }
        try {
            return new JSONObject(strNOt);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public void Ht(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.WMI;
            if (num == null || num.intValue() != i10) {
                this.WMI = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.WD.TFq()) {
                    mZ(num, i10);
                } else {
                    edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Vor.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Vor.this.mZ(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void NOt(String str) {
        this.TFq = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ZRu("mediation_info", str);
    }

    public void ZRu(boolean z10) {
        this.OCA = z10;
    }

    public void TFq(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.ZH = i10;
    }

    public void ZRu(@NonNull String str) {
        FA(str);
        this.uR = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ZRu("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.yBV.CH().uR(7);
    }

    public void uR(int i10) {
        if (i10 != 0 && i10 != 1) {
            i10 = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_coppa", Integer.valueOf(i10));
        this.om = i10;
    }

    public void NOt(final int i10) {
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.oK;
            if (num == null || num.intValue() != i10) {
                this.oK = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.WD.TFq()) {
                    ZRu(num, i10);
                } else {
                    edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Vor.2
                        @Override // java.lang.Runnable
                        public void run() {
                            Vor.this.ZRu(num, i10);
                        }
                    });
                }
            }
        }
    }

    public static Pair<String, Long> uR(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectAT = aT(str);
            if (jSONObjectAT == null) {
                return null;
            }
            return new Pair<>(jSONObjectAT.getString("value"), Long.valueOf(jSONObjectAT.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public uR.ZRu TFq(String str) {
        try {
            if (this.Zf == null || str == null) {
                return null;
            }
            return this.Zf.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void mZ(@Nullable final String str) {
        Vor(str);
        if (com.bytedance.sdk.openadsdk.utils.WD.TFq()) {
            edo.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Vor.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", "extra_data", str);
        }
        this.aT = str;
    }

    private String ZRu(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public void Ht(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                com.bytedance.sdk.openadsdk.mZ.aT.ZRu(6, str);
            } else if (this.Zf != null) {
                this.Zf.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(4, true);
        }
    }

    public void ZRu(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_icon_id", PermissionNeedDialog.f168058d, Integer.valueOf(i10));
        }
        this.Mm = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(5, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_ccpa", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "global_ccpa", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(5, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(3, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "sdk_coppa", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_privacy", "sdk_coppa", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(3, true);
        }
    }

    public void mZ(boolean z10) {
        this.mZ = z10;
    }

    public static void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String ZRu(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectAT = aT(str);
            if (jSONObjectAT == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectAT.getLong("time") <= j10) {
                return jSONObjectAT.getString("value");
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public void ZRu(String str, uR.ZRu zRu) {
        try {
            if (TextUtils.isEmpty(str) || zRu == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                com.bytedance.sdk.openadsdk.mZ.aT.ZRu(6, str, zRu);
                return;
            }
            if (this.Zf == null) {
                synchronized (Vor.class) {
                    try {
                        if (this.Zf == null) {
                            this.Zf = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.Zf != null) {
                this.Zf.put(str, zRu);
            }
        } catch (Throwable unused) {
        }
    }
}
