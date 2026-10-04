package h3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import com.prism.gaia.download.j;
import e.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f202391d = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f202392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f202393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f202394c;

    public static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f202395b = {j.b.f164768t};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f202396c = "kind = 1 AND image_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f202397a;

        public a(ContentResolver contentResolver) {
            this.f202397a = contentResolver;
        }

        @Override // h3.d
        public Cursor a(Uri uri) {
            return this.f202397a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f202395b, f202396c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f202398b = {j.b.f164768t};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f202399c = "kind = 1 AND video_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f202400a;

        public b(ContentResolver contentResolver) {
            this.f202400a = contentResolver;
        }

        @Override // h3.d
        public Cursor a(Uri uri) {
            return this.f202400a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f202398b, f202399c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @f0
    public c(Uri uri, e eVar) {
        this.f202392a = uri;
        this.f202393b = eVar;
    }

    public static c e(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.e(context).n().g(), dVar, com.bumptech.glide.c.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return e(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return e(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f202394c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f202394c = inputStreamH;
            aVar.e(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable(f202391d, 3)) {
                Log.d(f202391d, "Failed to find thumbnail file", e10);
            }
            aVar.f(e10);
        }
    }

    public final InputStream h() throws Throwable {
        InputStream inputStreamD = this.f202393b.d(this.f202392a);
        int iA = inputStreamD != null ? this.f202393b.a(this.f202392a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
