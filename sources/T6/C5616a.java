package t6;

import Q0.g;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.prism.commons.exception.GaiaProviderNullClientException;
import com.prism.commons.utils.l0;

/* JADX INFO: renamed from: t6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5616a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239211a = l0.b(C5616a.class.getSimpleName());

    public static ContentProviderClient a(Context context, Uri uri) {
        return context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public static ContentProviderClient b(Context context, String str) {
        return context.getContentResolver().acquireUnstableContentProviderClient(str);
    }

    public static Bundle c(Context context, Uri uri, String str, String str2, Bundle bundle) {
        ContentProviderClient contentProviderClientE = e(context, uri);
        if (contentProviderClientE == null) {
            Log.e(f239211a, NotificationCompat.CATEGORY_CALL, new GaiaProviderNullClientException("uri(" + uri + ") acquire null client"));
            return null;
        }
        try {
            return contentProviderClientE.call(str, str2, bundle);
        } catch (Throwable th) {
            try {
                Log.e(f239211a, NotificationCompat.CATEGORY_CALL, th);
                return null;
            } finally {
                g(contentProviderClientE);
            }
        }
    }

    public static Bundle d(Context context, Uri uri, String str, String str2, Bundle bundle) {
        ContentProviderClient contentProviderClientE = e(context, uri);
        if (contentProviderClientE == null) {
            return null;
        }
        try {
            Bundle bundleCall = contentProviderClientE.call(str, str2, bundle);
            g(contentProviderClientE);
            return bundleCall;
        } catch (Throwable unused) {
            g(contentProviderClientE);
            return null;
        }
    }

    public static ContentProviderClient e(Context context, Uri uri) {
        ContentProviderClient contentProviderClientA = a(context, uri);
        if (contentProviderClientA == null) {
            int i10 = 0;
            while (i10 < 5 && contentProviderClientA == null) {
                SystemClock.sleep(100L);
                i10++;
                contentProviderClientA = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            }
        }
        return contentProviderClientA;
    }

    public static ContentProviderClient f(Context context, String str) {
        ContentProviderClient contentProviderClientB = b(context, str);
        if (contentProviderClientB == null) {
            int i10 = 0;
            while (i10 < 5 && contentProviderClientB == null) {
                SystemClock.sleep(100L);
                i10++;
                contentProviderClientB = context.getContentResolver().acquireUnstableContentProviderClient(str);
            }
        }
        return contentProviderClientB;
    }

    public static void g(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    g.a(contentProviderClient);
                } else {
                    contentProviderClient.release();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
