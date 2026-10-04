package s2;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import dd.o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f238481c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final String f238482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @Nullable
    public final String f238483b;

    @V({"SMAP\nViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,83:1\n145#2,7:84\n*S KotlinDebug\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n*L\n73#1:84,7\n*E\n"})
    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final j a(@NotNull v2.d database, @NotNull String viewName) {
            j jVar;
            G.p(database, "database");
            G.p(viewName, "viewName");
            Cursor cursorA3 = database.A3("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                Cursor cursor = cursorA3;
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    G.o(string, "cursor.getString(0)");
                    jVar = new j(string, cursor.getString(1));
                } else {
                    jVar = new j(viewName, null);
                }
                kotlin.io.b.a(cursorA3, null);
                return jVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.b.a(cursorA3, th);
                    throw th2;
                }
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public j(@NotNull String name, @Nullable String str) {
        G.p(name, "name");
        this.f238482a = name;
        this.f238483b = str;
    }

    @o
    @NotNull
    public static final j a(@NotNull v2.d dVar, @NotNull String str) {
        return f238481c.a(dVar, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (G.g(this.f238482a, jVar.f238482a)) {
            String str = this.f238483b;
            String str2 = jVar.f238483b;
            if (str != null ? G.g(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f238482a.hashCode() * 31;
        String str = this.f238483b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewInfo{name='");
        sb2.append(this.f238482a);
        sb2.append("', sql='");
        return android.support.v4.media.e.a(sb2, this.f238483b, "'}");
    }
}
