package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.media.f;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(23)
public class g {

    public static class a extends f.b {
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.f114645a).g(str, new f.c<>(result));
        }
    }

    public interface b extends f.d {
        void g(String str, f.c<Parcel> cVar);
    }

    public static Object a(Context context, b bVar) {
        return new a(context, (f.d) bVar);
    }
}
