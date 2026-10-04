package com.bytedance.sdk.openadsdk.core.lp.mZ;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {

    @NonNull
    private final Map<NOt, String> NOt;

    @NonNull
    private final List<String> ZRu;

    public mZ(@NonNull List<String> list) {
        this.ZRu = list;
        HashMap map = new HashMap();
        this.NOt = map;
        map.put(NOt.CACHEBUSTING, NOt());
    }

    @NonNull
    private String NOt() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    @NonNull
    public List<String> ZRu() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.ZRu) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (NOt nOt : NOt.values()) {
                    String str = this.NOt.get(nOt);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = strReplaceAll.replaceAll("\\[" + nOt.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    @NonNull
    private String NOt(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }

    @NonNull
    public mZ ZRu(@Nullable com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu) {
        if (zRu != null) {
            this.NOt.put(NOt.ERRORCODE, zRu.ZRu());
        }
        return this;
    }

    @NonNull
    public mZ ZRu(@Nullable long j10) {
        if (j10 >= 0) {
            String strNOt = NOt(j10);
            if (!TextUtils.isEmpty(strNOt)) {
                this.NOt.put(NOt.CONTENTPLAYHEAD, strNOt);
            }
        }
        return this;
    }

    @NonNull
    public mZ ZRu(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.NOt.put(NOt.ASSETURI, str);
        }
        return this;
    }
}
