package Z;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79380b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<b, WeakReference<a>> f79381a = new HashMap<>();

    @r(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f79382c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ImageVector f79383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79384b;

        public a(@NotNull ImageVector imageVector, int i10) {
            this.f79383a = imageVector;
            this.f79384b = i10;
        }

        public static a d(a aVar, ImageVector imageVector, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageVector = aVar.f79383a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f79384b;
            }
            aVar.getClass();
            return new a(imageVector, i10);
        }

        @NotNull
        public final ImageVector a() {
            return this.f79383a;
        }

        public final int b() {
            return this.f79384b;
        }

        @NotNull
        public final a c(@NotNull ImageVector imageVector, int i10) {
            return new a(imageVector, i10);
        }

        public final int e() {
            return this.f79384b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G.g(this.f79383a, aVar.f79383a) && this.f79384b == aVar.f79384b;
        }

        @NotNull
        public final ImageVector f() {
            return this.f79383a;
        }

        public int hashCode() {
            return (this.f79383a.hashCode() * 31) + this.f79384b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f79383a);
            sb2.append(", configFlags=");
            return C1477d.a(sb2, this.f79384b, ')');
        }
    }

    @r(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f79385c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Resources.Theme f79386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79387b;

        public b(@NotNull Resources.Theme theme, int i10) {
            this.f79386a = theme;
            this.f79387b = i10;
        }

        public static b d(b bVar, Resources.Theme theme, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = bVar.f79386a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f79387b;
            }
            bVar.getClass();
            return new b(theme, i10);
        }

        @NotNull
        public final Resources.Theme a() {
            return this.f79386a;
        }

        public final int b() {
            return this.f79387b;
        }

        @NotNull
        public final b c(@NotNull Resources.Theme theme, int i10) {
            return new b(theme, i10);
        }

        public final int e() {
            return this.f79387b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G.g(this.f79386a, bVar.f79386a) && this.f79387b == bVar.f79387b;
        }

        @NotNull
        public final Resources.Theme f() {
            return this.f79386a;
        }

        public int hashCode() {
            return (this.f79386a.hashCode() * 31) + this.f79387b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f79386a);
            sb2.append(", id=");
            return C1477d.a(sb2, this.f79387b, ')');
        }
    }

    public final void a() {
        this.f79381a.clear();
    }

    @Nullable
    public final a b(@NotNull b bVar) {
        WeakReference<a> weakReference = this.f79381a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.f79381a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.f79384b)) {
                it.remove();
            }
        }
    }

    public final void d(@NotNull b bVar, @NotNull a aVar) {
        this.f79381a.put(bVar, new WeakReference<>(aVar));
    }
}
