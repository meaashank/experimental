package k3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.prism.gaia.download.j;
import g3.C4447e;
import h3.C4488b;
import java.io.File;
import java.io.FileNotFoundException;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements m<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f214393a;

    public j(Context context) {
        this.f214393a = context;
    }

    @Override // k3.m
    public boolean b(@NonNull Uri uri) {
        return C4488b.c(uri);
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<File> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(uri), new b(this.f214393a, uri));
    }

    public boolean d(@NonNull Uri uri) {
        return C4488b.c(uri);
    }

    public static final class a implements n<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214394a;

        public a(Context context) {
            this.f214394a = context;
        }

        @Override // k3.n
        @NonNull
        public m<Uri, File> e(q qVar) {
            return new j(this.f214394a);
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String[] f214395c = {j.b.f164768t};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f214397b;

        public b(Context context, Uri uri) {
            this.f214396a = context;
            this.f214397b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super File> aVar) {
            Cursor cursorQuery = this.f214396a.getContentResolver().query(this.f214397b, f214395c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(j.b.f164768t)) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.e(new File(string));
                return;
            }
            aVar.f(new FileNotFoundException("Failed to find file path for: " + this.f214397b));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
