package com.prism.gaia.naked.compat.android.database;

import W6.c;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.IInterface;
import com.prism.gaia.naked.metadata.android.database.ContentObserverCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public class ContentObserverCompat2 {

    public static class Util {
        public static void dispatchChange(ContentObserver contentObserver, boolean z10, Uri uri, int i10) {
            if (contentObserver == null) {
                return;
            }
            ContentObserverCAG._I15.dispatchChange().call(contentObserver, Boolean.valueOf(z10));
        }

        public static ContentObserver getContentObserverFromInf(IInterface iInterface) {
            if (iInterface == null) {
                return null;
            }
            return ContentObserverCAG.f165807G.Transport.mContentObserver().get(iInterface);
        }

        public static Handler getHandler(ContentObserver contentObserver) {
            if (contentObserver == null) {
                return null;
            }
            return ContentObserverCAG.f165807G.mHandler().get(contentObserver);
        }
    }
}
