package u;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.f;
import android.support.v4.media.i;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.FileProvider;
import androidx.core.util.C2425b;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e.e0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@Deprecated
public final class e extends FileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239309a = "BrowserServiceFP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f239310b = ".image_provider";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f239311c = "content";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f239312d = "image_provider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f239313e = "image_provider_images/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f239314f = ".png";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f239315g = "image_provider_uris";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f239316h = "last_cleanup_time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f239317i = new Object();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ContentResolver f239318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f239319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.d f239320c;

        public a(ContentResolver contentResolver, Uri uri, androidx.concurrent.futures.d dVar) {
            this.f239318a = contentResolver;
            this.f239319b = uri;
            this.f239320c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f239318a.openFileDescriptor(this.f239319b, CampaignEx.JSON_KEY_AD_R);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    this.f239320c.setException(new FileNotFoundException());
                    return;
                }
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
                if (bitmapDecodeFileDescriptor == null) {
                    this.f239320c.setException(new IOException("File could not be decoded."));
                } else {
                    this.f239320c.set(bitmapDecodeFileDescriptor);
                }
            } catch (IOException e10) {
                this.f239320c.setException(e10);
            }
        }
    }

    public static class b extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f239321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f239322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f239323d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f239324a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f239321b = timeUnit.toMillis(7L);
            f239322c = timeUnit.toMillis(7L);
            f239323d = timeUnit.toMillis(1L);
        }

        public b(Context context) {
            this.f239324a = context.getApplicationContext();
        }

        public static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        public static boolean c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(e.f239316h, System.currentTimeMillis()) + f239322c;
        }

        public Void a(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f239324a.getSharedPreferences(this.f239324a.getPackageName() + e.f239310b, 0);
            if (!c(sharedPreferences)) {
                return null;
            }
            synchronized (e.f239317i) {
                try {
                    File file = new File(this.f239324a.getFilesDir(), e.f239312d);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    long jCurrentTimeMillis = System.currentTimeMillis() - f239321b;
                    boolean z10 = true;
                    for (File file2 : fileArrListFiles) {
                        if (b(file2) && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                            Log.e(e.f239309a, "Fail to delete image: " + file2.getAbsoluteFile());
                            z10 = false;
                        }
                    }
                    long jCurrentTimeMillis2 = z10 ? System.currentTimeMillis() : (System.currentTimeMillis() - f239322c) + f239323d;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(e.f239316h, jCurrentTimeMillis2);
                    editorEdit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
            a(voidArr);
            return null;
        }
    }

    public static class c extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f239325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f239326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bitmap f239327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f239328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.concurrent.futures.d<Uri> f239329e;

        public c(Context context, String str, Bitmap bitmap, Uri uri, androidx.concurrent.futures.d<Uri> dVar) {
            this.f239325a = context.getApplicationContext();
            this.f239326b = str;
            this.f239327c = bitmap;
            this.f239328d = uri;
            this.f239329e = dVar;
        }

        public Void a(String... strArr) {
            d();
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            new b(this.f239325a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        public final void c(File file) {
            FileOutputStream fileOutputStreamH;
            C2425b c2425b = new C2425b(file);
            try {
                fileOutputStreamH = c2425b.h();
            } catch (IOException e10) {
                e = e10;
                fileOutputStreamH = null;
            }
            try {
                this.f239327c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamH);
                fileOutputStreamH.close();
                c2425b.c(fileOutputStreamH);
                this.f239329e.set(this.f239328d);
            } catch (IOException e11) {
                e = e11;
                c2425b.b(fileOutputStreamH);
                this.f239329e.setException(e);
            }
        }

        public final void d() {
            File file = new File(this.f239325a.getFilesDir(), e.f239312d);
            synchronized (e.f239317i) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.f239329e.setException(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.f239326b + e.f239314f);
                    if (file2.exists()) {
                        this.f239329e.set(this.f239328d);
                    } else {
                        c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(String[] strArr) {
            a(strArr);
            return null;
        }
    }

    public static Uri a(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + f239310b).path(i.a(f239313e, str, f239314f)).build();
    }

    public static void b(@NonNull Intent intent, @Nullable List<Uri> list, @NonNull Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, f239315g, list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i10)));
        }
        intent.setClipData(clipDataNewUri);
    }

    @NonNull
    public static ListenableFuture<Bitmap> c(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        androidx.concurrent.futures.d dVarI = androidx.concurrent.futures.d.i();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, dVarI));
        return dVarI;
    }

    @NonNull
    @e0
    public static androidx.concurrent.futures.d<Uri> d(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i10) {
        StringBuilder sbA = f.a(str, "_");
        sbA.append(Integer.toString(i10));
        String string = sbA.toString();
        Uri uriA = a(context, string);
        androidx.concurrent.futures.d<Uri> dVarI = androidx.concurrent.futures.d.i();
        new c(context, string, bitmap, uriA, dVarI).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return dVarI;
    }
}
