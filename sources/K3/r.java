package k3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import java.io.InputStream;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public class r<Data> implements m<Integer, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f214430c = "ResourceLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<Uri, Data> f214431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f214432b;

    public r(Resources resources, m<Uri, Data> mVar) {
        this.f214432b = resources;
        this.f214431a = mVar;
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull Integer num) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull Integer num, int i10, int i11, @NonNull C4447e c4447e) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f214431a.a(uriD, i10, i11, c4447e);
    }

    @Nullable
    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f214432b.getResourcePackageName(num.intValue()) + '/' + this.f214432b.getResourceTypeName(num.intValue()) + '/' + this.f214432b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable(f214430c, 5)) {
                return null;
            }
            Log.w(f214430c, "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    public boolean e(@NonNull Integer num) {
        return true;
    }

    public static final class a implements n<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f214433a;

        public a(Resources resources) {
            this.f214433a = resources;
        }

        @Override // k3.n
        public m<Integer, AssetFileDescriptor> e(q qVar) {
            return new r(this.f214433a, qVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    @Deprecated
    public static class b implements n<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f214434a;

        public b(Resources resources) {
            this.f214434a = resources;
        }

        @Override // k3.n
        @NonNull
        public m<Integer, ParcelFileDescriptor> e(q qVar) {
            return new r(this.f214434a, qVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class c implements n<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f214435a;

        public c(Resources resources) {
            this.f214435a = resources;
        }

        @Override // k3.n
        @NonNull
        public m<Integer, InputStream> e(q qVar) {
            return new r(this.f214435a, qVar.d(Uri.class, InputStream.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class d implements n<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f214436a;

        public d(Resources resources) {
            this.f214436a = resources;
        }

        @Override // k3.n
        @NonNull
        public m<Integer, Uri> e(q qVar) {
            return new r(this.f214436a, v.f214446a);
        }

        @Override // k3.n
        public void d() {
        }
    }
}
