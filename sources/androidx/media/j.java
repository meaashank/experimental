package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.f;
import androidx.media.g;
import e.T;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@T(26)
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f114647a = "MBSCompatApi26";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f114648b;

    public static class a extends g.a {
        public a(Context context, c cVar) {
            super(context, (f.d) cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((c) this.f114645a).b(str, new b(result), bundle);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f114649a;

        public b(MediaBrowserService.Result result) {
            this.f114649a = result;
        }

        public void a() {
            this.f114649a.detach();
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

        public void c(List<Parcel> list, int i10) {
            try {
                j.f114648b.setInt(this.f114649a, i10);
            } catch (IllegalAccessException e10) {
                Log.w(j.f114647a, e10);
            }
            this.f114649a.sendResult(b(list));
        }
    }

    public interface c extends g.b {
        void b(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f114648b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            Log.w(f114647a, e10);
        }
    }

    public static Object a(Context context, c cVar) {
        return new a(context, (f.d) cVar);
    }

    public static Bundle b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
