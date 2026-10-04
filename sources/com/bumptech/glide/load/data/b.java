package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139395d = "AssetPathFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f139397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f139398c;

    public b(AssetManager assetManager, String str) {
        this.f139397b = assetManager;
        this.f139396a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f139398c;
        if (t10 == null) {
            return;
        }
        try {
            e(t10);
        } catch (IOException unused) {
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
    public void d(@NonNull Priority priority, @NonNull d.a<? super T> aVar) {
        try {
            T tF = f(this.f139397b, this.f139396a);
            this.f139398c = tF;
            aVar.e(tF);
        } catch (IOException e10) {
            if (Log.isLoggable(f139395d, 3)) {
                Log.d(f139395d, "Failed to load data from asset manager", e10);
            }
            aVar.f(e10);
        }
    }

    public abstract void e(T t10) throws IOException;

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
