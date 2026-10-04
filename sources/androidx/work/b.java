package androidx.work;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<a> f120256a = new HashSet();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f120257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f120258b;

        public a(@NonNull Uri uri, boolean triggerForDescendants) {
            this.f120257a = uri;
            this.f120258b = triggerForDescendants;
        }

        @NonNull
        public Uri a() {
            return this.f120257a;
        }

        public boolean b() {
            return this.f120258b;
        }

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (o10 != null && a.class == o10.getClass()) {
                a aVar = (a) o10;
                if (this.f120258b == aVar.f120258b && this.f120257a.equals(aVar.f120257a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f120257a.hashCode() * 31) + (this.f120258b ? 1 : 0);
        }
    }

    public void a(@NonNull Uri uri, boolean triggerForDescendants) {
        this.f120256a.add(new a(uri, triggerForDescendants));
    }

    @NonNull
    public Set<a> b() {
        return this.f120256a;
    }

    public int c() {
        return this.f120256a.size();
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || b.class != o10.getClass()) {
            return false;
        }
        return this.f120256a.equals(((b) o10).f120256a);
    }

    public int hashCode() {
        return this.f120256a.hashCode();
    }
}
