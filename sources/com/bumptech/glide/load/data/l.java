package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139426d = "LocalUriFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f139427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f139428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f139429c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f139428b = contentResolver;
        this.f139427a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f139429c;
        if (t10 != null) {
            try {
                e(t10);
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
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T tF = f(this.f139427a, this.f139428b);
            this.f139429c = tF;
            aVar.e(tF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable(f139426d, 3)) {
                Log.d(f139426d, "Failed to open Uri", e10);
            }
            aVar.f(e10);
        }
    }

    public abstract void e(T t10) throws IOException;

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
