package T3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kd.InterfaceC4845e;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nDatabaseDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatabaseDelegate.kt\ncom/cookiegames/smartcookie/database/DatabaseDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class b implements InterfaceC4845e<SQLiteOpenHelper, SQLiteDatabase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SQLiteDatabase f68316a;

    @Override // kd.InterfaceC4845e
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase getValue(@NotNull SQLiteOpenHelper thisRef, @NotNull n<?> property) {
        G.p(thisRef, "thisRef");
        G.p(property, "property");
        SQLiteDatabase sQLiteDatabase = this.f68316a;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase != null) {
                return sQLiteDatabase;
            }
        }
        SQLiteDatabase writableDatabase = thisRef.getWritableDatabase();
        this.f68316a = writableDatabase;
        G.o(writableDatabase, "also(...)");
        return writableDatabase;
    }
}
