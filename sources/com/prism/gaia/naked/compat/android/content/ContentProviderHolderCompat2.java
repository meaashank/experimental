package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.app.IActivityManagerCAG;
import com.prism.gaia.naked.metadata.android.content.ContentProviderHolderCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContentProviderHolderCompat2 {

    public static class Util {
        public static Object ctor(ProviderInfo providerInfo) {
            return C3841e.s() ? ContentProviderHolderCAG.O26.ctor().newInstance(providerInfo) : IActivityManagerCAG._N25.ContentProviderHolder.ctor().newInstance(providerInfo);
        }

        public static IBinder getConnection(Object obj) {
            return C3841e.s() ? ContentProviderHolderCAG.O26.connection().get(obj) : IActivityManagerCAG._N25.ContentProviderHolder.connection().get(obj);
        }

        public static ProviderInfo getInfo(Object obj) {
            return C3841e.s() ? ContentProviderHolderCAG.O26.info().get(obj) : IActivityManagerCAG._N25.ContentProviderHolder.info().get(obj);
        }

        public static IInterface getProvider(Object obj) {
            return C3841e.s() ? ContentProviderHolderCAG.O26.provider().get(obj) : IActivityManagerCAG._N25.ContentProviderHolder.provider().get(obj);
        }

        public static boolean isInstanceOf(Object obj) {
            return C3841e.s() ? ContentProviderHolderCAG.O26.ORG_CLASS().isInstance(obj) : IActivityManagerCAG._N25.ContentProviderHolder.ORG_CLASS().isInstance(obj);
        }

        public static Boolean isLocalProvider(Object obj) {
            if (!C3841e.z()) {
                return null;
            }
            try {
                return Boolean.valueOf(ContentProviderHolderCAG.S31.mLocal().get(obj));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static void setConnection(Object obj, IBinder iBinder) {
            if (C3841e.s()) {
                ContentProviderHolderCAG.O26.connection().set(obj, iBinder);
            } else {
                IActivityManagerCAG._N25.ContentProviderHolder.connection().set(obj, iBinder);
            }
        }

        public static void setInfo(Object obj, ProviderInfo providerInfo) {
            if (C3841e.s()) {
                ContentProviderHolderCAG.O26.info().set(obj, providerInfo);
            } else {
                IActivityManagerCAG._N25.ContentProviderHolder.info().set(obj, providerInfo);
            }
        }

        public static void setLocalProvider(Object obj, boolean z10) {
            if (C3841e.s()) {
                ContentProviderHolderCAG.O26.noReleaseNeeded().set(obj, z10);
            } else {
                IActivityManagerCAG._N25.ContentProviderHolder.noReleaseNeeded().set(obj, z10);
            }
            if (C3841e.z()) {
                ContentProviderHolderCAG.S31.mLocal().set(obj, z10);
            }
        }

        public static void setNoReleaseNeed(Object obj, boolean z10) {
            if (C3841e.s()) {
                ContentProviderHolderCAG.O26.noReleaseNeeded().set(obj, z10);
            } else {
                IActivityManagerCAG._N25.ContentProviderHolder.noReleaseNeeded().set(obj, z10);
            }
        }

        public static void setProvider(Object obj, IInterface iInterface) {
            if (C3841e.s()) {
                ContentProviderHolderCAG.O26.provider().set(obj, iInterface);
            } else {
                IActivityManagerCAG._N25.ContentProviderHolder.provider().set(obj, iInterface);
            }
        }
    }
}
