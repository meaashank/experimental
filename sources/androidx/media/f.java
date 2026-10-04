package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import e.T;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f114644b;

        public a(String str, Bundle bundle) {
            this.f114643a = str;
            this.f114644b = bundle;
        }
    }

    public static class b extends MediaBrowserService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f114645a;

        public b(Context context, d dVar) {
            attachBaseContext(context);
            this.f114645a = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            a aVarC = this.f114645a.c(str, i10, bundle == null ? null : new Bundle(bundle));
            if (aVarC == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(aVarC.f114643a, aVarC.f114644b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f114645a.e(str, new c<>(result));
        }
    }

    public static class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f114646a;

        public c(MediaBrowserService.Result result) {
            this.f114646a = result;
        }

        public void a() {
            this.f114646a.detach();
        }

        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t10) {
            if (t10 instanceof List) {
                this.f114646a.sendResult(b((List) t10));
                return;
            }
            if (!(t10 instanceof Parcel)) {
                this.f114646a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t10;
            parcel.setDataPosition(0);
            this.f114646a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public interface d {
        a c(String str, int i10, Bundle bundle);

        void e(String str, c<List<Parcel>> cVar);
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static IBinder c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static void e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}
