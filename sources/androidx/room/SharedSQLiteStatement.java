package androidx.room;

import androidx.annotation.RestrictTo;
import ed.InterfaceC4376a;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f117176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f117177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.G f117178c;

    public SharedSQLiteStatement(@NotNull RoomDatabase database) {
        kotlin.jvm.internal.G.p(database, "database");
        this.f117176a = database;
        this.f117177b = new AtomicBoolean(false);
        this.f117178c = kotlin.I.a(new InterfaceC4376a<v2.h>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @NotNull
            public final v2.h g() {
                return this.f117179d.d();
            }

            @Override // ed.InterfaceC4376a
            public v2.h invoke() {
                return this.f117179d.d();
            }
        });
    }

    @NotNull
    public v2.h b() {
        c();
        return g(this.f117177b.compareAndSet(false, true));
    }

    public void c() {
        this.f117176a.c();
    }

    public final v2.h d() {
        return this.f117176a.h(e());
    }

    @NotNull
    public abstract String e();

    public final v2.h f() {
        return (v2.h) this.f117178c.getValue();
    }

    public final v2.h g(boolean z10) {
        return z10 ? f() : d();
    }

    public void h(@NotNull v2.h statement) {
        kotlin.jvm.internal.G.p(statement, "statement");
        if (statement == f()) {
            this.f117177b.set(false);
        }
    }
}
