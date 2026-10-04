package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class r<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull RoomDatabase database) {
        super(database);
        kotlin.jvm.internal.G.p(database, "database");
    }

    @Override // androidx.room.SharedSQLiteStatement
    @NotNull
    public abstract String e();

    public abstract void i(@NotNull v2.h hVar, T t10);

    public final int j(T t10) {
        v2.h hVarB = b();
        try {
            i(hVarB, t10);
            return hVarB.y0();
        } finally {
            h(hVarB);
        }
    }

    public final int k(@NotNull Iterable<? extends T> entities) {
        kotlin.jvm.internal.G.p(entities, "entities");
        v2.h hVarB = b();
        try {
            Iterator<? extends T> it = entities.iterator();
            int iY0 = 0;
            while (it.hasNext()) {
                i(hVarB, it.next());
                iY0 += hVarB.y0();
            }
            return iY0;
        } finally {
            h(hVarB);
        }
    }

    public final int l(@NotNull T[] entities) {
        kotlin.jvm.internal.G.p(entities, "entities");
        v2.h hVarB = b();
        try {
            int iY0 = 0;
            for (T t10 : entities) {
                i(hVarB, t10);
                iY0 += hVarB.y0();
            }
            return iY0;
        } finally {
            h(hVarB);
        }
    }
}
