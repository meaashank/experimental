package com.bytedance.sdk.component.ZRu;

import android.net.Uri;
import com.android.launcher3.IconCache;
import com.bytedance.sdk.component.ZRu.ZH;
import com.bytedance.sdk.component.ZRu.to;
import com.bytedance.sdk.component.ZRu.xY;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class OCA {
    private final Set<String> NOt;
    private ZH.ZRu TFq;
    private final Set<String> ZRu;
    private final xY mZ = WMI.ZRu;
    private final to uR;

    public OCA(to toVar, Set<String> set, Set<String> set2) {
        this.uR = toVar;
        if (set == null || set.isEmpty()) {
            this.ZRu = new LinkedHashSet();
        } else {
            this.ZRu = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.NOt = new LinkedHashSet();
        } else {
            this.NOt = new LinkedHashSet(set2);
        }
    }

    public final synchronized Zf NOt(String str, NOt nOt) {
        return ZRu(str, nOt, false);
    }

    public final synchronized Zf ZRu(boolean z10, String str, NOt nOt) throws to.ZRu {
        ZH.ZRu zRu;
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            Zf zf = this.NOt.contains(nOt.ZRu()) ? Zf.PUBLIC : null;
            for (String str2 : this.ZRu) {
                if (uri.getHost().equals(str2) || host.endsWith(IconCache.EMPTY_CLASS_NAME.concat(String.valueOf(str2)))) {
                    zf = Zf.PRIVATE;
                    break;
                }
            }
            if (zf == null && (zRu = this.TFq) != null && zRu.ZRu(str)) {
                if (this.TFq.ZRu(str, nOt.ZRu())) {
                    return null;
                }
                zf = Zf.PRIVATE;
            }
            Zf zfZRu = z10 ? ZRu(str, nOt) : NOt(str, nOt);
            return zfZRu != null ? zfZRu : zf;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void NOt(xY.ZRu zRu) {
        if (this.mZ != null) {
            throw null;
        }
    }

    public final synchronized Zf ZRu(String str, NOt nOt) throws to.ZRu {
        return ZRu(str, nOt, true);
    }

    public void ZRu(ZH.ZRu zRu) {
        this.TFq = zRu;
    }

    public void ZRu(xY.ZRu zRu) {
        if (this.mZ != null) {
            throw null;
        }
    }

    private Zf ZRu(String str, NOt nOt, boolean z10) {
        if (!z10 || this.uR == null) {
            return null;
        }
        throw null;
    }
}
