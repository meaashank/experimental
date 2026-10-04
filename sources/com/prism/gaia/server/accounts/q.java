package com.prism.gaia.server.accounts;

import android.content.Context;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f166613a = "asdf-".concat(q.class.getSimpleName());

    public XmlResourceParser a(Context context, ServiceInfo serviceInfo, String str, String str2) {
        int i10;
        Bundle bundle = serviceInfo.metaData;
        if (bundle == null || (i10 = bundle.getInt(str)) == 0) {
            return null;
        }
        try {
            b(context, str2);
            return b(context, str2).getXml(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public Resources b(Context context, String str) throws Exception {
        AssetManager assetManagerNewInstance = AssetManagerCAG.f165804G.ctor().newInstance();
        AssetManagerCAG.f165804G.addAssetPath().call(assetManagerNewInstance, str);
        Resources resources = context.getResources();
        return new Resources(assetManagerNewInstance, resources.getDisplayMetrics(), resources.getConfiguration());
    }
}
