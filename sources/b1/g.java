package b1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f120740a;

    public interface c {
        @Nullable
        Uri a();

        @Nullable
        Object b();

        @NonNull
        Uri c();

        void d();

        void e();

        @NonNull
        ClipDescription getDescription();
    }

    public g(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f120740a = new a(uri, clipDescription, uri2);
        } else {
            this.f120740a = new b(uri, clipDescription, uri2);
        }
    }

    @Nullable
    public static g g(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    @NonNull
    public Uri a() {
        return this.f120740a.c();
    }

    @NonNull
    public ClipDescription b() {
        return this.f120740a.getDescription();
    }

    @Nullable
    public Uri c() {
        return this.f120740a.a();
    }

    public void d() {
        this.f120740a.e();
    }

    public void e() {
        this.f120740a.d();
    }

    @Nullable
    public Object f() {
        return this.f120740a.b();
    }

    @T(25)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final InputContentInfo f120741a;

        public a(@NonNull Object obj) {
            this.f120741a = (InputContentInfo) obj;
        }

        @Override // b1.g.c
        @Nullable
        public Uri a() {
            return this.f120741a.getLinkUri();
        }

        @Override // b1.g.c
        @NonNull
        public Object b() {
            return this.f120741a;
        }

        @Override // b1.g.c
        @NonNull
        public Uri c() {
            return this.f120741a.getContentUri();
        }

        @Override // b1.g.c
        public void d() {
            this.f120741a.requestPermission();
        }

        @Override // b1.g.c
        public void e() {
            this.f120741a.releasePermission();
        }

        @Override // b1.g.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f120741a.getDescription();
        }

        public a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f120741a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public g(@NonNull c cVar) {
        this.f120740a = cVar;
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f120742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ClipDescription f120743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f120744c;

        public b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f120742a = uri;
            this.f120743b = clipDescription;
            this.f120744c = uri2;
        }

        @Override // b1.g.c
        @Nullable
        public Uri a() {
            return this.f120744c;
        }

        @Override // b1.g.c
        @Nullable
        public Object b() {
            return null;
        }

        @Override // b1.g.c
        @NonNull
        public Uri c() {
            return this.f120742a;
        }

        @Override // b1.g.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f120743b;
        }

        @Override // b1.g.c
        public void d() {
        }

        @Override // b1.g.c
        public void e() {
        }
    }
}
